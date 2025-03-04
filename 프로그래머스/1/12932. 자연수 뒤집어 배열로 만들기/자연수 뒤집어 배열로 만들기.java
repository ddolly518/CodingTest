class Solution {
    public int[] solution(long n) {
        long num = n;
        int len = String.valueOf(num).length();
        int[] answer = new int[len];
        for (int i=0; i<len; i++) {
            answer[i] = (int)(num%10);
            num/=10;
        }
        return answer;
    }
}