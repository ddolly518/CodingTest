class Solution {
    public int solution(int a, int d, boolean[] included) {
        int answer = 0;
        int num = a;
        for (boolean bo : included) {
            if (bo)
                answer+=num;
            num+=d;
        }
        return answer;
    }
}