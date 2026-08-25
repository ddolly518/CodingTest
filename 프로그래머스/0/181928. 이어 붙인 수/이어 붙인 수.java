class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        for (int i=0; i<num_list.length; i++) {
            int num = num_list[i];
            if (num%2 == 0) {
                sb1.append(num);
            } else {
                sb2.append(num);
            }
        }
        answer = Integer.valueOf(sb1.toString()) + Integer.valueOf(sb2.toString());
        return answer;
    }
}