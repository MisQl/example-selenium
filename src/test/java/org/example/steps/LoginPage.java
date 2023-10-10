package org.example.steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class LoginPage {

    private final WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void openPage(String url) {
        driver.get(url);
    }

    public void loginAsDefaultMandator(String username, String password) {
        driver.findElement(By.id("userName")).click();
        driver.findElement(By.id("userName")).sendKeys(username);
        driver.findElement(By.id("password")).click();
        driver.findElement(By.id("password")).sendKeys(password);
        driver.findElement(By.cssSelector("#loginWrapper > .ng-valid")).click();
        driver.findElement(By.cssSelector("button")).click();
        var element1 = driver.findElement(By.cssSelector("button"));
        var builder1 = new Actions(driver);
        builder1.moveToElement(element1).perform();
        var element2 = driver.findElement(By.tagName("body"));
        var builder2 = new Actions(driver);
        builder2.moveToElement(element2, 0, 0).perform();
        driver.findElement(By.id("activateMandant")).click();
    }
}
