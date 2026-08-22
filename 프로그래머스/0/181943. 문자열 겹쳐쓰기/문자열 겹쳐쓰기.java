class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        for (int i=0; i<s; i++) {
            char ch = my_string.charAt(i);
            sb.append(ch);
        }
        for (char ch : overwrite_string.toCharArray()) {
            sb.append(ch);
        }
        for (int i=s+overwrite_string.length(); i<my_string.length(); i++) {
            char ch = my_string.charAt(i);
            sb.append(ch);
        }
        answer = sb.toString();
        return answer;
    }
}