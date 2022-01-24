import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;

public class MainTest {

    @org.junit.Test
    public void diagonalDifference() {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 3));
        List<Integer> list2 = new ArrayList<>(Arrays.asList(4, 5, 6));
        List<Integer> list3 = new ArrayList<>(Arrays.asList(9, 8, 9));

        Collections.addAll(list, list1, list2, list3);

        assertEquals(2, Main.diagonalDifference(list));

    }
}