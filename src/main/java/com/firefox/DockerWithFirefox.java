package com.firefox;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class DockerWithFirefox {

    @Test
    public static void test() throws MalformedURLException {

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setBrowserName("firefox");
        //capabilities.setPlatform(Platform.LINUX);

        URL url = new URL("http://localhost:4444/wd/hub");

        RemoteWebDriver driver = new RemoteWebDriver(url, capabilities);

        System.out.println("Logging into Lambda Test Sign Up Page");
        driver.get("https://accounts.lambdatest.com/register");

        WebElement pageHeader= driver.findElement(By.xpath("//a[text()='Sign In']"));

        pageHeader.click();

        System.out.println("Clicked on the Sign In Button.");

        driver.close();
        System.out.println("The driver has been closed.");

    }
}