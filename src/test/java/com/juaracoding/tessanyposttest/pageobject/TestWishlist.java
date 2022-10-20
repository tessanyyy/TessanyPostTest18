package com.juaracoding.tessanyposttest.pageobject;

import com.juaracoding.tessanyposttest.pageobject.drivers.DriverSingleton;
import com.juaracoding.tessanyposttest.pageobject.pages.Login;
import com.juaracoding.tessanyposttest.pageobject.pages.Search;
import com.juaracoding.tessanyposttest.pageobject.pages.Wishlist;
import com.juaracoding.tessanyposttest.pageobject.utils.Constants;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestWishlist {
    public static WebDriver driver;
    private Login login;

    private Search search;

    private Wishlist wishlist;

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
        wishlist = new Wishlist();
    }

    @AfterClass
    public void closeBrowser() {
        delay(3);
//        driver.quit();
        DriverSingleton.closeObjectInstance();
    }

    @Test
    public void testAddWishlistItem() {

        delay(Constants.DETIK);
        // PreCondition one
        login.login("tessanykeintjem@gmail.com","Tessany3456!");
        delay(Constants.DETIK);
        // PreCondition Two
        search.searchItem();
        wishlist.btnWishlist();
        driver.navigate().refresh();
        Assert.assertEquals(wishlist.getTxtProductOne(),"MUSTARD STRAPPY FRILL RIBBED MINI DRESS");
        Assert.assertEquals(wishlist.getTxtProductTwo(),"WHITE MILKMAID HOOK AND EYE BODYCON MIDI DRESS");
        System.out.println("Test case add wishlist");
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
