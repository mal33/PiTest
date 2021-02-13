package abc;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTests {

    @Test
    public void test1 () {
        assertEquals(0, new Calculator().round(-0.5));
    }
}

