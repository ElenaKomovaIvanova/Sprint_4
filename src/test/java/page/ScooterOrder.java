package page;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertTrue;
import static page.PageObject.*;

@RunWith(Parameterized.class)
public class ScooterOrder {
    private WebDriver driver;

    // ПАРАМЕТРИЗАЦИЯ
    private final String nameP;
    private final String surnameP;
    private final String addressP;
    private final String phoneP;
    private final String commentP;
    public static String browser;
    public static String buttonP;





    public ScooterOrder(String nameP, String surnameP, String addressP, String phoneP, String commentP, String browser, String buttonP) {
        this.nameP = nameP;
        this.surnameP = surnameP;
        this.addressP = addressP;
        this.phoneP = phoneP;
        this.commentP = commentP;
        this.browser = browser;
        this.buttonP = buttonP;

    }

    @Parameterized.Parameters // добавили аннотацию
    public static Object[][] getFields() {

        return new Object[][]{
                {"Елена", "Комова", "г.Москва, Делегатская, 56С", "+79222225555", "Созвониться", "Chrome", "1"},
                {"Никита", "Петров", "г.Москва, Бориса Голушкина", "+79226622555", "Оставить у двери", "Firefox", "2"},
        };
    }

    @Before
    public void before() {
        driver = Common.browser(browser);
        driver.get("https://qa-scooter.praktikum-services.ru/");
        driver.findElement(yesСookiesButton).click();
        Common.button(buttonP);
    }

    // форма заказа
    @Test
    public void formOrderFill() {


        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        WebElement name = driver.findElement(namePom);
        name.clear();
        name.sendKeys(nameP);

        WebElement surname = driver.findElement(surnamePom);
        surname.clear();
        surname.sendKeys(surnameP);

        WebElement address = driver.findElement(addressPom);
        address.clear();
        address.sendKeys(addressP);

        WebElement metro = driver.findElement(metroPom);
        metro.click();
        WebElement metroSt = driver.findElement(metroStPom);
        metroSt.click();
        WebElement phone = driver.findElement(phonePom);
        phone.clear();
        phone.sendKeys(phoneP);

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.findElement(nextButton).click();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebElement day = driver.findElement(dayPom);
        day.clear();
        day.click();
        WebElement dayChoice = driver.findElement(dayChoicePom);
        dayChoice.click();

        WebElement time = driver.findElement(timePom);
        time.click();
        WebElement timeChoice = driver.findElement(timeChoicePom);
        timeChoice.click();

        WebElement colorScooter = driver.findElement(colorScooterGreyPom);
        colorScooter.click();

        WebElement comment = driver.findElement(commentPom);
        comment.clear();
        comment.sendKeys(commentP);

        driver.findElement(orderButton).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.findElement(yesButton).click();


        WebElement status = driver.findElement(statusPom);
        String StatusS = status.getText();
        assertTrue(StatusS.contains("Заказ оформлен"));
        System.out.println("Тест выполнился. Результат оформления заказа: \n" +StatusS);

    }


    @After
    public void teardown() {
        driver.quit();
    }
}




