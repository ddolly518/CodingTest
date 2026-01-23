import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        while (true) {
            int n = Integer.parseInt(br.readLine());
            if (n==0) 
                break;
            int answer = 0;
            for (int i=1; i<=n; i++) {
                answer+=i;
            }
            bw.write(answer+"\n");
        }
        
        bw.flush();
    }
}