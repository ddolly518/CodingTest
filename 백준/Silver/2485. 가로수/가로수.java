import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int min = 0;
        int answer = 0;
        List<Integer> list = new ArrayList<>();
        for (int i=0; i<n; i++) {
            int num = Integer.parseInt(br.readLine());
            list.add(num);
        }
        min = list.get(1)-list.get(0);
        for (int i=2; i<n; i++) {
            int two = list.get(i) - list.get(i-1);
            min = gcd(min, two);
        }
        for (int i=1; i<n; i++) {
            answer += (list.get(i) - list.get(i-1)) / min - 1;
        }
        bw.write(String.valueOf(answer));
        bw.flush();
        bw.close();
    }
    
    public static int gcd(int a, int b) {
        while (b!=0) {
            int temp = a%b;
            a=b;
            b = temp;
        }
        return a;
    }
}