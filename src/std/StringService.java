package std; 

import java.util.Arrays;

public class StringService {

    public static String[] sort(String[] as, boolean dir) throws StringArrayException {
        if(as == null || as.length == 0 ) {
            throw new StringArrayException("Массив не создан либо пуст.");
        }
        String[] tempArray = new String[as.length];
        System.arraycopy(as, 0, tempArray, 0, as.length);
        for (int i = 0; i < tempArray.length; i++) {
            tempArray[i] = tempArray[i].toLowerCase();
        }

        if (dir == true) {

            for (int i = 0; i < tempArray.length; i++) {
                for (int j = i + 1; j < tempArray.length; j++) {
                    String strTemp = "";
                    if (tempArray[j].charAt(0) <= tempArray[i].charAt(0)) {
                        if(tempArray[j].charAt(0) < tempArray[i].charAt(0)) {
                            strTemp = tempArray[i];
                            tempArray[i] = tempArray[j];
                            tempArray[j] = strTemp;
                            strTemp = as[i];
                            as[i] = as[j];
                            as[j] = strTemp;
                        }
                        else {
                            if(tempArray[j].charAt(1) < tempArray[i].charAt(1)) {
                                strTemp = tempArray[i];
                                tempArray[i] = tempArray[j];
                                tempArray[j] = strTemp;
                                strTemp = as[i];
                                as[i] = as[j];
                                as[j] = strTemp;
                            }
                        }
                    }
                }
            }
        }

        else {
            for (int i = 0; i < tempArray.length; i++) {
                for (int j = i + 1; j < tempArray.length; j++) {
                    String strTemp = "";
                    if (tempArray[j].charAt(0) >= tempArray[i].charAt(0)) {
                        if(tempArray[j].charAt(0) > tempArray[i].charAt(0)) {
                            strTemp = tempArray[i];
                            tempArray[i] = tempArray[j];
                            tempArray[j] = strTemp;
                            strTemp = as[i];
                            as[i] = as[j];
                            as[j] = strTemp;
                        }
                        else {
                            if(tempArray[j].charAt(1) > tempArray[i].charAt(1)) {
                                strTemp = tempArray[i];
                                tempArray[i] = tempArray[j];
                                tempArray[j] = strTemp;
                                strTemp = as[i];
                                as[i] = as[j];
                                as[j] = strTemp;
                            }
                        }
                   }
                }
            }
        }
            return as;
    }

    public static char[] getCharStat (String str) {
        if(str == null) {
            return null;
        }
        String strTemp  = "";
        for(int i = 0; i < str.length(); i++) {
            if(str.indexOf(str.charAt(i), i + 1) == -1) {
                strTemp += str.charAt(i);
            }
        }
        char[] array = strTemp.toCharArray();

        return array;
    }
}

class StringArrayException extends Exception {
    private static final String DEFAULT_DESCRIPTION = "Common error";

    public StringArrayException() {
        super(DEFAULT_DESCRIPTION);
    }

    public StringArrayException(String string) {
        super(string);
    }

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
