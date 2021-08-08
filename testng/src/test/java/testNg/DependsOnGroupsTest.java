package testNg;

import org.testng.annotations.Test;

public class DependsOnGroupsTest {

    @Test(dependsOnGroups = {"group1"})
    public void runMainTest() {
        System.out.println("runMainTest");
    }

    @Test(groups = "group1")
    public void group1() {
        System.out.println("group1");
    }

    @Test(groups = "group2")
    public void group2() {
        System.out.println("group2");
    }
}
