import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        while (true) {
            int n = Integer.parseInt(br.readLine());
            int count = 0;
            if (n==0) {
                break;
            } 
            for (int i=n+1; i<=2*n; i++) {
                boolean bo = true;
                for (int j=2; j*j<=i; j++) {
                    if (i%j==0) {
                        bo = false;
                        break;
                    }
                }
                if (bo) {
                    count++;
                }
            }
            
            bw.write(count+"\n");
        }
        bw.flush();
        bw.close();
    }
}