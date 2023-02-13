package com.umer.singlylinkedlist;

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

	// Insert method for SinglyLinkedList
	public void insertInLinkedList(int nodeValue, int location) {
		Node node = new Node();
		node.value = nodeValue;
		if (head == null) {
			// This means that the linked list does not exists yet.
			createSinglyLinkedList(nodeValue);
			return;
		} else if (location == 0) {
			node.next = head;
			head = node;
		} else if (location >= size) {
			// Since the location is greater than the size of the node, This means that the
			// node should be inserted at the end of the list.
			node.next = null;
			tail.next = node;
			tail = node;
		} else {
			// This means that we have to insert the node somewhere in the middle of the
			// linked list
			Node tempnode = head;
			int index = 0;
			while (index < location - 1) {
				// We iterate over till we reach the position in the linked list where a new
				// node
				// should be inserted.
				tempnode = tempnode.next;
				index++;
			}
			// We are at the location in the linked list where the new node should be
			// inserted.
			Node nextNode = tempnode.next;
			tempnode.next = node;
			node.next = nextNode;
		}
		size++;
	}

	// Traversal of singly linked list
	public void traverseSinglyLinkedList() {
		if (head == null) {
			System.out.println("Singly linked list does not exist.");
		} else {
			Node tempNode = head;
			for (int i = 0; i < size; i++) {
				System.out.print(tempNode.value);
				if (i < size - 1) {
					System.out.print("-->");
				}
				tempNode = tempNode.next;
			}
		}
		System.out.println("");
	}

	// Search for a node
	public boolean searchNode(int nodeValue) {
		if (head != null) {
			Node tempNode = head;
			for (int i = 0; i < size; i++) {
				if (tempNode.value == nodeValue) {
					System.out.println("Found the node value " + nodeValue + " at location: " + i);
					return true;
				}
				tempNode = tempNode.next;
			}
		}
		System.out.println("Node value not found.");
		return false;
	}

}
