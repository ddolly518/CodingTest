import java.util.*;

class Solution {
    public int solution(int[] mats, String[][] park) {
        int answer = -1;
        
        Arrays.sort(mats);
        for (int mat : mats) {
            for (int i=0; i<=park.length-mat; i++) {
                for (int j=0; j<=park[0].length-mat; j++) {
                    boolean bo = true;
                    for (int k=0; k<mat; k++) {
                        for (int p=0; p<mat; p++) {
                            if (!park[i+k][j+p].equals("-1"))
                                bo = false;
                        }
                    }
                    if (bo) 
                        answer = mat;
                }
            }
        }
        return answer;
    }
}