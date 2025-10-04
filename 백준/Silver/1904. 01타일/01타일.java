import java.util.*;

public class Main {
    private static int[] memo = new int[1000001];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        memo[1] = 1;
        memo[2] = 2;
        System.out.println(fun(n));
    }
    private static int fun(int n) {
        
        if (memo[n]!=0) return memo[n];
        memo[n] = (fun(n-1)+fun(n-2))%15746;
        return memo[n];
    }
}