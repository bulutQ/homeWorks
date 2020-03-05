package com.cbt.utilities;


import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class TitleVerification {

    WebDriver browsers;
    List<String> urlAndTitle;

    @BeforeTest
    public void setup(){
        browsers=BrowserFactory.getDriver("chrome");
        browsers.manage().window().maximize();
        browsers.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }
    @Test
    public void titleUrlTest_1(){
        urlAndTitle = new ArrayList<>();
        urlAndTitle.add("http://practice.cybertekschool.com/");
        urlAndTitle.add("http://practice.cybertekschool.com/dropdown");
        urlAndTitle.add("http://practice.cybertekschool.com/login");
        String expectedTitle="Practice";
        for (String url : urlAndTitle) {
            browsers.get(url);
            Assert.assertEquals(browsers.getTitle(), expectedTitle);
        }
    }
    @Test
    public void titleUrlTest_2(){
        urlAndTitle = new ArrayList<>();
        urlAndTitle.add("https://lulugandgeorgia.com");
        urlAndTitle.add("https://wayfair.com/");
        urlAndTitle.add("https://walmart.com");
        urlAndTitle.add("https://westelm.com/");

        for (String url:urlAndTitle){
            browsers.get(url);
            String title=browsers.getTitle();
            title=title.replace(" ","").toLowerCase();
            System.out.println(url+" contains: "+title+"? "+url.contains(title));
        }
    }

    @AfterTest
    public void tearDown(){
        browsers.close();
    }

}
