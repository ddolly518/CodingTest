import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Map<String, Double> map = new HashMap<>();
        map.put("A+",4.5);
        map.put("A0",4.0);
        map.put("B+",3.5);
        map.put("B0",3.0);
        map.put("C+",2.5);
        map.put("C0",2.0);
        map.put("D+",1.5);
        map.put("D0",1.0);
        map.put("F",0.0);
        double sum = 0;
        int count = 0;
        for (int i=0; i<20; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String str = st.nextToken();
            double a = Double.parseDouble(st.nextToken());
            String s = st.nextToken();
            if (s.equals("P"))
                continue;
            double b = map.get(s);
            sum+=(a*b);
            count+=a;
        }
        System.out.println(sum/count);
    }
}