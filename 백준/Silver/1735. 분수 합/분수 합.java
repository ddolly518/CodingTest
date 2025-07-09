import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a1 = Integer.parseInt(st.nextToken());
        int a2 = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int b1 = Integer.parseInt(st.nextToken());
        int b2 = Integer.parseInt(st.nextToken());
        int c1 = a1*b2+a2*b1;
        int c2 = a2*b2;
        while (c2!=0) {
            int temp = c2;
            c2 = c1%c2;
            c1 = temp;
        }
        System.out.println((a1*b2+a2*b1)/c1+" "+(a2*b2)/c1);
    }
}