public class ListUsingDoublyLinkedList implements List {
  DoublyNode front;
  DoublyNode back;
  int numberOfElements = 0;

  ListUsingDoublyLinkedList() {

  }

  // helper function
  DoublyNode getNode(int position) {
    if (position <= numberOfElements) {
      DoublyNode tmp = front;
      int counter = 1; // first position
      while (tmp.next != null && (counter <= position)) {
        counter++;
        tmp = tmp.next;
      }
      return tmp;
    }
    return null;
  }

  public void add(int element) {
    DoublyNode aNewNode = new DoublyNode();
    aNewNode.data = element;

    back.next = aNewNode;
    aNewNode.prev = back;

    back = aNewNode;

    numberOfElements++;
  }

  public void add(int position, int element) {
    DoublyNode x = getNode(position);

    DoublyNode aNewNode = new DoublyNode();
    aNewNode.data = element;

    aNewNode.next = x;
    aNewNode.prev = x.prev;
    x.prev.next = aNewNode;
    x.prev = aNewNode;

    numberOfElements++;

  }

  public void remove(int position) {

  }

  public int get(int position) {
    return getNode(position).data;
  }

  public int size() {
    return -1;
  }

  public static void main(String[] args) {
    List x = new ListUsingDoublyLinkedList();
    // Position starts from 1
    x.add(10);
    x.add(20);
    x.add(30);
    System.out.println(x.get(3));// 30
    x.add(1, 5);
    System.out.println(x.get(3));// 20
    x.remove(3); // 20
    // System.out.println(x.size());// 3
  }

}
