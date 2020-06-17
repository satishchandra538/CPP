import java.util.Scanner;

class nicePair {
    static boolean issquare(int a, int b) {
        for (int i = 0; i < 32; i++)
            if (i * i == (a + b)) {
                System.out.println(a + " " + b);
                return true;
            }
        return false;
    }

    static boolean iscube(int a, int b) {
        for (int i = 0; i <= 10; i++)
            if (i * i * i == (a + b)) {
                System.out.println(a + " " + b);
                return true;
            }
        return false;
    }

    public static void main(String args[]) throws Exception {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t > 0) {
            int n = s.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++)
                arr[i] = s.nextInt();
            int count = 0;
            for (int i = 0; i < n - 1; i++) {
                for (int j = i + 1; j < n; j++) {
                    if (iscube(arr[i], arr[j]))
                        count++;
                    if (issquare(arr[i], arr[j]))
                        count++;
                }
            }
            System.out.println(count);
            t--;
        }
        s.close();
    }
}
