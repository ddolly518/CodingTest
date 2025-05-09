import java.util.*;

class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        int sum = 0;
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        for (int t : tangerine) {
            map.put(t, map.getOrDefault(t,0)+1);
        }
        for (Map.Entry<Integer,Integer> entry : map.entrySet()) {
            list.add(entry.getValue());
        }
        Collections.sort(list);
        for (int i=0; i<list.size(); i++) {
            if (sum<k) {
                sum+=list.get(list.size()-1-i);
                answer++;
            }
        }
        return answer;
    }
}