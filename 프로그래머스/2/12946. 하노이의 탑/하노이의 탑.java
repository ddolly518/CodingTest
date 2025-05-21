import java.util.*;

class Solution {
    public int[][] solution(int n) {
        int num = (int)(Math.pow(2, n)-1);
        int[][] answer = new int[num][2];
        List<int[]> list = new ArrayList<>();
        move(n,1,2,3,list);
        for (int i=0; i<list.size(); i++) {
            answer[i]=list.get(i);
        }
        return answer;
    }
    private void move(int n, int a, int b, int c, List<int[]> list) {
        if (n==1) {
            list.add(new int[]{a,c});
            return;
        }
        move(n-1,a,c,b,list);
        list.add(new int[]{a,c});
        move(n-1,b,a,c,list);
    } 
}
