package junit.runWith;

import junit.framework.Test;
import junit.framework.TestSuite;

public class MySuite extends TestSuite {

    public static Test suite() {
        TestSuite testSuite = new TestSuite();
        testSuite.addTestSuite(AClass.class);
        testSuite.addTestSuite(BClass.class);
        return testSuite;
    }

}
