package inheritance;

import org.junit.Test;

import static org.junit.Assert.*;

public class RestaurantTest {
    @Test
    public void testToStringRestaurant() {
        Restaurant testToString = new Restaurant("Burger King", 2, "$");
        String expectedOutput = "Burger King has 2 stars and the price is $";
        assertEquals("checking toString",
                expectedOutput,
                testToString.toString());
    }

    @Test
    public void testAddReview() {
        Restaurant addRestaurant = new Restaurant("Burger King", 3, "$");
        Review addReview = new Review("Burger King", "good burgers", "Kush", 3 );
        addRestaurant.addReview(addReview);
        String expectedRestaurantName = "Burger King";
        String expectedRestaurantReview = "good burgers";
        assertEquals("checking restaurant names",
                expectedRestaurantName,
                addRestaurant.getName());
        assertEquals("checking restaurant review",
                expectedRestaurantReview,
                addRestaurant.reviewList.get(0).getBody());
        assertEquals("checking length of Review list"
                , 1,
                addRestaurant.reviewList.size());
    }

    @Test
    public void testAverageStars() {
        Restaurant addRestaurant = new Restaurant("Burger King", 3, "$");
        Review addReview = new Review("Burger King", "good burgers", "Kush", 3 );
        Review addReview2 = new Review("Burger King", "good burgers", "Kush", 5  );
        Review addReview3 = new Review("Burger King", "good burgers", "Kush", 4 );
        addRestaurant.addReview(addReview);
        addRestaurant.addReview(addReview2);
        addRestaurant.addReview(addReview3);
        addRestaurant.addReview(addReview3);
        int expectedOutput = 4;
        assertEquals("checking for average restaurant stars",
                expectedOutput,
                addRestaurant.getStars());
    }
}