public class middleOfList {
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public Node head = null;

    void insertNode(int data) {
        Node node = new Node(data);
        if (head == null) {
            head = node;
        } else {
            Node trav = head;
            while (trav.next != null)
                trav = trav.next;
            trav.next = node;
        }
    }

    void printList(Node head) {
        Node trav = head;
        while (trav != null) {
            System.out.print(trav.data + " ");
            trav = trav.next;
        }
        System.out.println();
    }

    void findMiddle(Node head) {
        Node trav1 = head, trav2 = head;
        while (trav1 != null && trav2.next != null) {
            trav1 = trav1.next;
            trav2 = trav2.next.next;
        }
        System.out.println("middle is = " + trav1.data);
    }

    public static void main(String args[]) {
        middleOfList list = new middleOfList();
        java.util.Random random = new java.util.Random();
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Enter Size of list to generate = ");
        int size = scanner.nextInt();
        for (int i = 0; i < size; i++) {
            list.insertNode(random.nextInt(100));
        }
        list.printList(list.head);
        list.findMiddle(list.head);
        scanner.close();
    }
}