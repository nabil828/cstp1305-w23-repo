
public interface List<E> {
  // List is a collection if ordered items
  // each item has a position
  // positioning starts from 1
  // add an element to the end of the list
  // Capacity 10 item
  // @throws CapacityReachedListException whenever the capacity is reached
  public void add(E element) throws CapacityReachedListException;

  // add an element to specific position in the list
  public void add(int position, E element);

  // remove an element from specific position in the list
  // if the list is empty an Exception should be raised
  public void remove(int position) throws RemovalOnAnEmptyListException;

  // add an element to specific position in the list
  public E get(int position);

  // get the size of the list
  public int size();
}
