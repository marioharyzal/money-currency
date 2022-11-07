import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] kurs = {"USA", "United States", "15000"};
        String[] kurs1 = {"MY", "Malaysia", "2000"};
        String[] kurs2 = {"CAN", "Canada", "4000"};

        MoneyService.addMoney(kurs);
        MoneyService.addMoney(kurs1);
        MoneyService.addMoney(kurs2);

        MoneyService.remove("CAN");
        System.out.println(MoneyService.findAll());
        System.out.println(MoneyService.findOne("USA"));
    }
}