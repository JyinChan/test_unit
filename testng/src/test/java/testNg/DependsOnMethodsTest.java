package testNg;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DependsOnMethodsTest {

    @BeforeTest
    public void before() {
        System.out.println("before");
    }

    @Test(dependsOnMethods = {"runOtherTest", "testNg.EnableTest.runTest1"})
    public void runMainTest() {
        System.out.println("runMainTest");
    }

    @Test
    public void runOtherTest() {
        System.out.println("runOtherTest");
    }
}
