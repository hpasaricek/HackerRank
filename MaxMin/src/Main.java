import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // write your code here
        maxMin(4, Arrays.asList(10, 4, 1, 2, 3, 4, 10, 20, 30, 40, 100, 200));
        System.out.println(maxMin(4, Arrays.asList(10, 4, 1, 2, 3, 4, 10, 20, 30, 40, 100, 200)));
        System.out.println("Hrvoje je kral".replaceAll("\\s",""));
    }

    public static int maxMin(int k, List<Integer> arr) {
        // Write your code here
        Collections.sort(arr);
        int min1, min2, max1, max2;
        min1 = arr.get(0);
        min2 = arr.get(arr.size() - k);
        max1 = arr.get(k - 1);
        max2 = arr.get(arr.size() - 1);
        System.out.println(arr);
        System.out.println(min1 + " " + min2 + " " + max1 + " " + max2);
        return Math.min((max1-min1),(max2-min2));
    }

}
