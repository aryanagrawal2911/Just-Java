public class GCD_of_TWO_numbers {

    static int Gcd(int a, int b) {

        if (b > a)
            return Gcd(b, a);

        if (a % b == 0)
            return b;

        if (a == 0)
            return b;
        if (b == 0)
            return a;

        return Gcd(b, a % b);
    }

    public static void main(String[] args) {
        System.out.println(Gcd(81, 108));
    }
}
