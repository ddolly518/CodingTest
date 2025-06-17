import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Map<Integer, Integer> map = new HashMap<>();
        for (int i=0; i<10; i++) {
            int n = Integer.parseInt(br.readLine())%42;
            map.put(n, map.getOrDefault(n,0)+1);
        }
        System.out.println(map.size());
    }
}