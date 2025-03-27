import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        int index = 0;
        for (int[] command:commands) {
            List<Integer> list = new ArrayList<>();
            for (int i=command[0]-1; i<command[1]; i++) {
                list.add(array[i]);
            }
            int[] result = new int[list.size()];
            for (int i=0; i<list.size(); i++) {
                result[i]=list.get(i);
            }
            Arrays.sort(result);
            answer[index++] = result[command[2]-1];
        }
        return answer;
    }
}