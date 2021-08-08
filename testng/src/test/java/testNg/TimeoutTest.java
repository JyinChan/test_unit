package testNg;

import org.testng.annotations.Test;
import org.testng.internal.thread.ThreadTimeoutException;

public class TimeoutTest {

    @Test(timeOut = 100)
    public void runTimeout1() {
        System.out.println("runTimeout1");
    }

    @Test(timeOut = 100, expectedExceptions = ThreadTimeoutException.class)
    public void runTimeout2() {
        try {
            Thread.sleep(101);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("runTimeout2");
    }
}
