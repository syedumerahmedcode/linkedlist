package com.umer.circulardoublylinkedlist;

import com.umer.common.DoublyNode;

public class CircularDoublyLinkedList {
	public DoublyNode head;
	public DoublyNode tail;
	public int size=0;
	
	// Create Circular Double linked list
	public DoublyNode createCircularDoublyLinkedList(int nodeValue) {
		head=new DoublyNode();
		DoublyNode newNode=new DoublyNode();
		newNode.value=nodeValue;
		head=newNode;
		tail=newNode;
		
		newNode.next=newNode;
		newNode.prev=newNode;
		size++;
		return head;
	}
	
	
}
