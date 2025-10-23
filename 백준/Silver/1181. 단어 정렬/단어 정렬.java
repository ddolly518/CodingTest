import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        Set<String> set = new HashSet<>();
        
        for (int i=0; i<N; i++) {
            set.add(br.readLine());
        }
        
        List<String> list = new ArrayList<>(set);
        
        Collections.sort(list, (a,b) -> {
           if (a.length()==b.length()) {
               return a.compareTo(b);
           } else {
               return a.length()-b.length();
           }
        });
        
        for (String str : list) {
            bw.write(str+"\n");
        }
        bw.flush();
    }
}