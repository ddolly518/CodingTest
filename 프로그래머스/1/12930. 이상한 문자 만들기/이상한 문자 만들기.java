class Solution {
    public String solution(String s) {
        String answer = "";
        String[] strs = s.split("");
        int count = 0;
        for (String str : strs) {
            char ch = str.charAt(0);
            count = (ch==' ')?0:count+1;
            if (count%2==1)
                answer+=Character.toUpperCase(ch);
            else 
                answer+=Character.toLowerCase(ch);
        }
        return answer;
    }
}