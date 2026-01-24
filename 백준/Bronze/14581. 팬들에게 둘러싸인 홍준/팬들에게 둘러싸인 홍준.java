import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        for (int i=0; i<3; i++) {
            System.out.print(":fan:");
        }
        System.out.println();
        System.out.print(":fan:");
        System.out.print(":"+str+":");
        System.out.println(":fan:");
        for (int i=0; i<3; i++) {
            System.out.print(":fan:");
        }
    }
}