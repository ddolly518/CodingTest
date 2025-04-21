class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        int i = 0;
        while(i<section.length) {
            int num = section[i];
            while (i<section.length && section[i]<=(num+m-1)) {
                i++;
            }
            answer++;
        }
        return answer;
    }
}