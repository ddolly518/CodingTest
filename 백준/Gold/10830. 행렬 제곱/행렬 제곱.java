import java.util.*;
import java.io.*;

public class Main {
    static int N;
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        N = Integer.parseInt(st.nextToken());
        long B = Long.parseLong(st.nextToken());
        
        int[][] A = new int[N][N];
        for (int i=0; i<N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            for (int j=0; j<N; j++) {
                A[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        
        int[][] answer = fun(A, B);
        for (int i=0; i<N; i++) {
            for (int j=0; j<N; j++) {
                bw.write(answer[i][j]+" ");
            }
            bw.write("\n");
        }
        bw.flush();
        bw.close();
    }
    
    private static int[][] fun(int[][] a, long b) {
        if (b==1) {
            int[][] num = new int[N][N];
            for (int i=0; i<N; i++) {
                for (int j=0; j<N; j++) {
                    num[i][j] = a[i][j]%1000;
                }
            }
            return num;
        }
        
        int[][] result = fun(a, b/2);
        result = mult(result, result);
        
        if (b%2==1) {
            return mult(result, a);
        }
        return result;
    }
    
    private static int[][] mult(int[][] a, int[][] b) {
        int[][] num = new int[N][N];
        for(int i=0; i<N; i++) {
            for (int j=0; j<N; j++) {
                for (int k=0; k<N; k++) {
                    num[i][j] += (a[i][k]*b[k][j]);
                    num[i][j]%=1000;
                }
            }
        }
        return num;
    }
}