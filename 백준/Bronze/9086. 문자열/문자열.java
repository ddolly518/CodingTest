import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        
        for (int i=0; i<N; i++) {
            String str = br.readLine();
            int len = str.length();
            bw.write(""+str.charAt(0)+str.charAt(len-1)+"\n");
        }
        
        bw.flush();
    }
}