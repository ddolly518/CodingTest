class Solution {
    public long solution(int n) {
        long answer = 0;
        int sum = 1;
        int num = 1;
        int num2 = 1;
        for (int i=2; i<=n; i++) {
            sum = (num+num2)%1234567;
            num = num2;
            num2 = sum;
        }
        answer = sum;
        return answer;
    }
}