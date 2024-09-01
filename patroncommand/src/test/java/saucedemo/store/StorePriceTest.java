package saucedemo.store;
import org.junit.jupiter.api.Test;

import saucedemo.actions.LoginAction;
import saucedemo.hooks.TestBase;

public class StorePriceTest extends TestBase {

    @Test
    public void validatePrice(){
        LoginAction.login(driver, "standard_user","secret_sauce");
    }

}
