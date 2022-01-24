import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10, 20, 20, 10, 10, 30, 50, 10, 20,50);
        System.out.println(sockMerchant(7, list));
    }

    public static int sockMerchant(int n, List<Integer> ar) {
        // Write your code here
       /* int count = 0;
        Map<Integer, Integer> socks = new HashMap<>();
        for (Integer integer : ar) {
            if (socks.containsKey(integer)) {
                int temp = socks.get(integer);
                if (temp % 2 == 0) {
                    count++;
                }
                socks.put(integer, ++temp);
            } else {
                socks.put(integer, 1);
            }
        }

        for (Map.Entry<Integer, Integer> entry : socks.entrySet()) {
            if (entry.getValue() >= 2) {
                count += entry.getValue() / 2;
            }
        }
        return count;*/

        int count = 0;
        Collections.sort(ar);
        for (int i = 0; i < ar.size() - 1; i++) {
            if (ar.get(i).equals(ar.get(i+1))) {
                count++;
                i++;
            }
        }
        return count;
    }
}
