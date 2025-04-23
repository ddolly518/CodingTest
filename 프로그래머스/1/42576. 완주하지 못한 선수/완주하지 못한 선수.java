import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        Map<String,Integer> map = new HashMap<>();
        for (String part:participant) {
            map.put(part,map.getOrDefault(part,0)+1);
        }
        for (String com : completion) {
            map.put(com,map.getOrDefault(com,0)-1);
        }
        for (Map.Entry<String,Integer> entry : map.entrySet()) {
            if (entry.getValue()==1)
                answer = entry.getKey();
        }
        return answer;
    }
}