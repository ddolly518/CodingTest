import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        String[][] arr = new String[N+1][M+1];
        int answer = 50*50;
        
        for (int i=0; i<N; i++) {
            String str = br.readLine();
            String[] a = str.split("");
            for (int j=0; j<M; j++) {
                arr[i][j] = a[j];
            }
        }
        
        for (int i=0; i<=N-8; i++) {
            for (int j=0; j<=M-8; j++) {
                int countW = 0;
                int countB = 0;
                
                for (int k=0; k<8; k++) {
                    for (int p=0; p<8; p++) {
                        int x = i+k;
                        int y = j+p;
                        String ch = arr[x][y];
                        if ((x+y)%2==0) {
                            if (ch.equals("W")) countW++;
                            else countB++;
                        } else {
                            if (ch.equals("W")) countB++;
                            else countW++;
                        }
                    }
                }
                int count = Math.min(countW, countB);
                answer = Math.min(answer,count);
            }
        }
        
        if (answer == 50*50)
            answer = 0;
        
        System.out.print(answer);
    }
}