public class DequeueUsingDoublyLinkedList {
  DoublyNode front;
  DoublyNode back;

  DequeueUsingDoublyLinkedList() {
    front = null;
    back = null;
  }

  void addFirst(int anItem) {
    // O(1)
    DoublyNode aNewNode = new DoublyNode();
    aNewNode.data = anItem;

    if (front == null) {
      front = aNewNode;
      back = aNewNode;

    } else {
      aNewNode.next = front;
      front.prev = aNewNode;

      front = aNewNode;
    }
  }

  void addLast(int anItem) {
    // O(1)
    DoublyNode aNewNode = new DoublyNode();
    aNewNode.data = anItem;

    if (back == null) {
      front = aNewNode; //
      back = aNewNode; //
    } else {
      back.next = aNewNode; // 1
      aNewNode.prev = back; // 2

      back = aNewNode; // 3
    }
  }

  void removeFirst() {
    if (front != null) {
      DoublyNode tmp = front;
      front = front.next;
      front.prev = null;

      tmp.next = null;
    }
  }

  void removeLast() {
    if (back != null) {
      back = back.prev;
      back.next.prev = null;
      back.next = null;
    }
  }

  int getFirst() {
    // O(1)
    return front.data;
  }

  int getLast() {
    // O(1)
    return back.data;
  }

  public static void main(String[] args) {
    DequeueUsingDoublyLinkedList aDequeue = new DequeueUsingDoublyLinkedList();
    aDequeue.addFirst(1);
    aDequeue.addFirst(2);
    System.out.println(aDequeue.getLast()); // 1
    aDequeue.addLast(3);
    System.out.println(aDequeue.getFirst()); // 2
  }

}
