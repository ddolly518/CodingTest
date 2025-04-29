import java.util.*;

class Solution {
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        Map<String, Integer> map = new HashMap<>();
        List<int[]> list = new ArrayList<>();
        map.put("code",0);
        map.put("date",1);
        map.put("maximum",2);
        map.put("remain",3);
        int e = map.get(ext);
        int s = map.get(sort_by);
        
        for (int[] d : data) {
            if (d[e]<val_ext) {
                list.add(d);
            }
        }
        Collections.sort(list, (a,b)-> {
           return Integer.compare(a[s],b[s]); 
        });
        int[][] answer = new int[list.size()][4];
        int index = 0;
        for (int[] num : list) {
            answer[index++]=num;
        }
        return answer;
    }
}