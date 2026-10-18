import java.util.*;

class Solution {
    public String solution(String my_string) {
        String answer = "";
        List<Character> list = new ArrayList<>();
        for (char ch : my_string.toCharArray()) {
            list.add(Character.toLowerCase(ch));
        }
        Collections.sort(list);
        StringBuilder sb = new StringBuilder();
        for (int i=0; i<list.size(); i++) {
            sb.append(list.get(i));
        }
        answer = sb.toString();
        return answer;
    }
}