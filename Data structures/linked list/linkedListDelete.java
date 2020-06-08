public class linkedListDelete {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
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

    void printList(Node head) {
        Node trav = head;
        while (trav != null) {
            System.out.print(trav.data + " ");
            trav = trav.next;
        }
        System.out.println("");
    }

    void deleteNode(int pos) {
        Node trav = head;
        for (int i = 0; i < pos - 2; i++) {
            trav = trav.next;
        }
        Node thisOne = trav.next;
        trav.next = trav.next.next;
        System.out.println("Deleted Node value is = " + thisOne.data);
    }

    public Node head = null;

    public static void main(String args[]) {
        linkedListDelete list = new linkedListDelete();
        java.util.Random random = new java.util.Random();
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Enter Size of Linked list to get generated = ");
        int size = scanner.nextInt();
        for (int i = 0; i < size; i++) {
            list.insertList(random.nextInt(100));
        }
        list.printList(list.head);
        System.out.print("Enter Position of Linked to be deleted = ");
        int pos = scanner.nextInt();
        list.deleteNode(pos);
        list.printList(list.head);
        scanner.close();
    }
}