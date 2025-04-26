import java.util.*;

class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        Map<Character, Integer> map = new HashMap<>();
        for (String key : keymap) {
            for (int i=0; i<key.length(); i++) {
                char ch = key.charAt(i);
                map.put(ch, Math.min(map.getOrDefault(ch, Integer.MAX_VALUE),i+1));
            }
        }
        int index = 0;
        for (String target : targets) {
            int sum = 0;
            for (char ch : target.toCharArray()) {
                if (!map.containsKey(ch)) {
                    sum=-1;
                    break;
                }    
                sum+=map.get(ch);
            }
             answer[index]=sum;
            index++;
        }
        return answer;
    }
}