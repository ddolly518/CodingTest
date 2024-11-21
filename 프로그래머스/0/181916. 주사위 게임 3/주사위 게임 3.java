import java.util.*;

class Solution {
    public int solution(int a, int b, int c, int d) {
        int answer = 0;
        int[] dice = {a,b,c,d};
        Map<Integer, Integer> map = new HashMap<>();
        for (int n : dice) {
            map.put(n, map.getOrDefault(n,0)+1);
        }
        if (map.size()==1) {
            answer=1111*a;
        } else if (map.size()==2 && map.containsValue(2)) {
            int p=0;
            int q=0;
            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                if (p==0)
                    p = entry.getKey();
                else
                    q = entry.getKey();
            }
            answer = (p+q)*Math.abs(p-q);
        } else if (map.size()==2) {
            int p=0;
            int q=0;
            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                if (entry.getValue()==3)
                    p = entry.getKey();
                else if (entry.getValue()==1)
                    q = entry.getKey();
            }
            answer = (int)Math.pow((10*p+q),2);
        } else if (map.size()==3) {
            int q = 0;
            int r = 0;
            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                if (entry.getValue()==1) {
                    if (q==0)
                        q = entry.getKey();
                    else
                        r = entry.getKey();
                }
            }
            answer = q*r;
        } else {
            int min = 6;
            for (int n : dice) {
                if (min > n)
                    min = n;
            }
            answer = min;
        }
        return answer;
    }
}