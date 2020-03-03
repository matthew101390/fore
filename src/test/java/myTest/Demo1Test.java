package myTest;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import src.TwoValues;

public class Demo1Test {

    @Test
    public void addition() {
        assertEquals(3, new TwoValues(1, 2).add());
    }

    @Test
    public void minus() {
        assertEquals(3, new TwoValues(1, 2).minus());
    }

    @Test
    public void minus2() {
        assertEquals(0, new TwoValues(2, 2).add());
    }

}