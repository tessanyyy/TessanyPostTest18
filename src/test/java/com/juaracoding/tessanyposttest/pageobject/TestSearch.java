package com.juaracoding.tessanyposttest.pageobject;

import com.juaracoding.tessanyposttest.pageobject.drivers.DriverSingleton;
import com.juaracoding.tessanyposttest.pageobject.pages.Login;
import com.juaracoding.tessanyposttest.pageobject.pages.Search;
import com.juaracoding.tessanyposttest.pageobject.utils.Constants;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestSearch {
    public static WebDriver driver;
    private Login login;

    private Search search;

    @BeforeClass
    public void setUp() {
        DriverSingleton.getInstance(Constants.CHROME);
        driver = DriverSingleton.getDriver();
        driver.get(Constants.URL_LOGIN);
    }

    @BeforeMethod
    public void pageObject() {
        login = new Login();
        search = new Search();
    }

    @AfterClass
    public void closeBrowser() {
        delay(3);
//        driver.quit();
        DriverSingleton.closeObjectInstance();
    }

    @Test
    public void testSearch() {

        delay(Constants.DETIK);
        //PreCondition
        login.login("tessanykeintjem@gmail.com","Tessany3456!");
        delay(Constants.DETIK);
        search.searchItem();
        Assert.assertTrue(search.getTxtShirt().contains("SHIRT"));
        System.out.println("Test case Search");
    }

    static void delay(int detik) {
        try {
            Thread.sleep(1000*detik);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
