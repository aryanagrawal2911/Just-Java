import java.util.Arrays;

public class arrayVALUE_match_INDEX {
    static void indexArray(int arr[]) {
        int n = arr.length;
        Arrays.sort(arr);

        for (int i = 0; i < n; i++) {
            int c = i;
            int v = -1;
            while ((arr[i] != i) && (arr[i] != -1)) {

                int t = arr[i];
                arr[c] = v;
                v = c = t;
            }

            if (v != -1)
                arr[c] = v;
        }

        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + "\t");
    }

    public static void main(String[] args) {
        int arr[] = { 2, 3, 4, -1, -1 };
        indexArray(arr);

    }
}
