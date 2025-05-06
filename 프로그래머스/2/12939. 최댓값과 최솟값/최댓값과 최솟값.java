class Solution {
    public String solution(String s) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        String[] str = s.split(" ");
        for (String st : str) {
            int num = Integer.valueOf(st);
            max = Math.max(max, num);
            min = Math.min(min, num);
        }
        sb.append(min);
        sb.append(" ");
        sb.append(max);
        answer = sb.toString();
        return answer;
    }
}