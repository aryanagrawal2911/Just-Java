public class subarray_with_MAX_SUMvalue {

    static void maxSubarray(int arr[]) {
        int n = arr.length;

        int maxsofar = Integer.MIN_VALUE;
        int maxhere = 0;
        int start = 0;
        int end = 0;
        int s = 0;

        for (int i = 0; i < n; i++) {
            maxhere += arr[i];

            if (maxsofar < maxhere) {
                maxsofar = maxhere;
                start = s;
                end = i;
            }

            if (maxhere < 0) {
                maxhere = 0;
                s = i + 1;
            }
        }

        System.out.println("Starting index " + start);
        System.out.println("Ending index " + end);
    }

    public static void main(String[] args) {
        int a[] = { -2, -3, 4, -1, -2, 1, 5, -3 };
        maxSubarray(a);
    }
}
