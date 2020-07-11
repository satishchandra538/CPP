import java.util.Random;
import java.util.Scanner;

public class pairsum {
    void mergeSort(int arr[], int f, int l) {
        if (f < l) {
            int m = (l + f) / 2;
            mergeSort(arr, f, m);
            mergeSort(arr, m + 1, l);
            merge(arr, f, m, l);
        }
    }

    void merge(int arr[], int f, int m, int l) {
        int n1 = m - f + 1, n2 = l - m;
        int L[] = new int[n1];
        int R[] = new int[n2];
        for (int i = 0; i < n1; i++) {
            L[i] = arr[f + i];
        }
        for (int j = 0; j < n2; j++) {
            R[j] = arr[m + j + 1];
        }
        int i = 0, j = 0, k = f;
        while (n1 > i && n2 > j) {
            if (L[i] < R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
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

    void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        Random r = new Random();
        pairsum ps = new pairsum();
        int t = s.nextInt();
        while (t-- > 0) {
            System.out.print("Enter size of array:-");
            int n = s.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = r.nextInt(50);
            }
            ps.printArray(arr);
            ps.mergeSort(arr, 0, n - 1);
        }
        s.close();
    }
}