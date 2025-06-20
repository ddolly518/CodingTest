import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        int N = sc.nextInt();
        int K = sc.nextInt();
        for (int i=1; i*i<=N; i++) {
            if (N%i==0) {
                list.add(i);
                if (i!=(N/i)) {
                    list.add(N/i);
                }
            }
        }
        Collections.sort(list);
        if (list.size()<K) {
            System.out.println(0);
        } else {
            System.out.println(list.get(K-1));
        }
    }
}