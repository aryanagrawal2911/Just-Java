import java.util.HashMap;
import java.util.Scanner;

public class basic_HashMap {
    static Scanner sn = new Scanner(System.in);

    static void insert(int n) {
        HashMap<Integer, Integer> hm = new HashMap<>();

        System.out.println("Enter n number values : ");
        for (int i = 1; i <= n; i++) {

            int x = sn.nextInt();
            int v;

            if (!hm.containsKey(x))
                hm.put(x, 1);

            else {
                v = hm.get(x);
                hm.put(x, v + 1);
            }
        }
    }

    static void display(HashMap<Integer, Integer> hm) {
        System.out.println(hm);
    }

}
