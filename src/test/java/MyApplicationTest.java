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


    @After
    public void tearDown() throws Exception {
    }
}