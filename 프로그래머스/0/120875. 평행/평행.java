class Solution {
    public int solution(int[][] dots) {
        int answer = 0;
        int[] a = dots[0];
        int[] b = dots[1];
        int[] c = dots[2];
        int[] d = dots[3];
        if (get(a,b,c,d)||get(a,c,b,d)||get(a,d,b,c))
            answer = 1;
        return answer;
    }
    public boolean get(int[] a,int[] b,int[] c,int[] d) {
        if (((a[0]-b[0])*(c[1]-d[1]))==((a[1]-b[1])*(c[0]-d[0])))
            return true;
        return false;
    }
}