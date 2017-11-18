package piotrowski.bogumil;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MorseCodeDecoder {

    public static String decode(String morseCode) {
        // your brilliant code here, remember that you can access the preloaded Morse code table through MorseCode.get(code)

        String[] alpha = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j",
                "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v",
                "w", "x", "y", "z", "1", "2", "3", "4", "5", "6", "7", "8",
                "9", "0"};
        String[] dottie = { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.",
                "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.",
                "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-",
                "-.--", "--..", ".----", "..---", "...--", "....-", ".....",
                "-....", "--...", "---..", "----.", "-----"};

        Map<String, String> morseStore= IntStream.range(0, dottie.length).boxed()
                .collect(Collectors.toMap(i -> dottie[i], i -> alpha[i]));
        StringBuilder stringBuilder = new StringBuilder();
        List<String> lists = Arrays.asList(morseCode.split("   "))
                .stream()
                .collect(Collectors.toList());

        for (String string :
                lists) {
            Arrays.asList(string.split(" "))
                    .stream()
                    .forEach(s1 -> stringBuilder
                            .append(morseStore.get(s1)
                                    .toUpperCase()));
            stringBuilder.append(" ");
        }

        return stringBuilder.deleteCharAt(stringBuilder.length()-1).toString();
    }

}
