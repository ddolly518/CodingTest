class Solution {
    public int solution(int n) {
        int answer = 0;
        int num = 0;
        int num2 = 1;
        for (int i=2; i<=n; i++) {
            answer=(num+num2)%1234567;
            num = num2;
            num2 = answer;
        }
        return answer;
    }
}