package com.umer.execute;

public class Execute {

	public static void main(String[] args) {
		System.out.println("Test");
		SinglyLinedList singlyLinedList=new SinglyLinedList();
		singlyLinedList.createSinglyLinkedList(5);
		System.out.println(singlyLinedList.head.value);

	}

}
