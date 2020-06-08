public class linkedListAddition {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public Node head = null;

    void addNode(int data) {
        Node new_node = new Node(data);
        if (head == null) {
            head = new_node;
        } else {
            Node trav = head;
            while (trav.next != null) {
                trav = trav.next;
            }
            trav.next = new_node;
        }
    }

    void printList() {
        Node trav = head;
        while (trav != null) {
            System.out.print(trav.data + " ");
            trav = trav.next;
        }
        System.out.println();
    }

    public static void main(String args[]) {
        linkedListAddition list = new linkedListAddition();
        for(int i=0;i<50;i++){
            java.util.Random random = new java.util.Random();
            list.addNode(random.nextInt(100));
        }
        list.printList();
    }
}