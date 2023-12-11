import org.junit.*;

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

    @After
    public void after(){
        System.out.println("Executing after test case");
    }

    @BeforeClass
    public static void onetimeBefore(){
        System.out.println("One time execution before starting test suite");
    }

    @AfterClass
    public static void afterCompletionOfTestsuite(){
        System.out.println("After test completion of test suite");
    }
}
