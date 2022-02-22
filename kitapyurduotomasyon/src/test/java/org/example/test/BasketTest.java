package org.example.test;

import org.example.driver.BaseTest;
import org.example.pages.BasketPage;
import org.example.pages.LoginPage;
import org.example.pages.SearchFavAddPage;
import org.example.pages.TransitionPage;
import org.junit.Test;

public class BasketTest extends BaseTest {

    @Test
    public void basket() {

        BasketPage basketPage = new BasketPage();
        basketPage.basket();
    }
}
