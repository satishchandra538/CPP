import java.util.Random;
import java.util.Scanner;

class unionIntersection {
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }

    Node insert(Node head, int data) {
        Node node = new Node(data);
        node.next = head;
        head = node;
        return head;
    }

    void print(Node head) {
        if (head == null)
            return;
        Node trav = head;
        while (trav != null) {
            System.out.print(trav.data + " -> ");
            trav = trav.next;
        }
        System.out.println();
    }

    int[][] hashArray(Node head) {
        Node node = head;
        int min = node.data, max = node.data;
        while (node.next != null) {
            node = node.next;
            if (node.data > max)
                max = node.data;
            if (node.data < min)
                min = node.data;
        }
        int minmax[] = { min, max };
        node = head;
        int hashArr[] = new int[max - min + 1];
        while (node != null) {
            hashArr[node.data - min] = node.data;
            node = node.next;
        }
        return new int[][] { hashArr, minmax };
    }

    public static void main(String args[]) {
        unionIntersection ui = new unionIntersection();
        Scanner s = new Scanner(System.in);
        Random r = new Random();
        System.out.print("Enter number of cases = ");
        int t = s.nextInt();
        while (t-- > 0) {
            System.out.println("Making Two Linked Lists:-");
            Node head1 = null, head2 = null, head3 = null;
            for (int i = 0; i < 10; i++) {
                head1 = ui.insert(head1, r.nextInt(100));
            }
            ui.print(head1);
            for (int i = 0; i < 8; i++) {
                head2 = ui.insert(head2, r.nextInt(100));
            }
            ui.print(head2);
            int hashArray[][] = ui.hashArray(head1);
            Node trav = head2;
            while (trav != null) {
                if (trav.data == hashArray[0][trav.data - hashArray[1][0]]) {
                    head3 = ui.insert(head3, trav.data);
                }
                trav = trav.next;
            }
            ui.print(head3);
        }
        s.close();
    }
}