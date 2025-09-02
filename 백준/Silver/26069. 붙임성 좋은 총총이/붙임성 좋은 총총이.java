import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = 1;
        Set<String> set = new HashSet<>();
        int n = Integer.parseInt(br.readLine());
        set.add("ChongChong");
        for (int i=0; i<n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String a = st.nextToken();
            String b = st.nextToken();
            
            if (set.contains(a) && !set.contains(b)) {
                count++;
                set.add(b);
            }
            if (!set.contains(a) && set.contains(b)) {
                count++;
                set.add(a);
            }
        }
        System.out.println(count);
    }
}