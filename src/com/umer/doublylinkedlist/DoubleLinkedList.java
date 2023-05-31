package com.umer.doublylinkedlist;

import com.umer.common.DoublyNode;

public class DoubleLinkedList {
	
	private static final String THE_DOUBLE_LINKED_LIST_HAS_BEEN_DELETED = "The double linked list has been deleted.";
	private static final String THE_DOUBLE_LINKED_LIST_DOES_NOT_EXIST = "The Double linked list does not exist.";
	
	DoublyNode head;
	DoublyNode tail;
	int size;

	public DoublyNode createDoubleLinkedList(int nodeValue) {
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
		if (head == null) {
			createDoubleLinkedList(nodeValue);
			return;
		} else if (location == 0) {
			newNode.next = head;
			newNode.prev = null;
			head.prev = newNode;
			head = newNode;
		} else if (location >= size) {
			newNode.next = null;
			tail.next = newNode;
			newNode.prev = tail;
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

	// traversal
	public void traverse() {
		if (head != null) {
			DoublyNode tempNode = head;
			for (int index = 0; index < size; index++) {
				System.out.print(tempNode.value);
				if (index != size - 1) {
					System.out.print("-->");
				}
				tempNode = tempNode.next;
			}
		} else {
			System.out.println(THE_DOUBLE_LINKED_LIST_DOES_NOT_EXIST);
		}
		System.out.println();
	}

	// reverse traversal
	public void reverseTraversal() {
		if (head != null) {
			DoublyNode tempnode = tail;
			for (int index = 0; index < size; index++) {
				System.out.print(tempnode.value);
				if (index != size - 1) {
					System.out.print("-->");
				}
				tempnode = tempnode.prev;
			}
		} else {
			System.out.println(THE_DOUBLE_LINKED_LIST_DOES_NOT_EXIST);
		}
		System.out.println();
	}

	// search node
	public boolean searchNode(int nodeValue) {
		if (head != null) {
			DoublyNode tempNode = head;
			for (int i = 0; i < size; i++) {
				if (tempNode.value == nodeValue) {
					System.out.println("The node value " + nodeValue + " is found at location: " + i);
					return true;
				}
				tempNode = tempNode.next;
			}
		}
		System.out.println("The node value " + nodeValue + " is not found in doubly linked list.");
		return false;
	}

	// deletion method
	public void deleteNodeDoublyLinkedList(int location) {
		if (head == null) {
			System.out.println(THE_DOUBLE_LINKED_LIST_DOES_NOT_EXIST);
			return;
		} else if (location == 0) {
			// delete from the head of the linked list
			if (size == 1) {
				// There is only one element in the double linked list.
				head = null;
				tail = null;
				size--;
				return;
			} else {
				// There are more than 1 element in the double linked list.
				head = head.next;
				head.prev = null;
				size--;
				return;
			}
		} else if (location >= size) {
			// delete from the end of the double linked list.
			DoublyNode tempNode = tail.prev;
			if (size == 1) {
				// There is only one element in the double linked list.
				head = null;
				tail = null;
				size--;
				return;
			} else {
				tempNode.next = null;
				tail = tempNode;
				size--;
			}
		} else {
			// The location is neither the start of the double linked list nor the end of
			// the double linked list i.e. its is somewhere in the middle of the double
			// linked list
			DoublyNode tempNode = head;
			for (int i = 0; i < location - 1; i++) {
				tempNode = tempNode.next;
			}
			tempNode.next = tempNode.next.next;
			tempNode.next.prev = tempNode;
			size--;
		}
	}

	// delete entire double linked list
	public void deleteDoubleLinkedList() {
		DoublyNode tempNode = head;
		for (int i = 0; i < size; i++) {
			tempNode.prev = null;
			tempNode.next = tempNode;
		}
		head = null;
		tail = null;
		size = 0;
		System.out.println(THE_DOUBLE_LINKED_LIST_HAS_BEEN_DELETED);
	}

}
