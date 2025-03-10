class Solution {
    public int solution(int balls, int share) {
        int answer = 0;
        answer = calc(balls, share);
        return answer;
    }
    public int calc(int balls, int share) {
        if (balls==share||share==0) return 1;
        return calc(balls-1,share-1)+calc(balls-1,share);
    }
}