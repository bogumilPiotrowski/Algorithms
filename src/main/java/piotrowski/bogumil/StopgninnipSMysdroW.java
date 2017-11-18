package piotrowski.bogumil;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.stream.Collectors;

public class StopgninnipSMysdroW {

    public String spinWords(String sentence) {
        StringBuilder stringBuilder = new StringBuilder();
        Arrays.asList(sentence.split(" "))
                .stream()
                .map(s -> (s.length() > 4) ? new StringBuilder(s).reverse() : s)
                .forEach(charSequence -> stringBuilder.append(charSequence + " "));
        return stringBuilder.deleteCharAt(stringBuilder.length()-1).toString();
    }

}
