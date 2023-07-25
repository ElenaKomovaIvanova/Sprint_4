package pageobject;

import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertTrue;

public class QuestionsAboutImportantText {



    @After
    public void tearDown() {
        driver.quit();
    }



    private WebDriver driver;

    @Test
    public void QuestionsAboutImportant_Text_Firefox() {
        FirefoxOptions options = new FirefoxOptions();
        driver = new FirefoxDriver(options);
        options.addArguments("-headless");
        driver.get("https://qa-scooter.praktikum-services.ru/");

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.findElement(By.id("rcc-confirm-button")).click();
        WebElement q1 = driver.findElement(By.id("accordion__heading-0"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", q1);

        q1.click();
        assertTrue(driver.findElement(By.id("accordion__panel-0")).getText().contains("Сутки — 400 рублей. Оплата курьеру — наличными или картой."));


        WebElement q2 = driver.findElement(By.id("accordion__heading-1"));
        q2.click();
        assertTrue(driver.findElement(By.id("accordion__panel-1")).getText().contains("Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим."));

        WebElement q3 = driver.findElement(By.id("accordion__heading-2"));
        q3.click();
        assertTrue(driver.findElement(By.id("accordion__panel-2")).getText().contains("Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30."));

        WebElement q4 = driver.findElement(By.id("accordion__heading-3"));
        q4.click();
        assertTrue(driver.findElement(By.id("accordion__panel-3")).getText().contains("Только начиная с завтрашнего дня. Но скоро станем расторопнее."));

        WebElement q5 = driver.findElement(By.id("accordion__heading-4"));
        q5.click();
        assertTrue(driver.findElement(By.id("accordion__panel-4")).getText().contains("Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010."));

        WebElement q6 = driver.findElement(By.id("accordion__heading-5"));
        q6.click();
        assertTrue(driver.findElement(By.id("accordion__panel-5")).getText().contains("Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится."));

        WebElement q7 = driver.findElement(By.id("accordion__heading-6"));
        q7.click();
        assertTrue(driver.findElement(By.id("accordion__panel-6")).getText().contains("Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои."));

        WebElement q8= driver.findElement(By.id("accordion__heading-7"));
        q8.click();
        assertTrue(driver.findElement(By.id("accordion__panel-7")).getText().contains("Да, обязательно. Всем самокатов! И Москве, и Московской области."));

    }
    @Test
    public void QuestionsAboutImportant_Text_Chrome() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--no-sandbox", "--headless", "--disable-dev-shm-usage");
        driver = new ChromeDriver(options);
        driver.get("https://qa-scooter.praktikum-services.ru/");

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.findElement(By.id("rcc-confirm-button")).click();
        WebElement q1 = driver.findElement(By.id("accordion__heading-0"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", q1);
        q1.click();
        assertTrue(driver.findElement(By.id("accordion__panel-0")).getText().contains("Сутки — 400 рублей. Оплата курьеру — наличными или картой."));


        WebElement q2 = driver.findElement(By.id("accordion__heading-1"));
        q2.click();
        assertTrue(driver.findElement(By.id("accordion__panel-1")).getText().contains("Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим."));

        WebElement q3 = driver.findElement(By.id("accordion__heading-2"));
        q3.click();
        assertTrue(driver.findElement(By.id("accordion__panel-2")).getText().contains("Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30."));

        WebElement q4 = driver.findElement(By.id("accordion__heading-3"));
        q4.click();
        assertTrue(driver.findElement(By.id("accordion__panel-3")).getText().contains("Только начиная с завтрашнего дня. Но скоро станем расторопнее."));

        WebElement q5 = driver.findElement(By.id("accordion__heading-4"));
        q5.click();
        assertTrue(driver.findElement(By.id("accordion__panel-4")).getText().contains("Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010."));

        WebElement q6 = driver.findElement(By.id("accordion__heading-5"));
        q6.click();
        assertTrue(driver.findElement(By.id("accordion__panel-5")).getText().contains("Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится."));

        WebElement q7 = driver.findElement(By.id("accordion__heading-6"));
        q7.click();
        assertTrue(driver.findElement(By.id("accordion__panel-6")).getText().contains("Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои."));

        WebElement q8= driver.findElement(By.id("accordion__heading-7"));
        q8.click();
        assertTrue(driver.findElement(By.id("accordion__panel-7")).getText().contains("Да, обязательно. Всем самокатов! И Москве, и Московской области."));

    }
}

