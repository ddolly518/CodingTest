import java.util.*;
class Solution {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        List<Integer> list = new ArrayList<>();
        switch(n) {
            case 1 :
                for (int i=0; i<=slicer[1]; i++) {
                    list.add(num_list[i]);
                }
                break;
            case 2 :
                for (int i=slicer[0]; i<num_list.length; i++) {
                    list.add(num_list[i]);
                }
                break;
            case 3 :
                for (int i=slicer[0]; i<=slicer[1]; i++) {
                    list.add(num_list[i]);
                }
                break;
            case 4 :
                for (int i=slicer[0]; i<=slicer[1]; i+=slicer[2]) {
                    list.add(num_list[i]);
                }
                break;               
        }
        int index = 0;
        int[] answer = new int[list.size()];
        for (int i=0; i<list.size(); i++) {
            answer[index++] = list.get(i);
        }
        return answer;
    }
}