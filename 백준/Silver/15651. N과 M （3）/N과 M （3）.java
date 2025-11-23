import java.util.*;
import java.io.*;

public class Main {
    static int N;
    static int M;
    static int[] arr;
    static boolean[] visited;
    static BufferedWriter bw;
    
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        bw = new BufferedWriter(new OutputStreamWriter(System.out));
        N = sc.nextInt();
        M = sc.nextInt();
        arr = new int[M];
        visited = new boolean[N+1];
        
        backtracking(0);
        
        bw.flush();
    }
    
    private static void backtracking(int length) throws IOException {
        if (length==M) {
            print();
            return;
        }
        
        for (int i=1; i<=N; i++) {
            arr[length] = i;
            visited[i] = true;
            backtracking(length+1);
            visited[i] = false;
        }
    }
    
    private static void print() throws IOException {
        for (int i=0; i<M; i++) {
            bw.write(arr[i]+" ");
        }
        bw.newLine();
    }
}