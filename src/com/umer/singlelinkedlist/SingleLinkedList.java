package com.umer.singlelinkedlist;

import com.umer.common.Node;

public class SingleLinkedList {
	
	private static final String THE_SINGLE_LINKED_LIST_IS_DELETED_SUCCESSFULLY = "The single linked list is deleted successfully.";
	private static final String NODE_VALUE_NOT_FOUND = "Node value not found.";
	private static final String SINGLE_LINKED_LIST_DOES_NOT_EXIST = "Single linked list does not exist.";
	
	public Node head;
	public Node tail;
	public int size;

	public Node createSingleLinkedList(int nodeValue) {
		head = new Node();
		Node node = new Node();
		node.next = null;
		node.value = nodeValue;
		head = node;
		tail = node;
		increaseSize();
		return node;
	}

	private void increaseSize() {
		size++;
	}

	// Insert method for singleLinkedList
	public void insert(int nodeValue, int location) {
		Node node = new Node();
		node.value = nodeValue;
		if (head == null) {
			// This means that the linked list does not exists yet.
			createSingleLinkedList(nodeValue);
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
		increaseSize();
	}

	// Traversal of single linked list
	public void traverse() {
		if (head == null) {
			System.out.println(SINGLE_LINKED_LIST_DOES_NOT_EXIST);
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
	public boolean search(int nodeValue) {
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
		System.out.println(NODE_VALUE_NOT_FOUND);
		return false;
	}

	// Deleting a node from a single linked list
	public void delete(int location) {
		if (head == null) {
			// Since head points to null, this means that there is no linked list present.
			System.out.println(SINGLE_LINKED_LIST_DOES_NOT_EXIST);
		} else if (location == 0) {
			// This means that we want to delete the first element in linked list

			// We set the head to its next element. By doing this, eventually the node will
			// be removed (eventually garbage collected)
			head = head.next;
			decreaseSize();
			if (size == 0) {
				// Case where we have only one element in the linked list
				tail = null;
			}
		} else if (location >= size) {
			// This means that we want to delete the last element in linked list
			Node tempNode = head;
			for (int i = 0; i < size - 1; i++) {
				tempNode = tempNode.next;
			}
			if (tempNode == head) {
				// Case where we have only one element in the linked list
				tail = head = null;
				decreaseSize();
				return;
			}
			// more than one element in the linked list
			tempNode.next = null;
			tail = tempNode;
			decreaseSize();
		} else {
			// We are deleting an element from somewhere in the middle of the linked list
			Node tempNode = head;
			for (int i = 0; i < location - 1; i++) {
				tempNode = tempNode.next;
			}
			// By doing this, we skip the node at the 'location', hence deleting it from the
			// memory
			tempNode.next = tempNode.next.next;
			decreaseSize();
		}
	}

	private void decreaseSize() {
		size--;
	}

	// Delete entire single linked list
	public void deleteSingleLinkedList() {
		head = tail = null;
		System.out.println(THE_SINGLE_LINKED_LIST_IS_DELETED_SUCCESSFULLY);
		size = 0;
	}

}
