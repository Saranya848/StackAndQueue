package com.stacksandqueues;

public class Stack {
	/*
	* PROCEDURE
	* 1. Creating Linked list
	* 2. pushing values to stack
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
}
