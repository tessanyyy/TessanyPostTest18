package com.juaracoding.tessanyposttest.pageobject.pages;

import com.juaracoding.tessanyposttest.pageobject.drivers.DriverSingleton;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Wishlist {
    private WebDriver driver;
    JavascriptExecutor js = (JavascriptExecutor) driver;

    public Wishlist() {
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id=\"noo-site\"]/html[1]/body[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]")
    WebElement btnWishlistOne;

    @FindBy(xpath = "//a[normalize-space()='black lux graphic t-shirt']")
    WebElement txtProductOne;

    @FindBy(xpath = "//a[normalize-space()='pink fruit graphic fitted t shirt']")
    WebElement txtProductTwo;

    @FindBy(xpath = "//*[@id=\"noo-site\"]/html[1]/body[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[1]/a[1]")
    WebElement btnWishlistTwo;


    public void btnWishlist() {
        btnWishlistOne.click();
        System.out.println("Click button wishlist product one");
        btnWishlistTwo.click();
        System.out.println("Click button wishlist product two");
    }

    public String getTxtProductOne() {
        return txtProductOne.getText();
    }

    public String getTxtProductTwo() {
        return txtProductTwo.getText();
    }
}
