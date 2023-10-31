public class decimal_to_binary {
    static void binary(int x) {
        String s = "";

        while (x > 0) {
            s = x % 2 + s;
            x /= 2;
        }

        System.out.println(s);
    }

    public static void main(String[] args) {
        binary(29);
    }
}
