import java.util.Random;

public class mergeSort {
    static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static void Sort(int arr[], int f, int l) {
        if (f < l) {
            int m = (f + l) / 2;
            Sort(arr, f, m);
            Sort(arr, m + 1, l);
            merge(arr, f, m, l);
            for(int i=0;i<arr.length;i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }
    }

    static void merge(int arr[], int f, int m, int l) {
        int n1 = m - f + 1, n2 = l - m;
        int L[] = new int[n1], R[] = new int[n2];
        for (int i = 0; i < n1; i++) {
            L[i] = arr[f + i];
        }
        for (int j = 0; j < n2; j++) {
            R[j] = arr[m + 1 + j];
        }
        int i = 0, j = 0, k = f;
        while (n1 > i && n2 > j) {
            if (L[i] > R[j]) {
                arr[k] = R[j];
                j++;
            } else {
                arr[k] = L[i];
                i++;
            }
            k++;
        }
        while (n1 > i) {
            arr[k] = L[i];
            i++;
            k++;
        }
        while (n2 > j) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    public static void main(String args[]) {
        int sizeOfArray = 6, arr[] = new int[sizeOfArray];
        Random random = new Random();
        for (int i = 0; i < sizeOfArray; i++) {
            arr[i] = random.nextInt(1000);
        }
        int f = 0, l = arr.length - 1;
        printArray(arr);
        Sort(arr, f, l);
        printArray(arr);
    }
}