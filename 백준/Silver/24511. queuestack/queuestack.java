import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int N = Integer.parseInt(br.readLine());
        
        int[] arr = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i=0; i<N; i++) {
            int num = Integer.parseInt(st.nextToken());
            arr[i] = num;
        }
        
        st = new StringTokenizer(br.readLine(), " ");
        Deque<Integer> deque = new ArrayDeque<>();
        for (int i=0; i<N; i++) {
            int num = Integer.parseInt(st.nextToken());
            if (arr[i]==0) {
                deque.offerFirst(num);
            }
        }
        
        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine(), " ");
        for (int i=0; i<M; i++) {
            int num = Integer.parseInt(st.nextToken());
            deque.offer(num);
            bw.write(deque.poll()+" ");
        }
        
        bw.flush();
    }
}