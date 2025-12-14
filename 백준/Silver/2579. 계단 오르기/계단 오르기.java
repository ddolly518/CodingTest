import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        
        for (int i=0; i<n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        
        int[] num = new int[n];
        num[0] = arr[0];
        if (n>1) {
            num[1] = arr[0] + arr[1];
        }
        if (n>2) {
            num[2] = Math.max(arr[0], arr[1])+arr[2];
        }
        
        for (int i=3; i<n; i++) {
            num[i] = Math.max(num[i-2], num[i-3]+arr[i-1]) + arr[i];
        }
        
        System.out.print(num[n-1]);
    }
}