import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        long sum = 0;
        List<Integer> list = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        for (int i=0; i<n; i++) {
            int num = Integer.parseInt(br.readLine());
            sum+=num;
            list.add(num);
            map.put(num, map.getOrDefault(num,0)+1);
        }
        Collections.sort(list);
        int maxFreq = Collections.max(map.values());
        List<Integer> freq = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue()==maxFreq) {
                freq.add(entry.getKey());
            }
        }
        Collections.sort(freq);
        int num = (freq.size()==1)?freq.get(0):freq.get(1);
        System.out.println(Math.round((double) sum / n));
        System.out.println(list.get(list.size()/2));
        System.out.println(num);
        System.out.println(list.get(list.size()-1)-list.get(0));
    }
}