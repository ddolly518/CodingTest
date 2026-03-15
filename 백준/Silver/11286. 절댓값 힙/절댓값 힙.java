import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        Queue<Integer> pq = new PriorityQueue<>((a,b) -> {
            if (Math.abs(a) == Math.abs(b)) {
                return a-b;
            }
            return Math.abs(a)-Math.abs(b);
        });
        
        for (int i=0; i<N; i++) {
            int num = Integer.parseInt(br.readLine());
            if (num == 0) {
                if (pq.isEmpty()) {
                    bw.write("0\n");
                } else {
                    bw.write(pq.poll()+"\n");
                }
            } else {
                pq.offer(num);
            }
        }
        
        bw.flush();
        bw.close();
    }
}