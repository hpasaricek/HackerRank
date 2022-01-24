import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println(balancedSums(Arrays.asList(6,23,6)));
    }

    public static String balancedSums(List<Integer> arr) {
        // Write your code here

        if (arr.size() == 2) {
            return "NO";
        }

        int sum1 = 0;
        int sum2 = 0;

        for (int i = 1; i < arr.size(); i++) {
            sum2 += arr.get(i);
        }

        for (int i = 0; i < arr.size()-1; i++) {
            if (sum1 == sum2) {
                return "YES";
            } else {
                sum1 += arr.get(i);
                sum2 -= arr.get(i+1);
            }
        }
        return "NO";

        /*for (int i = 0; i < arr.size(); i++) {
            for (int j = 0; j < i; j++) {
                if (j < i) {
                    sum1 += arr.get(j);
                } else if (j == i) {
                    continue;
                } else {
                    sum2 += arr.get(j);
                }
            }

            if (sum1 == sum2) {
                return "YES";
            } else {
                sum1 = 0;
                sum2 -= arr.get(i);
            }
        }
        return "NO";*/

        /*int sum1 = 0;
        int sum2 = 0;
        for (int i = 1; i < arr.size() - 1; i++) {
            for (int j = 0; j < i; j++) {
                sum1 += arr.get(j);
            }

            for (int k = i + 1; k < arr.size(); k++) {
                sum2 += arr.get(k);
            }

            if (sum1 == sum2) {
                return "YES";
            } else {
                sum1 = 0;
                sum2 = 0;
            }
        }
        return "NO";*/
    }
}
