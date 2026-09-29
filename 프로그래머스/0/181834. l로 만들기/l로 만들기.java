class Solution {
    public String solution(String myString) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        for (char ch : myString.toCharArray()) {
            if (ch < 'l') {
                sb.append('l');
            } else {
                sb.append(ch);
            }
        }
        answer = sb.toString();
        return answer;
    }
}