package org.example.test;

import org.example.driver.BaseTest;
import org.example.pages.LoginPage;
import org.example.pages.TransitionPage;
import org.junit.Test;

public class TransitionTest extends BaseTest {

    @Test
    public void transitionTest(){
        LoginPage loginPage=new LoginPage();
        TransitionPage transitionPage=new TransitionPage();

        loginPage.login();
        transitionPage.transition();
    }
}
