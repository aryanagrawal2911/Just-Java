public class array_swaps_to_sort {

    static void swap(int arr[], int l, int r) {
        int temp = arr[l];
        arr[l] = arr[r];
        arr[r] = temp;
    }

    static int lessthan(int arr[], int x) {
        int n = arr.length;
        int l = 0;
        int r = n - 1;
        int swap = 0;

        while (l < r) {
            if (arr[l] < x)
                l++;

            else if (arr[r] < x && arr[l] >= x) {
                swap(arr, l, r);
                swap++;
                l++;
                r--;
            }

            else
                r--;
        }

        return swap;
    }
}
