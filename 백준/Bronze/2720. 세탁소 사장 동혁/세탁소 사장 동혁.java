import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        for (int i=0; i<T; i++) {
            int num = Integer.parseInt(br.readLine());
            int q = num/25;
            int d = num%25/10;
            int n = num%25%10/5;
            int p = num%25%10%5;
            bw.write(q+" "+d+" "+n+" "+p+"\n");
        }
        bw.flush();
    }
}