package testNg;

import org.testng.annotations.Test;

//todo Why ???
@Test(singleThreaded = true)
public class SingleThreadedTest {

    @Test(invocationCount = 2, threadPoolSize = 2)
    public void test1() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("I am " + Thread.currentThread().getName());
    }

    public void test2() {
        System.out.println("I am " + Thread.currentThread().getName());
    }

    public void test3() {
        System.out.println("I am " + Thread.currentThread().getName());
    }
}
