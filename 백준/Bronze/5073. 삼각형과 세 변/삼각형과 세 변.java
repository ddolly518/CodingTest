import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[3];
        for (int i=0; i<3; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        while ((arr[0]+arr[1]+arr[2])!=0) {
            Arrays.sort(arr);
            if (arr[0]+arr[1]<=arr[2])
                System.out.println("Invalid");
            else {
                Map<Integer, Integer> map = new HashMap<>();
                for (int i=0; i<3; i++) {
                    map.put(arr[i], map.getOrDefault(arr[i],0)+1);   
                }
                if (map.size()==1)
                    System.out.println("Equilateral");
                else if (map.size()==2)
                    System.out.println("Isosceles");
                else 
                    System.out.println("Scalene");
            }
            
            st = new StringTokenizer(br.readLine());
            for (int i=0; i<3; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
            }
        }
    }
}