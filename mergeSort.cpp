#include <iostream>
using namespace std;

int merge(int arr[], int start, int middle, int end)
{
}
int mergeSort(int arr[], int start, int end)
{
    int i, j, k;
    int middle = (start + end) / 2;
    if (end > start)
    {
        mergeSort(arr, start, middle);
        mergeSort(arr, middle + 1, end);
        
        merge(arr, start, middle, end);
    }
}

int main()
{
    int arr[] = {2, 345, 345, 345, 34, 34, 34, 53, 45, 3, 5, 3};
    int end = sizeof(arr) / sizeof(*arr);
    mergeSort(arr, 0, end);
    return 0;
}
