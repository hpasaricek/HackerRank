import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here

        List<String> strings = Arrays.asList("ab", "ab", "abc","db");
        List<String> queries = Arrays.asList("ab", "abc", "bc","db");
        System.out.println(matchingStrings(strings, queries));
    }

    public static List<Integer> matchingStrings(List<String> strings, List<String> queries) {
        // Write your code here

        /*Map<String, Integer> map = new LinkedHashMap<>();

        for (String query: queries) {
            map.put(query,0);
        }

        for (String s : strings) {
            if (map.containsKey(s)) {
                map.replace(s, map.get(s) + 1);
            }
        }
        List<Integer> list = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            list.add(entry.getValue());
        }
        return list;*/

      /*  List<Integer> list = new ArrayList<>();
        for (String query : queries) {
            int sum = 0;
            for (String string : strings) {
                if (string.equals(query)) {
                    sum++;
                }
            }
            list.add(sum);
        }
        return list;*/
        Map<String, Integer> dic = new HashMap<String, Integer>();
        for(String ii: strings){ //O(n)
            int temp = dic.getOrDefault(ii,0);
            dic.put(ii, ++temp);
        }

        List<Integer> sol = new ArrayList<Integer>();
        for(String i : queries)    //O(m)
            sol.add(dic.getOrDefault(i,0));

        return sol;
    }
}
