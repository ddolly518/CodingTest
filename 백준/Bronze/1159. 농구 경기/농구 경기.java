import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int['z'-'a'+1];
        StringBuilder sb = new StringBuilder();
        
        int n = Integer.parseInt(br.readLine());
        
        for (int i=0; i<n; i++) {
            String str = br.readLine();
            arr[str.charAt(0)-'a']++;
        }
        
        for (int i=0; i<arr.length; i++) {
            if (arr[i]>=5) {
                sb.append((char)('a'+i));
            }
        }
        if (sb.length()==0) {
            System.out.print("PREDAJA");
        } else {
            System.out.print(sb.toString());
        }
    }
}