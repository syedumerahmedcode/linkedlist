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

	public void insertIntoCircularSinglyLinkedList(int nodeValue, int location) {
		Node node = new Node();
		node.value = nodeValue;
		// Check if the circular singly linked list exists or not
		if (head == null) {
			// If it doles not exist, create it.
			CreateCircularSinglyLinkedList(nodeValue);
			return;
		} else if (location == 0) {
			// inserting the node at the beginning of the list.
			node.next = head;
			head = node;
			tail.next = head;
		} else if (location >= size) {
			// inserting at the end of the list.
			tail.next = node;
			tail = node;
			tail.next = head;
		} else {
			Node tempNode = head;
			int index = 0;
			while (index < location - 1) {
				tempNode = tempNode.next;
				index++;
			}
			node.next = tempNode.next;
			tempNode.next = node;
		}
		size++;
	}

	// Traversal method
	public void traverseCircularSinglyLinkedList() {
		if (head != null) {
			Node tempNode = head;
			for (int index = 0; index < size; index++) {
				System.out.print(tempNode.value);
				if (index != size - 1) {
					System.out.print("-->");
				}
			}
		} else {
			System.out.println("The circular linked list does not exist.");
		}
	}

}
