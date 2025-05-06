class Solution {
    public int[] solution(String s) {
        int[] answer = new int[2];
        int count = 0;
        int zero = 0;
        while(!s.equals("1")) {
            int len = s.length();
            s = s.replaceAll("0","");
            int len2 = s.length();
            zero+=(len-len2);
            s = Integer.toBinaryString(len2);
            count++;
        }
        answer[0]=count;
        answer[1]=zero;
        return answer;
    }
}