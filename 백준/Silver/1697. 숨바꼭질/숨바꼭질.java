import java.util.*;
import java.io.*;

public class Main {
    static int K;
    static int[] arr;
    static boolean[] visited;
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        arr = new int[100001];
        visited = new boolean[100001];
        
        bfs(N);
        
        bw.write(arr[K]+"");
        
        bw.flush();
        bw.close();
    }
    private static void bfs(int v) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(v);
        visited[v] = true;
        
        while (!queue.isEmpty()) {
            int num = queue.poll();
            
            if (num == K) {
                return;
            }
            if (2*num <= 100000 && !visited[2*num]) {
                visited[2*num] = true;
                arr[2*num] = arr[num] + 1;
                queue.offer(2*num);
            }
            if ((num-1) >= 0 && (num-1) <= 100000 && !visited[num-1]) {
                visited[num-1] = true;
                arr[num-1] = arr[num] + 1;
                queue.offer(num-1);
            }
            if ((num+1) >= 0 && (num+1) <= 100000 && !visited[num+1]) {
                visited[num+1] = true;
                arr[num+1] = arr[num] + 1;
                queue.offer(num+1);
            }
        }
    }
}