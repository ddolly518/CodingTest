import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int answer = 0;
        for (int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'A' && ch <= 'C') answer += 3;
            else if (ch >= 'D' && ch <= 'F') answer += 4;
            else if (ch >= 'G' && ch <= 'I') answer += 5;
            else if (ch >= 'J' && ch <= 'L') answer += 6;
            else if (ch >= 'M' && ch <= 'O') answer += 7;
            else if (ch >= 'P' && ch <= 'S') answer += 8;
            else if (ch >= 'T' && ch <= 'V') answer += 9;
            else if (ch >= 'W' && ch <= 'Z') answer += 10;
        }
        System.out.println(answer);
    }
}