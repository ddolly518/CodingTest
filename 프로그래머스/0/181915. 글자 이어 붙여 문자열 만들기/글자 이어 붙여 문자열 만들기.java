class Solution {
    public String solution(String my_string, int[] index_list) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        for (int index : index_list) {
            char ch = my_string.charAt(index);
            sb.append(ch);
        }
        answer = sb.toString();
        return answer;
    }
}