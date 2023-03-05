package com.umer.doublylinkedlist;

import com.umer.common.DoublyNode;

public class DoublyLinkedList {
	DoublyNode head;
	DoublyNode tail;
	int size;

	public DoublyNode create(int nodeValue) {
		head = new DoublyNode();
		DoublyNode newNode = new DoublyNode();
		newNode.value = nodeValue;
		newNode.prev = null;
		newNode.next = null;
		head = newNode;
		tail = newNode;
		size = 1;
		return head;
	}

	// Insertion
	public void insert(int nodeValue, int location) {
		DoublyNode newNode = new DoublyNode();
		newNode.value = nodeValue;
//		if(hed)

	}
}
