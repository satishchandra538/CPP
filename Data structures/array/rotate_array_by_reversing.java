public class rotate_array_by_reversing extends rotate_array {
    public void reverse(int arr[], int start, int end) {
        for (int i = start; i <= (end - start) / 2; i++) {
            int a = arr[i];
            arr[i] = arr[end - i];
            arr[end - i] = a;
        }
    }

    public void rotate(int arr[], int num) {
        reverse(arr, 0, num - 1);
        reverse(arr, num, arr.length - 1);
        reverse(arr, 0, arr.length - 1);
    }

    public static void main(String args[]) {
        rotate_array_by_reversing rar = new rotate_array_by_reversing();
        int arr[] = new int[] { 1, 2, 3, 4, 5, 6, 7 };
        int times = 2;
        int n = times % arr.length;
        rar.rotate(arr, n);
        rar.print(arr);
    }
}