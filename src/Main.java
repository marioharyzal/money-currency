import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] kurs = {"USA", "United States", "15000"};
        String[] kurs1 = {"MY", "Malaysia", "2000"};
        String[] kurs2 = {"CAN", "Canada", "4000"};
        Money.addMoney(kurs);
        Money.addMoney(kurs1);
        Money.addMoney(kurs2);
        System.out.println(Money.findAll());
        System.out.println(Money.findOne("MY"));
        System.out.println(Money.remove("CAN"));
        System.out.println(Money.findAll());
    }
}