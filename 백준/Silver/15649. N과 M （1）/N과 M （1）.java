import java.util.*;
import java.io.*;

public class Main {
    static int n;
    static int m;
    static boolean[] V;
    static int[] S;
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        
        V = new boolean[n];
        S = new int[m];
        
        backtracking(0);
    }
    
    private static void backtracking(int length) {
        if (length==m) {
            for (int num : S) {
                System.out.print(num+" ");
            }
            System.out.println();
            return;
        }
        for (int i=0; i<n; i++) {
            if (!V[i]) {
                V[i] = true;
                S[length] = i+1;
                backtracking(length+1);
                V[i] = false;
            }
        }
        
    }
}