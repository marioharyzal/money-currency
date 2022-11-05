import java.util.ArrayList;
import java.util.Arrays;

public class Money {
    static String idMoney;
    static String nameCountry;
    static String kurs;

    static ArrayList<String[]> kursCollection = new ArrayList<String[]>();

    public static String findAll() {
        return Arrays.deepToString(Money.kursCollection.toArray());
    }
    public static void addMoney(String[] kurs) {
        kursCollection.add(kurs);
    }

    public static String findOne(String id) {
        String[] result = new String[1];
        kursCollection.forEach((n) -> {
            if (n[0] == id) {
                result[0] = Arrays.toString(n);
            }
        });

        return result[0];
    }

    public static String remove(String id) {
        String[] kurs = new String[1];
        kursCollection.forEach((n) -> {
            if (n[0] == id) {
                kurs[0] = Arrays.toString(n);
            }
        });
        kursCollection.remove(String.valueOf(kurs));
        return "Berhasil menghapus kurs " + Arrays.toString(kurs);
    }

}
