import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        int[] answer = new int[n];
        
        for (int i=0; i<n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        
        answer[0] = arr[0];
        if (n==1) {
            System.out.print(answer[0]);
            return;
        } 
        answer[1] = arr[0]+arr[1];
        if (n==2) {
            System.out.print(answer[1]);
            return;
        }
        
        for (int i=2; i<n; i++) {
            if (i==2) {
                int num = Math.max(arr[0], arr[1]) + arr[2];
                answer[i] = Math.max(answer[1], num);
            } else {
                int num = Math.max(answer[i-3]+arr[i-1], answer[i-2]) + arr[i];
                answer[i] = Math.max(answer[i-1], num);
            }
        }
        
        System.out.print(answer[n-1]);
    }
}