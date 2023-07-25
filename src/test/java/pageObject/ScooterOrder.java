package pageobject;

import org.junit.After;
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

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertTrue;

@RunWith(Parameterized.class)
public class ScooterOrder {
    private WebDriver driver;
    // СПИСОК ЛОКАТОРОВ
    // Локатор кнопки Заказать наверху страницы
    private By orderButtonUpper = By.xpath("//*[@id=\"root\"]/div/div/div[1]/div[2]/button[1]");
    // Локатор кнопки Заказать внизу страницы
    private By orderButtonLower = By.xpath("//*[@id=\"root\"]/div/div/div[4]/div[2]/div[5]/button");
    // Локатор для кнопки да все привыкли
    private By yesСookiesButton = By.id("rcc-confirm-button");
    // Локатор поля "Имя"
    private By namePom = By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[1]/input");
    // Локатор поля "Фамилия"
    private By surnamePom = By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[2]/input");
    // Локатор поля "Адрес"
    private By addressPom = By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[3]/input");
    // Локатор для выбора конкретной станции метро
    private By metroStPom = By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[4]/div/div[2]/ul/li[1]/button/div[2]");
    // Локатор поля "Станция метро"
    private By metroPom = By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[4]/div/div/input");
    // Локатор поля "Телефон"
    private By phonePom = By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[5]/input");
    // Локатор кнопки Далее на странице Для кого самокат
    private By nextButton = By.xpath("//button[text()=\"Далее\"]");
    // Локатор поля "Когда привезти самокат"
    private By dayPom = By.xpath("/html/body/div/div/div[2]/div[2]/div[1]/div/div/input");
    // Локатор для выбора конкретной даты начала аренды
    private By dayChoicePom = By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[1]/div[2]/div[2]/div/div/div[2]/div[2]/div[5]/div[1]");
    // Локатор поля "Срок аренды"
    private By timePom = By.xpath("/html/body/div/div/div[2]/div[2]/div[2]/div[1]/div[1]");
    // Локатор для выбора конкретного срока аренды
    private By timeChoicePom = By.xpath("/html/body/div/div/div[2]/div[2]/div[2]/div[2]/div[6]");
    // Локатор поля "Цвет самоката серый"
    private By colorScooterGreyPom = By.id("grey");
    // Локатор поля "Цвет самоката черный"
    private By colorScooterBlackPom = By.id("black");
    // Локатор поля "Комментарий для курьера"
    private By commentPom = By.xpath("/html/body/div/div/div[2]/div[2]/div[4]/input");
    // Локатор кнопки Заказать на странице Про аренду
    private By orderButton = By.xpath("//*[@id=\"root\"]/div/div[2]/div[3]/button[2]");
    // Локатор кнопки Да
    private By yesButton = By.xpath(".//button[text()=\"Да\"]");

    // ПАРАМЕТРИЗАЦИЯ
    private final String nameP;
    private final String surnameP;
    private final String addressP;
    private final String phoneP;
    private final String commentP;




    public ScooterOrder(String nameP, String surnameP, String addressP, String phoneP, String commentP) {
        this.nameP = nameP;
        this.surnameP = surnameP;
        this.addressP = addressP;
        this.phoneP = phoneP;
        this.commentP = commentP;
    }

    @Parameterized.Parameters // добавили аннотацию
    public static Object[][] getSumData() {
        return new Object[][] {
                { "Елена", "Комова", "г.Москва, Делегатская, 56С", "+79222225555","Созвониться" },
                { "Никита", "Петров", "г.Москва, Бориса Голушкина", "+79226622555","Оставить у двери"},
        };
    }






    @Test
    public void OrderButtom_Upper_Click_Chrome() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--no-sandbox", "--headless", "--disable-dev-shm-usage");
        driver = new ChromeDriver(options);
        driver.get("https://qa-scooter.praktikum-services.ru/");
        driver.findElement(yesСookiesButton).click();
        driver.findElement(orderButtonUpper).click();
    }
    @Test
    public void OrderButtom_Upper_Click_Firefox() {
        FirefoxOptions options = new FirefoxOptions();
        driver = new FirefoxDriver(options);
        driver.get("https://qa-scooter.praktikum-services.ru/");
        driver.findElement(yesСookiesButton).click();
        driver.findElement(orderButtonUpper).click();
    }

    @Test
    public void OrderButtom_Lower_Click_Chrome() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--no-sandbox", "--headless", "--disable-dev-shm-usage");
        driver = new ChromeDriver(options);
        driver.get("https://qa-scooter.praktikum-services.ru/");
        driver.findElement(yesСookiesButton).click();
        driver.findElement(orderButtonLower).click();
    }

    @Test
    public void OrderButtom_Lower_Click_Firefox() {
        FirefoxOptions options = new FirefoxOptions();
        driver = new FirefoxDriver(options);
        driver.get("https://qa-scooter.praktikum-services.ru/");
        driver.findElement(yesСookiesButton).click();
        driver.findElement(orderButtonLower).click();
    }
    // форма заказа в Chrome
    @Test
    public void FormOrderFill_Chrome() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--no-sandbox", "--headless", "--disable-dev-shm-usage");
        driver = new ChromeDriver(options);
        driver.get("https://qa-scooter.praktikum-services.ru/");
        driver.findElement(orderButtonUpper).click();

        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.findElement(By.id("rcc-confirm-button")).click();
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


        WebElement status = driver.findElement(By.xpath("/html/body/div/div/div[2]/div[5]/div[1]"));
        String StatusS = status.getText();
        assertTrue(StatusS.contains("Заказ оформлен"));
        System.out.println("Тест выполнился. Результат оформления заказа: \n" +StatusS);

    }

    // форма заказа в Firefox
    @Test
    public void FormOrderFill_Firefox() {
        FirefoxOptions options = new FirefoxOptions();
        driver = new FirefoxDriver(options);
        options.addArguments("-headless");
        driver.get("https://qa-scooter.praktikum-services.ru/");

        driver.findElement(orderButtonUpper).click();

        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.findElement(By.id("rcc-confirm-button")).click();
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


        WebElement status = driver.findElement(By.xpath("/html/body/div/div/div[2]/div[5]/div[1]"));
        String StatusS = status.getText();
        assertTrue(StatusS.contains("Заказ оформлен"));
        System.out.println("Тест выполнился. Результат оформления заказа: \n" +StatusS);

    }


    @After
    public void teardown() {
        driver.quit();
    }
}




