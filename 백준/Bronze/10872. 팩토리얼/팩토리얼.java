import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n==0 || n==1) {
            System.out.println(1);
            return;
        }
        int num = 1;
        for (int i=2; i<=n; i++) {
            num*=i;
        }
        System.out.println(num);
    }
}