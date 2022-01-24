public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println(pageCount(20, 16));
    }

    public static int pageCount(int n, int p) {
        // Write your code here

        return p<= n/2 ? p/2 : (n/2)-(p/2);

    }

}
