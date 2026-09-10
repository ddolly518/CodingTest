import java.util.*;

class Solution {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        int[] answer = {};
        int index = 0;
        int start = 0;
        int end = 0;
        int num = 1;
        if (n == 1) {
            end = slicer[1];
        } else if (n == 2) {
            start = slicer[0];
            end = num_list.length-1;
        } else if (n == 3) {
            start = slicer[0];
            end = slicer[1];
        } else if (n == 4) {
            start = slicer[0];
            end = slicer[1];
            num = slicer[2];
        }
        answer = new int[1+(end-start)/num];
        for (int i=start; i<=end; i+=num) {
            answer[index++] = num_list[i];
        }
        return answer;
    }
}