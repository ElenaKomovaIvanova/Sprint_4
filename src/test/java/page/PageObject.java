package page;

import org.openqa.selenium.By;

public class PageObject {
    // СПИСОК ЛОКАТОРОВ
    // Локатор кнопки Заказать наверху страницы
    public static By orderButtonUpper = By.xpath("//*[@id=\"root\"]/div/div/div[1]/div[2]/button[1]");
    // Локатор кнопки Заказать внизу страницы
    public static By orderButtonLower = By.xpath("//*[@id=\"root\"]/div/div/div[4]/div[2]/div[5]/button");
    // Локатор для кнопки да все привыкли
    public static By yesСookiesButton = By.id("rcc-confirm-button");
    // Локатор поля "Имя"
    public static By namePom = By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[1]/input");
    // Локатор поля "Фамилия"
    public static By surnamePom = By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[2]/input");
    // Локатор поля "Адрес"
    public static By addressPom = By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[3]/input");
    // Локатор для выбора конкретной станции метро
    public static By metroStPom = By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[4]/div/div[2]/ul/li[1]/button/div[2]");
    // Локатор поля "Станция метро"
    public static By metroPom = By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[4]/div/div/input");
    // Локатор поля "Телефон"
    public static By phonePom = By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[5]/input");
    // Локатор кнопки Далее на странице Для кого самокат
    public static By nextButton = By.xpath("//button[text()=\"Далее\"]");
    // Локатор поля "Когда привезти самокат"
    public static By dayPom = By.xpath("/html/body/div/div/div[2]/div[2]/div[1]/div/div/input");
    // Локатор для выбора конкретной даты начала аренды
    public static By dayChoicePom = By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[1]/div[2]/div[2]/div/div/div[2]/div[2]/div[5]/div[1]");
    // Локатор поля "Срок аренды"
    public static By timePom = By.xpath("/html/body/div/div/div[2]/div[2]/div[2]/div[1]/div[1]");
    // Локатор для выбора конкретного срока аренды
    public static By timeChoicePom = By.xpath("/html/body/div/div/div[2]/div[2]/div[2]/div[2]/div[6]");
    // Локатор поля "Цвет самоката серый"
    public static By colorScooterGreyPom = By.id("grey");
    // Локатор поля "Цвет самоката черный"
    public static By colorScooterBlackPom = By.id("black");
    // Локатор поля "Комментарий для курьера"
    public static By commentPom = By.xpath("/html/body/div/div/div[2]/div[2]/div[4]/input");
    // Локатор кнопки Заказать на странице Про аренду
    public static By orderButton = By.xpath("//*[@id=\"root\"]/div/div[2]/div[3]/button[2]");
    // Локатор кнопки Да
    public static By yesButton = By.xpath(".//button[text()=\"Да\"]");
    // Локатор для статуса
    public static By statusPom = By.xpath("/html/body/div/div/div[2]/div[5]/div[1]");

}
