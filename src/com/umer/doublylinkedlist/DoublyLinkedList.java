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
		if (head == null) {
			create(nodeValue);
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
			System.out.println("The Doubly linked list does not exist.");
		}
		System.out.println();
	}
	
	// reverse traversal
	public void reverseTraversal() {
		if(head!=null) {
			DoublyNode tempnode=tail;
			for (int index = 0; index < size; index++) {
				System.out.print(tempnode.value);
				if(index!=size-1) {
					System.out.print("-->");
				}
				tempnode=tempnode.prev;
			}
		}else {
			System.out.println("The Doubly linked list does not exist.");
		}
		System.out.println();
	}
}
