class Solution {
    public int solution(int n) {
        int countOne = Integer.bitCount(n);
        int answer = n+1;
        while (true) {
            if (Integer.bitCount(answer) == countOne) {
                return answer;
            }
            answer++;
        }
    }
}