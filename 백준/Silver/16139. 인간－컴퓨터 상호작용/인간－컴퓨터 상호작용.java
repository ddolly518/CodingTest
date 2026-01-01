import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String s = br.readLine();
        int q = Integer.parseInt(br.readLine());
        for (int i=0; i<q; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            char ch = (st.nextToken()).charAt(0);
            int l = Integer.parseInt(st.nextToken());
            int r = Integer.parseInt(st.nextToken());
            int answer = 0;
            
            for (int j=l; j<=r; j++) {
                if (s.charAt(j) == ch)
                    answer++;
            }
            
            bw.write(answer+"\n");
        }
        
        bw.flush();
    }
}