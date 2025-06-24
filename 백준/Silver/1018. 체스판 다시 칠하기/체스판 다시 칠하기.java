import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        char[][] arr = new char[N][M];
        for (int i=0; i<N; i++) {
            String str = br.readLine();
            for (int j=0; j<M; j++) {
                arr[i][j] = str.charAt(j);
            }
        }
        int min = Integer.MAX_VALUE;
        for (int i=0; i<=N-8; i++) {
            for (int j=0; j<=M-8; j++) {
                int countw = 0;
                int countb = 0;
                for (int a=0; a<8; a++) {
                    for (int b=0; b<8; b++) {
                        char ch = arr[i+a][j+b];
                        if ((a + b) % 2 == 0) {
                            if (ch != 'W') countw++;
                            if (ch != 'B') countb++;
                        } else {
                            if (ch != 'B') countw++;
                            if (ch != 'W') countb++;
                        }
                    }
                }
                min = Math.min(min,countw);
                min = Math.min(min,countb);
            }
        }
        System.out.println(min);
    }
}