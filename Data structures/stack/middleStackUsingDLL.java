public class middleStackUsingDLL {
    class DLLNode{
        int data;
        DLLNode next;
        DLLNode prev;
        DLLNode(int data){
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }
    class myStack{
        DLLNode head;
        DLLNode mid;
        int count;
    }
    myStack createStack(){
        myStack ms = new myStack();
        ms.count = 0;
        return ms;
    }
    static DLLNode head = null;
    void push(myStack ms,int data){
        DLLNode newNode = new DLLNode(data);
        if(head==null){
            head = newNode;
        }
        else{
            newNode.next = ms.head;
            head.prev = newNode;
            ms.head = newNode;
        }
        ms.count++;
        
    }
    public static void main(String args[]){
        //middleStackUsingDLL msd = new middleStackUsingDLL();

    }
}