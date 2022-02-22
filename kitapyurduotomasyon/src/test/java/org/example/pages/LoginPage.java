package org.example.pages;

import org.example.definitions.Functions;
import org.openqa.selenium.By;

public class LoginPage {
    Functions functions;
    public LoginPage(){
        functions=new Functions();
    }

    public void login(){
        functions.click(By.xpath("//*[@id='header-top']/div/div[1]/div[1]/a"));
        functions.waitBySeconds(2);
        functions.sendKeys(By.id("login-email"),"batuhan5100@gmail.com");
        functions.waitBySeconds(3);
        functions.findElement(By.id("login-password")).sendKeys("Batuhan1");
        functions.waitBySeconds(2);
        functions.click(By.cssSelector(".ky-btn.ky-btn-orange.w-100.ky-login-btn"));



    }



}
