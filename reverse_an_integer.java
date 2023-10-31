public class reverse_an_integer {
    static int reverse(int x) {

        int rev = 0;

        while (x > 0) {
            rev *= 10;
            rev += (x % 10);
            x /= 10;
        }

        return rev;
    }

    public static void main(String[] args) {
        System.out.println(reverse(9696024));
    }
}
