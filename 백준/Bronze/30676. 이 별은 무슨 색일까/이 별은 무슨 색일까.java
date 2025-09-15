import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String answer = "";
        if (n>=620) {
            answer = "Red";
        } else if (n>=590) {
            answer = "Orange";
        } else if (n>=570) {
            answer = "Yellow";
        } else if (n>=495) {
            answer = "Green";
        } else if (n>=450) {
            answer = "Blue";
        } else if (n>= 425) {
            answer = "Indigo";
        } else {
            answer = "Violet";
        }
        System.out.println(answer);
    }
}