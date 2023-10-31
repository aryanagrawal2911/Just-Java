public class generate_random_OTP {

    public static void main(String[] args) {

        int randomOtp = (int) (9000 * Math.random()) + 1000;
        String OTP = String.valueOf(randomOtp);
        System.out.println(OTP);

    }
}
