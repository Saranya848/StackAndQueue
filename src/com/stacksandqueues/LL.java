package com.stacksandqueues;

import java.util.EmptyStackException;

public class LL {
	/**
	 * pop - this method is used to remote element from top of the stack isEmpty -
	 * this method is used to check stack is empty or not peek - this method returns
	 * peek element of the stack Method for push Method for print append - this
	 * method adds element to queue
	 */
	Node top, head, tail;
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

	/**
	 * pop - this method is used to remote element from top of the stack
	 */
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

	public void append(int data) {
		Node newNode = new Node(data);
		newNode.data = data;
		newNode.next = null;
		if (head == null) {
			head = newNode;
		} else {
			Node temp = newNode;
			temp = head;
			while (temp.next != null)
				temp = temp.next;
			temp.next = newNode;
		}
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
