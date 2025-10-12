import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String str = "*";
        
        for (int i=1; i<=N; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j=1; j<=i; j++) {
                sb.append(str);
            }
            System.out.println(sb.toString());
        }
    }
}