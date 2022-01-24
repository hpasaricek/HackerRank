import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }

    public static List<Integer> dynamicArray(int n, List<List<Integer>> queries) {
        // Write your code here
        List<List<Integer>> arr = new ArrayList<>();
        int lastAnswer = 0;

        List<Integer> answers = new ArrayList<>();

        for(int i = 0; i < n; i++) {
            arr.add(new ArrayList<>());
        }

        for (List<Integer> query : queries) {
            if (query.get(0) == 1) {
                int idx = ((query.get(1) ^ lastAnswer) % n);
                arr.get(idx).add(query.get(2));
            } else {
                int idx = ((query.get(1) ^ lastAnswer) % n);
                lastAnswer = arr.get(idx).get(query.get(2) % arr.get(idx).size());
                answers.add(lastAnswer);
            }
        }
        return answers;

    }
}
