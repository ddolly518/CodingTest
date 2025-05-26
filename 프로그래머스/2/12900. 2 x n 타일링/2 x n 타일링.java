class Solution {
    long[] arr;
    public int solution(int n) {
        arr = new long[n+1];
        int answer = (int)calc(n);
        return answer;
    }
    private long calc(int n) {
        if (n==1) return 1;
        if (n==2) return 2;
        if (arr[n]!=0) return arr[n];
        arr[n] = (calc(n-1)+calc(n-2))%1000000007;
        return arr[n];
    }
}
/*
가로길이 n
4-5
3-3
2-2
1-1
*/