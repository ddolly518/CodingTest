import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int N = Integer.parseInt(br.readLine());
        List<int[]> list = new ArrayList<>();
        for (int i=0; i<N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            list.add(new int[]{a,b});
        }
        
        Collections.sort(list,(a,b)-> {
           if (a[0]==b[0]) {
               return a[1]-b[1];
           } else {
               return a[0]-b[0];
           }
        });
        
        for (int i=0; i<N; i++) {
            int a = list.get(i)[0];
            int b = list.get(i)[1];
            bw.write(a+" "+b+"\n");
        }
        bw.flush();
    }
}