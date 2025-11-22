import java.util.*;
import java.io.*;

public class Main {
    static BufferedWriter bw;
    static int[] arr;
    static boolean[] visited;
    static int N;
    static int M;
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        
        arr = new int[N];
        visited = new boolean[N+1];
        
        backtracking(0);
        
        bw.flush();
    }
    
    private static void backtracking(int length) throws IOException {
        if (length == M) {
            for (int i=0; i<M; i++) {
                bw.write(arr[i]+" ");
            }
            bw.newLine();
        }
        
        for (int i=1; i<=N; i++) {
            if (!visited[i]) {
                if (length==0 || length>0 && (arr[length-1]<i)) {
                    visited[i] = true;
                    arr[length] = i;
                    backtracking(length+1);
                    visited[i] = false;
                }
            }
        }
    }
}