import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        Map<String, String> map = new HashMap<>();
        for (int i=1; i<=n; i++) {
            String str = br.readLine();
            String num = String.valueOf(i);
            map.put(str,num);
            map.put(num,str);
        }
        for (int i=0; i<m; i++) {
            String str = br.readLine();
            bw.write(map.get(str)+"\n");
        }
        bw.flush();
        bw.close();
    }
}