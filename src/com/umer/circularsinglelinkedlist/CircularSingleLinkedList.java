package com.umer.circularsinglelinkedlist;

import com.umer.common.Node;

public class CircularSingleLinkedList {
	
	private static final String THE_CIRCULAR_SINGLE_LINKED_LIST_IS_EMPTY = "The circular single linked list is empty.";
	private static final String THE_CIRCULAR_SINGLE_LINKED_LIST_HAS_BEEN_DELETED = "The circular single linked list has been deleted.";
	private static final String THE_CIRCULAR_SINGLE_LINKED_LIST_DOES_NOT_EXIST = "The circular single linked list does not exist.";
	
	public Node head;
	public Node tail;
	public int size;

	public Node createCircularSingleLinkedList(int nodeValue) {
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

	public void insert(int nodeValue, int location) {
		Node node = new Node();
		node.value = nodeValue;
		// Check if the circular single linked list exists or not
		if (head == null) {
			// If it doles not exist, create it.
			createCircularSingleLinkedList(nodeValue);
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
		increaseSize();
	}

	private void increaseSize() {
		size++;
	}

	// Traversal method
	public void traverse() {
		if (head != null) {
			Node tempNode = head;
			for (int index = 0; index < size; index++) {
				System.out.print(tempNode.value);
				if (index != size - 1) {
					System.out.print("-->");
				}
				tempNode = tempNode.next;
			}
			System.out.println();
		} else {
			System.out.println(THE_CIRCULAR_SINGLE_LINKED_LIST_DOES_NOT_EXIST);
		}
	}

	// Searching
	public boolean search(int nodeValue) {
		if (head != null) {
			Node tempNode = head;
			for (int index = 0; index < size; index++) {
				if (tempNode.value == nodeValue) {
					System.out.println("Found value:" + nodeValue + " at location: " + index);
					return true;
				}
				tempNode = tempNode.next;
			}
			System.out.println("Did not find the value " + nodeValue + " in the circular single linked list.");
			return false;
		} else {
			System.out.println(THE_CIRCULAR_SINGLE_LINKED_LIST_IS_EMPTY);
			return false;
		}
	}

	// Deleting a node
	public void delete(int location) {
		if (head == null) {
			System.out.println(THE_CIRCULAR_SINGLE_LINKED_LIST_DOES_NOT_EXIST);
			return;
		} else if (location == 0) {
			// delete the element from the beginning of circular single linked list
			head = head.next;
			tail.next = head;
			decreaseSize();
			if (size == 0) {
				tail = null;
				head.next = null;
				head = null;
			}
		} else if (location >= size) {
			// delete the element from the end of circular single linked list
			Node tempNode = head;
			for (int index = 0; index < size - 1; index++) {
				tempNode = tempNode.next;
			}
			if (tempNode == null) {
				head.next = null;
				tail = head = null;
				decreaseSize();
				return;
			}
			tempNode.next = head;
			tail = tempNode;
			decreaseSize();
		} else {
			// delete the element from somewhere in between of the circular single linked
			// list
			Node tempnode = head;
			for (int index = 0; index < location - 1; index++) {
				tempnode = tempnode.next;
			}
			tempnode.next = tempnode.next.next;
			decreaseSize();
		}
	}

	private void decreaseSize() {
		size--;
	}

	// Deleting the entire circular single linked list
	public void deleteCircularSingleLinkedList() {
		if (head == null) {
			System.out.println(THE_CIRCULAR_SINGLE_LINKED_LIST_DOES_NOT_EXIST);
		} else {
			head = null;
			tail.next = null;
			tail = null;
			System.out.println(THE_CIRCULAR_SINGLE_LINKED_LIST_HAS_BEEN_DELETED);
		}
	}

}
