import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[10];
        
        Arrays.fill(arr, 1);
        arr[0] = 0;

        for (int i=2; i<=n; i++) {
            int[] temp = new int[10];
            
            for (int j=0; j<10; j++) {
                if (j==0) {
                    temp[j] = arr[1];
                } else if (j==9) {
                    temp[j] = arr[j-1]%1000000000;
                } else {
                    temp[j] = (arr[j-1] + arr[j+1])%1000000000;    
                }
            }
            
            arr = temp;
        }
        
        int sum = 0;
        
        for (int i=0; i<10; i++) {
            sum+=arr[i]; 
            sum%=1000000000;
        }
        
        System.out.print(sum);
    }
}