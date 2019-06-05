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

    @Test
    public void testAddReviewShop() {
        Shop testAddReview = new Shop("Target", "Everything you want", "$$");
        testAddReview.addReview(new Review("Target", "good store", "kush", 2 ));
        testAddReview.addReview(new Review("Target", "good store", "kush", 2 ));
        int expectedOutput = testAddReview.reviewList.size();
        int output = 2;
        assertEquals("checking the length of review list to see if review has been added for shop",
                expectedOutput,
                output);

    }
}