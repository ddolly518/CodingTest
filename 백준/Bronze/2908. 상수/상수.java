import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] arr = str.split(" ");
        StringBuilder sb = new StringBuilder(arr[0]);
        arr[0] = sb.reverse().toString();
        sb = new StringBuilder(arr[1]);
        arr[1] = sb.reverse().toString();
        System.out.println(Math.max(Integer.parseInt(arr[0]), Integer.parseInt(arr[1])));
    }
}