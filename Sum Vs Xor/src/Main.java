public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(sumXor(24));
    }

    public static long sumXor(long n) {
        // Write your code here
        String binary = Long.toBinaryString(n);
        int num = (int) binary.chars().filter(c -> c == '0').count();
        return (long) Math.pow(2, num);
    }
}
