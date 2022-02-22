package org.example.pages;

import org.example.definitions.Functions;
import org.junit.Assert;
import org.openqa.selenium.By;

public class SearchFavAddPage {

    Functions functions;
    public SearchFavAddPage(){functions=new Functions();}

    public void seach(){

        functions.waitBySeconds(8);
        functions.sendKeys(By.id("search-input"),"Oyuncak");
        functions.waitBySeconds(2);
        functions.click(By.cssSelector(".common-sprite.button-search"));
        functions.waitBySeconds(2);
        functions.scrollWithAction(By.xpath("//*[@id=\"product-577332\"]"));
        //functions.scrollWithJavaScript(By.xpath("//*[@id='product-601011']\""));
    }
    public void fav(){

        functions.click(By.xpath("//*[@id=\"product-399518\"]/div[2]/div[4]/a[4]"));
        functions.waitBySeconds(1);
        functions.click(By.xpath("//*[@id=\"product-341772\"]/div[2]/div[4]/a[4]"));
        functions.waitBySeconds(1);
        functions.click(By.xpath("//*[@id=\"product-577328\"]/div[2]/div[4]/a[4]"));
        functions.waitBySeconds(1);
        functions.click(By.xpath("//*[@id=\"product-577323\"]/div[2]/div[4]/a[4]"));
        functions.waitBySeconds(3);
        functions.click(By.xpath("//*[@id=\"header-bottom\"]/div/div[2]/a/img"));

    }




}
