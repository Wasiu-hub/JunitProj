import org.junit.Before;
import org.junit.Test;

public class MyTest {

    @Test
    public void test1(){
        System.out.println("Test 1 is executing");
    }

    @Test
    public void test2(){
        System.out.println("Test 2 is executing");
    }

    @Before
    public void before(){
        System.out.println("Before executing every test case");
    }
}
