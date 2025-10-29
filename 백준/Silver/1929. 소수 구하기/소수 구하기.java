import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int N = sc.nextInt();
        for (int i=M; i<=N; i++) {
            if (i<2) continue;
            boolean bo = true;
            for (int j=2; j*j<=i; j++) {
                if (i%j==0) {
                    bo = false;
                    break;
                }
            }
            if (bo) {
                bw.write(i+"\n");
            }
        }
        bw.flush();
    }
}