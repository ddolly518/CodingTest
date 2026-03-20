import java.util.*;
import java.io.*;

public class Main {
    static int N;
    static int M;
    static int[][] arr;
    static int[][] answer;
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};
    static boolean[][] visited;
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        arr = new int[N][M];
        answer = new int[N][M];
        visited = new boolean[N][M];
        
        for (int i=0; i<N; i++) {
            String str = br.readLine();
            
            for (int j=0; j<M; j++) {
                int num = str.charAt(j)-'0';
                arr[i][j] = num;
            }
        }
        
        bfs(0,0);
        bw.write(answer[N-1][M-1]+"");
        
        bw.flush();
        bw.close();
    }
    
    private static void bfs(int v, int w) {
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{v,w});
        visited[v][w] = true;
        answer[v][w] = 1;
        
        while (!queue.isEmpty()) {
            int[] num = queue.poll();
            
            for (int i=0; i<4; i++) {
                int x = num[0] + dx[i];
                int y = num[1] + dy[i];
                
                if (x>=0 && x<N && y>=0 && y<M) {
                    if (!visited[x][y] && arr[x][y] == 1) {
                        visited[x][y] = true;
                        answer[x][y] = answer[num[0]][num[1]]+1;
                        queue.offer(new int[]{x,y});
                    }
                }
            }
        }
    }
}