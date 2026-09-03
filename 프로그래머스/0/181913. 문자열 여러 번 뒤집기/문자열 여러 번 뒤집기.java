class Solution {
    public String solution(String my_string, int[][] queries) {
        String answer = "";
        StringBuilder sb = new StringBuilder(my_string);
        
        for (int[] query : queries) {
            int s = query[0];
            int e = query[1];
            
            String str = sb.toString();
            sb = new StringBuilder(str.substring(0,s));
            sb.append(new StringBuilder(str.substring(s,e+1)).reverse());
            sb.append(str.substring(e+1));
        }
        
        answer = sb.toString();
        return answer;
    }
}