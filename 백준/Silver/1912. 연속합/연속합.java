import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        int max = Integer.MIN_VALUE;
        
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i=0; i<n; i++) {
            int num = Integer.parseInt(st.nextToken());
            if (i==0) {
                arr[i] = num;
                max = arr[i];
            } else {
                arr[i] = Math.max(arr[i-1]+num, num);
                max = Math.max(max, arr[i]);
            }
        }
        
        System.out.print(max);
    }
}