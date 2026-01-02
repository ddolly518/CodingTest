import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int[] arr = new int[N];
        for (int i=0; i<N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        
        int answer = 0;
        for (int i=N-1; i>=0; i--) {
            if (K == 0) {
                break;
            }
            int num = K/arr[i];
            K%=arr[i];
            answer+=num;
        }
        bw.write(answer+"");
        bw.flush();
    }
}