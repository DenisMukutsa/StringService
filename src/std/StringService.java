package std;

import java.util.Arrays;
import java.util.Comparator;

class StringService {

    public static String[] sort(String[] as, boolean dir) throws StringArrayException {
        if (as == null || as.length == 0) {
            throw new StringArrayException("Массив не создан либо пуст.");
        }
        if (dir == true) {
            Arrays.sort(as, new Comparator<String>() {
                public int compare(String s1, String s2) {
                    return s1.toLowerCase().compareTo(s2.toLowerCase());
                }
            });
            return as;
        }
        else {
            Arrays.sort(as, new Comparator<String>() {
                public int compare(String s1, String s2) {
                    return s1.toLowerCase().compareTo(s2.toLowerCase());
                }
            });
            String[] tempArray = new String[as.length];
            System.arraycopy(as,0, tempArray, 0, as.length);
            int j = tempArray.length-1;
            for(int i = 0; i < as.length; i++) {
                as[i] = tempArray[j];
                j--;
            }
            return as;
        }
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
