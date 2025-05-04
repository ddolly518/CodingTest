class Solution {
    public String solution(String new_id) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        for (char ch : new_id.toCharArray()) {
            sb.append(Character.toLowerCase(ch));
        }
        String s = sb.toString().replaceAll("[^0-9a-z-_.]","");
        s = s.replaceAll("[.]{2,}", ".");
        sb = new StringBuilder(s);
        if (sb.length() > 0 && sb.charAt(0)=='.') {
            sb.deleteCharAt(0);
        }
        if (sb.length() > 0 && sb.charAt(sb.length()-1)=='.') {
            sb.deleteCharAt(sb.length() - 1);  
        }
        if (sb.length() == 0)
            sb.append("a");
        if (sb.length()>=16) {
            if (sb.charAt(14)=='.') {
                sb.setLength(14);
            } else {
                sb.setLength(15);
            }
        }
        if (sb.length()<=2) {
            char ch = sb.charAt(sb.length()-1);
            while (sb.length()<3) {
                sb.append(ch);
            }
        }
        answer = sb.toString();
        return answer;
    }
}