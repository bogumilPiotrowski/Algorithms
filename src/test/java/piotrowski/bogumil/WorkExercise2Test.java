package piotrowski.bogumil;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class WorkExercise2Test {
    @Test
    public void solution() throws Exception {
        //given
        WorkExercise2 sut = new WorkExercise2();
        //when
        Integer result = sut.solution(53, 1953786);
        //then
        assertThat(result).isEqualTo(2);
    }

    @Test
    public void solution2() throws Exception {
        //given
        WorkExercise2 sut = new WorkExercise2();
        //when
        Integer result = sut.solution(78, 195378678);
        //then
        assertThat(result).isEqualTo(4);
    }

    @Test
    public void solution3() throws Exception {
        //given
        WorkExercise2 sut = new WorkExercise2();
        //when
        Integer result = sut.solution(11, 195378678);
        //then
        assertThat(result).isEqualTo(4);
    }

}