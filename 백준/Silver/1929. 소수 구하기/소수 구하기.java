import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        
        if (n==1) {
            n++;
        }
        
        for (int i=n; i<=m; i++) {
            boolean bo = true;
            for (int j=2; j*j<=i; j++) {
                if (i%j==0) {
                    bo = false;
                    break;
                }
            }
            if (bo)
                bw.write(i+"\n");
        }
        bw.flush();
        bw.close();
    }
}