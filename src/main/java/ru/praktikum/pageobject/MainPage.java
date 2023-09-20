package ru.praktikum.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import static ru.praktikum.config.AppConfig.SCOOTER_APP_URL;

public class MainPage {
    WebDriver webDriver;

    public MainPage(WebDriver webDriver) {
        this.webDriver = webDriver;
        webDriver.get(SCOOTER_APP_URL);
    }

    //блок Вопросы о важном
    final By questionsBlock = By.xpath("//div[@class='Home_FourPart__1uthg']");
    //кнопка куки
    final By cookieButton = By.xpath("//button[@id = 'rcc-confirm-button']");
    //кнопка заказать
    final By orderButton = By.xpath("//button[@class='Button_Button__ra12g']");
    //блок с кнопкой заказать ниже на странице
    final By orderButtonDownBlock = By.xpath("//div[@class = 'Home_RoadMap__2tal_']");
    //кнопка заказать ниже на странице
    final By orderButtonDown = By.xpath("//button[@class= 'Button_Button__ra12g Button_Middle__1CSJM']");
    //блок с куки
    final By cookiesBlock = By.xpath("//div[@class = 'App_CookieConsent__1yUIN']");


    //метод перекидывает нас на область Вопросы о важном
    public void goToQuestions() {
        WebElement element = webDriver.findElement(questionsBlock);
        ((JavascriptExecutor) webDriver).executeScript("arguments[0].scrollIntoView();", element);
    }
    //метод перекидывает к нопке заказать внизу страницы
    public void goToOrderButtonDown() {
        WebElement element = webDriver.findElement(orderButtonDownBlock);
        ((JavascriptExecutor) webDriver).executeScript("arguments[0].scrollIntoView();", element);
    }

    //public void clickArrow(By arrow){
       // webDriver.findElement(arrow).click();
    //}
    //public boolean checkText(By text){
        //return webDriver.findElement(text).isDisplayed();
    //}
    //метод клика по галочкам
    public void clickArrow(int arrowNumber) {
        webDriver.findElement(By.xpath("//div[@id='accordion__heading-" + (arrowNumber - 1) +"']")).click();
    }
    //метод проверки текста под открывающейся галочкой
    public boolean checkText(int textNumber){
        return webDriver.findElement(By.xpath("//div[@id='accordion__panel-" + (textNumber - 1) +"']")).isDisplayed();
    }
    //клик по кнопке куки
    public void clickCookieButton(){
        new WebDriverWait(webDriver, Duration.ofSeconds(5)).until(ExpectedConditions.visibilityOfElementLocated(cookiesBlock));
        webDriver.findElement(cookieButton).click();
    }
    //клик по кнопке заказать
    public void clickOrderButton(String position) {
        if (position == "down") {
            goToOrderButtonDown();
            webDriver.findElement(orderButtonDown).click();
        } else {
            webDriver.findElement(orderButton).click();
        }
    }
    //клик по кнопке заказать 2, внизу страницы
    public void clickOrderButtonDown() {

        webDriver.findElement(orderButtonDown).click();
    }
}

