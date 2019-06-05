package inheritance;

import org.junit.Test;

import static org.junit.Assert.*;

public class TheaterTest {

    @Test
    public void testAddMovie(){
        Theater testToString = new Theater();
        testToString.addMovie("Iron Man");
        testToString.addMovie("Bat Man");
        String expectedOutput = testToString.toString();
        String output = "Iron Man";
        assertEquals("checking if movies has been added",
                expectedOutput,
                output);
    }

    @Test
    public void testRemoveMovie(){
        Theater testToString = new Theater();
        testToString.addMovie("Iron Man");
        testToString.addMovie("Bat Man");
        testToString.removeMovie("Iron Man");
        int expectedOutput = testToString.movieList.size();
        int output = 1;
        assertEquals("checking if movies has been added",
                expectedOutput,
                output);
    }

    @Test
    public void testTheatherReview(){
        Theater testToString = new Theater();
        testToString.addReview(new Review("AMC", "BatMan", "Good Movie", "Kush", 5));
        int expectedOutput = testToString.reviewList.size();
        int output = 1;
        assertEquals("checking if movies has been added",
                expectedOutput,
                output);
    }

    @Test
    public void testReviewJustTheater(){
        Theater testReview = new Theater();
        testReview.addReview(new Review("Good Theater", "Kush", 4));
        int expectedOutput = testReview.reviewList.size();
        int output = 1;
        assertEquals("checking review if the user just went for popcorn",
                expectedOutput,
                output);
    }
}