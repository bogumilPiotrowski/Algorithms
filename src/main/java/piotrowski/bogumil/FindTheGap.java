package piotrowski.bogumil;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FindTheGap {

    public int solution(int[] A) {
        // write your code in Java SE 8
        List<Integer> integerList = new ArrayList<>();
        Stream.of(A).forEach(s -> IntStream.of(s).boxed().filter(a -> a>0).distinct().forEach(a -> integerList.add(a)));
        if (!integerList.contains(1)) {
            return 1;
        }
        int j = 2;
        for (int i = 2; i < integerList.size(); i++) {
            Integer element = integerList.get(i);
            if (integerList.contains(element)) {
                j++;
            }
        }
        return j;
    }

}
