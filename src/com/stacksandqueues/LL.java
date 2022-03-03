package com.stacksandqueues;

public class LL {
	/**
	 * Method for push Method for print
	 */
	Node head;

	/**
	 * Method for push
	 * 
	 * @param data
	 */
	public void push(int data) {
		Node newnode = new Node(data);
		newnode.next = head;
		head = newnode;
	}

	/**
	 * Method for print
	 */
	public void printLL() {
		if (head == null) {
			System.out.println("LinkedList is empty");
		} else {
			Node temp = head;
			while (temp.next != null) {
				System.out.print(temp.data + " -> ");
				temp = temp.next;
			}
			System.out.println(temp.data);
		}
	}
}
