package org.example;

import org.example.steps.LoginPage;
import org.junit.jupiter.api.Test;

public class LoginTest extends SeleniumTestBase {

    LoginPage loginPage = new LoginPage(driver);

    @Test
    void loginAsDefaultMandator() {
        // given
        var url = "";
        var username = "";
        var password = "";

        // when
        loginPage.openPage(url);
        loginPage.loginAsDefaultMandator(username, password);

        // then
        // todo
    }
}
