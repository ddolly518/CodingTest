class Solution {
    public int solution(int M, int N) {
        int answer = (M-1)+M*(N-1);
        if (M==1&N==1)
            answer=0;
        return answer;
    }
}