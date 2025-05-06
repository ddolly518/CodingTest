class Solution {
    public String solution(String s) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        boolean bo = true;
        for (int i=0; i<s.length(); i++) {
            char ch = s.charAt(i);
            if (ch==' ') {
                sb.append(' ');
                bo = true;
            }
            else if (bo) {
                sb.append(Character.toUpperCase(ch));
                bo = false;
            } else {
                sb.append(Character.toLowerCase(ch));
            }
        }
        answer = sb.toString();
        return answer;
    }
}