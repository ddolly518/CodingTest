import java.util.*;

class Solution {
    public int solution(int a, int b, int c, int d) {
        int answer = 0;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(a, map.getOrDefault(a,0)+1);
        map.put(b, map.getOrDefault(b,0)+1);
        map.put(c, map.getOrDefault(c,0)+1);
        map.put(d, map.getOrDefault(d,0)+1);
        
        if (map.size() == 1) {
            answer = 1111 * a;
        } else if (map.size() == 2) {
            int p = 0;
            int q = 0;
            boolean bo = true;
            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                if (entry.getValue() == 1) {
                    q = entry.getKey();
                } else if (entry.getValue() == 3) {
                    p = entry.getKey();
                } else if (entry.getValue() == 2) {
                    bo = false;
                    if (p == 0) {
                        p = entry.getKey();
                    } else {
                        q = entry.getKey();
                    }
                }
            }
            
            answer = bo ? (int)Math.pow((10*p+q), 2) : (p+q) * Math.abs(p-q);
        } else if (map.size() == 3) {
            answer = 1;
            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                if (entry.getValue() == 1) {
                    answer*=entry.getKey();
                }
            }
        } else if (map.size() == 4) {
            answer = Math.min(a,b);
            answer = Math.min(answer, c);
            answer = Math.min(answer, d);
        }
        return answer;
    }
}