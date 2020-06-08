import java.util.Scanner;

class InsertionSort {
    static void swap(int arr[],int i, int j) {
        int a = arr[i];
        arr[i] = arr[j];
        arr[j] = a;
    }

    static void Sort(int arr[]) {
        int i, j;
        for (i = 0; i < arr.length; i++) {
            for (j = 0; j < i; j++) {
                if (arr[i] < arr[j]) {
                    swap(arr, i,j);
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt(), i;
        while (t > 0) {
            int n = s.nextInt();
            int arr[] = new int[n];
            for (i = 0; i < n; i++)
                arr[i] = s.nextInt();
            Sort(arr);
            for (i = 0; i < n; i++)
                System.out.print(arr[i] + " ");
            System.out.println();
            t--;
        }
        s.close();
    }
}