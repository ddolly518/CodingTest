class Solution {
    int answer = -1;
    public int solution(int k, int[][] dungeons) {
        boolean[] bo = new boolean[dungeons.length];
        dfs(k, dungeons, bo, 0);
        return answer;
    }
    private void dfs(int k, int[][] dungeons, boolean[] bo, int count) {
        answer = Math.max(answer, count);
        for (int i=0; i<dungeons.length; i++) {
            int a = dungeons[i][0];
            int b = dungeons[i][1];
            if (bo[i]==false && k>=a) {
                bo[i]=true;
                dfs(k-b,dungeons,bo,count+1);
                bo[i]=false;
            }
        }
    }
}