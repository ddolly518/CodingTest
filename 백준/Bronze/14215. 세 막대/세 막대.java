import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[3];
        for (int i=0; i<3; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int num = arr[0]+arr[1]-1;
        int answer = num+1+Math.min(num,arr[2]);
        System.out.println(answer);
    }
}