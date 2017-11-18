package piotrowski.bogumil;

import org.junit.Test;

import static org.junit.Assert.*;

public class ChocolateTest {

    @Test
    public void myTests() {
        assertEquals(Chocolate.breakChocolate(5, 5) , 24);
        assertEquals(Chocolate.breakChocolate(1, 1) , 0);
    }

}