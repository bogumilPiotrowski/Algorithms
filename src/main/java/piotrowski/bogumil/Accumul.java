package piotrowski.bogumil;

public class Accumul {

    public static String accum(String s) {

        char[] listOfChars = s.toCharArray();

        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < listOfChars.length; i++) {

            stringBuilder.append(String.valueOf(listOfChars[i]).toUpperCase());

            for (int j = 0; j < i; j++) {
                stringBuilder.append(String.valueOf(listOfChars[i]).toLowerCase());
            }

            if (!(i == listOfChars.length-1))
            stringBuilder.append("-");
        }

        return stringBuilder.toString();
    }
}