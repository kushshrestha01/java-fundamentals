/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package basiclibrary;

import org.junit.Test;
import static org.junit.Assert.*;

public class LibraryTest {
    @Test
    public void testSomeLibraryMethod() {
        Library classUnderTest = new Library();
        assertTrue("SomeLibraryMethod should return 'true'", classUnderTest.someLibraryMethod());
    }

    @Test
    public void testRoll() {
        Library libraryForTesting = new Library();
        int n = 4;
        int expectedOutput = n;
        assertEquals("Checking the length of an array",
                expectedOutput,
                libraryForTesting.roll(n).length);
    }

    @Test
    public void testRollValue() {
        Library libraryForTesting = new Library();
        int n = 4;
        int [] expectedOutput = libraryForTesting.roll(n);
        for(int i = 0; i < n; i++) {
            assertTrue("checking if int in array is less than 6 and greater than 1",
                    expectedOutput[i] <= 6 & expectedOutput[i] >= 1);
        }
   }

    @Test
    public void testContainDuplicates() {
        Library libraryForTesting = new Library();
        int [] inputArr = {1, 2, 3,3};
        assertTrue("Checking if array has any duplicate int",
                libraryForTesting.containsDuplicates(inputArr));
    }

    @Test
    public void testWithoutDuplicates() {
        Library libraryForTesting = new Library();
        int [] inputArr = {1, 2, 3};
        assertFalse("Checking to see when expected output is incorrect",
                libraryForTesting.containsDuplicates(inputArr));
    }

    @Test
    public void testCalculateAverage() {
        Library libraryForTesting = new Library();
        int [] inputArr = {1, 2, 3, 2};
        int expectedOutput = 2;
        assertEquals("Calculating average",
                expectedOutput,
                libraryForTesting.calculateAverage(inputArr));

    }

    @Test
    public void testCalculateAverageIncorrect() {
        Library libraryForTesting = new Library();
        int [] inputArr = {1, 2, 3,9};
        double expectedOutput = 2.0;
        assertNotEquals("Checking to see when expected output is incorrect",
                expectedOutput,
                libraryForTesting.calculateAverage(inputArr));

    }

    @Test
    public void testTwoDArray(){
        Library libraryForTesting = new Library();
        int[][] weeklyMonthTemperatures = {
                {66, 64, 58, 65, 71, 57, 60},
                {57, 65, 65, 70, 72, 65, 51},
                {55, 54, 60, 53, 59, 57, 61},
                {65, 56, 55, 52, 55, 62, 57}
        };
        int [] expectedOutput = {55, 54, 60, 53, 59, 57, 61};
        assertArrayEquals("returning the array with the lowest average in two dimensional array",
                expectedOutput,
                libraryForTesting.twoDArray(weeklyMonthTemperatures));

    }

    @Test
    public void testTwoDArraySecond(){
        Library libraryForTesting = new Library();
        int[][] weeklyMonthTemperatures = {
                {66, 64, 58, 65, 71, 57, 60},
                {57, 65, 65, 70, 72, 65, 51},
                {55, 54, 60, 53, 59, 57, 61},
                {65, 56, 55, 52, 55, 62, 57},
                {1,2,3,4,5,6,7}

        };
        int [] expectedOutput = {1,2,3,4,5,6,7};
        assertArrayEquals("returning the array with the lowest average in two dimensional array",
                expectedOutput,
                libraryForTesting.twoDArray(weeklyMonthTemperatures));

    }

}
