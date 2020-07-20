public class stackusinglinkedlist {
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    Node head = null;
    void printList(){
        Node trav = head;
        while(trav!=null){
            System.out.print(trav.data+" ");
            trav = trav.next;
        }
        System.out.println();
    }
    void push(int data){
        Node newnode = new Node(data);
        newnode.next = head;
        head = newnode;
        printList();
    }
    void pop(){
        System.out.println(head.data + " is popped...");
        head = head.next;
    }
    void isempty(){
        if(head==null){
            System.out.println("yes list is empty...");
        }
        else{
            System.out.println("No list is not empty...");
        }
    }
    void top(){
        if(head!=null){
            System.out.println(head.data + " is at top...");
        }
        else{
            System.out.println("list is empty...");
        }
    }
    public static void main(String args[]){
        stackusinglinkedlist sll = new stackusinglinkedlist();
        sll.isempty();
        sll.top();
        for(int i=0;i<10;i++){
            sll.push(i);
        }
        sll.pop();
        sll.top();
        sll.isempty();
        sll.printList();
    }
}