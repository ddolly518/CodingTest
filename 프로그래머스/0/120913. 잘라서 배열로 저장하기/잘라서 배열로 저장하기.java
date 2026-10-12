class Solution {
    public String[] solution(String my_str, int n) {
        int num = my_str.length()%n==0 ? my_str.length()/n : my_str.length()/n+1;
        String[] answer = new String[num];
        for (int i=0; i<my_str.length(); i+=n) {
            answer[i/n] = my_str.substring(i, Math.min(i+n, my_str.length()));
        }
        return answer;
    }
}