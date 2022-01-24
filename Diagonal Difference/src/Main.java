import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 3));
        List<Integer> list2 = new ArrayList<>(Arrays.asList(4, 5, 6));
        List<Integer> list3 = new ArrayList<>(Arrays.asList(9, 8, 9));

        Collections.addAll(list, list1, list2, list3);

        System.out.println(diagonalDifference(list));
    }

    public static int diagonalDifference(List<List<Integer>> arr) {
        // Write your code here

        int sumFirstDiagonal = 0;
        int sumSecondDiagonal = 0;

        int i = 0;
        int j = arr.get(0).size() - 1;

        for (List<Integer> integerList : arr) {
            sumFirstDiagonal += integerList.get(i++);
            sumSecondDiagonal += integerList.get(j++);
            i++;
            j--;
        }

        return Math.abs(sumFirstDiagonal - sumSecondDiagonal);
    }
}

