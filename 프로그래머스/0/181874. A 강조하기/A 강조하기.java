class Solution {
    public String solution(String myString) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        for (char ch : myString.toCharArray()) {
            if (ch == 'a' || ch == 'A')
                sb.append(Character.toUpperCase(ch));
            else 
                sb.append(Character.toLowerCase(ch));
        }
        answer = sb.toString();
        return answer;
    }
}