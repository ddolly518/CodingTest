import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(fibo(n));
    }
    private static int fibo(int n) {
        if (n==0) return 1;
        return n*fibo(n-1);
    }
}