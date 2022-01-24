import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        // write your code here
        List<Integer> integerList = Arrays.asList(1, 1, 3, 2, 1);
        integerList = countingSort(integerList);
        System.out.println(integerList);

    }

    public static List<Integer> countingSort(List<Integer> arr) {
        // Write your code here
        List<Integer> returnList = new ArrayList<>(Collections.nCopies(100, 0));

        for (Integer integer : arr) {
            returnList.set(integer, returnList.get(integer) + 1);
        }

        return returnList;
    }
}
