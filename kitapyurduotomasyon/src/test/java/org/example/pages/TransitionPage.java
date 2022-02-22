package org.example.pages;

import org.example.definitions.Functions;
import org.example.driver.BaseTest;
import org.openqa.selenium.By;

public class TransitionPage extends BaseTest {

    Functions functions;
    public TransitionPage(){functions=new Functions();}


    public void transition(){
        functions.waitBySeconds(3);
        functions.click(By.xpath("//*[@id=\"mainNav\"]/div[1]/div/div[2]/a"));
        functions.waitBySeconds(2);
        functions.click(By.xpath("//*[@id=\"landing-point\"]/div[4]/a[2]/img"));
        functions.waitBySeconds(2);
        functions.click(By.xpath("//*[@id=\"content\"]/div/div/div[1]/div/div[1]/select"));
        functions.waitBySeconds(1);
        functions.click(By.xpath("//*[@id=\"content\"]/div/div/div[1]/div/div[1]/select/option[6]"));
        functions.waitBySeconds(1);
        functions.click(By.xpath("//*[@id=\"mainNav\"]/div[1]/ul/li[1]/div[2]/ul/li[3]/span"));
        functions.waitBySeconds(1);
        functions.click(By.xpath("//*[@id=\"mainNav\"]/div[1]/ul/li[1]/div[2]/ul/li[3]/div/div[1]/div/ul[2]/li[14]/a"));
        functions.waitBySeconds(3);
        functions.click(By.xpath("//*[@id=\"product-74065\"]/div[3]/div/a/img"));
        functions.waitBySeconds(2);
        functions.click(By.xpath("//*[@id=\"button-cart\"]"));
        functions.waitBySeconds(1);
        functions.click(By.xpath("//*[@id=\"header-top\"]/div/div[2]/ul/li[1]/div/ul/li/a"));
        functions.waitBySeconds(1);
        functions.click(By.xpath("//*[@id=\"header-top\"]/div/div[2]/ul/li[1]/div/ul/li/div/ul/li[1]/a"));
        functions.waitBySeconds(1);
        functions.click(By.xpath("//*[@id=\"product-341772\"]/div[2]/div[4]/a[3]"));

    }
}
