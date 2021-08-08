package junit.runWith;

import junit.framework.TestCase;
import org.junit.Before;

public class BClass extends TestCase {

    @Override
    public void setUp() {
        System.out.println("before BClass");
    }

    public void test1() {
        System.out.println("Run BCase test1 " + Thread.currentThread().getName());
    }

    public void test2() {
        System.out.println("Run BCase test2 " + Thread.currentThread().getName());
    }

    @Override
    public void tearDown() {
        System.out.println("tear down BClass");
    }
}
