import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        Deque<Integer> queue = new LinkedList<>();
        for (int i=0; i<n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String str = st.nextToken();
            if (str.equals("push")) {
                queue.offer(Integer.parseInt(st.nextToken()));
            } else if (str.equals("pop")) {
                if (queue.isEmpty()) {
                    bw.write(-1+"\n");
                } else {
                    bw.write(queue.poll()+"\n");
                }
            } else if (str.equals("size")) {
                bw.write(queue.size()+"\n");
                
            } else if (str.equals("empty")) {
                if (queue.isEmpty()) {
                    bw.write(1+"\n");
                } else {
                    bw.write(0+"\n");
                }
                
            } else if (str.equals("front")) {
                if (queue.isEmpty()) {
                    bw.write(-1+"\n");
                } else {
                    bw.write(queue.peek()+"\n");
                }
                
            } else if (str.equals("back")) {
                if (queue.isEmpty()) {
                    bw.write(-1+"\n");
                } else {
                    bw.write(queue.peekLast()+"\n");
                }
            }
        }
        bw.flush();
        bw.close();
    }
}