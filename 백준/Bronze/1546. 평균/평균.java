import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int max = 0;
        double answer = 0;
        for (int i=0; i<N; i++) {
            int n = Integer.parseInt(st.nextToken());
            max = Math.max(n, max);
            answer+=n;
        }
        System.out.println(answer/max*100/N);
    }
}