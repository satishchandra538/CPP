public class reverese_linkedlist {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    void insertNode(Node head, int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    void insertList(int data) {
        Node node = new Node(data);
        if (head == null) {
            head = node;
        } else {
            Node trav = head;
            while (trav.next != null) {
                trav = trav.next;
            }
            trav.next = node;
        }
    }

    static Node head = null;

    void printList(Node head) {
        Node trav = head;
        while (trav != null) {
            trav = trav.next;
        }
        System.out.println();
    }

    Node reverseLinkedList(Node head) {
        Node prev = null;
        Node current = head;
        Node next = null;
        System.out.println(current.data);
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }

    public static void main(String args[]) {
        reverese_linkedlist rll = new reverese_linkedlist();
        for (int i = 0; i < 10; i++) {
            rll.insertList(i);
        }
        head = rll.reverseLinkedList(head);
        rll.printList(head);
    }
}