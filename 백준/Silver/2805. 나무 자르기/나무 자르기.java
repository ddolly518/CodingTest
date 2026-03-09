import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        long M = Long.parseLong(st.nextToken());
        
        long min = 1;
        long max = 0;
        int[] arr = new int[N];
        st = new StringTokenizer(br.readLine(), " ");
        for (int i=0; i<N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            max = Math.max(arr[i], max);
        }
        
        while (min <= max) {
            long mid = (min+max)/2;
            
            long sum = 0;
            for (int i=0; i<N; i++) {
                if(arr[i] > mid) {
                    sum += arr[i] - mid;
                }
            }
            
            if (sum < M) {
                max = mid - 1;
            } else {
                min = mid + 1;
            }
        }
        
        bw.write(max+"");
        
        bw.flush();
        bw.close();
    }
}