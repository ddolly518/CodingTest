import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Map<Integer, Integer> map1 = new HashMap<>();
        Map<Integer, Integer> map2 = new HashMap<>();
        int a = 0;
        int b = 0;
        for (int i=0; i<3; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            map1.put(x,map1.getOrDefault(x,0)+1);
            map2.put(y,map2.getOrDefault(y,0)+1);
        }
        for (Map.Entry<Integer, Integer> entry : map1.entrySet()) {
            if (entry.getValue()==1)
                a = entry.getKey();
        }
        for (Map.Entry<Integer, Integer> entry : map2.entrySet()) {
            if (entry.getValue()==1)
                b = entry.getKey();
        }
        System.out.println(a+" "+b);
    }
}