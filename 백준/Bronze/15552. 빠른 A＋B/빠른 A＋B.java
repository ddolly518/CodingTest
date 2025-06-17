import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());
        for (int i=0; i<T; i++) {
            StringTokenizer str = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(str.nextToken());
            int B = Integer.parseInt(str.nextToken());
            bw.write(A+B+ "\n");
        }
        bw.flush();
        bw.close();
    }
}