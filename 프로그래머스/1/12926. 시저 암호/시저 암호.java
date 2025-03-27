import java.util.*;

class Solution {
    public String solution(String s, int n) {
        String answer = "";
        for (char ch : s.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                answer+=(char)('A'+(ch-'A'+n)%26);
            } else if (Character.isLowerCase(ch)) {
                answer+=(char)('a'+(ch-'a'+n)%26);
            } else {
                answer+=ch;
            }
        }
        return answer;
    }
}