import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = sc.nextInt();
        int K = sc.nextInt();
        Queue<Integer> queue = new LinkedList<>();
        
        for (int i=1; i<=N; i++) {
            queue.offer(i);
        }
        
        bw.write("<");
        while (queue.size()>1) {
            for (int i=1; i<K; i++) {
                queue.offer(queue.poll());
            }
            bw.write(queue.poll()+", ");
        }
        bw.write(queue.poll()+">");
        bw.flush();
        
    }
}