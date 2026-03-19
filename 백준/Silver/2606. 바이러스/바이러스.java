import java.util.*;
import java.io.*;

public class Main {
    static List<Integer>[] A;
    static boolean[] visited;
    static int count;
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());
        A = new ArrayList[N+1];
        visited = new boolean[N+1];
        count = 0;
        
        for (int i=1; i<=N; i++) {
            A[i] = new ArrayList<>();
        }
        
        for (int i=0; i<M; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            A[a].add(b);
            A[b].add(a);
        }
        
        bfs(1);
        
        bw.write(count+"");
        
        bw.flush();
        bw.close();
    }
    private static void bfs(int v) {
        visited[v] = true;
        
        for (int next : A[v]) {
            if (!visited[next]) {
                count++;
                bfs(next);
            }
        }
    }
}