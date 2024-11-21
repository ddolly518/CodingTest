import java.util.*;
class Solution {
    public int[] solution(String my_string) {
        int[] answer = new int[52];
        Map<Character, Integer> map = new HashMap<>();
        for (char ch : my_string.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0)+1);
        }
        int index = 0;
        for (char ch = 'A'; ch<='Z'; ch++) {
            answer[index++] = map.getOrDefault(ch, 0);
        }
        for (char ch = 'a'; ch<='z'; ch++) {
            answer[index++] = map.getOrDefault(ch, 0);
        }
        
        return answer;
    }
}