import java.util.*;
import java.io.*;

public class Main {
    static int[][] arr;
    static boolean[][] visited;
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};
    static List<Integer> answer;
    static int N;
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        N = Integer.parseInt(br.readLine());
        arr = new int[N][N];
        visited = new boolean[N][N];
        answer = new ArrayList<>();
        
        for (int i=0; i<N; i++) {
            String str = br.readLine();
            for (int j=0; j<N; j++) {
                int num = str.charAt(j)-'0';
                arr[i][j] = num;
            }
        }
        
        for (int i=0; i<N; i++) {
            for (int j=0; j<N; j++) {
                if (arr[i][j] == 1 && !visited[i][j]) {
                    bfs(i, j);
                }
            }
        }
        
        bw.write(answer.size()+"\n");
        Collections.sort(answer);
        for (int i=0; i<answer.size(); i++) {
            bw.write(answer.get(i)+"\n");
        }
        
        bw.flush();
        bw.close();
    }
    
    private static void bfs(int v, int w) {
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{v,w});
        visited[v][w] = true;
        int cnt = 1;
        
        while (!queue.isEmpty()) {
            int[] a = queue.poll();
            
            for (int i=0; i<4; i++) {
                int x = a[0] + dx[i];
                int y = a[1] + dy[i];
                
                if (x>=0 && x<N && y>=0 && y<N) {
                    if (arr[x][y] == 1 && !visited[x][y]) {
                        visited[x][y] = true;
                        cnt++;
                        queue.offer(new int[]{x, y});
                    }
                }
            } 
        }
        
        answer.add(cnt);
    }
}