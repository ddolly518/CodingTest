import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        List<String[]> list = new ArrayList<>();
        
        for (int i=0; i<N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String a = st.nextToken();
            String b = st.nextToken();
            list.add(new String[]{a,b});
        }
        
        Collections.sort(list, (a,b) -> {
            int a1 = Integer.parseInt(a[0]);
            int b1 = Integer.parseInt(b[0]);
            return a1-b1;
        });
        
        for (int i=0; i<N; i++) {
            bw.write(list.get(i)[0]+" "+list.get(i)[1]+"\n");
        }
        bw.flush();
    }
}