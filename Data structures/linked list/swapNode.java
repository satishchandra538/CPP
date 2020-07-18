public class swapNode {
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    void insertNode(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    void swap(int x, int y) {
        Node prevX = null;
        Node currX = head;
        while (currX != null && currX.data != x) {
            prevX = currX;
            currX = currX.next;
        }
        Node prevY = null;
        Node currY = head;
        while (currY != null && currY.data != y) {
            prevY = currY;
            currY = currY.next;
        }
        if (currY == null || currX == null)
            return;
        if (currX == currY)
            return;
        if (currX == head) {
            currY.next = head.next;
            head = currY;
        } 
        else {
            prevX.next = currY;
        }
        if (currY == head) {
            currX.next = head.next;
            head = currX;
        } 
        else {
            prevY.next = currX;
        }
        Node temp = currX.next;
        currX.next = currY.next;
        currY.next = temp;
    }

    void printList() {
        Node trav = head;
        while (trav != null) {
            System.out.print(trav.data + " ");
            trav = trav.next;
        }
        System.out.println();
    }

    static Node head;

    public static void main(String args[]) {
        swapNode sn = new swapNode();
        for (int i = 0; i < 10; i++) {
            sn.insertNode(i);
        }
        sn.printList();
        sn.swap(9, 6);
        sn.printList();
    }
}