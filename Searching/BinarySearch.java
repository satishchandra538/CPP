import java.util.*;

class BinarySearch {
    static int search(int arr[], int k, int f, int l) {
        if (f <= l) {
            int mid = (f + l) / 2;
            if (arr[mid] == k)
                return mid;
            else if (arr[mid] < k) {
                return search(arr, k, mid + 1, l);
            } else if (arr[mid] > k) {
                return search(arr, k, f, mid);
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t > 0) {
            int n, k, i;
            n = s.nextInt();
            k = s.nextInt();
            int arr[] = new int[n];
            for (i = 0; i < n; i++) {
                arr[i] = s.nextInt();
            }
            System.out.println(search(arr, k, 0, n - 1));
            t--;
        }
        s.close();
    }
}