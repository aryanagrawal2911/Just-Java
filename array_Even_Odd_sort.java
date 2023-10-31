public class array_Even_Odd_sort {

    static void swap(int arr[], int l, int r) {
        int temp = arr[l];
        arr[l] = arr[r];
        arr[r] = temp;
    }

    static void evenodd(int arr[]) {
        int n = arr.length;
        int l = 0, r = n - 1;

        while (l < r) {
            if (arr[l] % 2 == 0)
                l++;

            if (arr[r] % 2 == 1)
                r--;

            else if (arr[l] % 2 == 1 && arr[r] % 2 == 0) {
                swap(arr, l, r);
                l++;
                r--;
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + "\t");
        }
    }

    public static void main(String[] args) {
        int A[] = { 1, 1, 0, 1, 0, 2, 0, 2, 0, 1, 2, 1, 0, 1, 0, 2, 0, 1, 2, 2 };
        evenodd(A);
    }
}
