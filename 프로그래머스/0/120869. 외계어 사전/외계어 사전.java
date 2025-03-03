import java.util.*;

class Solution {
    public int solution(String[] spell, String[] dic) {
        int answer = 2;
        for (String str : dic) {
            Map<String, Integer> map = new HashMap<>();
            for (char ch : str.toCharArray()) {
                map.put(String.valueOf(ch), map.getOrDefault(String.valueOf(ch),0)+1);
            }
            boolean bo = true;
            for (String s : spell) {
                if (map.getOrDefault(s,0)!=1) {
                    bo = false;
                }
            }
            if (bo) {
                answer = 1;
            }
        }
        return answer;
    }
}