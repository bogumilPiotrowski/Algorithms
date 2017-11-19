package piotrowski.bogumil;

import java.util.Arrays;
import java.util.OptionalInt;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


public class TheSupermarketQueue {

    public static int solveSuperMarketQueue(int[] customers, int n) {
        int[] listOfQueue = new int[n];
        Arrays.stream(listOfQueue).forEach(s -> s = 0);
        for (int i = 0; i < customers.length; i++) {
            Integer integer = customers[i];
            OptionalInt min = IntStream.of(listOfQueue).min();
            int findMinIdx = IntStream.of(listOfQueue).boxed().collect(Collectors.toList()).indexOf(min.getAsInt());
            listOfQueue[findMinIdx] += integer;
        }

        return IntStream.of(listOfQueue).max().getAsInt();
    }


}
