package com.umer.execute;

import com.umer.circulardoublylinkedlist.CircularDoubleLinkedList;
import com.umer.circularsinglylinkedlist.CircularSingleLinkedList;
import com.umer.common.DoublyNode;
import com.umer.doublylinkedlist.DoubleLinkedList;
import com.umer.singlylinkedlist.SingleLinedList;

public class Execute {

	private static final String TRAVERSING_THROUGH_THE_CURRENT_STATE_OF_THE_SINGLY_LINKED_LIST = "Traversing through the current state of the singly linked list";
	private static final String COMMA = ",";
	private static final String THE_CURRENT_STATUS_OF_THE_SINGLY_LINKED_LIST_SHOULD_BE = "The current status of the singly linked list should be";

	public static void main(String[] args) {
		SingleLinedList singlyLinedList = new SingleLinedList();
		singlyLinedList.createSingleLinkedList(5);
		System.out.println("Currently, the head of the linked list is: " + singlyLinedList.head.value);
		singlyLinedList.insert(6, 1);
		System.out.println(THE_CURRENT_STATUS_OF_THE_SINGLY_LINKED_LIST_SHOULD_BE + " 5,6 --->"
				+ singlyLinedList.head.value + COMMA + singlyLinedList.head.next.value);
		singlyLinedList.insert(9, 2);
		System.out.println(
				THE_CURRENT_STATUS_OF_THE_SINGLY_LINKED_LIST_SHOULD_BE + " 5,6,9 --->" + singlyLinedList.head.value
						+ COMMA + singlyLinedList.head.next.value + COMMA + singlyLinedList.head.next.next.value);
		singlyLinedList.insert(43, 2);
		System.out.println(THE_CURRENT_STATUS_OF_THE_SINGLY_LINKED_LIST_SHOULD_BE + " 5,6,43,9 --->"
				+ singlyLinedList.head.value + COMMA + singlyLinedList.head.next.value + COMMA
				+ singlyLinedList.head.next.next.value + COMMA + singlyLinedList.head.next.next.next.value);

		singlyLinedList.insert(4, 4);
		singlyLinedList.insert(5, 5);
		singlyLinedList.insert(6, 6);
		singlyLinedList.insert(7, 7);
		System.out.println(TRAVERSING_THROUGH_THE_CURRENT_STATE_OF_THE_SINGLY_LINKED_LIST);
		singlyLinedList.traverse();

		singlyLinedList.search(43);
		singlyLinedList.search(99);

		System.out.println(TRAVERSING_THROUGH_THE_CURRENT_STATE_OF_THE_SINGLY_LINKED_LIST);
		singlyLinedList.traverse();
		singlyLinedList.delete(6);
		singlyLinedList.traverse();
		singlyLinedList.delete(0);
		singlyLinedList.traverse();
		singlyLinedList.delete(50);
		singlyLinedList.traverse();

		singlyLinedList.deleteSinglyLinkedList();
		singlyLinedList.traverse();

		System.out.println();
		System.out.println();

		System.out.println("Checking operations of circular singly linked list.");

		System.out.println();
		System.out.println();

		CircularSingleLinkedList circularSinglyLinkedList = new CircularSingleLinkedList();
		final int firstNodeValueForCircularSinglyLinkedList = 5;
		circularSinglyLinkedList.createCircularSingleLinkedList(firstNodeValueForCircularSinglyLinkedList);
		System.out.println("The first node value inserted in circular singly linked list is: "
				+ firstNodeValueForCircularSinglyLinkedList);
		System.out.println("First node value fetched from Circular Singly Linked List is---> "
				+ circularSinglyLinkedList.head.value);
		System.out.println(
				"Since the current size is only 1, hence the next node value of circular singly linked list is also--->"
						+ circularSinglyLinkedList.head.next.value);

		circularSinglyLinkedList.insert(4, 0);
		circularSinglyLinkedList.insert(6, 1);
		circularSinglyLinkedList.insert(7, 8);
		System.out.println(circularSinglyLinkedList.head.value);
		circularSinglyLinkedList.traverse();
		circularSinglyLinkedList.search(5);
		circularSinglyLinkedList.search(500);
		circularSinglyLinkedList.search(7);
		circularSinglyLinkedList.delete(2);
		circularSinglyLinkedList.traverse();
		circularSinglyLinkedList.deleteCircularSinglyLinkedlIst();
		circularSinglyLinkedList.traverse();

		DoubleLinkedList doublyLinkedList = new DoubleLinkedList();
		final DoublyNode initialDoublyLinkedList = doublyLinkedList.createDoubleLinkedList(1);
		System.out.println(
				"The current value after initialization of doubly linked list is: " + initialDoublyLinkedList.value);
		doublyLinkedList.insert(2, 0);
		doublyLinkedList.insert(3, 1);
		doublyLinkedList.insert(4, 7);
		System.out.println("Travesing through the doubly linked list in forward direction");
		doublyLinkedList.traverse();
		System.out.println("Travesing through the doubly linked list in backward direction");
		doublyLinkedList.reverseTraversal();
		int valueToSearchForInDoublyLinkedlist = 4;
		System.out.println("Searching for a node value that exists in the doubly linked list");
		doublyLinkedList.searchNode(valueToSearchForInDoublyLinkedlist);

		valueToSearchForInDoublyLinkedlist = 100;
		System.out.println("Searching for a node value that does not exist in the doubly linked list");
		doublyLinkedList.searchNode(valueToSearchForInDoublyLinkedlist);

		System.out.println("Travesing through the doubly linked list in forward direction");
		doublyLinkedList.traverse();
		int locationToDeleteAtInDoublyLinkedList = 1;
		doublyLinkedList.deleteNodeDoublyLinkedList(locationToDeleteAtInDoublyLinkedList);
		System.out.println("Travesing through the doubly linked list in forward direction");
		doublyLinkedList.traverse();

		locationToDeleteAtInDoublyLinkedList = 100;
		doublyLinkedList.deleteNodeDoublyLinkedList(locationToDeleteAtInDoublyLinkedList);
		System.out.println("Travesing through the doubly linked list in forward direction");
		doublyLinkedList.traverse();

		doublyLinkedList.deleteDoubleLinkedList();
		doublyLinkedList.traverse();

		System.out.println("Checking various operations of circular double linked list.");
		CircularDoubleLinkedList circularDoublyLinkedList = new CircularDoubleLinkedList();
		circularDoublyLinkedList.createCircularDoublyLinkedList(1);
		System.out.println("The value of head in circular double linked list: " + circularDoublyLinkedList.head.value);

		circularDoublyLinkedList.insertNode(2, 0);
		circularDoublyLinkedList.insertNode(3, 2);
		circularDoublyLinkedList.insertNode(4, 5);
		circularDoublyLinkedList.traverse();
//		circularDoublyLinkedList.reverseTraversal();
		System.out.println("Searching for a node value in the circular double linked list");
		int valueToSearchForInCircularDoublyLinkedList = 3;
		circularDoublyLinkedList.searchNode(valueToSearchForInCircularDoublyLinkedList);

		valueToSearchForInCircularDoublyLinkedList = 3000000;
		circularDoublyLinkedList.searchNode(valueToSearchForInCircularDoublyLinkedList);

		circularDoublyLinkedList.traverse();
		circularDoublyLinkedList.deleteNode(9);
		circularDoublyLinkedList.traverse();
		circularDoublyLinkedList.deleteCircularDoubleLinkedList();
		circularDoublyLinkedList.traverse();

	}

}
