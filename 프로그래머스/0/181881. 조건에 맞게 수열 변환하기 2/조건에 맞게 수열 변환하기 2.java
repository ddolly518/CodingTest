class Solution {
    public int solution(int[] arr) {
        int answer = 0;
        Boolean b = false;
        int count = 0;
        while (!b) {
            b = true;
            for (int index=0; index<arr.length; index++) {
                if (arr[index] >= 50 && arr[index]%2==0) {
                    arr[index]/=2;
                    b = false;
                } else if (arr[index] < 50 && arr[index]%2==1) {
                    arr[index] = arr[index]*2+1;
                    b = false;
                }
            }
            count++;
            
        }
        return count-1;
    }
}