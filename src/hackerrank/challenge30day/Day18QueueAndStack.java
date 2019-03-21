package hackerrank.challenge30day;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

public class Day18QueueAndStack {

	// Write your code here.
	private Stack<Character> stack;
	private LinkedList<Character> list;

	public Day18QueueAndStack() {
		list = new LinkedList<Character>();
		stack = new Stack<Character>();
	}

	public void pushCharacter(char c) {
		stack.push(c);
	}

	public void enqueueCharacter(char c) {
		list.add(c);
	}

	private char popCharacter() {
		return stack.pop();
	}

	private char dequeueCharacter() {
		return list.removeFirst();
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		scan.close();

		// Convert input String to an array of characters:
		char[] s = input.toCharArray();

		// Create a Solution object:
		Day18QueueAndStack p = new Day18QueueAndStack();

		// Enqueue/Push all chars to their respective data structures:
		for (char c : s) {
			p.pushCharacter(c);
			p.enqueueCharacter(c);
		}

		// Pop/Dequeue the chars at the head of both data structures and compare them:
		boolean isPalindrome = true;
		for (int i = 0; i < s.length / 2; i++) {
			char a = p.popCharacter();
			char b = p.dequeueCharacter();
			System.out.println("pop: " + a + " , dequeue: " + b);
			if (a != b) {
				isPalindrome = false;
				break;
			}
		}

		// Finally, print whether string s is palindrome or not.
		System.out.println("The word, " + input + ", is " + ((!isPalindrome) ? "not a palindrome." : "a palindrome."));
	}

}