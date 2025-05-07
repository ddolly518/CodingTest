class Solution {
    public int solution(int n) {
        int answer = 0;
        int m = 1;
        
        while (m * (m - 1) / 2 < n) {
            if ((n - (m * (m - 1) / 2)) % m == 0) {
                answer++;
            }
            m++;
        }
        return answer;
    }
}