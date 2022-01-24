import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println(lonelyinteger(Arrays.asList(1, 2, 3, 4, 3, 2, 1)));

    }

    public static int lonelyinteger(List<Integer> a) {
        // Write your code here
        int result = 0;

        Map<Integer, Integer> map = new HashMap<>();
        for (Integer integer : a) {
            int temp = map.getOrDefault(integer, 0);
            map.put(integer, ++temp);
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                result = entry.getKey();
            }
        }


        return result;

        /*for (Integer integer : a) {
            if (Collections.frequency(a, integer) == 1) {
                result = integer;
            }
        }*/
    }
}
