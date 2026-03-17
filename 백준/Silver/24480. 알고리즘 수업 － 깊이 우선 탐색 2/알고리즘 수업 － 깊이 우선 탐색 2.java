import java.util.*;
import java.io.*;

public class Main {
    static List<Integer>[] A;
    static boolean[] visited;
    static int[] count;
    static int cnt;
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int R = Integer.parseInt(st.nextToken());
        A = new ArrayList[N+1];
        visited = new boolean[N+1];
        cnt = 1;
        count = new int[N+1];
        
        for (int i=1; i<=N; i++) {
            A[i] = new ArrayList<Integer>();
        }
        
        for (int i=0; i<M; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            A[a].add(b);
            A[b].add(a);
        }
        
        for (int i=1; i<=N; i++) {
            Collections.sort(A[i], Collections.reverseOrder());
        }
        
        dfs(R);
        
        for (int i=1; i<=N; i++) {
            bw.write(count[i]+"\n");
        }
        
        bw.flush();
        bw.close();
    }
    
    private static void dfs(int v) {
        visited[v] = true;
        count[v] = cnt++;
        
        for (int next : A[v]) {
            if (!visited[next]) {
                dfs(next);
            }
        }
    }
}