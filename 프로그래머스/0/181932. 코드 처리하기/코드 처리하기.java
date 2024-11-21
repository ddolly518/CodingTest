class Solution {
    public String solution(String code) {
        String answer = "";
        int mode = 0;
        for (int i=0; i<code.length(); i++) {
            char c = code.charAt(i);
            if (c=='1')
                mode = (mode==0) ? 1 : 0;
            else if (mode==0&&i%2==0)
                answer+=c;
            else if (mode==1&&i%2==1)
                answer+=c;
        }
        answer = (answer.equals("")) ? "EMPTY" : answer;
        return answer;
    }
}