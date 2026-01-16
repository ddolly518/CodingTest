import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int[][] sumB = new int[N+1][M+1];
        int[][] sumW = new int[N+1][M+1];
        
        for (int i=1; i<=N; i++) {
            String line = br.readLine();
            for (int j=1; j<=M; j++) {
                char ch = line.charAt(j-1);
                
                if ((i+j)%2==0) {
                    if (ch == 'B') {
                        sumB[i][j] = sumB[i-1][j] + sumB[i][j-1] - sumB[i-1][j-1];
                        sumW[i][j] = sumW[i-1][j] + sumW[i][j-1] - sumW[i-1][j-1] + 1;
                    } else {
                        sumB[i][j] = sumB[i-1][j] + sumB[i][j-1] - sumB[i-1][j-1] + 1;
                        sumW[i][j] = sumW[i-1][j] + sumW[i][j-1] - sumW[i-1][j-1];
                    }
                } else {
                    if (ch == 'B') {
                        sumB[i][j] = sumB[i-1][j] + sumB[i][j-1] - sumB[i-1][j-1] + 1;
                        sumW[i][j] = sumW[i-1][j] + sumW[i][j-1] - sumW[i-1][j-1];
                    } else {
                        sumB[i][j] = sumB[i-1][j] + sumB[i][j-1] - sumB[i-1][j-1];
                        sumW[i][j] = sumW[i-1][j] + sumW[i][j-1] - sumW[i-1][j-1] + 1;
                    }
                }
            }
        }
        
        int min = Integer.MAX_VALUE;
        
        for (int i=K; i<=N; i++) {
            for (int j=K; j<=M; j++) {
                int countB = sumB[i][j] - sumB[i-K][j] - sumB[i][j-K] + sumB[i-K][j-K];
                int countW = sumW[i][j] - sumW[i-K][j] - sumW[i][j-K] + sumW[i-K][j-K];
                min = Math.min(min, Math.min(countB, countW));
            }
        }
        bw.write(min+"");
        
        bw.flush();
    }
}