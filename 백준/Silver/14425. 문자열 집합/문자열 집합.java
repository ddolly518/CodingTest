import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        Set<String> set = new HashSet<>();
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int answer = 0;
        for (int i=0; i<N; i++) {
            set.add(br.readLine());
        }
        for (int i = 0; i < M; i++) {
            if (set.contains(br.readLine())) answer++;
        }
        System.out.println(answer);
    }
}