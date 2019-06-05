package inheritance;

import org.junit.Test;

import static org.junit.Assert.*;

public class TheaterTest {

    @Test
    public void testAddMovie(){
        Theater testToString = new Theater();
        testToString.addMovie("Iron Man");
        testToString.addMovie("Bat Man");
        int expectedOutput = testToString.movieList.size();
        int output = 2;
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
}