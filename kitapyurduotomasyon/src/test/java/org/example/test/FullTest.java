package org.example.test;

import org.example.driver.BaseTest;
import org.example.pages.BasketPage;
import org.example.pages.LoginPage;
import org.example.pages.SearchFavAddPage;
import org.example.pages.TransitionPage;
import org.junit.Test;

public class FullTest extends BaseTest {

    @Test
    public void fullTest(){
        LoginPage loginPage=new LoginPage();
        SearchFavAddPage searchFavAddPage=new SearchFavAddPage();
        TransitionPage transitionPage=new TransitionPage();
        BasketPage basketPage=new BasketPage();

        loginPage.login();
        searchFavAddPage.seach();
        searchFavAddPage.fav();
        transitionPage.transition();
        basketPage.basket();

    }
}
