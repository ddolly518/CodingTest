import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] arr = new int[M];
        long answer = 0;
        long sum = 0;
        st = new StringTokenizer(br.readLine(), " ");
        for (int i=0; i<N; i++) {
            sum+=Integer.parseInt(st.nextToken());
            int num = (int)sum%M;
            sum%=M;
            arr[num]++;
            if (num==0)
                answer++;
        }
        
        for (int i=0; i<M; i++) {
            if (arr[i]!=0) {
                long num = arr[i];
                answer += num*(num-1)/2;
            }
        }
        
        bw.write(answer+"");
        
        bw.flush();
    }
}