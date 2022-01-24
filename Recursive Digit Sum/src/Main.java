import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println(superDigit("9875", 4));



    }

    public static int superDigit(String n, int k) {
        // Write your code here

        if(n.length() == 1 && k == 1) {
            return Integer.parseInt(n);
        }
        long sumOfChars = 0;

        for (char c : n.toCharArray()) {
            sumOfChars += Character.getNumericValue(c);
        }

        sumOfChars *= k;

        return superDigit(Long.toString(sumOfChars),1);
    }



}
