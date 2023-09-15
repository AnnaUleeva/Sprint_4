package ru.praktikum;

import org.junit.Before;
import org.junit.Test;
import ru.praktikum.pageobject.MainPage;
import ru.praktikum.pageobject.OrderPage;

import static org.junit.Assert.assertTrue;

public class CreateOrderTest extends BaseTest {
    MainPage mainPage;
    OrderPage orderPage;

    @Before
    public void init() {
        mainPage = new MainPage(webDriver);
        orderPage = new OrderPage(webDriver);
    }

    @Test
    public void firstCreateOrder() {
        mainPage.clickOrderButton();
        orderPage.sendKeysInputName();
        orderPage.sendKeysInputSurName();
        orderPage.sendKeysInputAddress();
        orderPage.clickInputMetro();
        orderPage.clickNameInputMetro();
        orderPage.sendKeysInputPhone();
        orderPage.clickOrderNextButton();
        orderPage.clickInputDatePicker();
        orderPage.clickCurrentDay();
        orderPage.clickInputRentalPeriod();
        orderPage.clickPeriodDay();
        orderPage.clickCheckBoxOne();
        orderPage.sendKeysInputComment();
        orderPage.clickButtonCreateOrder();
        orderPage.clickButtonAcceptCreateOrder();
        assertTrue(orderPage.checkSuccessMessageTitle());
    }
}
