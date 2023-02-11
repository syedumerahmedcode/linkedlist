package com.umer.execute;

import com.umer.singlylinkedlist.SinglyLinedList;

public class Execute {

	public static void main(String[] args) {
		SinglyLinedList singlyLinedList=new SinglyLinedList();
		singlyLinedList.createSinglyLinkedList(5);
		System.out.println(singlyLinedList.head.value);

	}

}
