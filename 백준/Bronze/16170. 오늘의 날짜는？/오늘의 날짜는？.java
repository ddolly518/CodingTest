import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        LocalDate d = LocalDate.now();
        System.out.println(d.getYear());
        System.out.println(d.getMonthValue());
        System.out.println(d.getDayOfMonth());
    }
}
