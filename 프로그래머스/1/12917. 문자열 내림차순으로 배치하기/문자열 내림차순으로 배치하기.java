import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        char[] array = new char[s.length()];
        int index = 0;
        for (char ch : s.toCharArray()) {
            array[index++] = ch;
        }
        Arrays.sort(array);
        for (int i=s.length()-1; i>=0; i--) {
            answer+=array[i];
        }
        return answer;
    }
}