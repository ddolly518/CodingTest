import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = sc.nextInt();
        
        for (int i=2; i*i<=N; i++) {
            while (N%i==0) {
                N/=i;
                bw.write(i+"\n");
            }
        }
        if (N>1)
            bw.write(N+"\n");
        bw.flush();
    }
}