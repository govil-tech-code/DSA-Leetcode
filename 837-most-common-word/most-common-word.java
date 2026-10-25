
import java.util.*;

class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        paragraph = paragraph.toLowerCase();

        String[] words = paragraph.split("[!?',;. ]+");

        Set<String> ban = new HashSet<>();
        for (String word : banned) {
            ban.add(word);
        }

        Map<String, Integer> map = new HashMap<>();

        String ans = "";
        int max = 0;

        for (String word : words) {
            if (!ban.contains(word)) {
                int count = map.getOrDefault(word, 0) + 1;
                map.put(word, count);

                if (count > max) {
                    max = count;
                    ans = word;
                }
            }
        }

        return ans;
    }
}
