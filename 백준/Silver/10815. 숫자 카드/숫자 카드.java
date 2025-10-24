import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        Set<Integer> set = new HashSet<>();
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        for (int i=0; i<N; i++) {
            set.add(Integer.parseInt(st.nextToken()));
        }
        
        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine()," ");
        for (int i=0; i<M; i++) {
            int num = Integer.parseInt(st.nextToken());
            int answer = (set.contains(num)?1:0);
            bw.write(answer+" ");
        }
        bw.flush();
    }
}