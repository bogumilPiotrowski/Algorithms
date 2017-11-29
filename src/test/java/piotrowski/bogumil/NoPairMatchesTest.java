package piotrowski.bogumil;

import org.junit.Test;

import java.util.Random;

import static org.assertj.core.api.Assertions.assertThat;
public class NoPairMatchesTest {
    @Test
    public void solution() throws Exception {
        //given
        NoPairMatches sut = new NoPairMatches();
        //when
        int[] ints = new Random(1).ints(50, 0, 20).toArray();
//        for (int i = 0; i < ints.length; i++) {
//            System.out.println(ints[i]);
//        }
        Integer result = sut.solution(ints);
        //then
        assertThat(result).isEqualTo(3);

    }

}