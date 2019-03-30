package hackerrank.challenge30day;

import java.util.Scanner;

class Node3 {
	int data;
	Node3 next;

	Node3(int d) {
		data = d;
		next = null;
	}

}

public class Day24MoreLinkedLists {

	public static Node3 removeDuplicates(Node3 head) {
		// Write your code here
		if (head == null)
			return null;

		Node3 actual = head;
		while (actual.next != null) {
			if (actual.data == actual.next.data)
				actual.next = actual.next.next;
			else
				actual = actual.next;
		}
		return head;

	}

	public static Node3 insert(Node3 head, int data) {
		Node3 p = new Node3(data);
		if (head == null)
			head = p;
		else if (head.next == null)
			head.next = p;
		else {
			Node3 start = head;
			while (start.next != null)
				start = start.next;
			start.next = p;

		}
		return head;
	}

	public static void display(Node3 head) {
		Node3 start = head;
		while (start != null) {
			System.out.print(start.data + " ");
			start = start.next;
		}
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		Node3 head = null;
		int T = sc.nextInt();
		while (T-- > 0) {
			int ele = sc.nextInt();
			head = insert(head, ele);
		}
		head = removeDuplicates(head);
		display(head);
		sc.close();

	}
}
