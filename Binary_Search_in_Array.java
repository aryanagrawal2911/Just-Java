public class Binary_Search_in_Array {
    static int binsch(int arr[], int l, int r, int x) {

        if (r >= 1) {

            int m = l + (r - 1) / 2;

            if (x == arr[m])
                return m;

            if (x < arr[m])
                return binsch(arr, l, m - 1, x);

            return binsch(arr, m + 1, r, x);
        }

        return -1;
    }

    public static void main(String args[]) {
        int arr[] = { 2, 3, 4, 10, 40 };
        int n = arr.length;
        int x = 10;
        int result = binsch(arr, 0, n - 1, x);

        if (result == -1)
            System.out.println("Element is not present in array");

        else
            System.out.println("Element is present at index : " + result);
    }
}
