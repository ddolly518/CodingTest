import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        int[] b = new int[N-1];
        int answer = 0;
        
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i=0; i<N-1; i++) {
            b[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine(), " ");
        for (int i=0; i<N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        
        int min = Integer.MAX_VALUE;
        for (int i=0; i<N-1; i++) {
            min = Math.min(min, arr[i]);
            answer+=(min*b[i]);
        }
        
        bw.write(answer+"");
        
        bw.flush();
    }
}