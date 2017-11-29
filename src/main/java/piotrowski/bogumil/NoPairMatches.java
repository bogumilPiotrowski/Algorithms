package piotrowski.bogumil;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class NoPairMatches {

    public int solution(int[] A) {
        if (A.length == 1) {
            return A[0];
        }
        Map<Integer, Integer> temp = IntStream.of(A)
                .distinct()
                .sorted()
                .boxed()
                .collect(Collectors.toMap(o -> o, o -> 0));
        IntStream.of(A).forEach(value -> temp.put(value, temp.get(value)+1));
        temp.entrySet().forEach(System.out::println);
        Integer result = temp.entrySet()
                .stream().
                        filter(integerIntegerEntry -> integerIntegerEntry.
                                getValue() == 1)
                .findFirst()
                .get().getKey();
        return result;
    }
}
