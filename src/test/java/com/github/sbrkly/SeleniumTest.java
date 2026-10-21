package com.github.sbrkly;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SeleniumTest {
    @Test
    void Setup() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://wikipedia.org");
    }

}
