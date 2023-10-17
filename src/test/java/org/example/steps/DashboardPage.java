package org.example.steps;

import io.cucumber.java.en.Then;
import org.example.Context;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DashboardPage {

    @Then("User has been logged")
    public void userHasBeenLogged() {
        var driver = Context.getWebDriver();
        var wait = new WebDriverWait(driver, Duration.ofSeconds(2));
        var element = driver.findElement(By.id("logout"));
        wait.until(d -> element.isDisplayed());
    }
}
