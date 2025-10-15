import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        List<String> list = new ArrayList<>();
        String line;
        int max = 0;
        
        while ((line=br.readLine())!=null) {
            list.add(line);
            max = Math.max(max,line.length());
        }
        for (int i=0; i<max; i++) {
            for (int j=0; j<list.size(); j++) {
                String str = list.get(j);
                if (str.length()>i) {
                    sb.append(str.charAt(i));
                }
            }
        }
        System.out.print(sb.toString());
    }
}