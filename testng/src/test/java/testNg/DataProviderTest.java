package testNg;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest {

    @Test(dataProvider = "provider1", dataProviderClass = MyDataProvider.class)
    public void test(int id, String name) {
        System.out.println("Thread " + Thread.currentThread().getName() + ", No:" + id + ", Name:" + name);
    }
}

class MyDataProvider {

    @DataProvider(name = "provider1", parallel = true)
    public static Object[][] getIdAndName() {
        return new Object[][]{{1, "Java"}, {2, "C/C++"}, {3, "Python"}};
    }
}
