# Linked list

## Table of content

- [Introduction](#introduction)
- [Out Of Scope](#out-of-scope)
- [Average Temperature Calculation](#average-temperature-calculation)

- [Project structure](#project-structure)
- [Technologies Used](#technologies-used)
- [Prerequisities](#prerequisities)
- [Commands](#commands)
- [Contribution](#contribution)
- [References](#references)
- [Contact Information](#contact-information)

## Introduction

- Linked list is a form of sequential collection and it does not have to be in order. A linked list is made up of independent nodes that may contain any type of data and it has a reference to the next node in the link. 

- The first node is called HEAD and the last node is called the TAIL of the linked list.

## Out Of Scope

Since this is an beginner project in which the focus is just to learn the basics of various aspects of linked list as well as some basic usages of linked list, testing is out of scope of this project.

## Arrays vs linked list

# Arrays
- Elements in arrays are NOT independent objects. 
- The size of an array is always predefined.
- Random access - accessing an elements in the case of an array is very efficient. That means that we can access the element based on the index in the array. O(n) = 1.

# Linked list
- Elements of linked list are independent objects. This means that we can remove an object from the middle of a linked list 
- Variable size - the size of a linked list is not pre-defined. This allows us dynamic resizing at runtime.
- Random access - accessing an elements in the case of a linked list is NOT efficient as we have to traverse through all elements till we reach the desired elements. O(n) = n


## Types of linked list

- Singly linked list(Example: any trivial application of a lined list)
- Circular singly linked list(Example: a chess game in that how the turns switches among players)
- Doubly linked list(Example: a music play list)
- Circular doubly linked list(Example: ctrl+tab/ctrl+shift+tab function in Linux OS)

# Linked list in memory

- TODO: Add a diagram representing linked list in memory.

# Creation - singly linked list

The creation of a singly linked list follows the following pseudo code:

- TODO: Add a diagram representing creation of singly linked list.

# Insertion - Linked List in memory

The following three variations are  possible for insertion in a singly linked list:

- At the beginning of a linked list
- After a node in the middle of linekd list
- At the end of a linked list

- TODO: Create 3 diagrams showing step-by-step of insertion of Singly Linked List in memory. (89)


# Traversal - singly linked list

- TODO: Add a diagram depicting the traversal in a singly linked list. (91)
Time complexity: O(n)

# Searching - singly linked list

- TODO: Add a diagram depicting the searching a value in a singly linked list. (92)
Time complexity: O(n)

# Deletion - Singly linked list

- TODO: Add a diagram depicting the deletion in a singly linked list. (93)
Time complexity: O(n)

# Deleting entire singly linked list
- TODO: Add a diagram depicting the deletion in a singly linked list. (95)
Time complexity: O(1)

# Time and space complexity of the singly linked list
- TODO: Add a diagram depicting the deletion in a singly linked list. (96)


## Circular singly linked list
- TODO: Add a diagram depicting the deletion in a singly linked list. (98) x2
- Time complexity of creation with one node: O(1).

# Creation - Circular singly linked list
-  Diagram with changes (3x) (99).

# Insertion - Circular singly linked list
-  Diagram with changes (1x) (100).
- Time complexity of insertion of a node: O(n).

# Traversal - circular singly linked list

- TODO: Add a diagram depicting the traversal in a circular singly linked list. (102)
Time complexity: O(n) 

# Searching - circular singly linked list

- TODO: Add a diagram depicting the searching a value in a singly linked list. (103)
Time complexity: O(n)

# Deletion - circular singly linked list

- TODO: Add a diagram depicting the searching a value in a singly linked list. (104+105)
Time complexity: O(n)

# Deleting entire circular singly linked list
Time complexity: O(1)

# Time and space complexity of the circular singly linked list
- TODO: Add a diagram depicting the deletion in a singly linked list. (108)

## Doubly linked list
- TODO: Add a diagram depicting the deletion in a singly linked list. (110)
- Time complexity of creation with one node: O(1).

## Insertion - Doubly linked list
- TODO: Add a diagram depicting the deletion in a singly linked list. (112)
- Time complexity of creation with one node: O(1). 

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
  