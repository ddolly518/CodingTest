import java.util.*;
import java.io.*;

public class Main {
    static int n;
    static int[][] arr;
    static boolean[] visited;
    static int min = Integer.MAX_VALUE;
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        n = Integer.parseInt(br.readLine());
        arr = new int[n+1][n+1];
        visited = new boolean[n+1];
        
        for (int i=1; i<=n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            for (int j=1; j<=n; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        
        backtracking(1, 0);
        
        System.out.print(min);
    } 
    
    private static void backtracking(int start, int length) {
        if (length == n/2) {
            min = Math.min(min, Math.abs(fun()));
            return;
        }
        
        for (int i=start; i<=n; i++) {
            if (!visited[i]) {
                visited[i] = true;
                backtracking(i+1, length+1);
                visited[i] = false;
            }
        }
    }
    
    private static int fun() {
        int sum = 0;
        
        for (int i=1; i<=n; i++) {
            for (int j=1; j<=n; j++) {
                if (visited[i] && visited[j]) {
                    sum+=arr[i][j];
                } else if (!visited[i] && !visited[j]) {
                    sum-=arr[i][j];
                }
            }
        }
        
        return sum;
    }
}