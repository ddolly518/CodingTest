import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Map<String, Integer> map = new HashMap<>();
        String[] arr = new String[]{"black","brown","red","orange","yellow","green","blue","violet","grey","white"};
        for (int i=0; i<10; i++) {
            map.put(arr[i],i);
        }
        String one = br.readLine();
        String two = br.readLine();
        String three = br.readLine();
        long num = map.get(one)*10;
        num+=map.get(two);
        num*=((long)Math.pow(10,map.get(three)));
        System.out.println(num);
    }
}