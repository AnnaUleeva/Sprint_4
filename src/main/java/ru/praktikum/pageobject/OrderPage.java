package ru.praktikum.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;

import java.time.Duration;

public class OrderPage {
    WebDriver webDriver;

    public OrderPage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    // инпут Имя
    final By inputName = By.xpath("//input[@class='Input_Input__1iN_Z Input_Responsible__1jDKN']");
    //инаут фамилия
    final By inputSurname = By.xpath("//input[@class='Input_Input__1iN_Z Input_Responsible__1jDKN']");
    //инпут Адрес
    final By inputAddress = By.xpath("//input[@class='Input_Input__1iN_Z Input_Responsible__1jDKN']");
    //инпут телефон
    final By inputPhone = By.xpath("//input[@class='Input_Input__1iN_Z Input_Responsible__1jDKN']");
    //инпут Станция метро
    final By inputMetro = By.xpath("//input[@class='select-search__input']");
    //выбор одной из станций в дропдауне
    final By inputMetroType = By.xpath(".//*[contains(text(),'Черкизовская')]");
    //кнопка Далее
    final By orderNextButton = By.xpath("//button[@class='Button_Button__ra12g Button_Middle__1CSJM']");
    //инпут с проставлением даты
    final By inputDatePicker = By.xpath("//input[@class = 'Input_Input__1iN_Z Input_Responsible__1jDKN']");
    //выбор даты сегодня
    final By inputDatePickerCurrentDay = By.xpath("//div[contains(@class, 'react-datepicker__day--today')]");
    //инпут срок аренды
    final By inputRentalPeriod = By.xpath("//div[@class = 'Dropdown-placeholder']");
    //пункт из дропдауна срока аренды
    final By inputPeriodDay = By.xpath("//div[@class = 'Dropdown-menu']/div[@class = 'Dropdown-option'][1]");
    //чекбокс "черный жемчуг" в поле цвет самоката
    final By checkBoxOne = By.xpath("//input[@class = 'Checkbox_Input__14A2w']");
    //инпут Комментарий
    final By inputComment = By.xpath("//input[@class = 'Input_Input__1iN_Z Input_Responsible__1jDKN']");
    //кнопка Заказать
    final By buttonCreateOrder = By.xpath("//button[@class = 'Button_Button__ra12g Button_Middle__1CSJM']");
    //модальное окно Хотите оформить заказ?
    final By modalAcceptCreateOrder = By.xpath("//div[@class = 'Order_Modal__YZ-d3']");
    final By overlayAcceptCreateOrder = By.xpath("//div[@class = 'Order_Overlay__3KW-T']");
    //кнопка Да в модалке подтверждения заказа
    final By buttonAcceptCreateOrder = By.xpath("//button[@class = 'Button_Button__ra12g Button_Middle__1CSJM']");
    //By.xpath("//button[contains(text(),'Да')]");
    //сообщение об оформлении заказа
    final By successMessageTitle = By.xpath("//div[@class = 'Order_ModalHeader__3FDaJ']");


    //метод добавления значения в поле Имя
    public void sendKeysInputName(String name) {
        webDriver.findElement(inputName).sendKeys(name);
    }

    //метод добавления значения в поле фамилия
    public void sendKeysInputSurName(String surname) {

        webDriver.findElement(inputSurname).sendKeys(surname);
    }

    //метод добавления значения в поле Адрес
    public void sendKeysInputAddress(String address) {

        webDriver.findElement(inputAddress).sendKeys(address);
    }

    //клик по полю Станция метро
    public void clickInputMetro() {

        webDriver.findElement(inputMetro).click();
    }

    //выбор станции метро в поле
    public void clickNameInputMetro() {
        waitMetroVisible(inputMetroType);
        webDriver.findElement(inputMetroType).click();
    }

    //добавление телефона
    public void sendKeysInputPhone(String phone) {

        webDriver.findElement(inputPhone).sendKeys(phone);
    }

    //клик по кнопке Далее
    public void clickOrderNextButton() {
        webDriver.findElement(orderNextButton).click();
    }

    //клик по полю Когда привезти самокат
    public void clickInputDatePicker() {
        webDriver.findElement(inputDatePicker).click();
    }

    //клик по сегодняшнему дню
    public void clickCurrentDay() {
        new WebDriverWait(webDriver, Duration.ofSeconds(3)).until(ExpectedConditions.visibilityOfElementLocated(inputDatePickerCurrentDay));
        webDriver.findElement(inputDatePickerCurrentDay).click();
    }

    //клик по чекбоксу "черный жемчуг"
    public void clickCheckBoxOne() {
        webDriver.findElement(checkBoxOne).click();
    }

    //заполнить поле Комментарий
    public void sendKeysInputComment(String comment) {
        webDriver.findElement(inputComment).sendKeys(comment);
    }


    //метод для ожидания списка со станциями
    public void waitMetroVisible(By element) {
        new WebDriverWait(webDriver, Duration.ofSeconds(3)).until(ExpectedConditions.elementToBeClickable(element));
    }

    //метод открытия списка срока аренды
    public void clickInputRentalPeriod() {

        webDriver.findElement(inputRentalPeriod).click();
    }

    //метод выбора срока аренды
    public void clickPeriodDay() {

        webDriver.findElement(inputPeriodDay).click();
    }

    //клик по кнопке Заказать на странице Про аренду
    public void clickButtonCreateOrder() {
        new WebDriverWait(webDriver, Duration.ofSeconds(3)).until(ExpectedConditions.visibilityOfElementLocated(buttonCreateOrder));
        webDriver.findElement(buttonCreateOrder).click();
    }

    //метод клика по кнопке Да в модалке подтверждения заказа
    public void clickButtonAcceptCreateOrder() {
        new WebDriverWait(webDriver, Duration.ofSeconds(5)).until(ExpectedConditions.elementToBeClickable(buttonAcceptCreateOrder));
        WebElement element = webDriver.findElement(buttonAcceptCreateOrder);
        ((JavascriptExecutor) webDriver).executeScript("arguments[0].click();", element);
    }

    //метод проверяет выход модального окна с ожидаемым текстом
    public boolean checkSuccessMessageTitle() {
        new WebDriverWait(webDriver, Duration.ofSeconds(3)).until(ExpectedConditions.visibilityOfElementLocated(successMessageTitle));
        return webDriver.findElement(successMessageTitle).isDisplayed();
    }
}

