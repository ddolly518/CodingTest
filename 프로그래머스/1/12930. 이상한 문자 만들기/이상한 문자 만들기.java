class Solution {
    public String solution(String s) {
        String answer = "";
        int index = 0;
        for (char ch : s.toCharArray()) {
            if (Character.isUpperCase(ch)||Character.isLowerCase(ch)) {
                if (index%2==0) {
                    answer+=(Character.toUpperCase(ch));
                } else {
                    answer+=(Character.toLowerCase(ch)); 
                } 
                index++;
            } else {
                index = 0;
                answer+=ch;
            }
        }
        return answer;
    }
}