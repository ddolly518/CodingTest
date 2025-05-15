import java.util.*;

class Solution {
    public int solution(int[] topping) {
        Map<Integer, Integer> map = new HashMap<>();
        Map<Integer, Integer> map2 = new HashMap<>();
        int answer = 0;
        for (int t : topping) {
            map.put(t, map.getOrDefault(t,0)+1);
        }
        for (int i=0; i<topping.length; i++) {
            int t = topping[i];
            map.put(t, map.get(t)-1);
            map2.put(t, map2.getOrDefault(t,0)+1);
            if (map.get(t)==0) {
                map.remove(t);
            }
            if (map.size()==map2.size())
                answer++;
        }
        return answer;
    }
}