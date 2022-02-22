package org.example.test;

import org.example.driver.BaseTest;
import org.example.pages.LoginPage;
import org.example.pages.SearchFavAddPage;
import org.junit.Test;

public class SearchFavAddTest extends BaseTest {

    @Test
    public void searchTest() {
        SearchFavAddPage searchFavAddPage = new SearchFavAddPage();
        LoginPage loginPage=new LoginPage();

        loginPage.login();
        searchFavAddPage.seach();
        searchFavAddPage.fav();

    }

}
