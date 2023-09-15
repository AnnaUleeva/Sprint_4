package ru.praktikum;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class BaseTest {
    WebDriver webDriver;

    @Before
    public void setUp() {
        String browserName = System.getProperty("browserName");

        webDriver = WebDriverFactory.get(browserName);
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    @After
    public void clean() {
        webDriver.quit();
    }
}