import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;
        int num = 1;
        
        while ((line=br.readLine())!=null) {
            if (line.equals("0")) break;
            System.out.println("Case " + num +": Sorting... done!");
            num++;
        }
    }
}