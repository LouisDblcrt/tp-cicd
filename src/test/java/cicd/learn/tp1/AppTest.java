package cicd.learn.tp1;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }

    public void testCarGetMethod(){
        Car car = new Car("test","test",10);
        assertEquals(car.getModele(),"test");
    }
    
    public void testCarGetMethod2(){
        Car car = new Car("test","test",10);
        assertEquals(car.getMarque(),"test");
    }
    public void testCarGetMethod3(){
        Car car = new Car("test","test",10);
        assertEquals(car.getPrix(),11);
    }
}
