import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<Integer,Integer> map = new HashMap<>();
        int answer = 0;
        
        for (int i=0; i<3; i++) {
            int num = sc.nextInt();
            map.put(num, map.getOrDefault(num,0)+1);
        }
        
        for (Map.Entry<Integer,Integer> entry : map.entrySet()) {
            int max = 0;
            if (entry.getValue()==3) {
                int num = 10000+entry.getKey()*1000;
                answer = Math.max(answer, num);
            } else if (entry.getValue()==2) {
                int num = 1000+entry.getKey()*100;
                answer = Math.max(answer, num);
            } else {
                max = Math.max(max, entry.getKey());
                int num = 100*max;
                answer = Math.max(answer, num);
            }
        }
        
        System.out.print(answer);
    }
}