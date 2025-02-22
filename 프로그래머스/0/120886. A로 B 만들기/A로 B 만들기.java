import java.util.*;

class Solution {
    public int solution(String before, String after) {
        int answer = 0;
        Map<Character, Integer> map = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();
        for (char ch : before.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0)+1);
        }
        for (char ch : after.toCharArray()) {
            map2.put(ch, map2.getOrDefault(ch, 0)+1);
        }
        if (map.equals(map2)) {
            answer = 1;
        }
        return answer;
    }
}