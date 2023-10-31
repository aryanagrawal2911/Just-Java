import java.util.Arrays;

public class array_values_MIN_MAX_wave {

    static void swap(int arr[], int l, int r) {
        int t = arr[l];
        arr[l] = arr[r];
        arr[r] = t;
    }

    static void waveArray(int arr[]) {
        int n = arr.length;
        Arrays.sort(arr);

        for (int i = 1; i < n - 1; i += 2) {
            swap(arr, i, i + 1);
        }

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + "\t");
        }
    }

    public static void main(String[] args) {
        int a[] = { -2, -3, 4, -1, -2, 1, 5, -3 };
        waveArray(a);
    }
}
