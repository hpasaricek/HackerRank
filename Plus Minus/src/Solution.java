import java.io.IOException;
import java.util.Arrays;
import java.util.List;

class Result {

    /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus(List<Integer> arr) {
        // Write your code here
       /* int negative = 0, zero = 0, positive = 0;
        for (Integer integer : arr) {
            if (integer < 0) {
                negative++;
            } else if (integer > 0) {
                positive++;
            } else {
                zero++;
            }
        }
        System.out.printf("%.6f",((float)positive/arr.size()));
        System.out.printf("\n%.6f",((float)negative/arr.size()));
        System.out.printf("\n%.6f",((float)zero/arr.size()));*/

        long negative = arr.stream().filter(num -> num < 0).count();
        long zero = arr.stream().filter(num -> num == 0).count();
        long positive = arr.stream().filter(num -> num > 0).count();

        System.out.printf("%.6f",((float)positive/arr.size()));
        System.out.printf("\n%.6f",((float)negative/arr.size()));
        System.out.printf("\n%.6f",((float)zero/arr.size()));


    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        List<Integer> list = Arrays.asList(1,1,0,-1,-1);
        Result.plusMinus(list);
        /*BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        Result.plusMinus(arr);

        bufferedReader.close();*/
    }
}
