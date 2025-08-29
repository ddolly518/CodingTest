import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i=0; i<n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Deque<Integer> queue = new LinkedList<>();
        st = new StringTokenizer(br.readLine());
        for (int i=0; i<n; i++) {
            int num = Integer.parseInt(st.nextToken());
            if (arr[i]==0) {
                queue.offerFirst(num);
            }
        }
        int count = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for (int i=0; i<count; i++) {
            int num = Integer.parseInt(st.nextToken());
            queue.offer(num);
            num = queue.poll();
            bw.write(num+" ");
        }
        bw.flush();
        bw.close();
    }
}