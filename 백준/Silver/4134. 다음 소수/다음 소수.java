import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());
        for (int i=0; i<n; i++) {
            long num = Long.parseLong(br.readLine());
            boolean bo = false;
            while (!bo) {
                bo = true;
                if (num < 2) num = 2;
                for (long j=2; j*j<=num; j++) {
                    if (num%j==0) {
                        bo = false;
                        num++;
                        break;
                    }
                }
            }
            if (bo) {
                bw.write(num+"\n");
            }
        }
        
        bw.flush();
        bw.close();
    }
}