# Assignment 1 - SET ADT
A **set** is collection that does not allow repeated, or duplicate, entries. Whenever you
must process an item in a data collection only once, you can use a set. For example, a compiler must
find the identifiers in a program and ensure that each one has been defined only once. It could add
each identifier encountered to a set. If this addition is unsuccessful, the compiler will have detected
an identifier previously found.

```js
 /** An interface that describes the operations of a set of
objects. */
public interface SetInterface<T>
{
public int getCurrentSize();
public boolean isEmpty();

/** Adds a new entry to this set, avoiding duplicates.
 @param newEntry The object to be added as a new entry.
@return True if the addition is successful, or
false if the item already is in the set. */
public boolean add(T newEntry);

/** Removes a specific entry from this set, if possible.
@param anEntry The entry to be removed.
@return True if the removal was successful, or false if
not. */
public boolean remove(T anEntry);

public void clear();
public boolean contains(T anEntry);
public T[] toArray();
} // end SetInterface
```

## Requirements
- Implement the **SetInterface** using arrays and linked lists.
- Write unit tests to verify your implementation. 
- Create a 3-minute maximum YouTube video to demonstrate your work.

## Deliverables
- The YT link.



