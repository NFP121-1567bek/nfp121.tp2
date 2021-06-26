package question1;


/**
 * Write a description of class MyNewTest here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
public class MyNewTest
{
    // instance variables - replace the example below with your own
   

    /**
     * Constructor for objects of class MyNewTest
     */
    public MyNewTest()
    {
     
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
   @BeforeEach
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @AfterEach
    public void tearDown()
    {
    }

    

    @Test
    public void MyNewTest()
    {
        assertEquals(32.22, question1.FahrenheitCelsius.fahrenheitEnCelsius(90), 0.1);
        assertEquals(-6.66, question1.FahrenheitCelsius.fahrenheitEnCelsius(20), 0.1);
        assertEquals(20, question1.FahrenheitCelsius.fahrenheitEnCelsius(68), 0.1);
        assertEquals(0, question1.FahrenheitCelsius.fahrenheitEnCelsius(32), 0.1);
        assertEquals(4.44, question1.FahrenheitCelsius.fahrenheitEnCelsius(40), 0.1);
    }
}
