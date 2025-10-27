import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        Map<String, Integer> mapStr = new HashMap<>();
        Map<Integer, String> mapInt = new HashMap<>();
        
        for (int i=0; i<N; i++) {
            String str = br.readLine();
            mapStr.put(str,i+1);
            mapInt.put(i+1,str);
        }
        for (int i=0; i<M; i++) {
            String str = br.readLine();
            if (str.matches("[0-9]+")) {
                bw.write(mapInt.get(Integer.parseInt(str))+"\n");
            } else {
                bw.write(mapStr.get(str)+"\n");
            }
        }
        
        bw.flush();
    }
}