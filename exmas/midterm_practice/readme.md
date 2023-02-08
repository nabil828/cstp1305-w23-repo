**Midterm Exam**
**Instructions**
- Exam duration is 90 minutes.
- Open book.
- You may your previous labworks.
- You should demonstrate through tests code that your implementation is working.



**The Set ADT - Part I [40%]**
*Set* is Unordered collection of elements – no duplicates.
{1, 3, 8} is the same as {3, 8, 1}

The Set ADT maximum capacity is 10 elements.

Implement the following core methods in the Set ADT
-add(item)
-remove(item)
-contains(item)

Non-core methods
-toArray() - this method will return an array of elements in the ADT
-clear()
-getSize()
-isEmpty


Implementation details
- Implement the *Set* ADT using **Array**, **Circular Linked List** and **Doubly linked list**.
- For the array implementation, start with an array size of one and double the array size whenever the size of the Set ADT reaches 80% capacity.


**The Set ADT - Part II [60%]**
The following operations are common for over *Set* ADT,
Set union (S ∪ S'), set intersection (S ∩ S') and set difference (i.e. subtraction) (S − S').
Each of these operation will result a new set.

Create the following java functions
• `public static Set union(Set A, Set B)` implements A ∪ B: add all the element of A to B
• `public static Set intersect(Set A, Set B)` implements A ∩ B: retain only the common elements between A and B
• `public static Set difference(Set A, Set B)` implements A − B: removing all elements of B from A



Bonus - More Implementation Details 
<!-- - [x] a custom/user-defined exception should be raised whenever the you reach maximum capacity is reached. -->
- [x] a custom/user-defined exception should be raised whenever the set is accessed while empty.
- [x] Implement the ADT using an interface


**Formatting and style conventions** [-10% if not cared for]
-- Naming conventions - https://www.oracle.com/java/technologies/javase/codeconventions-namingconventions.html
-- Add the ADT description in the interface.
-- For each method in the interface, add specifications (pre and post-conditions).
