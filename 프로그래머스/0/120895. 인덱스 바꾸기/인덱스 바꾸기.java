class Solution {
    public String solution(String my_string, int num1, int num2) {
        String answer = "";
        StringBuilder sb = new StringBuilder(my_string);
        Character ch = sb.charAt(num1);
        sb.setCharAt(num1, sb.charAt(num2));
        sb.setCharAt(num2, ch);
        answer = sb.toString();
        return answer;
    }
}