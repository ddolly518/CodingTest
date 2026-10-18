import java.util.*;

class Solution {
    public String solution(String my_string) {
        String answer = "";
        char[] ch = my_string.toLowerCase().toCharArray();
        Arrays.sort(ch);
        StringBuilder sb = new StringBuilder();
        for (char c : ch) {
            sb.append(c);
        }
        answer = sb.toString();
        return answer;
    }
}