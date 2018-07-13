import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MyApplicationTest {

    MyApplication myApplication ;

    @Before
    public void setUp() throws Exception {
        myApplication = new MyApplication();
    }



    @Test
    public void doMathRight()throws Exception{
        int result = myApplication.doMath(5,5);


        assertEquals(10, result);

    }

    @Test
    public void helloWorldTest()throws Exception {
        assertEquals("Hello World", myApplication.printHelloWorld());
    }


    @Test
    public void rngTest() throws Exception {
        int result = myApplication.rdn(5);
        boolean isGreaterThan;
        if (result > 5) {
            isGreaterThan = true;
        } else {
            isGreaterThan = false;
        }
        assertTrue(String.valueOf(result),!isGreaterThan);
    }

    @After
    public void tearDown() throws Exception {
    }




}