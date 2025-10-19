import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int one = Integer.parseInt(st.nextToken());
            int two = Integer.parseInt(st.nextToken());
            int three = Integer.parseInt(st.nextToken());
            
            if (one==0 && two==0 && three==0)
                break;

            String answer = fun(one,two,three);
            bw.write(answer+"\n");
        }
        bw.flush();
    }
    
    private static String fun(int one, int two, int three) {
        int sum = one+two+three;
        int max = Math.max(one, two);
        max = Math.max(max, three);
        if (sum<=2*max)
            return "Invalid";
        
        Map<Integer, Integer> map = new HashMap<>();
        map.put(one,map.getOrDefault(one,0)+1);
        map.put(two,map.getOrDefault(two,0)+1);
        map.put(three,map.getOrDefault(three,0)+1);
        
        if (map.size()==1)
            return "Equilateral";
        else if (map.size()==2)
            return "Isosceles";
        else
            return "Scalene";
    }
}