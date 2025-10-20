import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int answer = N;
        
        for (int i=N-1; i>0; i--) {
            String str = String.valueOf(i);
            String[] arr = str.split("");
            int num = 0;
            for (int j=0; j<arr.length; j++) {
                num+=Integer.parseInt(arr[j]);
            }
            if (N==(i+num))
                answer = i;
        }
        
        if (answer==N)
            answer=0;
        
        System.out.print(answer);
    }
}