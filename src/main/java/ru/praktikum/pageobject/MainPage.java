package ru.praktikum.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import static ru.praktikum.config.AppConfig.SCOOTER_APP_URL;

public class MainPage {
    WebDriver webDriver;

    public MainPage(WebDriver webDriver) {
        this.webDriver = webDriver;
        webDriver.get(SCOOTER_APP_URL);
    }


    //блок Вопросы о важном
    final By questionsBlock = By.xpath("//div[@class='Home_FourPart__1uthg']");
    //стрелочка один
    final By arrowOne = By.xpath("//div[@id='accordion__heading-0']");
    //текст под стрелкой 1
    final By textOne = By.xpath("//div[@id='accordion__panel-0']");
    //стрелочка два
    final By arrowTwo = By.xpath("//div[@id='accordion__heading-1']");
    //текст под стрелкой 2
    final By textTwo = By.xpath("//div[@id='accordion__panel-1']");
    //стрелочка три
    final By arrowThree = By.xpath("//div[@id = 'accordion__heading-2']");
    //текст под стрелкой 3
    final By textThree = By.xpath("//div[@id = 'accordion__panel-2']");
    //стрелочка четыре
    final By arrowFour = By.xpath("//div[@id = 'accordion__heading-3']");
    //текст под стрелкой 4
    final By textFour = By.xpath("//div[@id = 'accordion__panel-3']");
    //стрелочка пять
    final By arrowFive = By.xpath("//div[@id = 'accordion__heading-4']");
    //текст под стрелкой 5
    final By textFive = By.xpath("//div[@id = 'accordion__panel-4']");
    //стрелочка шесть
    final By arrowSix = By.xpath("//div[@id = 'accordion__heading-5']");
    //текст под стрелкой 6
    final By textSix = By.xpath("//div[@id = 'accordion__panel-5']");
    //стрелочка семь
    final By arrowSeven = By.xpath("//div[@id = 'accordion__heading-6']");
    //текст под стрелкой 7
    final By textSeven = By.xpath("//div[@id = 'accordion__panel-6']");
    //стрелочка восемь
    final By arrowEight = By.xpath("//div[@id = 'accordion__heading-7']");
    //текст под стрелкой 7
    final By textEight = By.xpath("//div[@id = 'accordion__panel-7']");
    final By orderButton = By.xpath("//button[@class='Button_Button__ra12g']");


    //метод переидывает нас на область Вопросы о важном
    public void goToQuestions() {
        WebElement element = webDriver.findElement(questionsBlock);
        ((JavascriptExecutor) webDriver).executeScript("arguments[0].scrollIntoView();", element);
    }

    //клик по первой галочке
    public void clickArrowOne() {
        webDriver.findElement(arrowOne).click();
    }

    //текст открывающийся под первой галочкой
    public boolean checkTextOne() {
        return webDriver.findElement(textOne).isDisplayed();
    }
    //клик по второй галочке
    public void clickArrowTwo() {
        webDriver.findElement(arrowTwo).click();
    }
    //текст открывающийся под второй галочкой
    public boolean checkTextTwo() {
        return webDriver.findElement(textTwo).isDisplayed();
    }
    //клик по третьей галочке
    public void clickArrowThree() {
        webDriver.findElement(arrowThree).click();
    }
    //текст открывающийся под третьей галочкой
    public boolean checkTextThree() {
        return webDriver.findElement(textThree).isDisplayed();
    }
    //клик по четвертой галочке
    public void clickArrowFour() {
        webDriver.findElement(arrowFour).click();
    }
    //текст открывающийся под четвертой галочкой
    public boolean checkTextFour() {
        return webDriver.findElement(textFour).isDisplayed();
    }
    //клик по пятой галочке
    public void clickArrowFive() {
        webDriver.findElement(arrowFive).click();
    }
    //текст открывающийся под пятой галочкой
    public boolean checkTextFive() {
        return webDriver.findElement(textFive).isDisplayed();
    }
    //клик по шестой галочке
    public void clickArrowSix() {
        webDriver.findElement(arrowSix).click();
    }
    //текст открывающийся под шестой галочкой
    public boolean checkTextSix() {
        return webDriver.findElement(textSix).isDisplayed();
    }
    //клик по седьмой галочке
    public void clickArrowSeven() {
        webDriver.findElement(arrowSeven).click();
    }
    //текст открывающийся под седьмой галочкой
    public boolean checkTextSeven() {
        return webDriver.findElement(textSeven).isDisplayed();
    }
    //клик по восьмой галочке
    public void clickArrowEight() {
        webDriver.findElement(arrowEight).click();
    }
    //текст открывающийся под восьмой галочкой
    public boolean checkTextEight() {
        return webDriver.findElement(textEight).isDisplayed();
    }
//клик по кнопке заказать
    public void clickOrderButton() {
        webDriver.findElement(orderButton).click();
    }
}

