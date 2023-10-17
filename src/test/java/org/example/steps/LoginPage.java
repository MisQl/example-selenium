package org.example.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.example.Context;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

public class LoginPage {

    @Given("Open login page")
    public void openPage() {
        var driver = Context.getDriver();
        driver.get("");
    }

    @When("Login as {string} user and set a default mandator")
    public void loginAs(String username) {
        var driver = Context.getDriver();
        var password = getPassword(username);
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

    private String getPassword(String username) {
        return switch (username) {
            case "username" -> "password";
            default -> null;
        };
    }
}
