package hackerrank.challenge30day;

import java.util.Scanner;

class ANode {
	ANode left, right;
	int data;

	ANode(int data) {
		this.data = data;
		left = right = null;
	}
}

public class Day22BinarySearchTree {

	public static int getHeight(ANode root) {
		// Write your code here
		int left = 1;
		int right = 1;

		if (root.left == null && root.right == null)
			return 0;

		if (root.left == null)
			left = 0;
		else
			left = 1 + getHeight(root.left);

		if (root.right == null)
			right = 0;
		else
			right = 1 + getHeight(root.right);

		return Math.max(left, right);

	}

	public static ANode insert(ANode root, int data) {
		if (root == null) {
			return new ANode(data);
		} else {
			ANode cur;
			if (data <= root.data) {
				cur = insert(root.left, data);
				root.left = cur;
			} else {
				cur = insert(root.right, data);
				root.right = cur;
			}
			return root;
		}
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		ANode root = null;
		while (T-- > 0) {
			int data = sc.nextInt();
			root = insert(root, data);
		}
		int height = getHeight(root);
		System.out.println(height);
		sc.close();
	}
}