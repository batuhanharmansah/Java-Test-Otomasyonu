package org.example.pages;

import org.example.definitions.Functions;
import org.openqa.selenium.By;

public class BasketPage {

    Functions functions;
    public BasketPage(){
        functions=new Functions();
    }

    public void basket(){
        functions.waitBySeconds(2);
        functions.click(By.xpath("//*[@id=\"cart\"]/div[1]"));
        functions.waitBySeconds(1);
        functions.click(By.xpath("//*[@id=\"js-cart\"]"));
        functions.waitBySeconds(2);
        functions.click(By.xpath("//*[@id=\"cart_module\"]/div[4]/div[1]"));
        functions.waitBySeconds(2);
        functions.click(By.xpath("//*[@id=\"button-checkout-continue\"]"));
        functions.waitBySeconds(2);
        functions.click(By.xpath("//*[@id=\"button-checkout-continue\"]"));
        functions.waitBySeconds(2);
        functions.click(By.xpath("//*[@id=\"button-checkout-continue\"]"));
        functions.waitBySeconds(2);
        functions.sendKeys(By.xpath("//*[@id=\"credit-card-owner\"]"),"Ahmet Ahmet");
        functions.waitBySeconds(1);
        functions.sendKeys(By.xpath("//*[@id=\"credit_card_number_1\"]"),"4111");
        functions.sendKeys(By.xpath("//*[@id=\"credit_card_number_2\"]"),"1111");
        functions.sendKeys(By.xpath("//*[@id=\"credit_card_number_3\"]"),"1111");
        functions.sendKeys(By.xpath("//*[@id=\"credit_card_number_4\"]"),"1129");
        functions.waitBySeconds(1);
        functions.click(By.xpath("//*[@id=\"credit-card-expire-date-month\"]"));
        functions.click(By.xpath("//*[@id=\"credit-card-expire-date-month\"]/option[13]"));
        functions.waitBySeconds(1);
        functions.click(By.xpath("//*[@id=\"credit-card-expire-date-year\"]"));
        functions.click(By.xpath("//*[@id=\"credit-card-expire-date-year\"]/option[2]"));
        functions.waitBySeconds(1);
        functions.sendKeys(By.xpath("//*[@id=\"credit-card-security-code\"]"),"0000");
        functions.waitBySeconds(2);
        functions.click(By.xpath("//*[@id=\"button-checkout-continue\"]"));
        functions.waitBySeconds(1);
        functions.click(By.xpath("//*[@id=\"terms-and-conditions-form\"]/div/input"));
        functions.waitBySeconds(1);
        functions.click(By.xpath("//*[@id=\"checkout-payment-form\"]/form/div/div/input"));
        System.out.println("BU KART İLE ALIŞ-VERİŞ YAPILAMAZ BAKİYESİ YETERSİZ");

        functions.waitBySeconds(4);


    }


}
