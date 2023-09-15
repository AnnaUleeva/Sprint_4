package ru.praktikum;

import org.junit.Before;
import org.junit.Test;
import ru.praktikum.pageobject.MainPage;

import static org.junit.Assert.*;

public class QuestionsAboutImportantTest extends BaseTest {
    MainPage mainPage;

    @Before
    public void init() {
        mainPage = new MainPage(webDriver);
    }

    @Test
    public void FirstItemClick() {
        mainPage.goToQuestions();
        mainPage.clickArrowOne();
        assertTrue(mainPage.checkTextOne());
    }

    @Test
    public void SecondItemClick() {
        mainPage.goToQuestions();
        mainPage.clickArrowTwo();
        assertTrue(mainPage.checkTextTwo());
    }

    @Test
    public void ThreeItemClick() {
        mainPage.goToQuestions();
        mainPage.clickArrowThree();
        assertTrue(mainPage.checkTextThree());
    }

    @Test
    public void FourItemClick() {
        mainPage.goToQuestions();
        mainPage.clickArrowFour();
        assertTrue(mainPage.checkTextFour());
    }

    @Test
    public void FiveItemClick() {
        mainPage.goToQuestions();
        mainPage.clickArrowFive();
        assertTrue(mainPage.checkTextFive());
    }

    @Test
    public void SixItemClick() {
        mainPage.goToQuestions();
        mainPage.clickArrowSix();
        assertTrue(mainPage.checkTextSix());
    }

    @Test
    public void SevenItemClick() {
        mainPage.goToQuestions();
        mainPage.clickArrowSeven();
        assertTrue(mainPage.checkTextSeven());
    }

    @Test
    public void EightItemClick() {
        mainPage.goToQuestions();
        mainPage.clickArrowEight();
        assertTrue(mainPage.checkTextEight());
    }
}

