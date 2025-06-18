import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine());
        String str = sc.nextLine();
        String[] arr = str.split("");
        int answer = 0;
        for (int i=0; i<N; i++) {
            answer+=Integer.parseInt(arr[i]);
        }
        System.out.println(answer);
    }
}