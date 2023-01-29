public class ListUsingALinkedList<E> implements List<E> {

  Node<E> front;
  int numberOfElements;

  ListUsingALinkedList() {
    front = null;
    numberOfElements = 0;
  }

  public void add(E element) throws CapacityReachedListException {
    add(numberOfElements + 1, element);
    
  }

  Node<E> getNode(int position) {
    if (position > numberOfElements)
      return null;

    Node<E> tmp = front;
    if (front != null) {
      int counter = 1;
      while (counter < position) {

        tmp = tmp.next;
        counter++;
      }
    }
    return tmp;
  }

  public void add(int position, E element) {
    Node<E> aNewNode = new Node<E>();
    aNewNode.data = element;
    if (position > 1) {

      Node<E> prevNode = getNode(position - 1);

      // 1
      aNewNode.next = prevNode.next;

      // 2
      prevNode.next = aNewNode;
      numberOfElements++;
    } else if (position == 1) {
      // position is 1
      aNewNode.next = front;
      front = aNewNode;
      numberOfElements++;
    } else {
      System.out.println("You should not use position < 1 ");
    }
  }

  public void remove(int position) throws RemovalOnAnEmptyListException {
    // try {1
    if (numberOfElements > 1) {
      Node<E> prevNode = getNode(position - 1);
      Node<E> tmp = prevNode.next;
      // 1
      prevNode.next = prevNode.next.next;
      // 2
      tmp.next = null;
      numberOfElements--;
    } else if (numberOfElements == 1) {
      Node<E> tmp = front;

      front = front.next;

      tmp.next = null;
      numberOfElements--;
    } else {
      // System.out.println("You should remove from an empty List ");
      // throw new RuntimeException("You should remove from an empty List "); //
      // UnChecked Exception
      throw new RemovalOnAnEmptyListException("You should remove from an empty List "); // Checked Exception
      // not reachable
    }
    // } catch (Exception e) {
    // System.out.println(e.getMessage());
    // // cleaning
    // }
  }

  public E get(int position) {
    if (position >= 1)
      return getNode(position).data;
    else
      return null;
  }

  public int size() {
    return numberOfElements;
  }

  public static void main(String[] args) {
    List<Integer> x = new ListUsingALinkedList<Integer>();
    try {
      // Position starts from 1
      x.add(10);
      x.add(20);
      x.add(30);
      System.out.println(x.get(3));// 30
      x.add(1, 5);
      System.out.println(x.get(3));// 20
      x.remove(3);
      System.out.println(x.size());// 3
      x.remove(1);
      x.remove(1);
      x.remove(1);
      System.out.println(x.size());// 0
      // if (x.size() > 1)
      x.remove(1); // this is illegal and an exception will be raised
      System.out.println(x.size()); // 0
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }

  }

}
