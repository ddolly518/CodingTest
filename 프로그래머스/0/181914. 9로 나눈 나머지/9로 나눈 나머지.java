class Solution {
    public int solution(String number) {
        int answer = 0;
        for (char ch : number.toCharArray()) {
            int num = ch-'0';
            answer+=num;
        }
        answer%=9;
        return answer;
    }
}