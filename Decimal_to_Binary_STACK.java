import java.util.Stack;

public class Decimal_to_Binary_STACK {
    static void stackBin(int x) {
        Stack<Integer> s = new Stack<>();

        while (x > 0) {
            int r = x % 2;
            s.push(r);
            x /= 2;
        }

        while (!s.isEmpty())
            System.out.print(s.pop());
    }

    public static void main(String[] args) {
        stackBin(29);
    }
}
