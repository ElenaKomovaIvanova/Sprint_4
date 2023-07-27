package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import static page.PageObject.orderButtonLower;
import static page.PageObject.orderButtonUpper;


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

    public static void button(String button) {
        if (button.equalsIgnoreCase("1")) {
            driver.findElement(orderButtonUpper).click();
        } else if ((button.equalsIgnoreCase("2"))) {
           driver.findElement(orderButtonLower).click();
        }
   }

}
