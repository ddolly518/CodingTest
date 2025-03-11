class Solution {
    public int solution(int[][] board) {
        int answer = 0;
        int n = board.length;
        int[] a = {-1,-1,0,1,1,1,0,-1};
        int[] b = {0,1,1,1,0,-1,-1,-1};
        int[][] arr = new int[n][n];
        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++) {
                if (board[i][j]==1) {
                    for (int k=0; k<8; k++) {
                        arr[i][j]=1;
                        int x=(i+a[k]);
                        int y=(j+b[k]);
                        if (x>=0&&x<n&&y>=0&&y<n) {
                            arr[x][y]=1;
                        }
                    }
                }
            }
        }
        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++) {
                if (arr[i][j]==0)
                    answer++;
            }
        }
        return answer;
    }
}