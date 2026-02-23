import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        long[] arr = new long[n];
        long[] number = new long[n-1];
        long answer = 0;
        
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i=0; i<n-1; i++) {
            number[i] = Long.parseLong(st.nextToken());
        }
        st = new StringTokenizer(br.readLine(), " ");
        for (int i=0; i<n; i++) {
            arr[i] = Long.parseLong(st.nextToken());
        }
        
        long min = arr[0];
        for (int i=0; i<n-1; i++) {
            min = Math.min(min, arr[i]);
            answer+=(min*number[i]);
        }
        bw.write(answer+"");
        
        bw.flush();
        bw.close();
    }
}