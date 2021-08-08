package testNg;


import org.testng.annotations.Test;

public class InvocationCountTest {

    @Test(invocationCount = 3, threadPoolSize = 10)
    public void test() {
        System.out.println("I am " + Thread.currentThread().getName());
    }
}
