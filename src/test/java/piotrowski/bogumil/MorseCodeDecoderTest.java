package piotrowski.bogumil;

import org.junit.Test;

import static org.junit.Assert.*;

public class MorseCodeDecoderTest {

    @Test
    public void testExampleFromDescription() {
        assertEquals("", MorseCodeDecoder.decode(""));
    }


    @Test
    public void test() {
        assertEquals("HEY JUDE", MorseCodeDecoder.decode(".... . -.--   .--- ..- -.. ."));
    }


    @Test
    public void test1() {
        assertEquals("JESTEM ZAJEBISTY", MorseCodeDecoder.decode(".--- . ... - . --   --.. .- .--- . -... .. ... - -.--"));
    }

    @Test
    public void test3() {
        assertEquals("JESTEM ZAJEBISTY", MorseCodeDecoder.decode("   .--- . ... - . --   --.. .- .--- . -... .. ... - -.--"));
    }

    @Test
    public void test2() {
        assertEquals("", MorseCodeDecoder.decode("kur!#%#"));
    }

}