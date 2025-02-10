import java.util.*;

class Solution {
    public String solution(String my_string) {
        List<Character> list = new ArrayList<>();
        String answer = "";
        for (char ch:my_string.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                list.add(Character.toLowerCase(ch));
            } else {
                list.add(ch);
            }
        }
        Collections.sort(list);
        for (int i=0; i<list.size(); i++) {
            answer+=list.get(i);
        }
        return answer;
    }
}