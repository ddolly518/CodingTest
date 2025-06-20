import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = 0;
        while ((n=Integer.parseInt(br.readLine()))!=-1) {
            List<Integer> list = new ArrayList<>();
            int sum = 1;
            for (int i=2; i*i<=n; i++) {
                if (n%i==0) {
                    list.add(i);
                    sum+=i;
                    if (i!=(n/i)) {
                        list.add(n/i);
                        sum+=(n/i);
                    }
                }
            }
            if (sum==n) {
                Collections.sort(list);
                System.out.print(n+" = 1 + ");
                for (int i=0; i<list.size()-1; i++) {
                    System.out.print(list.get(i)+" + ");
                }
                System.out.println(list.get(list.size()-1));
            } else {
                System.out.println(n+" is NOT perfect.");
            }
        }
    }
}