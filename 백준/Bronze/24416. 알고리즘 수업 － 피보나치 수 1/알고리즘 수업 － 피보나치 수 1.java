import java.util.*;

public class Main {
    private static int f1 = 0;
    private static int f2 = 0;
    private static int[] f = new int[41];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        fib(n);
        fibonacci(n);
        System.out.print(f1+" "+f2);
    }
    private static int fib(int n) {
        if (n == 1 || n == 2) {
            f1++;
            return 1;
        } else {
            return (fib(n - 1) + fib(n - 2));
        } 
    }
    
    private static int fibonacci(int n) {
        f[1] = 1;
        f[2] = 1;
        for (int i=3; i<=n; i++) {
            f2++;
            f[i] = f[i-1]+f[i-2];
        }
        return f[n];
    }
}