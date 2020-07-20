public class stackinarray{
    static final int MAX = 10;
    int arr[] = new int[MAX];
    int top;
    void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    stackinarray(){
        top=-1;
    }
    void push(int data){
        if(top>=MAX-1){
            System.out.println("Stack Overflow...");
        }
        else{
            arr[++top] = data;
            printArray(arr);
        }
    }
    boolean isempty(){
        return top<0;
    }
    int pop(){
        if(top<0){
            System.out.println("Stack Underflow...");
            return 0;
        }
        else{
            return arr[top--];
        }
    }
    int top(){
        if(top<0){
            System.out.println("Stack Underflow...");
            return 0;
        }
        else{
            return arr[top];
        }
    }
}

class Main{
    public static void main(String args[]){
        stackinarray s = new stackinarray();
        s.push(1);
        s.push(23);
        System.out.println("top="+s.top());
        s.push(1);
        s.push(23);
        System.out.println("top=" +s.top());
        System.out.println(s.pop());
        s.push(67);
    }
}