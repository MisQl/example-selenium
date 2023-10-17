package org.example;

import io.cucumber.java.AfterAll;
import io.cucumber.java.BeforeAll;
import org.junit.platform.suite.api.ConfigurationParameter;
import org.junit.platform.suite.api.IncludeEngines;
import org.junit.platform.suite.api.SelectClasspathResource;
import org.junit.platform.suite.api.Suite;

import static io.cucumber.core.options.Constants.GLUE_PROPERTY_NAME;
import static io.cucumber.core.options.Constants.PLUGIN_PROPERTY_NAME;

@Suite
@IncludeEngines("cucumber")
@SelectClasspathResource("org/example")
@ConfigurationParameter(key = PLUGIN_PROPERTY_NAME, value = "pretty")
@ConfigurationParameter(key = GLUE_PROPERTY_NAME, value = "org.example")
public class RunCucumberTest {

    @BeforeAll
    public static void setUp() {
        SeleniumTestBase.setUp();
        Context.setWebDriver(SeleniumTestBase.getDriver());
    }

    @AfterAll
    public static void close() {
        SeleniumTestBase.close();
    }
}