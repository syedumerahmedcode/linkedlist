package com.umer.circulardoublylinkedlist;

import com.umer.common.DoublyNode;

public class CircularDoublyLinkedList {
	public DoublyNode head;
	public DoublyNode tail;
	public int size = 0;

	// Create Circular Double linked list
	public DoublyNode createCircularDoublyLinkedList(int nodeValue) {
		head = new DoublyNode();
		DoublyNode newNode = new DoublyNode();
		newNode.value = nodeValue;
		head = newNode;
		tail = newNode;

		newNode.next = newNode;
		newNode.prev = newNode;
		size++;
		return head;
	}

	// Insertion method
	public void insertNode(int nodeValue, int location) {
		DoublyNode newNode = new DoublyNode();
		newNode.value = nodeValue;
		if (head == null) {
			// The circular doubly linked list does not exist so we create it.
			createCircularDoublyLinkedList(nodeValue);
			return;
		} else if (location == 0) {
			// node should be inserted at the beginning of the list
			newNode.prev = head;
			newNode.next = tail;
			head.prev = newNode;
			tail.next = newNode;
			head = newNode;
		} else if (location >= size) {
			newNode.next = head;
			newNode.next = tail;
			head.prev = newNode;
			tail.next = newNode;
			tail = newNode;
		} else {
			DoublyNode tempNode = head;
			int index = 0;
			while (index < location - 1) {
				tempNode = tempNode.next;
				index++;
			}
			newNode.prev = tempNode;
			newNode.next = tempNode.next;
			tempNode.next = newNode;
			newNode.next.prev = newNode;
		}
		size++;
	}

	// traverse circular double linked list
	public void traverse() {
		if (head != null) {
			DoublyNode tempNode = head;
			for (int i = 0; i < size; i++) {
				System.out.print(tempNode.value);
				if (i != size - 1) {
					System.out.print("-->");
				}
				tempNode = tempNode.next;
			}
		} else {
			System.out.println("The circular double linked list does not exist.");
		}
		System.out.println();
	}

	// reverse traversal of circular double linked list
	public void reverseTraversal() {
		if (head != null) {
			DoublyNode tempNode = tail;
			for (int i = 0; i < size; i++) {
				System.out.print(tempNode.value);
				if (i != size - 1) {
					System.out.print("<--");
				}
				tempNode = tempNode.prev;
			}
		} else {
			System.out.println("The circular double linked list does not exist.");
		}
		System.out.println();
	}

	// search for a node
	public boolean searchNode(int nodeValue) {
		if (head != null) {
			DoublyNode tempNode = head;

			for (int i = 0; i < size; i++) {
				if (tempNode.value == nodeValue) {
					System.out.println("The node is found at location: " + i);
					return true;
				}
				tempNode = tempNode.next;
			}
		}
		System.out.println("The node does not exist.");
		return false;
	}

}
