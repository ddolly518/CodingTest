import java.util.ArrayList;

class Solution {
    public int[] solution(int l, int r) {
        ArrayList<Integer> list = new ArrayList<>();
        int index = 0;
        for (int i=l; i<=r; i++) {
            if (i%5==0) {
                Boolean a=true;
                String str = ""+i;
                for (char ch : str.toCharArray()) {
                    if (ch!='5'&&ch!='0')
                        a=false;
                }
                if (a) {
                    list.add(i);
                }
                    
            }
        }
         if (list.isEmpty()) {
            return new int[] {-1};
        }
        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}