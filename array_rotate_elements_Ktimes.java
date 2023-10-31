public class array_rotate_elements_Ktimes {
    static void rotktimes(int arr[], int k) {

        int n = arr.length;

        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + "\t");
        System.out.println();

        for (int j = 1; j <= k; j++) {

            int temp = arr[n - 1];
            for (int i = n - 1; i > 0; i--) {
                arr[i] = arr[i - 1];
            }
            arr[0] = temp;

            for (int i = 0; i < n; i++)
                System.out.print(arr[i] + "\t");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int arr[] = { 56, 6, 65, 4, 43, 5, 88, 8, 90, 21 };
        rotktimes(arr, 3);
    }
}
