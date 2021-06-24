import java.util.Arrays;
import java.util.Arrays;
import java.util.Collections;

public class Result {
    public static int minNumber(int Number[]) {
        if (Number == null || Number.length == 0) {
            throw new IllegalArgumentException("Bad or empty array");
        }
        Arrays.sort(Number);
        //Arrays.sort(Number, Collections.reverseOrder());

        return Number[0];
    }

    public static int maxNumber(int Number[]) {
        if (Number == null || Number.length == 0) {
            throw new IllegalArgumentException("Bad or empty array");
        }
        //Arrays.sort(Number);
// we have to convert it into array of Objects, using java's boxing
        Integer[] arrOfObjects = new Integer[Number.length];
        for (int i = 0; i < Number.length; i++)
            arrOfObjects[i] = new Integer(Number[i]);
        Arrays.sort(arrOfObjects, Collections.reverseOrder());

        return arrOfObjects[0];
    }
}

