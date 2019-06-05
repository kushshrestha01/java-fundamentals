package inheritance;

import org.junit.Test;

import static org.junit.Assert.*;

public class ReviewTest {
    @Test
    public void testToStringReview() {
        Review testToString = new Review("They have delicious burgers", "Kush", 2);
        String expectedOutput = "Review: They have delicious burgers, by Kush";
        assertEquals("checking toString Review",
                expectedOutput,
                testToString.toString());
    }

    @Test
    public void testToStringReviewWithName() {
        Restaurant testToStringRestaurant = new Restaurant("Burger King", 2, "$");
        Review testToString = new Review( "Burger King", "They have delicious burgers", "Kush", 2);

        String expectedOutput = "Restaurant: Burger King Review: They have delicious burgers, by Kush";
        assertEquals("checking toString Review",
                expectedOutput,
                testToString.toStringSecond());
    }
}