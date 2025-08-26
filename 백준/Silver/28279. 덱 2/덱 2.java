import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());
        Deque<Integer> dq = new LinkedList<>();
        for (int i=0; i<n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int num = Integer.parseInt(st.nextToken());
            if (num==1) {
                dq.offerFirst(Integer.parseInt(st.nextToken()));
            } else if (num==2) {
                dq.offerLast(Integer.parseInt(st.nextToken()));
            } else if (num==3) {
                if (dq.isEmpty()) {
                    bw.write(-1+"\n");
                } else {
                    bw.write(dq.pollFirst()+"\n");
                }
            } else if (num==4) {
                if (dq.isEmpty()) {
                    bw.write(-1+"\n");
                } else {
                    bw.write(dq.pollLast()+"\n");
                }
            } else if (num==5) {
                bw.write(dq.size()+"\n");
            } else if (num==6) {
                if (dq.isEmpty()) {
                    bw.write(1+"\n");
                } else {
                    bw.write(0+"\n");
                }
            } else if (num==7) {
                if (dq.isEmpty()) {
                    bw.write(-1+"\n");
                } else {
                    bw.write(dq.peekFirst()+"\n");
                }
            } else if (num==8) {
                if (dq.isEmpty()) {
                    bw.write(-1+"\n");
                } else {
                    bw.write(dq.peekLast()+"\n");
                }
            }
        }
        bw.flush();
        bw.close();
    }
}