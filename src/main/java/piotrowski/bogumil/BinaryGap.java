package piotrowski.bogumil;

import java.util.Optional;
import java.util.stream.Stream;

public class BinaryGap {

    int solution(int N) {
        String temp = Integer.toBinaryString(N);
        temp = new StringBuilder(temp).reverse().toString();
        temp = Integer.toBinaryString(Integer.parseInt(temp, 2));
        String[] tempArray = temp.split("1");
        Optional<Integer> result = Optional.of(Stream.of(tempArray)
                .filter(s -> !s.equals(""))
                .mapToInt(String::length)
                .boxed()
                .sorted()
                .min((o1, o2) -> o2)
                .orElse(0)
                .intValue());
//        System.out.println(result.get());
        return result.get();
    }

}
