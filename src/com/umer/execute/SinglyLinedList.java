package com.umer.execute;

public class SinglyLinedList {
	public Node head;
	public Node tail;
	public int size;

	public Node createSinglyLinkedList(int nodeValue) {
		head = new Node();
		Node node = new Node();
		node.next = null;
		node.value = nodeValue;
		head = node;
		tail = node;
		size++;

		return node;

	}

}
