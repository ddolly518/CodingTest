class Solution {
    public int solution(String my_string) {
        String[] str = my_string.split(" ");
        int answer = Integer.valueOf(str[0]);
        for (int i=1; i<str.length; i+=2) {
            switch(str[i]) {
                case "+" : answer+=Integer.valueOf(str[i+1]); break;
                case "-" : answer-=Integer.valueOf(str[i+1]); break;
            }
        }
        return answer;
    }
}