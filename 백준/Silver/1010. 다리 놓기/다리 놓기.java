import java.util.*;
import java.io.*;

public class Main {
    static int[][] dp = new int[31][31];
    public static int comb(int a, int b) {
        if (b==0 || b==a) return 1;
        if (dp[a][b]!=0) return dp[a][b];
        return dp[a][b] = comb(a-1,b-1) + comb(a-1,b);
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());
        for (int i=0; i<n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            bw.write(comb(b,a)+"\n");
        }
        
        bw.flush();
        bw.close();
    }
}