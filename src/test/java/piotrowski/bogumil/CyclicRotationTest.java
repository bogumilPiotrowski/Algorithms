package piotrowski.bogumil;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CyclicRotationTest {
    @Test
    public void solution() throws Exception {
        //given
        CyclicRotation sut = new CyclicRotation();
        //when
        int[] given = {3, 8, 9, 7, 6};
        int[] result = sut.solution(given, 3);
        //then
        assertThat(result).containsSequence(9, 7, 6, 3, 8);
    }

    @Test
    public void solution1() throws Exception {
        //given
        CyclicRotation sut = new CyclicRotation();
        //when
        int[] given = {1, 2, 3, 4};
        int[] result = sut.solution(given, 4);
        //then
        assertThat(result).containsSequence(1, 2, 3, 4);
    }

    @Test
    public void solution2() throws Exception {
        //given
        CyclicRotation sut = new CyclicRotation();
        //when
        int[] given = {1, 2, 3, 4, 6, 7, 7};
        int[] result = sut.solution(given, 1);
        //then
        assertThat(result).containsSequence(7, 1, 2, 3, 4, 6, 7);

    }

}