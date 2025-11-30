import java.util.*;

public class Main {
    static int count = 0;
    static int[] arr;
    static int n;
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        arr = new int[n+1];
        
        backtracking(1);
        
        System.out.print(count);
    }
    
    private static void backtracking(int length) {
        if (length == n+1) {
            count++;
            return;
        }
        
        for (int i=1; i<=n; i++) {
            boolean bo = true;
            
            for (int j=1; j<length; j++) {
                if (arr[j]==i || Math.abs(i-arr[j])==Math.abs(length-j)) {
                    bo = false;
                    break;
                }
            }
            if (bo) {
                arr[length] = i;
                backtracking(length+1);
            }
        }
    }
}