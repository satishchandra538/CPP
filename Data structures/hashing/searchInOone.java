import java.util.Random;
import java.util.Scanner;

public class searchInOone {
    static int MAX;
    static int hash[][] = new int[MAX][2];

    void insert(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                hash[arr[i]][0] = arr[i];
            } else {
                hash[arr[i]*-1][0] = arr[i];
            }
        }
    }

    boolean search(int num) {
        if (num >= 0) {
            if (hash[num][0] == num) {
                return true;
            }
            return false;
        }
        if (hash[Math.abs(num)][1] == num) {
            return true;
        }
        return false;
    }

    public static void main(String args[]) {
        searchInOone search = new searchInOone();
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter MAX Size of array=");
        int size = scanner.nextInt();
        System.out.print("\nEnter Size of array smaller than MAX=");
        MAX = scanner.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = random.nextInt(MAX + size) - size;
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        search.insert(arr);
        System.out.println("\nEnter Item To search=");
        int item = scanner.nextInt();
        System.out.println(search.search(item));
        scanner.close();
    }
}