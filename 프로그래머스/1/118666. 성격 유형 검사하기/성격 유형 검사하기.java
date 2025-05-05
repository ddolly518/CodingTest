import java.util.*;

class Solution {
    public String solution(String[] survey, int[] choices) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        Map<String, Integer> map = new HashMap<>();
        for (int i=0; i<choices.length; i++) {
            int num = choices[i];
            String[] str = survey[i].split("");
            if (num<4) {
                map.put(str[0],map.getOrDefault(str[0],0)+(4-num));
            } else if (num>4) {
                map.put(str[1],map.getOrDefault(str[1],0)+(num-4));
            }
        }
        if (map.getOrDefault("R", 0)<map.getOrDefault("T",0))
            sb.append("T");
        else
            sb.append("R");
        if (map.getOrDefault("C",0)<map.getOrDefault("F",0))
            sb.append("F");
        else
            sb.append("C");
        if (map.getOrDefault("J",0)<map.getOrDefault("M",0))
            sb.append("M");
        else
            sb.append("J");
        if (map.getOrDefault("A",0)<map.getOrDefault("N",0))
            sb.append("N");
        else
            sb.append("A");
        answer = sb.toString();
        return answer;
    }
}