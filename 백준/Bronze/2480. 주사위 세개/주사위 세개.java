import java.util.*; 

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<Integer, Integer> map = new HashMap<>();
        for (int i=0; i<3; i++) {
            int n = sc.nextInt();
            map.put(n,map.getOrDefault(n,0)+1);
        }
        if (map.size()==1) {
            for (int key : map.keySet()) {
                System.out.println(10000+key*1000);
            }
        } else if (map.size()==2) {
            for (int key : map.keySet()) {
                if (map.get(key)==2) {
                    System.out.println(1000+key*100);
                }
            }
        } else {
            int max = 0;
            for (int key : map.keySet()) {
                max = Math.max(key,max);
            }
            System.out.println(max*100);
        }
    }
}