import java.util.*;

public class Main {
    static int[] arr = new int[21];
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        fibo(n);
        System.out.println(arr[n]);
        
    }
    public static int fibo(int n) {
        if (n==0) {
            arr[0] = 0;
            return 0;
        }
        if (n==1) {
            arr[1] = 1;
            return 1;
        }
        if (arr[n] != 0) return arr[n];
        return arr[n] = fibo(n-1) + fibo(n-2);
    }
}