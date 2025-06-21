import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Map<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        for (int i=0; i<3; i++) {
            int n = Integer.parseInt(br.readLine());
            sum += n;
            map.put(n, map.getOrDefault(n,0)+1);
        }
        if (sum!=180)
            System.out.println("Error");
        else {
            if (map.size()==1)
                System.out.println("Equilateral");
            else if (map.size()==2)
                System.out.println("Isosceles");
            else 
                System.out.println("Scalene");
        }
    }
}