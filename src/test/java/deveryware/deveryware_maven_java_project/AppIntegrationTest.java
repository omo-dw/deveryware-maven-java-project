package deveryware.deveryware_maven_java_project;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppIntegrationTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppIntegrationTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppIntegrationTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }
    
    /**
     * Rigourous Test :-)
     */
    public void testApp2()
    {
    	App.main(null);
        assertTrue( true );
    }
    
    /**
     * Rigourous Test :-)
     */
    public void testApp3()
    {
    	App.main(null);
        assertTrue( true );
    }
    
    
}
