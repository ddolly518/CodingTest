class Solution {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];
        int n = total/num;
        if (num%2==0) {
            int s = n-(num/2)+1;
            for (int i=0; i<num; i++) {
                answer[i]=s++;
            }
        } else {
            int s = n-(num/2);
            for (int i=0; i<num; i++) {
                answer[i]=s++;
            }
        }
        return answer;
    }
}