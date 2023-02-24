package com.chrome;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class DockerWithChrome3 {

    @Test
    public static void test3() throws MalformedURLException {

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setBrowserName("chrome");
        //capabilities.setPlatform(Platform.LINUX);

        URL url = new URL("http://localhost:4444/wd/hub");

        RemoteWebDriver driver = new RemoteWebDriver(url, capabilities);

        // Launch website
        driver.navigate().to("http://www.google.com/");

        // Click on the search text box and send value
        driver.findElement(By.id("lst-ib")).sendKeys("javatpoint tutorials");

        // Click on the search button
        driver.findElement(By.name("btnK")).click();

        //close Chrome
        driver.close();

    }
}