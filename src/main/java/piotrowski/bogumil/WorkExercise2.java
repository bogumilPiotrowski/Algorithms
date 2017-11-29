package piotrowski.bogumil;

import java.util.stream.Stream;

public class WorkExercise2 {
    public int solution(int A, int B) {
        String[] tempString = String.valueOf(B).split(String.valueOf(A));
        if (tempString[0].length() == String.valueOf(B).length()) {
            return -1;
        }
        Integer result = tempString[0].length();
        return result;
    }
}
//    SELECT e.dept_id, COUNT(e.dept_id) AS "count", SUM(salary) AS sum_of_salary
//        FROM department AS d, employee AS e WHERE d.dept_id=e.dept_id GROUP BY "count", sum_of_salary