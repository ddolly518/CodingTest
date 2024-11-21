import java.util.*;
class Solution {
    public String solution(String my_string, int[][] queries) {
        String answer = "";
        StringBuilder sb = new StringBuilder(my_string);
        for (int[] query : queries) {
            int s = query[0];
            int e = query[1];
            while (s<e) {
                char ch = sb.charAt(s);
                sb.setCharAt(s, sb.charAt(e));
                sb.setCharAt(e, ch);
                s++;
                e--;
            }
        }
        answer = sb.toString();
        return answer;
    }
}