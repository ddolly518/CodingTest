import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        boolean[] b = new boolean[1000001];
        for (int i=2; i<=1000000; i++) {
            boolean bo = true;
            for (int j=2; j*j<=i; j++) {
                if (i%j==0) {
                    bo = false;
                    break;
                }
            }
            if (bo) {
                b[i] = true;
            }
        }
        
        for (int i=0; i<n; i++) {
            int m = Integer.parseInt(br.readLine());
            int count = 0;
            for (int j=2; j<=m/2; j++) {
                if (b[j] && b[m-j])
                    count++;
            }
            bw.write(count+"\n");
        }
        bw.flush();
        bw.close();
    }
}