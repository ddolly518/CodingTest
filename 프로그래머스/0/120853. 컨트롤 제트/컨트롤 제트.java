class Solution {
    public int solution(String s) {
        int answer = 0;
        int ex = 0;
        String[] arr = s.split(" ");
        for (String str : arr) {
            if (str.equals("Z")) {
                answer-=ex;
            } else {
                ex = Integer.valueOf(str);
                answer+=ex;
            }
        }
        return answer;
    }
}