package inheritance;

import org.junit.Test;

import static org.junit.Assert.*;

public class ShopTest {

    @Test
    public void testToStringShop() {
        Shop testToString = new Shop("Target", "good store", "$$");
        String expectedOutput = "Target is good store and the price is $$";
        String output = testToString.toString();
        assertEquals("checking toString method of Shop class",
                expectedOutput,
                output);

    }

}