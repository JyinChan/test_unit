package junit.runWith;

import junit.framework.TestCase;
import org.junit.Before;

public class AClass extends TestCase {

    @Override
    public void setUp() {
        System.out.println("before AClass");
    }

    public void test1() {
        System.out.println("Run ACase test1 " + Thread.currentThread().getName());
    }

}