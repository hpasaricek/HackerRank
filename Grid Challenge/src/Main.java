import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println(gridChallenge(Arrays.asList("def","abc")));

    }

    public static String gridChallenge(List<String> grid) {
        // Write your code here
        for (int i = 0; i < grid.size(); i++) {
            char[] charArray = grid.get(i).toCharArray();
            Arrays.sort(charArray);
            grid.set(i, new String(charArray));
        }

        for (int i = 0; i < grid.size() - 1; i++) {
            for (int j = 0; j < grid.get(i).length(); j++) {
                if (grid.get(i).charAt(j) > grid.get(i + 1).charAt(j)) {
                    return "NO";
                }
            }
        }
        return "YES";
    }
}
