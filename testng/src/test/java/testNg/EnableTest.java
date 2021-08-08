package testNg;


import org.testng.annotations.Test;

public class EnableTest {

    @Test
    public void runTest1() {
        System.out.println("runTest1");
    }

    @Test(enabled = false)
    public void runTest2() {
        System.out.println("runTest2");
    }

}
