# Linked list

## Table of content

- [Introduction](#introduction)
- [Out Of Scope](#out-of-scope)
- [Arrays vs linked list](#arrays-vs-linked-list)
- [Arrays](#arrays)
- [Linked list](#linked-list)
- [Types of linked list](#types-of-linked-list)
- [Linked list in memory](#linked-list-in-memory)
- [single linked list](#single-linked-list)
- [Creation in single linked list](#creation-in-single-linked-list)
- [Traversal in single linked list](#traversal-in-single-linked-list)
- [Searching in single linked list](#searching-in-single-linked-list)
- [Deletion in single linked list](#deletion-in-single-linked-list)
- [Deleting entire single linked list](#deleting-entire-single-linked-list)
- [Time and space complexity in single linked list](#time-and-space-complexity-in-single-linked-list)
- [Circular single linked list](#circular-single-linked-list)
- [Creation in Circular single linked list](#creation-in-circular-single-linked-list)
- [Insertion in Circular single linked list](#insertion-in-circular-single-linked-list)
- [Traversal in circular single linked list](#traversal-in-circular-single-linked-list)
- [Searching in circular single linked list](#searching-in-circular-single-linked-list)
- [Deletion in circular single linked list](#deletion-in-circular-single-linked-list)
- [Deleting entire circular single linked list](#deleting-entire-circular-single-linked-list)
- [Time and space complexity in circular single linked list](#time-and-space-complexity-in-circular-single-linked-list)
- [double linked list](#double-linked-list)
- [Insertion in double linked list](#insertion-in-double-linked-list)
- [Traversal in double linked list](#traversal-in-double-linked-list)
- [Reverse Traversal in double linked list](#reverse-traversal-in-double-linked-list)
- [Searching in double linked list](#searching-in-double-linked-list)
- [Deletion in double linked list](#deletion-in-double-linked-list)
- [Deletion of entire double linked list](#deletion-of-entire-double-linked-list)
- [Time and space complexity in double linked list](#time-and-space-complexity-in-double-linked-list)
- [Circular double linked list](#circular-double-linked-list)
- [Creation in circular double linked list](#creation-in-circular-double-linked-list)
- [Insertion in circular double linked list](#insertion-in-circular-double-linked-list)
- [Traversal in circular double linked list](#traversal-in-circular-double-linked-list)
- [Reverse Traversal in circular double linked list](#reverse-traversal-in-circular-double-linked-list)
- [Searching in circular double linked list](#searching-in-circular-double-linked-list)
- [Deletion in circular double linked list](#deletion-in-circular-double-linked-list)
- [Deleting entire circular double linked list](#deletion-in-circular-double-linked-list)
- [Summary of time and space complexity](#summary-of-time-and-space-complexity)
- [Time complexity of arrays vs linked list](#time-complexity-of-arrays-vs-linked-list)
- [Project structure](#project-structure)
- [Technologies Used](#technologies-used)
- [Prerequisities](#prerequisities)
- [Commands](#commands)
- [Contribution](#contribution)
- [References](#references)
- [Contact Information](#contact-information)

# Introduction

- Linked list is a form of sequential collection and it does not have to be in order. A linked list is made up of independent nodes that may contain any type of data and it has a reference to the next node(and sometimes previous node) in the link. 

- The first node is called HEAD and the last node is called the TAIL of the linked list.

# Out Of Scope

Since this is an beginner project in which the focus is just to learn the basics of various aspects of linked list as well as some basic usages of linked list, testing is out of scope of this project.

# Arrays vs linked list

## Arrays

- Elements in arrays are NOT independent objects. 
- The size of an array is always predefined.
- Random access - accessing an elements in the case of an array is very efficient. That means that we can access the element based on the index in the array. O(n) = 1.

## Linked list
- Elements of linked list are independent objects. This means that we can remove an object from the middle of a linked list 
- Variable size - the size of a linked list is not pre-defined. This allows us dynamic resizing at runtime.
- Random access - accessing an elements in the case of a linked list is NOT efficient as we have to traverse through all elements till we reach the desired elements. O(n) = n


## Types of linked list

- single linked list(Example: any trivial application of a lined list)
- Circular single linked list(Example: a chess game in that how the turns switches among players)
- double linked list(Example: a music play list)
- Circular double linked list(Example: ctrl+tab/ctrl+shift+tab function in Linux OS)

## Linked list in memory

- TODO: Add a diagram representing linked list in memory.

# single linked list

## Creation in single linked list

The creation of a single linked list follows the following pseudo code:

- A new node called head is created.
- It value is set to the value provided.
- Its next node is set to _null_.
- Both _head_ and _tail_ are set to node value.
- The size is increased by 1.
- Finally, the node object is returned 

- TODO: Add a diagram representing creation of single linked list.

## Insertion in Linked List in memory

The following three variations are possible for insertion in a single linked list:

- At the beginning of a linked list
* We first check if the _head_ is null or not. If it is null,this means that the linked list does not exist yet and we call _create()_ instead.
* If the _head_ node is not null, then we check if the _location==0_. This means that insert should happen at the start of the list.  

This is achieved by doing the following:

```java 
// insert at the start of the linked list
node.next = head;
head = node;
```
  
- At the end of a linked list
* However, if _location >= size_, this means that the node should be inserted at the end of the list since the location is greater than the size of the node.

This is achieved by doing the following:

```java 
// Since the location is greater than the size of the node, This means that the
// node should be inserted at the end of the list.
node.next = null;
tail.next = node;
tail = node;
```

- After a node somewhere in the middle of linked list.
* If none of the above two conditions are fulfilled, it means that we have to insert the node somewhere in the middle of the linked list.

First, we loop through till the position at which we want to insert the node. Then, a new node is added as follows:

```java
Node tempnode = head;
int index = 0;
while (index < location - 1) {
	// We iterate over till we reach the position in the linked list where a new
	// node should be inserted.
	tempnode = tempnode.next;
	index++;
}
// We are at the location in the linked list where the new node should be
// inserted.
Node nextNode = tempnode.next;
tempnode.next = node;
node.next = nextNode;
```

Finally, the size of the linked list is increased by one.   



- TODO: Create 3 diagrams showing step-by-step of insertion of single Linked List in memory. (89)


## Traversal in single linked list

Here, we first check if the _head_ is null or not. If it is null, it means that the Single linked list does not exist.

If it is not null, then we loop through the linked list and print out each value one by one. This is achieved via the following code:

```java
Node tempNode = head;
for (int index = 0; index < size; index++) {
	System.out.print(tempNode.value);
	if (index < size - 1) {
		System.out.print(Constants.FORWARD_LINK);
	}
	tempNode = tempNode.next;
}
```
 

- TODO: Add a diagram depicting the traversal in a single linked list. (91)
Time complexity: O(n)

## Searching in single linked list

Here, we first check if the _head_ is null or not. If it is null, it means that the Single linked list does not exist.

If it is not null, then we loop through the linked list and match the value of the node to given node. If the value of the node matches the given value, we return true. Otherwise, false is returned.

This is achieved using the following code snippet:

```java
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
```

- TODO: Add a diagram depicting the searching a value in a single linked list. (92)
Time complexity: O(n)

## Deletion in single linked list

The following three variations are possible for insertion in a single linked list:

- At the beginning of a linked list
* We first check if the _head_ is null or not. If it is null,this means that the linked list does not exist.
* If the _head_ node is not null, then we check if the _location==0_. This means that delete should happen at the start of the list.   After deletion, we check if the size is equal to zero. If yes, _tail_ is set to null.

This is achieved by doing the following:

```java 
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
}
```
  
- At the end of a linked list
* However, if _location >= size_, this means that the node should be deleted at the end of the list since the location is greater than the size of the node. We loop through the list till we come upon the node to delete. Now, if it is the first node(_head_), we set both _head_ and _tail_ to null. Else we set _tempNode.next = null_ and _tail = tempNode;_.  

This is achieved by doing the following:

```java 
else if (location >= size) {
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
}
```

- A node somewhere in the middle of linked list.
* If none of the above two conditions are fulfilled, it means that we have to delete the node somewhere in the middle of the linked list.

First, we loop through till the position at which we want to insert the node. Then, the node is deleted as follows:

```java
// We are deleting an element from somewhere in the middle of the linked list
Node tempNode = head;
for (int i = 0; i < location - 1; i++) {
	tempNode = tempNode.next;
}
// By doing this, we skip the node at the 'location', hence deleting it from the
// memory
tempNode.next = tempNode.next.next;
decreaseSize();
```

Finally, the size of the linked list is decreased by one.   


- TODO: Add a diagram depicting the deletion in a single linked list. (93)
Time complexity: O(n)

## Deleting entire single linked list
- TODO: Add a diagram depicting the deletion in a single linked list. (95)
Time complexity: O(1)

## Time and space complexity in single linked list
- TODO: Add a diagram depicting the deletion in a single linked list. (96)


# Circular single linked list
- TODO: Add a diagram depicting the deletion in a single linked list. (98) x2

## Creation in Circular single linked list
-  Diagram with changes (3x) (99).
- Time complexity of creation with one node: O(1).

## Insertion in Circular single linked list
-  Diagram with changes (1x) (100).
- Time complexity of insertion of a node: O(n).

## Traversal in circular single linked list

- TODO: Add a diagram depicting the traversal in a circular single linked list. (102)
Time complexity: O(n) 

## Searching in circular single linked list

- TODO: Add a diagram depicting the searching a value in a single linked list. (103)
Time complexity: O(n)

## Deletion in circular single linked list

- TODO: Add a diagram depicting the searching a value in a single linked list. (104+105)
Time complexity: O(n)

## Deleting entire circular single linked list
Time complexity: O(1)

## Time and space complexity in circular single linked list
- TODO: Add a diagram depicting the deletion in a single linked list. (108)

# double linked list
- TODO: Add a diagram depicting the deletion in a double linked list. (110)---> Please double check the video number. 
- Time complexity of creation with one node: O(1).

## Insertion in double linked list
- TODO: Add a diagram depicting the deletion in a double linked list. (112)---> Please double check the video number.
- Time complexity of creation with one node: O(1).

## Traversal in double linked list
- TODO: Add a diagram depicting the deletion in a double linked list. (104)---> Please double check the video number.
- Time complexity of creation with one node: O(n).

## Reverse Traversal in double linked list  
- TODO: Add a diagram depicting the deletion in a double linked list. (105)---> Please double check the video number.
- Time complexity of traversal with one node: O(n).

## Searching in double linked list  
- TODO: Add a diagram depicting the searching algorithm in a double linked list. (106)
- Time complexity of searching with one node: O(n).

## Deletion in double linked list  
- TODO: Add a diagram depicting the searching algorithm in a double linked list. (108)
- Time complexity of deletion with one node: O(n).

## Deletion of Entire double linked list  
- Time complexity of deletion with one node: O(n).

## Time and space complexity in double linked list
 - Create a diagram describing time and space complexity for double linked list. (111)

# Circular double linked list

## Creation in Circular double linked list
- TODO: Add a diagram depicting the creation of a circular double linked list. (113) 
- Time complexity of creation with one node: O(1).

## Insertion in Circular double linked list
- TODO: Add a diagram depicting the insertion algorithm for circular double linked list. (115) 
- Time complexity of creation with one node: O(n).

## Traversal in Circular double linked list
- TODO: Add a diagram depicting the traversal algorithm for circular double linked list. (117) 
- Time complexity of creation with one node: O(n).

## Reverse Traversal in Circular double linked list
- TODO: Add a diagram depicting the reverse traversal algorithm for circular double linked list. (118) 
- Time complexity of creation with one node: O(n).

## Searching in Circular double linked list
- TODO: Add a diagram depicting the searching algorithm for circular double linked list. (119)
- Time complexity of creation with one node: O(n).

## Deletion in Circular double linked list
- TODO: Add a diagram depicting the deletion algorithm for circular double linked list. (121)
- Time complexity of creation with one node: O(n).

## Deleting entire Circular double linked list
- Time complexity of Deleting entire Circular double linked list: O(n).

## Summary of time and space complexity
- TODO: Add a diagram depicting the table of time and space complexities for circular double linked list. (124)

## Time complexity of arrays vs linked list
- TODO: Add a diagram depicting the table of time complexities for arrays vs linked list. (125)

 

## Project structure

There are several packages, one for each problem, which contain the solution inside a _Service_ class. These service classes are instantiated and called from _main()_ inside the Execute class which can be found inside _com.umer.main_ package.

## Technologies Used

- Java 11.


## Commands

In order to run the program, one needs to open the project in a suitable IDE(such as Eclipse, STS, VSCode 0or IntelliJ), navigate to the Execute class inside com.umer.main package. Once there, right click---> Run As ---> Java Application.

The program is written in such a way that most of the service currently uses hard-coded values and it does not take any input from the user. However, one can go inside the main() inside Execute class and change the input parameters as one sees fit.

## Contribution

Feature requests, issues, pull requests and questions are welcome.
 

## References

- [1](https://bechtle.udemy.com/course/java-data-structures-and-algorithms-masterclass/learn/): Data Structures and Algorithms from Zero to Hero and Crack Top Companies 100+ Interview questions (Java Coding) **(Udemy)** **(Primary resource)**
- [2](https://www.happycoders.eu/): Happy Coders

## Contact Information

How to reach me? At [github specific gmail account](mailto:syedumerahmedcode@gmail.com?subject=%5BGitHub%5D%20Hello%20from%20Github). Additionally, you can reach me via [Linkedin](https://www.linkedin.com/in/syed-umer-ahmed-a346a746/) or at [Xing](https://www.xing.com/profile/SyedUmer_Ahmed/cv).
  