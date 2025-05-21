import java.util.*;

class Solution {
    public int solution(int[][] maps) {
        int[] a = {0, 1, 0, -1}; 
        int[] b = {1, 0, -1, 0};
        int answer = -1;
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{0,0,1});
        int n = maps.length;
        int m = maps[0].length;
        boolean[][] arr = new boolean[n][m];
        arr[0][0]=true;
        while(!queue.isEmpty()) {
            int[] num = queue.poll();
            int x = num[0];
            int y = num[1];
            int count = num[2];
            if (x==(n-1) && y==(m-1))
                return count;
            for (int i=0; i<4; i++) {
                int xi = x+a[i];
                int yi = y+b[i];
                if (xi>=0 && xi<n && yi>=0 && yi<m && arr[xi][yi]==false && maps[xi][yi]==1) {
                    arr[xi][yi]=true;
                    queue.offer(new int[]{xi,yi,count+1});
                }
            }
        }
        return answer;
    }
}