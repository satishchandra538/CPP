public class queue {
    int front, rear, capacity, size, arr[];

    queue(int capacity) {
        this.capacity = capacity;
        front = 0;
        rear = capacity - 1;
        arr = new int[this.capacity];
    }

    boolean isFull(queue q) {
        return (this.size >= this.capacity);
    }

    boolean isEmpty(queue q) {
        return (this.size <= 0);
    }

    void enque(int data) {
        if (isFull(this)) {
            System.out.println("Queue Over flow");
            return;
        }
        this.rear = this.rear + 1;
        this.arr[this.size++] = data;
        System.out.println(data + " is enqued.");
    }

    void printArr() {
        for (int i = 0; i < this.arr.length; i++) {
            System.out.print(this.arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        queue q = new queue(10);
        for(int i=0;i<13;i++){
            q.enque(i);
        }
        q.printArr();
    }
}