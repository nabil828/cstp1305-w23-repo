public class PriorityQueueUsingArrays {
  Integer[] arr;
  int numberOfElements;

  PriorityQueueUsingArrays() {
    arr = new Integer[10];
    numberOfElements = 0;
  }

  void add(int element) {
    arr[numberOfElements] = element;
    numberOfElements++;
  }

  int peek() {
    int min = Integer.MAX_VALUE;
    for (int i = 0; i < numberOfElements; i++) {
      if (arr[i] < min) {
        min = arr[i];
      }
    }

    return min;
  }

  void remove() {
    int min = Integer.MAX_VALUE;
    int minIndex = -1;
    for (int i = 0; i < numberOfElements; i++) {
      if (arr[i] < min) {
        min = arr[i];
        minIndex = i;
      }
    }

    // start shifting form the index of the minimum <<
    for (int i = minIndex; i < (numberOfElements - 1); i++) {
      arr[i] = arr[i + 1];
    }

  }

  public static void main(String[] args) {
    PriorityQueueUsingArrays aPQueue = new PriorityQueueUsingArrays();
    aPQueue.add(5);
    aPQueue.add(3);
    aPQueue.add(2);
    aPQueue.add(1);
    aPQueue.add(6);

    System.out.println(aPQueue.peek());// 1 most priority
    aPQueue.remove();// removing 1 most priority

  }
}
