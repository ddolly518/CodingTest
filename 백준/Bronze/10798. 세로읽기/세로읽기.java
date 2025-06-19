import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String[] arr = new String[5];
            String answer = "";
            int len = 0;
            for (int i=0; i<5; i++) {
                arr[i] = br.readLine();
                len = Math.max(len, arr[i].length());
            }
            for (int i=0; i<len; i++) {
                for (int j=0; j<5; j++) {
                    if (arr[j].length()>i) {
                        answer+=arr[j].charAt(i);
                    }
                }
            }
            System.out.println(answer);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}