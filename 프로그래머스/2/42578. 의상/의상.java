import java.util.*;

class Solution {
    public int solution(String[][] clothes) {
        int answer = 1;
        Map<String,Integer> map = new HashMap<>();
        for (String[] c : clothes) {
            String ch = c[1];
            map.put(ch, map.getOrDefault(ch,0)+1);
        }
        for (Map.Entry<String,Integer> entry : map.entrySet()) {
            answer*=(entry.getValue()+1);
        }
        answer--;
        return answer;
    }
}