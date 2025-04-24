import java.util.*;

class Solution {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        int num = stages.length;
        double[][] rate = new double[N][2];
        Map<Integer, Integer> map = new HashMap<>();
        for (int stage : stages) {
            map.put(stage, map.getOrDefault(stage,0)+1);
        }
        for (int i=0; i<N; i++) {
            rate[i][0]=i;
            rate[i][1]=num==0?0:(double)map.getOrDefault(i+1, 0)/num;
            num-=map.getOrDefault(i+1, 0);
        }
        Arrays.sort(rate,(a,b) -> {
            if (Double.compare(a[1], b[1]) != 0)
                return Double.compare(b[1],a[1]);
            return Double.compare(a[0],b[0]);
        });
        for (int i=0; i<N; i++) {
            answer[i]=(int)rate[i][0]+1;
        }
        return answer;
    }
}