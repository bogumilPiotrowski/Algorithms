package piotrowski.bogumil;

import java.util.Arrays;

//TODO:
public class PersistentBugger {
    static Long helpingValue = 1l;

    public static int persistence(long n) {
        int[] list = Arrays.asList(String.valueOf(n).toCharArray())
                .stream()
                .mapToInt(s -> Integer.parseInt(String.valueOf(s)))
                .toArray();

        for (int i = 0; i < list.length; i++) {
            multiply(list[i]);
        }

        return Math.toIntExact(helpingValue);
    }

     static void multiply(long arg) {
        helpingValue *= arg;
    }
}
