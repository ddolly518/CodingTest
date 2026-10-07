class Solution {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];
        int n = (int)total/num;
        int len = (int)num/2;
        int index = 0;
        if (total%num == 0) {
            for (int i=(n-len); i<=(n+len); i++) {
                answer[index++] = i;
            }
        } else {
            for (int i=(n-len+1); i<=(n+len); i++) {
                answer[index++] = i;
            }
        }
        return answer;
    }
}