public class array_Sort_0_1_2 {
    static void swap(int arr[], int l, int r) {
        int temp = arr[l];
        arr[l] = arr[r];
        arr[r] = temp;
    }

    static void sort012(int arr[]) {
        int n = arr.length;
        int l = 0;
        int m = 0;
        int h = n - 1;

        while (m < h) {
            if (arr[m] == 0) {
                swap(arr, l, m);
                l++;
                m++;
            }

            else if (arr[m] == 1)
                m++;

            else if (arr[m] == 2) {
                swap(arr, m, h);
                h--;
            }
        }

        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + "\t");

    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int A[] = { 1, 1, 0, 1, 0, 2, 0, 2, 0, 1, 2, 1, 0, 1, 0, 2, 0, 1, 2, 2 };
        sort012(A);
    }
}
