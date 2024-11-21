import java.util.*;
class Solution {
    public String solution(String myString) {
        String answer = "";
        for (char ch : myString.toCharArray()) {
            answer += Character.toUpperCase(ch);
        }
        return answer;
    }
}