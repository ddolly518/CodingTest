import java.util.*;

class Solution {
    public int[] solution(int[][] score) {
        int len = score.length;
        int[] answer = new int[len];
        double[] avg = new double[len];
        List<double[]> list = new ArrayList<>();
        for (int i=0; i<len; i++) {
            avg[i]=(score[i][0]+score[i][1])/2.0;
            list.add(new double[]{avg[i],i});
        }
        list.sort((a, b) -> Double.compare(b[0], a[0]));
        answer[(int)list.get(0)[1]]=1;
        for (int i=1; i<len; i++) {
            if (list.get(i)[0]==list.get(i-1)[0]) {
                answer[(int)list.get(i)[1]]=answer[(int)list.get(i-1)[1]];
            } else {
                answer[(int)list.get(i)[1]]=i+1;
            }
        }
        return answer;
    }
}