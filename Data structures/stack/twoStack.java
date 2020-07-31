public class twoStack {
    static int n = 20;
    static int top1 = -1,top2=n/2-1;
    void push1(int arr[],int data){
        if(top1>=n/2-1){
            System.out.println("Stack1 Overflow");
        }
        else{
            arr[++top1] = data;
        }
    }
    
    void push2(int arr[], int data) {
        if (top2 >= n-1) {
            System.out.println("Stack2 Overflow");
        } else {
            arr[++top2] = data;
        }
    }
    int pop1(int arr[]){
        if(top1<=-1){
            System.out.println("Stack1 Underflow");
            return 0;
        }
        else{
            return arr[top1--];
        }
    }
    
    int pop2(int arr[]) {
        if (top2 <= n/2-1) {
            System.out.println("Stack2 Underflow");
            return 0;
        } else {
            return arr[top2--];
        }
    }
    void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        int arr[] = new int[n];
        twoStack ts = new twoStack();
        for(int i=0;i<n/20;i++){
            ts.push1(arr, i);
        }
        ts.printArr(arr);
        for (int i = 0; i <= n/20; i++) {
            ts.push2(arr, i*i);
        }
        ts.printArr(arr);
        System.out.println(ts.pop1(arr));
        System.out.println(ts.pop2(arr));
        ts.printArr(arr);
    }
}