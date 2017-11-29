package piotrowski.bogumil;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class BinaryGapTest {
    @Test
    public void solution() throws Exception {
        //given
        BinaryGap sut = new BinaryGap();
        //when
        int result = sut.solution(111111);
        //then
        assertThat(result).isEqualTo(0);
    }


    @Test
    public void solution1() throws Exception {
        //given
        BinaryGap sut = new BinaryGap();
        //when
        int result = sut.solution(1000001000);
        //then
        assertThat(result).isEqualTo(5);
    }

    @Test
    public void solution2() throws Exception {
        //given
        BinaryGap sut = new BinaryGap();
        //when
        int result = sut.solution(1000000110);
        //then
        assertThat(result).isEqualTo(6);
    }

    @Test
    public void solution3() throws Exception {
        //given
        BinaryGap sut = new BinaryGap();
        //when
        int result = sut.solution(0b010000010001);
        //then
        assertThat(result).isEqualTo(5);
    }

}