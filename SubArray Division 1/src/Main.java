import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println(birthday(Arrays.asList(2,2,1,3,2), 4, 2));
        List<Integer> integerList = Arrays.asList(1,2,3,4,5);
        long sum = integerList.stream().mapToInt(Integer::intValue).sum();
    }

    public static int birthday(List<Integer> s, int d, int m) {
        // Write your code here

        /*int count = 0;
        for (int i = 0; i < s.size() - m; i++) {
            int sum = 0;
            for (int j = i; j < m + i; j++) {
                sum += s.get(j);
            }
            if (sum == d) {
                count++;
            }
        }
        return count;*/

        int count = 0;
        for (int i = 0; i <= s.size() - m; i++) {
            int sum = 0;

            for (int j = 0; j < m; j++) {
                sum += s.get(i+j);
            }

            if (sum == d) {
                count++;
            }
        }
        return count;
    }
}
