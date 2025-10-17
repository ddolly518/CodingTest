import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        for (int i=1; i*i<=N; i++) {
            if (N%i==0) {
                list.add(i);
                if ((N/i)!=i)
                    list.add(N/i);
            }
        }
        Collections.sort(list);
        
        if (list.size()>=K) {
            System.out.print(list.get(K-1));
        } else {
            System.out.print(0);
        }
    }
}