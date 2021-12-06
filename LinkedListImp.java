public class LinkedListImp {

    Node head;
    private int size;

    LinkedListImp() {
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

    public void addAfter(int data, int position) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        if (position > size) {
            System.out.println("List is smaller than specified position!");
            return;
        }

        Node currentNode = head;
        int currentPosition = 1;

        while (currentPosition != position) {
            currentNode = currentNode.next;
            currentPosition++;
        }

        newNode.next = currentNode.next;
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

    public void delFirst() {
        if (head == null) {
            System.out.println("The list is empty.");
            return;
        }
        size--;

        Node deletedNode = head;
        head = head.next;

        System.out.println("Deleted: " + deletedNode.data);
    }

    public void delLast() {
        if (head == null) {
            System.out.println("The list is empty.");
            return;
        }
        size--;

        if (head.next == null) {
            head = null;
            return;
        }

        Node deletedNode = head;
        Node currentNode = head.next;

        while (currentNode.next != null) {
            currentNode = currentNode.next;
            deletedNode = deletedNode.next;
        }

        System.out.println("Deleted: " + deletedNode.next.data);
        deletedNode.next = null;
    }

    public void deleteAfter(int position) {
        if (head == null) {
            System.out.println("The list is empty.");
            return;
        }
        size--;

        if (position > size) {
            System.out.println("List is smaller than specified position!");
            return;
        }

        Node currentNode = head;
        int currentPosition = 1;

        while (currentPosition < position - 1) {
            currentNode = currentNode.next;
            currentPosition++;
        }
        Node deletedNode = currentNode.next;
        currentNode.next = deletedNode.next;

        System.out.println("Deleted: " + deletedNode.data);

    }

    public int getSize() {
        return size;
    }

    public void reverseListIterative() {
        if (head == null) {
            System.out.println("The list is empty.");
            return;
        }

        if (head.next == null)
            return;

        Node previousNode = head;
        Node currentNode = head.next;

        while (currentNode != null) {
            Node nextNode = currentNode.next;
            currentNode.next = previousNode;

            // Updating nodes:
            previousNode = currentNode;
            currentNode = nextNode;
        }

        head.next = null;
        head = previousNode;
    }

    public Node reverseListRecursive(Node head) {
        if (head == null) {
            System.out.println("The list is empty.");
            return null;
        }

        if (head.next == null)
            return head;

        Node newNode = reverseListRecursive(head.next);

        head.next.next = head;
        head.next = null;

        return newNode;
    }

    public static void main(String[] args) {
        LinkedListImp ll = new LinkedListImp();

        ll.addFirst(10);
        ll.addFirst(20);
        ll.addFirst(30);
        ll.addLast(40);
        ll.addLast(50);
        ll.addFirst(11);
        ll.addLast(60);

        ll.printList();
        System.out.println(ll.getSize());

        ll.addAfter(65, 2);

        ll.printList();
        System.out.println(ll.getSize());

        ll.deleteAfter(3);
        ll.printList();
        System.out.println(ll.getSize());

        ll.reverseListIterative();
        ll.head = ll.reverseListRecursive(ll.head);
        ll.printList();
    }
}