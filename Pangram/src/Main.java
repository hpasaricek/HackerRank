import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(pangrams("We promptly judged antique ivory buckles for the prize"));
        long count = "We promptly judged antique ivory buckles for the prize".chars().distinct().count();
        System.out.println(count);

    }

    public static String pangrams(String s) {
        // Write your code here
        /*String newString = s.replaceAll("[\\W]","").toLowerCase();
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < newString.length(); i++) {
            set.add(newString.charAt(i));
        }
        return set.size() == 26 ? "pangram" : "not pangram";*/

        String newString = s.replaceAll("[\\W]","").toLowerCase();
        long count = newString.chars().distinct().count();
        return count == 26 ? "pangram" : "not pangram";
    }

}
