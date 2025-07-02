import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        Map<String, Integer> map = new HashMap<>();
        List<String> list = new ArrayList<>();
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int count = 0;
        for (int i=0; i<N; i++) {
            String str = br.readLine();
            map.put(str, 1);
        }
        for (int i=0; i<M; i++) {
            String str = br.readLine();
            if(map.containsKey(str)) {
                count++;
                list.add(str);
            }
                
        }
        Collections.sort(list);
        bw.write(count+"\n");
        for (String str : list) {
            bw.write(str+"\n");
        }
        bw.flush();
        bw.close();
    }
}