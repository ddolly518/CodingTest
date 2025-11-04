import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        Deque<Integer> dq = new ArrayDeque<>();
        
        for (int i=0; i<N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            String str = st.nextToken();
            if (str.equals("push")) {
                dq.offer(Integer.parseInt(st.nextToken()));
            } else if (str.equals("pop")) {
                if (dq.isEmpty()) {
                    bw.write(-1+"\n");
                } else {
                    bw.write(dq.poll()+"\n");
                }
            } else if (str.equals("size")) {
                bw.write(dq.size()+"\n");
            } else if (str.equals("empty")) {
                if (dq.isEmpty()) {
                    bw.write(1+"\n");
                } else {
                    bw.write(0+"\n");
                }
            } else if (str.equals("front")) {
                if (dq.isEmpty()) {
                    bw.write(-1+"\n");
                } else {
                    bw.write(dq.peek()+"\n");
                }
            } else if (str.equals("back")) {
                if (dq.isEmpty()) {
                    bw.write(-1+"\n");
                } else {
                    bw.write(dq.peekLast()+"\n");
                }
            }
        }
        bw.flush();
    }
}