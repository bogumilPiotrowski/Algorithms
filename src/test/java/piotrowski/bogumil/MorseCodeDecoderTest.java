package piotrowski.bogumil;

import org.junit.Test;

import static org.junit.Assert.*;

public class MorseCodeDecoderTest {

    @Test
    public void testExampleFromDescription() {
        assertEquals("HEY JUDE", MorseCodeDecoder.decode(".... . -.--   .--- ..- -.. ."));
    }

}