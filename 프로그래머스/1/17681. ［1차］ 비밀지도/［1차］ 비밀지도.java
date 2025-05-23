class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        for (int i=0; i<n; i++) {
            String str1 = String.format("%" + n + "s", Integer.toBinaryString(arr1[i]));
            String str2 = String.format("%" + n + "s", Integer.toBinaryString(arr2[i]));
            StringBuilder sb = new StringBuilder();
            for (int j=0; j<n; j++) {
                if (str1.charAt(j)=='1'||str2.charAt(j)=='1') {
                    sb.append("#");
                } else {
                    sb.append(" ");
                }
            }
            answer[i] = sb.toString();
        }
        
        return answer;
    }
}