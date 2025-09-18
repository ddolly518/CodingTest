import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr;
        int[] S;
        int max = Integer.MIN_VALUE;
        
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        
        arr = new int[n+1];
        S = new int[n+1];
        
        st = new StringTokenizer(br.readLine());
        for (int i=1; i<n+1; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            S[i] = S[i-1]+arr[i];
        }
        
        for (int i=1; i<=n+1-m; i++) {
            int num = S[i+m-1]-S[i-1];
            max = (max<num)?num:max;
        }
        System.out.println(max);
    }
}