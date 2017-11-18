package piotrowski.bogumil;

import java.util.List;

public class GetTheMiddleCharacter {

    public static String getMiddle(String word) {
        char[] proccessing = word.toCharArray();
        if (proccessing.length % 2 != 0) {
            return String.valueOf(proccessing[proccessing.length / 2]);
        }

        return String.valueOf(proccessing[(int) Math.floor(proccessing.length/2-1)]) +
                String.valueOf(proccessing[(int) Math.floor(proccessing.length/2)]);
    }
}
