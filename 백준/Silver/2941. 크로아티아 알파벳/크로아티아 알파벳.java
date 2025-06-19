import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[][] arr = {{"c=","c"},{"c-","c"},{"dz=","d"},{"d-","d"},{"lj","l"},{"nj","n"},{"s=","s"},{"z=","z"}};
        String str = sc.nextLine();
        for (int i=0; i<8; i++) {
            str= str.replace(arr[i][0],arr[i][1]);
        }
        System.out.println(str.length());
    }
}