import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        String answer = String.valueOf(A*B*C);
        int[] arr = new int[10];
        
        for (int i=0; i<answer.length(); i++) {
            char ch = answer.charAt(i);
            arr[ch-'0']++;
        }
        for (int i=0; i<10; i++) {
            System.out.println(arr[i]);
        }  
    }
}