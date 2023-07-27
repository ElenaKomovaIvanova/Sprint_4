package pageobject;

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
import static pageObject.PageObject.*;

@RunWith(Parameterized.class)
public class QuestionsAboutImportantText {

    private  WebDriver driver;
    public static String browser;
    private final String question;
    private final String answer;
    private final String text;



    public QuestionsAboutImportantText(String browser, String question, String answer, String text) {
        this.browser = browser;
        this.question = question;
        this.answer = answer;
        this.text = text;
    }

    @Parameterized.Parameters // добавили аннотацию
    public static Object[][] getFields() {
        return new Object[][]{
                {"Firefox", "accordion__heading-0", "accordion__panel-0", "Сутки — 400 рублей. Оплата курьеру — наличными или картой."},
                {"Firefox", "accordion__heading-1", "accordion__panel-1", "Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим."},
                {"Firefox", "accordion__heading-2", "accordion__panel-2", "Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30."},
                {"Firefox", "accordion__heading-3", "accordion__panel-3", "Только начиная с завтрашнего дня. Но скоро станем расторопнее."},
                {"Firefox", "accordion__heading-4", "accordion__panel-4", "Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010."},
                {"Firefox", "accordion__heading-5", "accordion__panel-5", "Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится."},
                {"Firefox", "accordion__heading-6", "accordion__panel-6", "Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои."},
                {"Firefox", "accordion__heading-7", "accordion__panel-7", "Да, обязательно. Всем самокатов! И Москве, и Московской области."},
                {"Chrome", "accordion__heading-0", "accordion__panel-0", "Сутки — 400 рублей. Оплата курьеру — наличными или картой."},
                {"Chrome", "accordion__heading-1", "accordion__panel-1", "Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим."},
                {"Chrome", "accordion__heading-2", "accordion__panel-2", "Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30."},
                {"Chrome", "accordion__heading-3", "accordion__panel-3", "Только начиная с завтрашнего дня. Но скоро станем расторопнее."},
                {"Chrome", "accordion__heading-4", "accordion__panel-4", "Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010."},
                {"Chrome", "accordion__heading-5", "accordion__panel-5", "Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится."},
                {"Chrome", "accordion__heading-6", "accordion__panel-6", "Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои."},
                {"Chrome", "accordion__heading-7", "accordion__panel-7", "Да, обязательно. Всем самокатов! И Москве, и Московской области."},
        };
    }



    @Before
    public void before() {
        driver = pageobject.Common.browser(browser);
        driver.get("https://qa-scooter.praktikum-services.ru/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(yesСookiesButton).click();
    }



    @Test
    public void questionsAboutImportantText() {
        WebElement questionQ = driver.findElement(By.id(question));
        questionQ.click();
        assertTrue(driver.findElement(By.id(answer)).getText().contains(text));
    }



   @After
   public void teardown() {
       driver.quit();
   }
}

