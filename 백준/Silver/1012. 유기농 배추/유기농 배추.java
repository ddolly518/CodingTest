import java.util.*;
import java.io.*;

public class Main {
    static int[][] arr;
    static boolean[][] visited;
    static int cnt;
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};
    static int M;
    static int N;
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());

        for (int t=0; t<T; t++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            M  = Integer.parseInt(st.nextToken());
            N = Integer.parseInt(st.nextToken());
            int K = Integer.parseInt(st.nextToken());
            arr = new int[N][M];
            visited = new boolean[N][M];
            cnt = 0;
            
            for (int i=0; i<K; i++) {
                st = new StringTokenizer(br.readLine(), " ");
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());
                arr[y][x] = 1;
            }
            
            for (int i=0; i<N; i++) {
                for (int j=0; j<M; j++) {
                    if (!visited[i][j] && arr[i][j] == 1) {
                        bfs(i, j);
                    }
                }
            }
            
            bw.write(cnt+"\n");
        }
            
        bw.flush();
        bw.close();
    }
    private static void bfs(int v, int w) {
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{v,w});
        visited[v][w] = true;
        cnt++;
        
        while (!queue.isEmpty()) {
            int[] num = queue.poll();
            
            for (int i=0; i<4; i++) {
                int x = num[0] + dx[i];
                int y = num[1] + dy[i];
                
                if (x>=0 && x<N && y>=0 && y<M) {
                    if (!visited[x][y] && arr[x][y] == 1) {
                        visited[x][y] = true;
                        queue.offer(new int[]{x,y});
                    }
                }
            }
        }
    }
}