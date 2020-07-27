import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by rudan on 06/12/2019.
 */
public class main_bank {

    public static void main(String[] str) {
        int[] aArray = {1, 3, 5, 6};
        int numChar = 2;
        int index = 0;

        Arrays.sort(aArray);

        String aStr = Arrays.toString(aArray);
        aStr = aStr.replaceAll("\\[", "");
        aStr = aStr.replaceAll("\\]", "");
        aStr = aStr.replaceAll(",", "");
        aStr = aStr.replaceAll(" ", "");
        index = aStr.indexOf(Integer.toString(numChar));

        int aCount = aArray.length;

        if (index < 0) {
            for (int a : aArray) {
                aCount--;
                if (numChar < a) {
                    index = aStr.indexOf(Integer.toString(a));
                    break;
                }
                if (aCount == 0) {
                    index = aArray.length;
                    break;
                }
            }
        }

        System.out.println(index < 0 ? 0 : index);


    }
/*
    public char answer8(String str) {]
        int strLength = str.length();
        char[] charArray = str.toCharArray();
        return (charArray[str.length() - 1] == ' ' ? '0' : charArray[strLength - 1]);
    }*/

   /*
   public int[] answer9(int[] aArray, int[] bArray) {
        int[] resultArray = new int[aArray.length + bArray.length];
        System.arraycopy(aArray, 0, resultArray, 0, aArray.length);
        System.arraycopy(bArray, 0, resultArray, aArray.length, bArray.length);

        Arrays.sort(resultArray);
        return resultArray;
    }*/

/*
    public int answer10(int[] aArray, int numChar) {
        int index = 0;

        Arrays.sort(aArray);
        String aStr = Arrays.toString(aArray);
        aStr = aStr.replaceAll("\\[", "");
        aStr = aStr.replaceAll("\\]", "");
        aStr = aStr.replaceAll(",", "");
        aStr = aStr.replaceAll(" ", "");
        index = aStr.indexOf(Integer.toString(numChar));

        int aCount = aArray.length;

        if (index < 0) {
            for (int a : aArray) {
                aCount--;
                if (numChar < a) {
                    index = aStr.indexOf(Integer.toString(a));
                    break;
                }
                if (aCount == 0) {
                    index = aArray.length;
                    break;
                }
            }
        }

        return index < 0 ? 0 : index;
    }*/
}
