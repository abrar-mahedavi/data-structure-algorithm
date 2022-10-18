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

  public void addNodeAtFirst(int data) {
    if (null == head) {
      head = new Node(data);
    } else {
      Node newNode = new Node(data);
      newNode.next = head;
      head = newNode;
    }
  }

  public void addNodeAtLast(int data) {
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

  public void printData() {
    Node temp = this.head;
    while (temp != null) {
      System.out.println(temp.data);
      temp = temp.next;
    }
  }

  public static void main(String[] args) {
    CustomSingularLinkList customSingularLinkList = new CustomSingularLinkList();
    customSingularLinkList.addNode(1);
    customSingularLinkList.addNode(2);
    customSingularLinkList.addNode(3);
    customSingularLinkList.printData();
  }

}
