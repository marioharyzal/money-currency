import java.util.ArrayList;
import java.util.Arrays;

public class MoneyService extends Money {
    protected static ArrayList<String[]> kursCollection = new ArrayList<String[]>();

    protected static String findAll() {
        return Arrays.deepToString(kursCollection.toArray());
    }

    protected static void addMoney(String[] kurs) {
        kursCollection.add(kurs);
    }

    protected static String findOne(String id) {
        String[] result = new String[1];
        kursCollection.forEach((n) -> {
            if (n[0] == id) {
                result[0] = Arrays.toString(n);
            }
        });

        return result[0];
    }

    protected static void remove(String id) {
        int index = 0;
        for (String[] kurs: kursCollection) {
            if (kurs[0] == id) {
                kursCollection.remove(index);
                return;
            }
            index++;
        }
    }

    protected static void destroyAll() {
        kursCollection.clear();
    }
}
