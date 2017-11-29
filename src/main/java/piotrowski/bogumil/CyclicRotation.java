package piotrowski.bogumil;

import java.util.stream.IntStream;

public class CyclicRotation {
    public int[] solution(int[] A, int K) {
        if (A.length==0 || A.length==1 || A.equals(null)) {
            return A;
        }
        int[] temp = new int[A.length];
        StringBuilder stringBuilder = new StringBuilder();
        IntStream.of(A).forEach(ints -> stringBuilder.append(String.valueOf(ints)));
        char[] chars = stringBuilder.toString().toCharArray();
        for (int i = 0; i < A.length; i++) {
            int tempint = (K+i)%chars.length;
            temp[tempint] = Character.getNumericValue(chars[i]);
        }
        return temp;
    }
}
