package page;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import page.Common;

import java.util.Locale;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertTrue;
import static page.PageObject.*;

@RunWith(Parameterized.class)
public class QuestionsAboutImportantText {

    private  WebDriver driver;
    public static By questions;
    public static By answer;
    private final String text;

    //private final String browser = "Chrome";
    private final String browser = "Firefox";



    public QuestionsAboutImportantText(By questions, By answer, String text) {


        this.questions = questions;
        this.answer = answer;
        this.text = text;
    }



    @Parameterized.Parameters // добавили аннотацию
    public static Object[][] getFields() {
        return new Object[][]{
                {question1, answer1, "Сутки — 400 рублей. Оплата курьеру — наличными или картой."},
                {question2, answer2, "Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим."},
                {question3, answer3, "Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30."},
                {question4, answer4, "Только начиная с завтрашнего дня. Но скоро станем расторопнее."},
                {question5, answer5, "Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010."},
                {question6, answer6, "Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится."},
                {question7, answer7, "Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои."},
                {question8, answer8, "Да, обязательно. Всем самокатов! И Москве, и Московской области."},

        };
    }



    @Before
    public void before() {
        driver = Common.browser(browser);
        driver.get("https://qa-scooter.praktikum-services.ru/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(yesСookiesButton).click();
    }



    @Test
    public void questionsAboutImportantText() {
        WebElement questionQ = driver.findElement(questions);
        questionQ.click();
        assertTrue(driver.findElement(answer).getText().contains(text));
    }



   @After
   public void teardown() {
       driver.quit();
   }
}

