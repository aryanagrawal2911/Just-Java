public class check_prime {
    static boolean isPrime(int x) {

        if (x < 2)
            return false;

        boolean b = true;

        for (int i = 2; i <= Math.sqrt(x); i++) {
            if (x % i == 0) {
                b = false;
                break;
            }
        }

        return b;
    }

    public static void main(String[] args) {
        System.out.println(isPrime(101));
    }
}
