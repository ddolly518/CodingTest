class Solution {
    public String solution(int a, int b) {
        Integer[] arr = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] day = {"FRI","SAT","SUN","MON","TUE","WED","THU"};
        int sum = 0;
        for (int i=0; i<a-1; i++) {
            sum+=arr[i];
        }
        sum+=(b-1);
        String answer = day[sum%7];
        return answer;
    }
}