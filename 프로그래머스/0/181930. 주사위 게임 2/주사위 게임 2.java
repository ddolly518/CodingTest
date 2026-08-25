import java.util.*;

class Solution {
    public int solution(int a, int b, int c) {
        int answer = (a+b+c);
        Map<Integer, Integer> map = new HashMap<>();
        map.put(a, map.getOrDefault(a,0)+1);
        map.put(b, map.getOrDefault(b,0)+1);
        map.put(c, map.getOrDefault(c,0)+1);
        if (map.size() <= 2) {
            answer *= (Math.pow(a,2) + Math.pow(b,2) + Math.pow(c,2));
        } 
        if (map.size() == 1) {
            answer *= (Math.pow(a,3) + Math.pow(b,3) + Math.pow(c,3));
        }
        return answer;
    }
}