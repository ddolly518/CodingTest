class Solution {
    public int[] solution(int n, long left, long right) {
        int size = (int)(right-left+1);
        int[] answer = new int[size];
        for (int i=0; i<size; i++) {
            long num = left+i;
            int row = (int)(num/n);
            int col = (int)(num%n);
            answer[i]=Math.max(row,col)+1;
        }
        return answer;
    }
}