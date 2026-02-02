import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {6,3,2,1,2};
        
        for (int i=0; i<2; i++) {
            int answer = 0;
            for (int j=0; j<5; j++) {
                int n = sc.nextInt();
                answer+=(arr[j]*n);
            }
            System.out.print(answer+" ");
        }
    }
}