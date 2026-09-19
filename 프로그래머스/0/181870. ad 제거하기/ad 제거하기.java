import java.util.*;

class Solution {
    public String[] solution(String[] strArr) {
        String[] answer = {};
        List<String> list = new ArrayList<>();
        for (String str : strArr) {
            if (!str.contains("ad"))
                list.add(str);
        }
        answer = new String[list.size()];
        list.toArray(answer);
        return answer;
    }
}