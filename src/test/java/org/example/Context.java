package org.example;

import org.openqa.selenium.WebDriver;

public class Context {

    static {
        SeleniumTestBase.beforeAll();
    }

    public static WebDriver getDriver() {
        return SeleniumTestBase.driver;
    }
}
