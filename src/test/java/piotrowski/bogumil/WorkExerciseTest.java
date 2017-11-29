package piotrowski.bogumil;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class WorkExerciseTest {
    @Test
    public void solution() throws Exception {
        //given
        WorkExercise sut = new WorkExercise();
        //when
        int result = sut.solution(4, 17);
        //then
        assertThat(result).isEqualTo(3);
    }

    @Test
    public void solution1() throws Exception {
        //given
        WorkExercise sut = new WorkExercise();
        //when
        int result = sut.solution(-100, 1);
        //then
        assertThat(result).isEqualTo(1);
    }

}