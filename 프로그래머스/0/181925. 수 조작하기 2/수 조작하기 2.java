class Solution {
    public String solution(int[] numLog) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        for (int i=1; i<numLog.length; i++) {
            int num = numLog[i] - numLog[i-1];
            if (num == 1) sb.append('w');
            else if (num == -1) sb.append('s');
            else if (num == 10) sb.append('d');
            else if (num == -10) sb.append('a');
        }
        answer = sb.toString();
        return answer;
    }
}