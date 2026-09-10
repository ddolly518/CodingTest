import java.util.*;

class Solution {
    public String solution(String my_string, int[] indices) {
        String answer = "";
        List<Integer> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        for (int num : indices) {
            list.add(num);
        }
        for (int i=0; i<my_string.length(); i++) {
            if (!list.contains(i))
                sb.append(my_string.charAt(i));
        }
        answer = sb.toString();
        return answer;
    }
}