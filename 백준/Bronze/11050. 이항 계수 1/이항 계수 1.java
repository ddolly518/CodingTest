import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int num = 1;
        for (int i=1; i<=m; i++) {
            num= num*n/i;
            n--;
        }
        System.out.println(num);
    }
}