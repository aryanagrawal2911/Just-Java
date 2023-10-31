import java.util.Arrays;

public class array_Least_Missing_Natural_Number {

    static int leastMissing(int arr[]) {
        int n = arr.length;
        Arrays.sort(arr);
        int ans = 1;

        for (int i = 0; i < n; i++) {
            if (arr[i] == ans)
                ans++;
        }

        return ans;
    }

    public static void main(String[] args) {
        int arr[] = { -2, -3, 4, -1, 2, 1, 5, 3 };
        System.out.println(leastMissing(arr));
    }
}
