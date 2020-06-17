public class stackInList {
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public Node head = null;

    void push(int data) {
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

    void pop() {
        Node trav = head;
        if (head == null) {
            System.out.println("List is Empty.");
            return;
        }
        while (trav.next.next != null) {
            trav = trav.next;
        }
        trav.next = null;
    }

    void top() {
        Node trav = head;
        if (head == null) {
            System.out.println("List is Empty.");
            return;
        }
        while (trav.next != null) {
            trav = trav.next;
        }
        System.out.println("Top of Stack is = " + trav.data);
    }

    void printList(Node head) {
        Node trav = head;
        while (trav != null) {
            System.out.print(trav.data + " ");
            trav = trav.next;
        }
        System.out.println();
    }

    public static void main(String args[]) {
        stackInList list = new stackInList();
        list.top();
        list.push(3);
        list.push(2);
        list.push(5);
        list.top();
        list.push(4);
        list.push(9);
        list.top();
        list.push(7);
        list.printList(list.head);
        list.pop();
        list.printList(list.head);
        list.pop();
        list.printList(list.head);
        list.top();
    }
}