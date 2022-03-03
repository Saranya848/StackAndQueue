package com.stacksandqueues;

public class Stack {
	/*
	* PROCEDURE
	* 1. Creating Linked list
	* 2. pushing values to stack
	* 3. Displaying the stack
	* 4. check stack empty or not
	* 5.display peek element of the stack
	* 6.pop element of the stack
	*/
	
	/*
	 * 1.creating linked list
	 */
	LL list = new LL();
	
	/*
	 * 2.pushing elements to stack
	 */
	list.push(70);
	list.push(30);
	list.push(56);
	
	/*
	 * 3.Displaying the stack
	 */
	list.printLL();
	
	/*
	 * 4.check stack empty or not 
	 */
	System.out.println("Stack is empty or not  "+list.isEmpty());
	/*
	 * 5.display peek element of the stack 
	 */
	System.out.println("Peek element of stack  "+list.peek());
	/*
	 * 6.pop element of the stack
	 */
	System.out.println("pop element of stack  "+list.pop());
}
