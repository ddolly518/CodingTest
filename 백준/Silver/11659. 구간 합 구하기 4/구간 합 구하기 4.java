import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr;
        int[] S;
        
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        
        arr = new int[n+1];
        S = new int[n+1];
        
        st = new StringTokenizer(br.readLine());
        for (int i=1; i<n+1; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            S[i] = S[i-1]+arr[i];
        }
        
        for (int i=0; i<m; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int num = S[b]-S[a-1];
            bw.write(num+"\n");
        }
        
        bw.flush();
        bw.close();
    }
}