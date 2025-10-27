import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Map<String,Integer> map = new HashMap<>();
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        
        for (int i=0; i<(M+N); i++) {
            String str = br.readLine();
            map.put(str, map.getOrDefault(str,0)+1);
        }
        int answer = 0;
        List<String> list = new ArrayList<>();
        for (Map.Entry<String,Integer> entry : map.entrySet()) {
            if (entry.getValue()==2) {
                answer++;
                list.add(entry.getKey());
            }
        }
        
        Collections.sort(list);
        bw.write(answer+"\n");
        for (int i=0; i<list.size(); i++) {
            bw.write(list.get(i)+"\n");
        }
        bw.flush();
    }
}