import java.util.*;

class Solution {
    public int[] solution(String s) {
        List<Integer> list = new ArrayList<>();
        list.add(-1);
        for (int i=1; i<s.length(); i++) {
            boolean bo = false;
            int index = 0;
            char ch = s.charAt(i);
            for (int j=0; j<i; j++) {
                if (ch==s.charAt(j)) {
                    bo = true;
                    index = j;
                }
            }
            if (bo) {
                list.add(i-index);
            } else {
                list.add(-1);
            }
        }
        int[] answer = new int[list.size()];
        for (int i=0; i<list.size(); i++) {
            answer[i]=list.get(i);
        }
        return answer;
    }
}