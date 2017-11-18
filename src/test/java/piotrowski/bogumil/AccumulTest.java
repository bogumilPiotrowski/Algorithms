package piotrowski.bogumil;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AccumulTest {

    @Test
    public void accum() throws Exception {
        //given
        Accumul sut = new Accumul();
        //when
        String result = Accumul.accum("NyffsGeyylB");
        String expected = "N-Yy-Fff-Ffff-Sssss-Gggggg-Eeeeeee-Yyyyyyyy-Yyyyyyyyy-Llllllllll-Bbbbbbbbbbb";

        //then
        assertEquals(result, expected);
    }

}