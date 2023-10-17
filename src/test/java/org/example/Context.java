package org.example;

import org.openqa.selenium.WebDriver;

public class Context {

    private static WebDriver webDriver;

    public static WebDriver getWebDriver() {
        return webDriver;
    }

    public static void setWebDriver(WebDriver webDriver) {
        Context.webDriver = webDriver;
    }
}
