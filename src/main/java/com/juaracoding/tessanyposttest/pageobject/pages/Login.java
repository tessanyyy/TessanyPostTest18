package com.juaracoding.tessanyposttest.pageobject.pages;

import com.juaracoding.tessanyposttest.pageobject.drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
    private WebDriver driver;

    public Login() {
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "username")
    WebElement usernameLogin;

    @FindBy(id = "password")
    WebElement passwordLogin;

    @FindBy(xpath = "//*[@id=\"customer_login\"]/div[1]/form/p[2]/span/span")
    WebElement Password;

    @FindBy(id = "rememberme")
    WebElement Rememberme;

    @FindBy(xpath = "//*[@id=\"customer_login\"]/div[1]/form/p[3]/button")
    WebElement btnLogin;

    public void login(String email, String password) {
        this.usernameLogin.sendKeys(email);
        System.out.println("insert username or email login");
        this.passwordLogin.sendKeys(password);
        System.out.println("insert password login");
        Password.click();
        Rememberme.click();
        btnLogin.click();
    }
}
