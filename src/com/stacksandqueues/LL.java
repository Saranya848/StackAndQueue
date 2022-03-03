package com.stacksandqueues;

import java.util.EmptyStackException;

public class LL {
	/**
	 * pop - this method is used to remote element from top of the stack isEmpty -
	 * this method is used to check stack is empty or not peek - this method returns
	 * peek element of the stack Method for push Method for print
	 */
	Node top;
	Node head;
	int size;

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

	public int pop() {
		if (isEmpty()) {
			throw new EmptyStackException();
		}
		int result = top.data;
		top = top.next;
		size--;
		return result;
	}

	/**
	 * isEmpty - this method is used to check stack is empty or not
	 * 
	 */
	public boolean isEmpty() {
		return size == 0;
	}

	/**
	 * peek - this method returns peek element of the stack
	 * 
	 */
	public int peek() {
		if (isEmpty()) {
			throw new EmptyStackException();
		}
		return top.data;

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
