class Solution {
    public String solution(String my_string, int s, int e) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        StringBuilder reverse = new StringBuilder(my_string.substring(s,e+1));
        reverse.reverse();
        sb.append(my_string.substring(0,s));
        sb.append(reverse);
        sb.append(my_string.substring(e+1));
        answer = sb.toString();
        return answer;
    }
}