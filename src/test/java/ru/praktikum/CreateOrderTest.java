package ru.praktikum;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import ru.praktikum.pageobject.MainPage;
import ru.praktikum.pageobject.OrderPage;

import static org.junit.Assert.assertTrue;
@RunWith(Parameterized.class)
public class CreateOrderTest extends BaseTest {
    MainPage mainPage;
    OrderPage orderPage;
    private final String positionButton;
    private final String name;
    private final String surname;
    private final String address;
    private final String phone;
    private final String comment;

    @Before
    public void init() {
        mainPage = new MainPage(webDriver);
        orderPage = new OrderPage(webDriver);
    }
    public CreateOrderTest(
            String positionButton,
            String name,
            String surname,
            String address,
            String phone,
            String comment

    ) {
        this.positionButton = positionButton;
        this.name = name;
        this.surname = surname;
        this.address = address;
        this.phone = phone;
        this.comment = comment;

    }
    @Parameterized.Parameters
    public static Object[][] getTestData() {
        return new Object[][]{
                {"top", "Анна","Улеева","Петербургская","+79999999999","Хочу самокат"},
                {"down", "Федор","Морозов","Аграрная","+71111111111","Буду катать"},
        };
    }

    @Test
    public void firstCreateOrder() {
        mainPage.clickCookieButton();
        mainPage.clickOrderButton(positionButton);
        orderPage.sendKeysInputName(name);
        orderPage.sendKeysInputSurName(surname);
        orderPage.sendKeysInputAddress(address);
        orderPage.clickInputMetro();
        orderPage.clickNameInputMetro();
        orderPage.sendKeysInputPhone(phone);
        orderPage.clickOrderNextButton();
        orderPage.clickInputDatePicker();
        orderPage.clickCurrentDay();
        orderPage.clickInputRentalPeriod();
        orderPage.clickPeriodDay();
        orderPage.clickCheckBoxOne();
        orderPage.sendKeysInputComment(comment);
        orderPage.clickButtonCreateOrder();
        orderPage.clickButtonAcceptCreateOrder();
        assertTrue(orderPage.checkSuccessMessageTitle());
    }

//    @Test
//    public void secondCreateOrderWithButtonDown(){
//        mainPage.clickCookieButton();
//        mainPage.goToOrderButtonDown();
//        mainPage.clickOrderButtonDown();
//        orderPage.sendKeysInputName();
//        orderPage.sendKeysInputSurName();
//        orderPage.sendKeysInputAddress();
//        orderPage.clickInputMetro();
//        orderPage.clickNameInputMetro();
//        orderPage.sendKeysInputPhone();
//        orderPage.clickOrderNextButton();
//        orderPage.clickInputDatePicker();
//        orderPage.clickCurrentDay();
//        orderPage.clickInputRentalPeriod();
//        orderPage.clickPeriodDay();
//        orderPage.clickCheckBoxOne();
//        orderPage.sendKeysInputComment();
//        orderPage.clickButtonCreateOrder();
//        orderPage.clickButtonAcceptCreateOrder();
//        assertTrue(orderPage.checkSuccessMessageTitle());
//    }
}

