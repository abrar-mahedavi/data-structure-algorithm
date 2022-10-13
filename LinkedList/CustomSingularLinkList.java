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

}
