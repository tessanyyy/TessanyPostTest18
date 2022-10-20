package com.juaracoding.tessanyposttest.pageobject.pages;

import com.juaracoding.tessanyposttest.pageobject.drivers.DriverSingleton;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search {
    private WebDriver driver;

    public Search() {
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id=\"noo-site\"]/header/div[2]/div/div/div/a")
    WebElement Search;

    @FindBy(name = "s")
    WebElement inputSearch;

    @FindBy(xpath = "//a[normalize-space()='pink drop shoulder oversized t shirt']")
    WebElement txtShirt;

    public void searchItem() {
        Search.click();
        System.out.println("Search");
        inputSearch.sendKeys("tshirt", Keys.ENTER);
        System.out.println("Input shirt for values search");
    }

    public String getTxtShirt() {
        return txtShirt.getText();
    }
}
