import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for (int i=0; i<T; i++) {
            int n = Integer.parseInt(br.readLine());
            System.out.print(n/25+" "+n%25/10+" "+n%25%10/5+" "+n%25%10%5);
            System.out.println();
        }
    }
}