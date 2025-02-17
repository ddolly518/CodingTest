import java.util.*;

class Solution {
    public String solution(String my_string) {
        List<Character> list = new ArrayList<>();
        String answer = "";
        for (char ch : my_string.toCharArray()) {
            if (!list.contains(ch))
                list.add(ch);
        }
        for (int i=0; i<list.size(); i++) {
            answer+=list.get(i);
        }
        return answer;
    }
}