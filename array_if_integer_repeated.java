import java.util.Scanner;

public class array_if_integer_repeated {

    public static void main(String[] args) {

        Scanner sn = new Scanner(System.in);
        int n = sn.nextInt();
        sn.nextLine();

        if (n < 1 || n > 100000)
            System.exit(0);

        int arr[] = new int[n];
        int res[] = new int[n];

        for (int i = 0; i < n; i++) {

            arr[i] = sn.nextInt();

            if (arr[i] < 1 || arr[i] > 20000)
                sn.close();

            else
                continue;

        }

        for (int i = 0; i < n; i++) {

            res[i] = -1;

            for (int j = i + 1; j < n; j++) {

                if (arr[i] == arr[j]) {

                    res[i] = 1;
                }

            }

        }

        for (int i : res)
            System.out.print(i + "\t");

    }
}