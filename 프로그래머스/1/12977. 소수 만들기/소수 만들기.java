class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        for (int i=0; i<nums.length-2; i++) {
            for (int j=i+1; j<nums.length-1; j++) {
                for (int k=j+1; k<nums.length; k++) {
                    int num = nums[i]+nums[j]+nums[k];
                    if (calc(num))
                        answer++;
                }
            }
        }
        return answer;
    }
    public boolean calc(int n) {
        boolean bo = true;
        for (int i=2; i*i<=n; i++) {
            if (n%i==0) {
                bo = false;
            }
        }
        return bo;
    }
}