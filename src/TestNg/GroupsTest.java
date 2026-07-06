package TestNg;

import org.testng.annotations.Test;


public class GroupsTest {

    @Test(groups = {"smoke"})
    public void login() {
        System.out.println("Login Test");
    }

    @Test(groups = {"sanity"})
    public void search() {
        System.out.println("Search Test");
    }

    @Test(groups = {"regression"})
    public void payment() {
        System.out.println("Payment Test");
    }

    @Test(groups = {"smoke", "regression"})
    public void logout() {
        System.out.println("Logout Test");
    }
}
