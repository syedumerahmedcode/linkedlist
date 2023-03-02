package com.umer.execute;

import com.umer.circularsinglylinkedlist.CircularSinglyLinkedList;
import com.umer.singlylinkedlist.SinglyLinedList;

public class Execute {

	private static final String TRAVERSING_THROUGH_THE_CURRENT_STATE_OF_THE_SINGLY_LINKED_LIST = "Traversing through the current state of the singly linked list";
	private static final String COMMA = ",";
	private static final String THE_CURRENT_STATUS_OF_THE_SINGLY_LINKED_LIST_SHOULD_BE = "The current status of the singly linked list should be";

	public static void main(String[] args) {
		SinglyLinedList singlyLinedList = new SinglyLinedList();
		singlyLinedList.createSinglyLinkedList(5);
		System.out.println("Currently, the head of the linked list is: " + singlyLinedList.head.value);
		singlyLinedList.insertInLinkedList(6, 1);
		System.out.println(THE_CURRENT_STATUS_OF_THE_SINGLY_LINKED_LIST_SHOULD_BE + " 5,6 --->"
				+ singlyLinedList.head.value + COMMA + singlyLinedList.head.next.value);
		singlyLinedList.insertInLinkedList(9, 2);
		System.out.println(
				THE_CURRENT_STATUS_OF_THE_SINGLY_LINKED_LIST_SHOULD_BE + " 5,6,9 --->" + singlyLinedList.head.value
						+ COMMA + singlyLinedList.head.next.value + COMMA + singlyLinedList.head.next.next.value);
		singlyLinedList.insertInLinkedList(43, 2);
		System.out.println(THE_CURRENT_STATUS_OF_THE_SINGLY_LINKED_LIST_SHOULD_BE + " 5,6,43,9 --->"
				+ singlyLinedList.head.value + COMMA + singlyLinedList.head.next.value + COMMA
				+ singlyLinedList.head.next.next.value + COMMA + singlyLinedList.head.next.next.next.value);

		singlyLinedList.insertInLinkedList(4, 4);
		singlyLinedList.insertInLinkedList(5, 5);
		singlyLinedList.insertInLinkedList(6, 6);
		singlyLinedList.insertInLinkedList(7, 7);
		System.out.println(TRAVERSING_THROUGH_THE_CURRENT_STATE_OF_THE_SINGLY_LINKED_LIST);
		singlyLinedList.traverseSinglyLinkedList();

		singlyLinedList.searchNode(43);
		singlyLinedList.searchNode(99);

		System.out.println(TRAVERSING_THROUGH_THE_CURRENT_STATE_OF_THE_SINGLY_LINKED_LIST);
		singlyLinedList.traverseSinglyLinkedList();
		singlyLinedList.deleteNode(6);
		singlyLinedList.traverseSinglyLinkedList();
		singlyLinedList.deleteNode(0);
		singlyLinedList.traverseSinglyLinkedList();
		singlyLinedList.deleteNode(50);
		singlyLinedList.traverseSinglyLinkedList();

		singlyLinedList.deleteSinglyLinkedList();
		singlyLinedList.traverseSinglyLinkedList();

		System.out.println();
		System.out.println();

		System.out.println("Checking operations of circular singly linked list.");
		
		System.out.println();
		System.out.println();

		CircularSinglyLinkedList circularSinglyLinkedList = new CircularSinglyLinkedList();
		final int firstNodeValueForCircularSinglyLinkedList = 5;
		circularSinglyLinkedList.CreateCircularSinglyLinkedList(firstNodeValueForCircularSinglyLinkedList);
		System.out.println("The first node value inserted in circular singly linked list is: "
				+ firstNodeValueForCircularSinglyLinkedList);
		System.out.println("First node value fetched from Circular Singly Linked List is---> "
				+ circularSinglyLinkedList.head.value);
		System.out.println(
				"Since the current size is only 1, hence the next node value of circular singly linked list is also--->"
						+ circularSinglyLinkedList.head.next.value);
		
		circularSinglyLinkedList.insertIntoCircularSinglyLinkedList(4, 0);
		circularSinglyLinkedList.insertIntoCircularSinglyLinkedList(6, 1);
		circularSinglyLinkedList.insertIntoCircularSinglyLinkedList(7, 8);
		System.out.println(circularSinglyLinkedList.head.value);
		circularSinglyLinkedList.traverseCircularSinglyLinkedList();
		System.out.println();
		circularSinglyLinkedList.searchnode(5);
		circularSinglyLinkedList.searchnode(500);
		circularSinglyLinkedList.searchnode(7);

	}

}
