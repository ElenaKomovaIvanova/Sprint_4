package pageobject;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import static pageObject.PageObject.*;
import static pageobject.ScooterOrder.*;

public class Common {
    private static WebDriver driver;
    //public static String browser;
//
//    public Common(String browser) {
//    this.browser = browser;
//    }

    public static WebDriver browser(String browser) {
        if (browser.equalsIgnoreCase("Chrome")) {
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--no-sandbox", "--headless", "--disable-dev-shm-usage");
            driver = new ChromeDriver(options);
        } else {
            FirefoxOptions options = new FirefoxOptions();
            driver = new FirefoxDriver(options);
        }
        return driver;
    }

//    public static button(String button) {
//        if (buttonP.equalsIgnoreCase("1")) {
//            driver.findElement(orderButtonUpper).click();
//        } else if ((buttonP.equalsIgnoreCase("0"))) {
//            driver.findElement(orderButtonLower).click();
//        }
//        //return button;
//    }

}
