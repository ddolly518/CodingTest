class Solution {
    public int solution(int[] wallet, int[] bill) {
        int answer = 0;
        int min = Math.min(bill[0], bill[1]);
        int max = Math.max(bill[0], bill[1]);
        int wal = Math.min(wallet[0], wallet[1]);
        int let = Math.max(wallet[0], wallet[1]);
        while (min>wal || max>let) {
            max = max/2;
            answer++;
            if (max<min) {
                int temp = min;
                min = max;
                max = temp;
            }
        }
        return answer;
    }
}