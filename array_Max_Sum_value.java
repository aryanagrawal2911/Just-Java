public class array_Max_Sum_value {

    // It gives the maximum possible value for the sum of the products of elements multiplied with their indexes

    static void multiplyindex(int arr[]) {
        int n = arr.length;

        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            max = Math.max(max, arr[i]);
        }

        while (max != arr[n - 1]) {
            int temp = arr[n - 1];
            for (int i = n - 1; i > 0; i--) {
                arr[i] = arr[i - 1];
            }
            arr[0] = temp;
        }

        if (max == arr[n - 1]) {
            int sum = 0;
            for (int i = 0; i < n; i++) {
                sum += arr[i] * (i + 1);
            }
            System.out.println(sum);
            return;
        }
    }

    public static void main(String[] args) {
        int arr[] = { 2, 7, 5, 4, 6, 3, 1 };
        multiplyindex(arr);
    }
}
