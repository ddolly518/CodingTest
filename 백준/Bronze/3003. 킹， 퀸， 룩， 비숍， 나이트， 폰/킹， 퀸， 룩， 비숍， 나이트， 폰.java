import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String[] arr = line.split(" ");
        int[] count = new int[]{1,1,2,2,2,8};
        
        for (int i=0; i<count.length; i++) {
            int num = Integer.parseInt(arr[i]);
            System.out.print(count[i]-num+" ");
        }
    }
}