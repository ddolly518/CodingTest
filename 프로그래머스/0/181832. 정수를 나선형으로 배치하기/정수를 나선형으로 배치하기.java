class Solution {
    public int[][] solution(int n) {
        int[][] answer = new int[n][n];
        int num = 1;
        int start=0;
        int end=n-1;
        while (num <= n*n) {
            // 왼쪽에서 오른쪽으로
            for (int i = start; i < end; i++) {
                answer[start][i] = num++;
            }
            // 위에서 아래로
            for (int i = start; i < end; i++) {
                answer[i][end] = num++;
            }
            // 오른쪽에서 왼쪽으로
            for (int i = end; i > start; i--) {
                answer[end][i] = num++;
            }
            // 아래에서 위로
            for (int i = end; i > start; i--) {
                answer[i][start] = num++;
            }
            if (start == end) {
                answer[start][start] = num++;
            }
            start++;
            end--;
        }
        return answer;
    }
}