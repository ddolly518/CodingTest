import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        
        for (int i=0; i<N; i++) {
            long num = Long.parseLong(br.readLine());
            if (num < 2) {
                bw.write(2+"\n");
                continue;
            }
            while (true) {
                boolean bo = true;
                
                for (long j=2; j*j<=num; j++) {
                    if (num%j==0) {
                        bo = false;
                        break;
                    }
                }
                if (bo) {
                    bw.write(num+"\n");
                    break;
                }
                num++;
            }
        }
        bw.flush();
    }
}