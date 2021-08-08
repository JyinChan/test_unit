package junit.runWith;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({AClass.class, BClass.class, DClass.class})
public class RunWithTest {
}
