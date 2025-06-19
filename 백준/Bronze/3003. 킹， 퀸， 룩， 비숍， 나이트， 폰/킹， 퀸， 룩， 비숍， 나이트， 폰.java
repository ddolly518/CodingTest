import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] arr = str.split(" ");
        int[] num = {1,1,2,2,2,8};
        for (int i=0; i<6; i++) {
            int n = Integer.parseInt(arr[i]);
            System.out.print(num[i]-n);
            System.out.print(" ");
        }
    }
}