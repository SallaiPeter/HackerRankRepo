package hackerrank.challenge30day;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Node2 {
	Node2 left, right;
	int data;

	Node2(int data) {
		this.data = data;
		left = right = null;
	}
}

public class Day23BST_LevelOrderTraversal {

//	public void levelorder(binarytree t) {
//	    if(t is not empty) {
//	        // enqueue current root
//	        queue.enqueue(t)
//	        
//	        // while there are nodes to process
//	        while( queue is not empty ) {
//	            // dequeue next node
//	            binarytree tree = queue.dequeue();
//	            
//	            process tree's root;
//	            
//	            // enqueue child elements from next level in order
//	            if( tree has non-empty left subtree ) {
//	                queue.enqueue( left subtree of t )
//	            }
//	            if( tree has non-empty right subtree ) {
//	                queue.enqueue( right subtree of t )
//	            }
//	        }
//	    } 
//	} 
	static void levelOrder(Node2 root) {
		if (root != null) {
			Queue<Node2> queue = new LinkedList<Node2>();
			queue.add(root);

			while (!queue.isEmpty()) {
				Node2 tree = queue.poll();
				
				System.out.print(tree.data + " ");
				
				if(tree.left != null)
					queue.add(tree.left);
				if(tree.right != null)
					queue.add(tree.right);
				
			}
		}
	}

	public static Node2 insert(Node2 root, int data) {
		if (root == null) {
			return new Node2(data);
		} else {
			Node2 cur;
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
		Node2 root = null;
		while (T-- > 0) {
			int data = sc.nextInt();
			root = insert(root, data);
		}
		levelOrder(root);
		sc.close();
	}

}
