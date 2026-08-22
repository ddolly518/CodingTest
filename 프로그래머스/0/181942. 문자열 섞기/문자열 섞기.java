class Solution {
    public String solution(String str1, String str2) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        for (int i=0; i<str1.length(); i++) {
            char ch1 = str1.charAt(i);
            char ch2 = str2.charAt(i);
            sb.append(ch1);
            sb.append(ch2);
        }
        answer = sb.toString();
        return answer;
    }
}