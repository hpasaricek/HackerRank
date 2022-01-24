public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println(3%26);
    }

    public static String caesarCipher(String s, int k) {
        // Write your code here
        k = k % 26;
        int length = s.length();
        for (int i = 0; i < length; i++) {
            if (!Character.isAlphabetic(s.charAt(i))) {
                s += Character.toString(s.charAt(i));
                continue;
            }
            if (k > 0 && Character.toLowerCase(s.charAt(i)) + k > 'z') {
                s += Character.toString(s.charAt(i) - 26 + k);
                continue;
            }
            s += Character.toString(s.charAt(i) + k);
        }

        return s.substring(length);
    }
}
