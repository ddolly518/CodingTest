import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int num = 0;
        
        while ((num=Integer.parseInt(br.readLine()))!=-1) {
            List<Integer> list = new ArrayList<>();
            int sum = 1;
            for (int i=2; i*i<=num; i++) {
                if (num%i==0) {
                    list.add(i);
                    sum+=i;
                    if ((num/i)!=i) {
                        list.add(num/i);
                        sum+=(num/i);
                    }  
                }
            }
            
            Collections.sort(list);
            if (sum==num) {
                bw.write(num+" = 1 + ");
                for (int i=0; i<list.size()-1; i++) {
                    bw.write(list.get(i)+" + ");
                }
                bw.write(list.get(list.size()-1)+"\n");
            } else {
                bw.write(num+" is NOT perfect.\n");
            }
        }
        bw.flush();
    }
}