import java.util.Scanner;
import java.util.TreeSet;

public class basic_TREESET {
    static Scanner sn = new Scanner(System.in);

    static void display(TreeSet<Integer> ts) {
        if (ts.isEmpty())
            return;

        System.out.println(ts);
    }

    static boolean check(TreeSet<Integer> ts) {
        System.out.println("Enter a number : ");
        int n = sn.nextInt();

        return ts.contains(n);
    }

    static void remove(TreeSet<Integer> ts, int x) {
        if (ts.isEmpty() || !ts.contains(x))
            return;

        ts.remove(x);
        display(ts);
    }
}
