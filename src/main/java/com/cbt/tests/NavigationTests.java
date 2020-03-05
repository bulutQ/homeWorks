package com.cbt.tests;
import com.cbt.utilities.BrowserFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class NavigationTests {

    WebDriver browsers;

    @Test
    public void chromeTest(){
        browsers=BrowserFactory.getDriver("chrome");
        browsers.manage().window().maximize();
        browsers.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
        browsers.get("https://google.com");
        String googleTitle = browsers.getTitle();
        System.out.println(googleTitle);
        browsers.get("https://etsy.com");
        String etsyTitle = browsers.getTitle();
            browsers.navigate().back();
            browsers.getTitle();
            browsers.navigate().forward();
            browsers.navigate().back();
            browsers.getTitle();

    }
    @Test
    public void edgeTest(){
        browsers=BrowserFactory.getDriver("edge");
        browsers.manage().window().maximize();
        browsers.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
        browsers.get("https://google.com");
        String linkTitle = browsers.getTitle();
        System.out.println(linkTitle);
        browsers.get("https://etsy.com");
        String etsyTitle = browsers.getTitle();
        browsers.navigate().back();
        browsers.getTitle();
    }
    @Test
    public void firefoxTest(){
        browsers=BrowserFactory.getDriver("firefox");
        browsers.manage().window().maximize();
        browsers.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
        browsers.get("https://google.com");
        String linkTitle = browsers.getTitle();
        System.out.println(linkTitle);
        browsers.get("https://etsy.com");
        String etsyTitle = browsers.getTitle();
        browsers.navigate().back();
        browsers.getTitle();
    }
}
