public class array_Segregating_0_and_1 {

    static void swap(int arr[], int l, int r) {
        int temp = arr[l];
        arr[l] = arr[r];
        arr[r] = temp;
    }

    static int segregate(int arr[]) {
        int n = arr.length;
        int l = 0, r = n - 1, swap = 0;

        while (l < r) {

            if (arr[l] == 0)
                l++;

            if (arr[r] == 1)
                r--;

            if (arr[l] > arr[r]) {
                swap(arr, l, r);
                swap++;
                l++;
                r--;
            }
        }

        return swap;
    }

    public static void main(String[] args) {
        int a[] = { 0, 1, 0, 0, 1, 0, 1, 1, 0, 0, 1, 1, 0, 1 };

        System.out.println("No. of swaps to segregate the array : " + segregate(a));

        for (int i : a) {
            System.out.print(i + "\t");
        }

    }
}
