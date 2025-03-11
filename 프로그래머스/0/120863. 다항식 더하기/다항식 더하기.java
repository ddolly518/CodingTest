class Solution {
    public String solution(String polynomial) {
        String answer = "";
        int a = 0;
        int b = 0;
        String[] arr = polynomial.split(" \\+ ");
        for (String str:arr) {
            if (str.contains("x")) {
                if (str.length()==1) {
                    a+=1;
                } else {
                    a+=Integer.parseInt(str.replace("x", ""));
                }
            } else {
                b+=Integer.valueOf(str);
            }
        }
        if (a==1) {
            answer+="x";
        } else if (a>1) {
            answer+=(String.valueOf(a)+"x");
        }
        if (b!=0) {
            if (a>0) {
                answer +=" + "+String.valueOf(b);
            } else {
                answer +=String.valueOf(b);
            }
        }
        return answer;
    }
}