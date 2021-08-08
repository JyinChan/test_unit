package junit;

import junit.framework.TestCase;

public class TestCaseTest extends TestCase {

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        System.out.println("Hello, i am setup");
    }

    public void test1() {
        System.out.println("Hello, i am TestCaseTest.test1");
    }

    public void test2() {
        System.out.println("Hello, i am TestCaseTest.test2");
    }

    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
        System.out.println("Hello, i am tearDown");
    }
}
