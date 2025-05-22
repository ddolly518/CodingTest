class Solution {
    int[] answer = new int[2];
    public int[] solution(int[][] arr) {
        int len = arr.length;
        calc(arr,0,0,len);
        return answer;
    }
    private void calc(int[][] arr, int row, int col, int len) {
        boolean bo = true;
        int num = arr[row][col];
        for (int i=row; i<row+len; i++) {
            for (int j=col; j<col+len; j++) {
                if (arr[i][j]!=num) {
                    bo = false;
                }
            }
        }
        
        if (bo) {
            answer[num]++;
            return;
        }
        len/=2;
        calc(arr,row,col,len);
        calc(arr,len+row,col,len);
        calc(arr,row,len+col,len);
        calc(arr,len+row,len+col,len);
    }
}