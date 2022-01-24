public class Main {

    public static void main(String[] args) {
	// write your code here
        int p1 = 0, p2 = 0;
        for (int i = 1; i <= 100000; i++) {
            if (i % 2 != 0) {
                p1++;
            } else {
                p2++;
            }
        }
        System.out.println(p1 + " - " + p2);
    }
}
