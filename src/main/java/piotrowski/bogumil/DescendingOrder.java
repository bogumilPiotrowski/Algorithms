package piotrowski.bogumil;

public class DescendingOrder {

    public static int sortDesc(final int num) {

        return Integer.parseInt(Integer.toString(num).codePoints()
                .sorted()
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .reverse()
                .toString());
    }

}
