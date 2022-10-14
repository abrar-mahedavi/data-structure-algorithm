public class CustomSingularLinkList {

  private Node head;

  public class Node {

    int data;
    Node next;

    private Node() throws IllegalAccessException {
      throw new IllegalAccessException("Cannot create an object of node");
    }

    Node(int data) {
      this.data = data;
      this.next = null;
    }
  }

  public void addNode(int data) {
    if (null == head) {
      head = new Node(data);
    } else {
      Node temp = head;
      while (temp.next != null) {
        temp = temp.next;
      }
      Node newNode = new Node(data);
      temp.next = newNode;
    }
  }

}
