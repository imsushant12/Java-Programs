public class NthNodeFromLastinLINKEDLIST {

    Node head;
    private int size;

    NthNodeFromLastinLINKEDLIST() {
        this.size = 0;
    }

    class Node {
        int data;
        Node next;

        // Constructor:
        Node(int data) {
            this.data = data;
            this.next = null;
            size++;
        }
    } 

    public void addFirst(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    public void addLast(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node currentNode = head;
        while (currentNode.next != null) {
            currentNode = currentNode.next;
        }
        currentNode.next = newNode;
    }

    public void printList() {
        if (head == null) {
            System.out.println("The list is empty.");
            return;
        }

        Node currentNode = head;

        while (currentNode != null) {
            System.out.print(currentNode.data + "  -->  ");
            currentNode = currentNode.next;
        }
        System.out.print("NULL.\n");
    }

    public int getSize() {
        return size;
    }

    public void nthNodeFromLast(int n) {
        if (head == null) {
            System.out.println("The list is empty.");
            return;
        }

        // Using the two pointer technicque:
        int currentPosition = n;
        Node firstPointer = head;
        Node secondPointer = head;

        while (n > 0) {
            secondPointer = secondPointer.next;
            n--;
        }

        while (secondPointer != null) {
            secondPointer = secondPointer.next;
            firstPointer = firstPointer.next;
        }

        System.out.println(currentPosition + "th Node from the end is: " + firstPointer.data);
    }

    public static void main(String[] args) {

        NthNodeFromLastinLINKEDLIST ll = new NthNodeFromLastinLINKEDLIST();

        ll.addFirst(10);
        ll.addLast(20);
        ll.addLast(30);
        ll.addLast(40);
        ll.addLast(50);

        ll.printList();
        System.out.println(ll.getSize());

        ll.nthNodeFromLast(3);
    }
}