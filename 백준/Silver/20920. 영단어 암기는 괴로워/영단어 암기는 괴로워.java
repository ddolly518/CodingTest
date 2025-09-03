import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        Map<String, Integer> map = new HashMap<>();
        List<String> list = new ArrayList<>();
        for (int i=0; i<n; i++) {
            String str = br.readLine();
            if (str.length()>=m) {
                map.put(str, map.getOrDefault(str,0)+1);
            }
        }
        list.addAll(map.keySet());
        Collections.sort(list, (a,b) -> {
            int result = map.get(b)-map.get(a);
            if (result==0) result = (b.length()-a.length());
            if (result==0) result = a.compareTo(b);
            return result;
        });
        for (int i=0; i<list.size(); i++) {
            bw.write(list.get(i)+"\n");
        }
        bw.flush();
        bw.close();
    }
}