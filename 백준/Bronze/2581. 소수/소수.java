import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int N = sc.nextInt();
        int min = 0;
        int sum = 0;
        for (int i=M; i<=N; i++) {
            boolean bo = true;
            if (i<2) continue;
            for (int j=2; j*j<=i; j++) {
                if (i%j==0)
                    bo = false;
            }
            if (bo) {
                if (sum==0) {
                    min = i;
                }
                sum+=i;
            }
        }
        if (sum==0) {
            System.out.println(-1); 
        } else {
            System.out.println(sum);
            System.out.println(min);
        }
    }
}