package sample;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class GradeBookTest
{
    private GradeBook gradeBook1;
    private GradeBook gradeBook2;

    @Before
    public void setUp()
    {

        gradeBook1 = new GradeBook(5);
        gradeBook2 = new GradeBook(5);

        gradeBook1.addScore(50.0);
        gradeBook1.addScore(75.0);

        gradeBook2.addScore(25.0);
        gradeBook2.addScore(15.0);
        gradeBook2.addScore(35.0);
        gradeBook2.addScore(5.0);
    }

    @After
    public void tearDown()
    {
        gradeBook1 = null;
        gradeBook2 = null;
    }

    @Test
    public void addScoreTest()
    {

        assertTrue((gradeBook1.toString()).equals("50.0 75.0 "));
        assertTrue((gradeBook2.toString()).equals("25.0 15.0 35.0 5.0 "));

        assertEquals(2, gradeBook1.getScoreSize(), 0.001);
        assertEquals(4, gradeBook2.getScoreSize(), 0.001);
    }

    @Test
    public void testSum()
    {
        assertEquals(125.0, gradeBook1.sum(), 0.0001);
        assertEquals(80.0, gradeBook2.sum(), 0.0001);
    }

    @Test
    public void testMinimum()
    {

        assertEquals(50.0, gradeBook1.minimum(), 0.001);
        assertEquals(5.0, gradeBook2.minimum(), 0.001);
    }

    @Test
    public void testFinalScore()
    {

        assertEquals(75.0, gradeBook1.finalScore(), 0.001);
        assertEquals(75.0, gradeBook2.finalScore(), 0.001);
    }
}
