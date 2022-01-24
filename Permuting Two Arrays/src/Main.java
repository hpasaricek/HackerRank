import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(twoArrays(5, Arrays.asList(1,2,2,1),Arrays.asList(3,3,3,4)));

    }

    public static String twoArrays(int k, List<Integer> A, List<Integer> B) {
        // Write your code here
       /* boolean permuted = false;

        for (int i = 0; i < A.size(); i++) {
            for (int j = i; j < B.size(); j++) {
                if (A.get(i) + B.get(j) >= k) {
                    int temp = B.get(i);
                    B.set(i, B.get(j));
                    B.set(j, temp);
                    permuted = true;
                }
            }
            if (!permuted) {
                return "NO";
            }
        }
        System.out.println(A + " - " + B);
        return "YES";*/

        /*int sum = Stream.of(A,B).flatMap(Collection::stream).mapToInt(a -> a).sum();
        return (sum / A.size() >= k) ? "YES" : "NO";*/

        Collections.sort(A);
        Collections.sort(B, Comparator.reverseOrder());

        for (int i = 0; i < A.size(); i++) {
            if (A.get(i) + B.get(i) < k) {
                return "NO";
            }
        }
        return "YES";
    }

}
