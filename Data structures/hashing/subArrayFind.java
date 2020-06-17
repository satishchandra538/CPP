import java.util.Random;
import java.util.Scanner;

public class subArrayFind {
    static void print(int arr[]) {
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    static int[] hashArray(int arr[]) {
        int max = arr[0], min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (min > arr[i])
                min = arr[i];
            if (max < arr[i])
                max = arr[i];
        }
        int hash[] = new int[max - min + 1];
        for (int i = 0; i < arr.length; i++) {
            hash[arr[i] - min] = arr[i];
        }
        return hash;
    }

    static boolean isSubarray(int arr1[], int arr2[]) {
        int hashArray[] = hashArray(arr1);
        print(hashArray);
        int min = arr2[0];
        for (int i = 0; i < arr2.length; i++)
            if (arr2[i] < min)
                min = arr2[i];
        for (int i = 0; i < arr2.length; i++)
            if (arr2[i] != hashArray[arr2[i] - min])
                return false;
        return true;
    }

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        Random r = new Random();
        System.out.print("Enter number of cases=");
        int t = s.nextInt();
        System.out.println();
        while (t > 0) {
            System.out.print("Enter size of Bigger array = ");
            int n = s.nextInt();
            int arr1[] = new int[n];
            System.out.print("Enter bound size from = ");
            int boundMin = s.nextInt();
            System.out.print(" to = ");
            int boundMax = s.nextInt();
            for (int i = 0; i < n; i++) {
                arr1[i] = r.nextInt(boundMin) - boundMax;
                System.out.print(arr1[i] + " ");
            }
            System.out.println();
            System.out.print("Enter size of Smaller array = ");
            int m = s.nextInt();
            int arr2[] = new int[m];
            for (int i = 0; i < m; i++) {
                arr2[i] = s.nextInt();
            }
            System.out.println(isSubarray(arr1, arr2));
            t--;
        }
        s.close();
    }
}