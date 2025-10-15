import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
    
        for (int i=1; i<2*N; i++) {
            StringBuilder sb = new StringBuilder();
            if (i<=N) {
                for (int j=0; j<(N-i); j++) {
                    sb.append(" ");
                }
                for (int j=1; j<=(2*i-1); j++) {
                    sb.append("*");
                }
            } else {
                for (int j=0; j<(i-N); j++) {
                    sb.append(" ");
                }
                for (int j=1; j<=(2*(2*N-i)-1); j++) {
                    sb.append("*");
                }
            }
            System.out.println(sb.toString());
        }
    }
}