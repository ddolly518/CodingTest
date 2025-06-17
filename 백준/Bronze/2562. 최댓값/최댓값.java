import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        List<Integer> list = new ArrayList<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int max = 0;
        for (int i=0; i<9; i++) {
            int num = Integer.parseInt(br.readLine());
            max = Math.max(num,max);
            list.add(num);
        }
        System.out.println(max);
        System.out.println(list.indexOf(max)+1);
    }
}