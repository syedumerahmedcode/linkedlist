package com.umer.circularsinglylinkedlist;

import com.umer.common.Node;

public class CircularSinglyLinkedList {
	public Node head;
	public Node tail;
	public int size;

	public Node CreateCircularSinglyLinkedList(int nodeValue) {
		head = new Node();
		Node node = new Node();
		node.value = nodeValue;
		// This makes the initial list circular since the head is pointing to itself.
		node.next = node;
		head = node;
		tail = node;
		size = 1;
		return head;
	}

}
