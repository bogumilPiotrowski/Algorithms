package piotrowski.bogumil;

public class WorkExercise {
    public int solution(int A, int B) {
        Integer checedNumber = A;
        Integer tempCounter = 0;
        if (A < 0) {
            checedNumber = 0;
            tempCounter++;
        }
        if (B==0) {
            return 0;
        }
        Integer range = B-checedNumber;
        for (int i = 0; i < range; i++) {
            Double temp = Math.sqrt(checedNumber);
            if (Math.floor(temp) == temp) {
                tempCounter++;
            }
            checedNumber++;
        }
        return tempCounter;
    }
}
