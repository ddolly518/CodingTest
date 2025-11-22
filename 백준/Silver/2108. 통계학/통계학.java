import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Map<Integer, Integer> map = new HashMap<>();
        int[] arr = new int[N];
        double sum = 0;
        
        for (int i=0; i<N; i++) {
            int num = Integer.parseInt(br.readLine());
            arr[i] = num;
            map.put(num, map.getOrDefault(num,0)+1);
            sum+=num;
        }
        Arrays.sort(arr);
        
        int max = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            max = Math.max(entry.getValue(), max);
        }
        List<Integer> list = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue()==max) {
                list.add(entry.getKey());
            }
        }
        Collections.sort(list);
        int value = 0;
        if (list.size()==1) {
            value = list.get(0); 
        } else {
            value = list.get(1);
        }
        
        System.out.println((int)Math.round(sum/N));
        System.out.println(arr[N/2]);
        System.out.println(value);
        System.out.println(arr[N-1]-arr[0]);
    }
}