class Solution {
    public int solution(String dartResult) {
        int answer = 0;
        int[] scores = new int[3];
        int index = 0;
        int i=0;
        int num = 0;
        while (i<dartResult.length()) {
            if (dartResult.charAt(i) == '1' && dartResult.charAt(i+1) == '0') {
                num = 10;
                i+=2;
            } else {
                num=dartResult.charAt(i)-'0';
                i++;
            }
            char bonus = dartResult.charAt(i);
            if (bonus == 'S') num = (int)Math.pow(num, 1);
            else if (bonus == 'D') num = (int)Math.pow(num, 2);
            else if (bonus == 'T') num = (int)Math.pow(num, 3);
            i++;
            
            if (i < dartResult.length()) {
                char option = dartResult.charAt(i);
                if (option == '*') {
                    num *= 2;
                    if (index > 0) scores[index - 1] *= 2;
                    i++;
                } else if (option == '#') {
                    num *= -1;
                    i++;
                }
            }
            scores[index++] = num;
        }
        answer = scores[0]+scores[1]+scores[2];
        return answer;
    }
}