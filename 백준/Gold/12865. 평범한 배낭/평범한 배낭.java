import java.util.*;
import java.io.*;

public class Main {    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int[][] arr = new int[N+1][2];
        int[] answer = new int[K+1];
        for(int i=1; i<=N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }
        
        for (int i=1; i<=N; i++) {
            int weight = arr[i][0];
            int value = arr[i][1];
            for (int j=K; j>=weight; j--) {
                answer[j] = Math.max(answer[j], answer[j-weight]+value);
            }
        }
        
        bw.write(answer[K]+"");
        
        bw.flush();
    }
}