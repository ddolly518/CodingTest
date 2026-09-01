import java.util.*;

class Solution {
    public int[] solution(int l, int r) {
        int[] answer = {};
        List<Integer> list = new ArrayList<>();
        while (true) {
            if (l%5 == 0) 
                break;
            l++;
        }
        for (int i=l; i<=r; i+=5) {
            boolean bo = true;
            String value = String.valueOf(i);
            for (char ch : value.toCharArray()) {
                if (ch != '5' && ch != '0') {
                    bo = false;
                    break;
                }
            }
            if (bo) {
                list.add(i);
            }
        }
        if (list.size() > 0) {
            answer = new int[list.size()];
            for (int i=0; i<list.size(); i++) {
                answer[i] = list.get(i);
            }
        } else {
            return new int[] {-1};
        }
        return answer;
    }
}