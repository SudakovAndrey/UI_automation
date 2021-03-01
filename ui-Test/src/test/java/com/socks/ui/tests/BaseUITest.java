package com.socks.ui.tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import io.restassured.RestAssured;
import org.testng.annotations.BeforeSuite;



public class BaseUITest {

    @BeforeSuite
    public void setUp() {
        RestAssured.baseURI = "http://206.189.103.114";
        Configuration.baseUrl = "http://206.189.103.114";
    }

    protected <T> T at(Class<T> pageClass){
        return Selenide.page(pageClass);
    }
}
