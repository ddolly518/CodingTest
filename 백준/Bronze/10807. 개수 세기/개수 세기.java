import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Map<Integer, Integer> map = new HashMap<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i=0; i<N; i++) {
            int num = Integer.parseInt(st.nextToken());
            map.put(num, map.getOrDefault(num,0)+1);
        }
        int v = Integer.parseInt(br.readLine());
        System.out.println(map.getOrDefault(v,0));
    }
}