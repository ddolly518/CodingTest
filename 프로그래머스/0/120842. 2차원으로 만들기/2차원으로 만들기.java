class Solution {
    public int[][] solution(int[] num_list, int n) {
        int[][] answer = new int[num_list.length/n][n];
        int num = 0;
        int index = 0;
        for (int i=0; i<num_list.length; i++) {
            answer[index][num] = num_list[i];
            num++;
            if (num==n) {
                index++;
                num=0;
            }
        }
        
        return answer;
    }
}