import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int answer = 0;
        int n = Integer.parseInt(br.readLine());
        Set<String> set = new HashSet<>();
        for (int i=0; i<n; i++) {
            String str = br.readLine();
            if (str.equals("ENTER")) {
                set = new HashSet<>();
            } else if (!set.contains(str)) {
                set.add(str);
                answer++;
            }
        }
        System.out.print(answer);
    }
}