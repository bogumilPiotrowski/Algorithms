package piotrowski.bogumil;


import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FindTheGapTest {
    @Test
    public void solution() throws Exception {
        //given
        FindTheGap findTheGap = new FindTheGap();
        //when
        int[] array = {-1, -3};

        Integer result = findTheGap.solution(array);
        //then
        assertThat(result).isEqualTo(1);
    }

    @Test
    public void solution1() throws Exception {
        //given
        FindTheGap findTheGap = new FindTheGap();
        //when
        int[] array = {-1, -3, 1, 2, 4};

        Integer result = findTheGap.solution(array);
        //then
        assertThat(result).isEqualTo(3);
    }

    @Test
    public void solution2() throws Exception {
        //given
        FindTheGap findTheGap = new FindTheGap();
        //when
        int[] array = {-1, -3, 1, 1, 2, 4, 4 , 3, 3 ,5, 5,5 ,7, 7};

        Integer result = findTheGap.solution(array);
        //then
        assertThat(result).isEqualTo(6);
    }

}