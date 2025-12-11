import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = 0;
        
        for (int i=0; i<8; i++) {
            String str = br.readLine();
            if (i%2==0) {
                for (int j=0; j<8; j+=2) {
                    char ch = str.charAt(j);
                    if (ch=='F')
                        count++;
                }
            } else {
                for (int j=1; j<8; j+=2) {
                    char ch = str.charAt(j);
                    if (ch=='F')
                        count++;
                }
            }
        }
        
        System.out.print(count);
    }
}