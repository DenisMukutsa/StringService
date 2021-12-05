package std;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        StringService service = new StringService();
        char[] array = service.getCharStat("Программирование на java");
        System.out.println(Arrays.toString(array));
        String[] arrayString = {"стоит", "Арбуз", "Дорого", "Совсем", "Сочный", "южный", "Ялтинский"};
        try {
            arrayString = service.sort(arrayString, true);
        }
        catch(StringArrayException e) {

        }
        System.out.println(Arrays.toString(arrayString));

        try {
            arrayString = service.sort(arrayString, false);
        }
        catch(StringArrayException e) {

        }
        System.out.println(Arrays.toString(arrayString));
    }
}
