public class Search_an_element_in_a_sorted_and_rotated_array extends rotate_array {
    public int BinarySearch(int arr[], int num, int start, int end) {
        if (start < end) {
            int mid = (start + end) / 2;
            if (num > arr[mid]) {
                return BinarySearch(arr, num, mid + 1, end);
            } else if (num < arr[mid]) {
                return BinarySearch(arr, num, start, mid);
            } else
                return mid;
        }
        return -1;
    }

    public int pivot(int arr[]) {
        for (int i = 1; i < arr.length; i++)
            if (arr[i] > arr[i + 1])
                return i;
        return -1;
    }

    public static void main(String args[]) {
        Search_an_element_in_a_sorted_and_rotated_array sira = new Search_an_element_in_a_sorted_and_rotated_array();
        int arr[] = new int[] { 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 0, 1, 2, 3 };
        int pivot = sira.pivot(arr);
        sira.print(arr);
        System.out.println(pivot);
        int num = 0;
        int index;
        if (num > arr[0])
            index = sira.BinarySearch(arr, num, 0, pivot);
        else
            index = sira.BinarySearch(arr, num, pivot + 1, arr.length - 1);
        System.out.println(index);
    }
}