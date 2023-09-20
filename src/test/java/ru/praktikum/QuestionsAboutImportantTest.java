package ru.praktikum;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.By;
import ru.praktikum.pageobject.MainPage;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)

public class QuestionsAboutImportantTest extends BaseTest {
    static MainPage mainPage;
    private final int arrowNumber;
    private final int textNumber;
    private final boolean expected;

    @Before
    public void init() {
        mainPage = new MainPage(webDriver);
    }

    public QuestionsAboutImportantTest(int arrowNumber, int textNumber, boolean expected) {
        this.arrowNumber = arrowNumber;
        this.textNumber = textNumber;
        this.expected = expected;
    }


    @Parameterized.Parameters
    public static Object[][] getTestData() {
        return new Object[][]{
                {1, 1, true},
                {2, 2, true},
                {3, 3, true},
                {4, 4, true},
                {5, 5, true},
                {6, 6, true},
                {7, 7, true  }
        };
    }


    @Test
    public void itemClick() {
        mainPage.goToQuestions();
        mainPage.clickArrow(arrowNumber);
        assertEquals(mainPage.checkText(textNumber), expected);
    }

//    @Test
//    public void secondItemClick() {
//        mainPage.goToQuestions();
//        mainPage.clickArrowTwo();
//        assertTrue(mainPage.checkTextTwo());
//    }
//
//    @Test
//    public void threeItemClick() {
//        mainPage.goToQuestions();
//        mainPage.clickArrowThree();
//        mainPage.clickArrow(3);
//        assertTrue(mainPage.checkTextThree());
//    }
//
//    @Test
//    public void fourItemClick() {
//        mainPage.goToQuestions();
//        mainPage.clickArrowFour();
//        assertTrue(mainPage.checkTextFour());
//    }
//
//    @Test
//    public void fiveItemClick() {
//        mainPage.goToQuestions();
//        mainPage.clickArrowFive();
//        assertTrue(mainPage.checkTextFive());
//    }
//
//    @Test
//    public void sixItemClick() {
//        mainPage.goToQuestions();
//        mainPage.clickArrowSix();
//        assertTrue(mainPage.checkTextSix());
//    }
//
//    @Test
//    public void sevenItemClick() {
//        mainPage.goToQuestions();
//        mainPage.clickArrowSeven();
//        assertTrue(mainPage.checkTextSeven());
//    }
//
//    @Test
//    public void eightItemClick() {
//        mainPage.goToQuestions();
//        mainPage.clickArrowEight();
//        assertTrue(mainPage.checkTextEight());
//    }
}

