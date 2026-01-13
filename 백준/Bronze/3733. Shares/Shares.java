import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String line;
        
        while ((line=br.readLine())!=null) {
            StringTokenizer st = new StringTokenizer(line);
            
            int n = Integer.parseInt(st.nextToken());
            int s = Integer.parseInt(st.nextToken());
            bw.write((int)Math.floor(s/(n+1))+"\n");
        }
        
        bw.flush();
    }
}