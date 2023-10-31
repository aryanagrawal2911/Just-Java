import java.util.Arrays;

public class array_MAX_MIN_sequence {

    static void maxmin(int a[]) {
        int n = a.length;
        Arrays.sort(a);

        for (int i = 0; i < (n + 1) / 2; i++) {
            if (a[i] != a[n - 1 - i])
                System.out.print(a[n - 1 - i] + "\t" + a[i] + "\t");

            else
                System.out.print(a[i] + "\t");
        }
    }

    public static void main(String[] args) {
        int a[] = { 0, 10, 2, -10, -20 };
        maxmin(a);
    }
}
