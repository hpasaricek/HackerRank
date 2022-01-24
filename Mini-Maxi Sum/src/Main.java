import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // write your code here
        miniMaxSum(Arrays.asList(8,1,1,2,5));
    }

    public static void miniMaxSum(List<Integer> arr) {
        // Write your code here
        /*Collections.sort(arr);
        long min = 0, max = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            min += arr.get(i);
        }
        for (int i = 1; i < arr.size(); i++) {
            max += arr.get(i);
        }

        System.out.println(min + " " + max);*/

        long sum = arr.stream().mapToInt(Integer::intValue).sum();
        long min = sum - Collections.max(arr);
        long max = sum - Collections.min(arr);
        System.out.println(min + " " + max);



    }
}
