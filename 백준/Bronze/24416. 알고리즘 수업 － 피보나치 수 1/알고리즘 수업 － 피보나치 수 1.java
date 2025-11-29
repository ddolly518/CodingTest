import java.util.*;

public class Main {
    static int f1 = 0;
    static int f2 = 0;
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        fib(n);
        fibonacci(n);
        System.out.print(f1+" "+f2);
    }
    
    private static int fib(int n) {
        if (n==1 || n==2) {
            f1++;
            return 1;
        } else {
            return fib(n-1)+fib(n-2);
        }
    }
    
    private static int fibonacci(int n) {
        int[] f = new int[n+1];
        f[1] = 1;
        f[2] = 1;
        for (int i=3; i<=n; i++) {
            f[i] = f[i-1]+f[i-2];
            f2++;
        }
        return f[n];
    }
}