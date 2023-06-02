package com.umer.execute;

import com.umer.circulardoublelinkedlist.CircularDoubleLinkedList;
import com.umer.circularsinglelinkedlist.CircularSingleLinkedList;
import com.umer.common.DoubleNode;
import com.umer.doublelinkedlist.DoubleLinkedList;
import com.umer.singlelinkedlist.SingleLinkedList;

public class Execute {

	private static final String SEARCHING_FOR_A_NODE_VALUE_IN_THE_CIRCULAR_DOUBLE_LINKED_LIST = "Searching for a node value in the circular double linked list";
	private static final String THE_VALUE_OF_HEAD_IN_CIRCULAR_DOUBLE_LINKED_LIST = "The value of head in circular double linked list: ";
	private static final String CHECKING_VARIOUS_OPERATIONS_OF_CIRCULAR_DOUBLE_LINKED_LIST = "Checking various operations of circular double linked list.";
	private static final String SEARCHING_FOR_A_NODE_VALUE_THAT_DOES_NOT_EXIST_IN_THE_DOUBLY_LINKED_LIST = "Searching for a node value that does not exist in the doubly linked list";
	private static final String SEARCHING_FOR_A_NODE_VALUE_THAT_EXISTS_IN_THE_DOUBLY_LINKED_LIST = "Searching for a node value that exists in the doubly linked list";
	private static final String TRAVESING_THROUGH_THE_DOUBLY_LINKED_LIST_IN_BACKWARD_DIRECTION = "Travesing through the doubly linked list in backward direction";
	private static final String TRAVESING_THROUGH_THE_DOUBLY_LINKED_LIST_IN_FORWARD_DIRECTION = "Travesing through the doubly linked list in forward direction";
	private static final String THE_CURRENT_VALUE_AFTER_INITIALIZATION_OF_DOUBLY_LINKED_LIST_IS = "The current value after initialization of doubly linked list is: ";
	private static final String SINCE_THE_CURRENT_SIZE_IS_ONLY_1_HENCE_THE_NEXT_NODE_VALUE_OF_CIRCULAR_SINGLY_LINKED_LIST_IS_ALSO = "Since the current size is only 1, hence the next node value of circular singly linked list is also--->";
	private static final String FIRST_NODE_VALUE_FETCHED_FROM_CIRCULAR_SINGLY_LINKED_LIST_IS = "First node value fetched from Circular Singly Linked List is---> ";
	private static final String THE_FIRST_NODE_VALUE_INSERTED_IN_CIRCULAR_SINGLY_LINKED_LIST_IS = "The first node value inserted in circular singly linked list is: ";
	private static final String CHECKING_OPERATIONS_OF_CIRCULAR_SINGLY_LINKED_LIST = "Checking operations of circular singly linked list.";
	private static final String TRAVERSING_THROUGH_THE_CURRENT_STATE_OF_THE_SINGLY_LINKED_LIST = "Traversing through the current state of the singly linked list";
	private static final String COMMA = ",";
	private static final String THE_CURRENT_STATUS_OF_THE_SINGLY_LINKED_LIST_SHOULD_BE = "The current status of the singly linked list should be";

	public static void main(String[] args) {
		SingleLinkedList singlyLinedList = new SingleLinkedList();
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

		singlyLinedList.deleteSingleLinkedList();
		singlyLinedList.traverse();

		System.out.println();
		System.out.println();

		System.out.println(CHECKING_OPERATIONS_OF_CIRCULAR_SINGLY_LINKED_LIST);

		System.out.println();
		System.out.println();

		CircularSingleLinkedList circularSinglyLinkedList = new CircularSingleLinkedList();
		final int firstNodeValueForCircularSinglyLinkedList = 5;
		circularSinglyLinkedList.createCircularSingleLinkedList(firstNodeValueForCircularSinglyLinkedList);
		System.out.println(THE_FIRST_NODE_VALUE_INSERTED_IN_CIRCULAR_SINGLY_LINKED_LIST_IS
				+ firstNodeValueForCircularSinglyLinkedList);
		System.out.println(FIRST_NODE_VALUE_FETCHED_FROM_CIRCULAR_SINGLY_LINKED_LIST_IS
				+ circularSinglyLinkedList.head.value);
		System.out.println(
				SINCE_THE_CURRENT_SIZE_IS_ONLY_1_HENCE_THE_NEXT_NODE_VALUE_OF_CIRCULAR_SINGLY_LINKED_LIST_IS_ALSO
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
		circularSinglyLinkedList.deleteCircularSingleLinkedList();
		circularSinglyLinkedList.traverse();

		DoubleLinkedList doublyLinkedList = new DoubleLinkedList();
		final DoubleNode initialDoublyLinkedList = doublyLinkedList.createDoubleLinkedList(1);
		System.out.println(
				THE_CURRENT_VALUE_AFTER_INITIALIZATION_OF_DOUBLY_LINKED_LIST_IS + initialDoublyLinkedList.value);
		doublyLinkedList.insert(2, 0);
		doublyLinkedList.insert(3, 1);
		doublyLinkedList.insert(4, 7);
		System.out.println(TRAVESING_THROUGH_THE_DOUBLY_LINKED_LIST_IN_FORWARD_DIRECTION);
		doublyLinkedList.traverse();
		System.out.println(TRAVESING_THROUGH_THE_DOUBLY_LINKED_LIST_IN_BACKWARD_DIRECTION);
		doublyLinkedList.reverseTraversal();
		int valueToSearchForInDoublyLinkedlist = 4;
		System.out.println(SEARCHING_FOR_A_NODE_VALUE_THAT_EXISTS_IN_THE_DOUBLY_LINKED_LIST);
		doublyLinkedList.searchNode(valueToSearchForInDoublyLinkedlist);

		valueToSearchForInDoublyLinkedlist = 100;
		System.out.println(SEARCHING_FOR_A_NODE_VALUE_THAT_DOES_NOT_EXIST_IN_THE_DOUBLY_LINKED_LIST);
		doublyLinkedList.searchNode(valueToSearchForInDoublyLinkedlist);

		System.out.println(TRAVESING_THROUGH_THE_DOUBLY_LINKED_LIST_IN_FORWARD_DIRECTION);
		doublyLinkedList.traverse();
		int locationToDeleteAtInDoublyLinkedList = 1;
		doublyLinkedList.deleteNodeDoubleLinkedList(locationToDeleteAtInDoublyLinkedList);
		System.out.println(TRAVESING_THROUGH_THE_DOUBLY_LINKED_LIST_IN_FORWARD_DIRECTION);
		doublyLinkedList.traverse();

		locationToDeleteAtInDoublyLinkedList = 100;
		doublyLinkedList.deleteNodeDoubleLinkedList(locationToDeleteAtInDoublyLinkedList);
		System.out.println(TRAVESING_THROUGH_THE_DOUBLY_LINKED_LIST_IN_FORWARD_DIRECTION);
		doublyLinkedList.traverse();

		doublyLinkedList.deleteDoubleLinkedList();
		doublyLinkedList.traverse();

		System.out.println(CHECKING_VARIOUS_OPERATIONS_OF_CIRCULAR_DOUBLE_LINKED_LIST);
		CircularDoubleLinkedList circularDoublyLinkedList = new CircularDoubleLinkedList();
		circularDoublyLinkedList.createCircularDoubleLinkedList(1);
		System.out.println(THE_VALUE_OF_HEAD_IN_CIRCULAR_DOUBLE_LINKED_LIST + circularDoublyLinkedList.head.value);

		circularDoublyLinkedList.insertNode(2, 0);
		circularDoublyLinkedList.insertNode(3, 2);
		circularDoublyLinkedList.insertNode(4, 5);
		circularDoublyLinkedList.traverse();
//		circularDoublyLinkedList.reverseTraversal();
		System.out.println(SEARCHING_FOR_A_NODE_VALUE_IN_THE_CIRCULAR_DOUBLE_LINKED_LIST);
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
