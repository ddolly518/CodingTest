class Solution {
    public String solution(String[] my_strings, int[][] parts) {
        String answer = "";
        int index = 0;
        for (String str : my_strings) {
            int s = parts[index][0];
            int e = parts[index][1];
            index++;
            answer+=str.substring(s,e+1);
        }
        return answer;
    }
}