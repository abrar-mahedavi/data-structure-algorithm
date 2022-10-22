public class CustomSingularLinkList {

  private Node head;
  private int size;

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
      this.head = new Node(data);
      this.size = 1;
    } else {
      Node temp = head;
      while (temp.next != null) {
        temp = temp.next;
      }
      Node newNode = new Node(data);
      temp.next = newNode;
      this.size++;
    }
  }

  public void addNodeAtFirst(int data) {
    if (null == head) {
      head = new Node(data);
      this.size = 1;
    } else {
      Node newNode = new Node(data);
      newNode.next = head;
      head = newNode;
      this.size++;
    }
  }

  public void addNodeAtLast(int data) {
    if (null == head) {
      head = new Node(data);
      this.size = 1;
    } else {
      Node temp = head;
      while (temp.next != null) {
        temp = temp.next;
      }
      Node newNode = new Node(data);
      temp.next = newNode;
      this.size++;
    }
  }

  public void addNodeAtIndex(int index, int data) {
    int count = 1;
    if (null == head && count <= index) {
      head = new Node(data);
      this.size = 1;
    } else {
      Node temp = head;
      while (temp.next != null && count < index) {
        temp = temp.next;
        count++;
      }
      Node newNode = new Node(data);
      newNode.next = temp.next;
      temp.next = newNode;
      this.size++;
    }
  }

  public void removeFirstNode() {
    if (null == head) {
      System.out.println("No nodes can't remove anything");
    } else {
      Node temp = head;
      head = temp.next;
      this.size--;
    }
  }

  public void removeLastNode() {
    if (null == head) {
      System.out.println("No nodes can't remove anything");
    } else {
      Node temp = head;
      while (temp.next.next != null) {
        temp = temp.next;
      }
      temp.next = null;
      this.size--;
    }
  }

  public int size() {
    return this.size;
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
