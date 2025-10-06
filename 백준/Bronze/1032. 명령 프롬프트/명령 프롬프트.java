import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String str = br.readLine();
        Character[] arr = new Character[str.length()];
        for (int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);
            arr[i] = ch;
        }
        for (int i=1; i<n; i++) {
            String s = br.readLine();
            for (int j=0; j<s.length(); j++) {
                char ch = s.charAt(j);
                if (ch!='?' && arr[j]!=ch) {
                    arr[j] = '?';
                }
            }
        }
        for (int i=0; i<str.length(); i++) {
            System.out.print(arr[i]);
        }
    }
}