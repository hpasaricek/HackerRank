public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println(counterGame(132));


    }

    public static String counterGame(long n) {
        // Write your code here

        if (n == 1) {
            return "Richard";
        }

        int count = 1;
        while (n > 1) {
            if ((n & (n - 1)) == 0) {
                n /= 2;
            } else {
                long result = 1;
                while (result < n) {
                    result <<= 1;
                }
                result /= 2;
                n -= result;
            }
            count++;
        }

        return count % 2 == 0 ? "Louise" : "Richard";
    }
}
