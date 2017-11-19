package piotrowski.bogumil;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MorseCodeDecoder {

    public static String decode(String morseCode) {
        // your brilliant code here, remember that you can access the preloaded Morse code table through MorseCode.get(code)
        if (morseCode.isEmpty()) {
            return "";
        }

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
        return Arrays.stream(morseCode.split("   "))
                .map(i -> Arrays.stream(i.split(" "))
                        .map(l -> morseStore.get(l))
                        .filter(l -> l != null)
                        .collect(Collectors.joining()))
                .collect(Collectors.joining(" "))
                .trim();
    }

}
