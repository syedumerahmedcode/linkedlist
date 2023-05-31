package com.umer.circulardoublelinkedlist;

import com.umer.common.DoubleNode;

public class CircularDoubleLinkedList {

	private static final String THE_CIRCULAR_DOUBLE_LINKED_LIST_DOES_NOT_EXIST = "The circular double linked list does not exist.";
	private static final String THE_CIRCULAR_DOUBLE_LINKED_LIST_HAS_BEEN_DELETED = "The circular double linked list has been deleted.";
	
	public DoubleNode head;
	public DoubleNode tail;
	public int size = 0;

	// Create Circular Double linked list
	public DoubleNode createCircularDoubleLinkedList(int nodeValue) {
		head = new DoubleNode();
		DoubleNode newNode = new DoubleNode();
		newNode.value = nodeValue;
		head = newNode;
		tail = newNode;

		newNode.next = newNode;
		newNode.prev = newNode;
		increaseSize();
		return head;
	}

	// Insertion method
	public void insertNode(int nodeValue, int location) {
		DoubleNode newNode = new DoubleNode();
		newNode.value = nodeValue;
		if (head == null) {
			// The circular double linked list does not exist so we create it.
			createCircularDoubleLinkedList(nodeValue);
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
			newNode.prev = tail;
			head.prev = newNode;
			tail.next = newNode;
			tail = newNode;
		} else {
			DoubleNode tempNode = head;
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
		increaseSize();
	}

	private void increaseSize() {
		size++;
	}

	// traverse circular double linked list
	public void traverse() {
		if (head != null) {
			DoubleNode tempNode = head;
			for (int i = 0; i < size; i++) {
				System.out.print(tempNode.value);
				if (i != size - 1) {
					System.out.print("-->");
				}
				tempNode = tempNode.next;
			}
		} else {
			System.out.println(THE_CIRCULAR_DOUBLE_LINKED_LIST_DOES_NOT_EXIST);
		}
		System.out.println();
	}

	// Reverse Traversal
	void reverseTraversal() {
		if (head != null) {
			DoubleNode tempNode = tail;
			for (int i = 0; i < size; i++) {
				System.out.print(tempNode.value);
				if (i != size - 1) {
					System.out.print(" <- ");
				}
				tempNode = tempNode.prev;
			}

		} else {
			System.out.println(THE_CIRCULAR_DOUBLE_LINKED_LIST_DOES_NOT_EXIST);
		}
	}

	// search for a node
	public boolean searchNode(int nodeValue) {
		if (head != null) {
			DoubleNode tempNode = head;

			for (int i = 0; i < size; i++) {
				if (tempNode.value == nodeValue) {
					System.out.println("The value provided: " + nodeValue + " is found at location: " + i);
					return true;
				}
				tempNode = tempNode.next;
			}
		}
		System.out.println("The value provided: " + nodeValue + " does not exist.");
		return false;
	}

	// deletion method
	public void deleteNode(int location) {
		if (head == null) {
			System.out.println(THE_CIRCULAR_DOUBLE_LINKED_LIST_DOES_NOT_EXIST);
			return;
		} else if (location == 0) {
			// We are deleting a node at the start of the circular double linked list
			if (size == 1) {
				// The circular double linked list contains only one element
				head.prev = null;
				head.next = null;
				head = tail = null;
				decreaseSize();
				return;
			} else {
				// The circular double linked list contains more than one element
				head = head.next;
				head.prev = tail;
				tail.next = head;
				decreaseSize();
			}
		} else if (location >= size) {
			// We are deleting a node at the end of the circular double linked list
			if (size == 1) {
				// The circular double linked list contains only one element
				head.prev = null;
				head.next = null;
				head = tail = null;
				decreaseSize();
				return;
			} else {
				// The circular double linked list contains more than one element
				tail = tail.prev;
				tail.next = head;
				head.prev = tail;
				decreaseSize();
			}
		} else {
			// We are deleting a node at any given location of the circular double linked
			// list
			DoubleNode tempNode = head;
			for (int i = 0; i < location - 1; i++) {
				tempNode = tempNode.next;
			}
			tempNode.next = tempNode.next.next;
			tempNode.next.prev = tempNode;
			decreaseSize();
		}
	}

	private void decreaseSize() {
		size--;
	}

	// delete entire circular double linked list
	public void deleteCircularDoubleLinkedList() {
		DoubleNode tempNode = head;
		for (int i = 0; i < size; i++) {
			tempNode.prev = null;
			tempNode = tempNode.next;
		}
		head = null;
		tail = null;
		System.out.println(THE_CIRCULAR_DOUBLE_LINKED_LIST_HAS_BEEN_DELETED);
	}

}
