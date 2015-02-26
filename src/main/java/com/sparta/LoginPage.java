package com.sparta;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by ammaskuldeep on 25/02/15.
 */
public class LoginPage
{

    WebDriver driver = BrowserFactory.getDriver();
    public boolean login(String Username, String Password)
    {
        driver.findElement(By.id("j_username")).sendKeys(Username);
        driver.findElement(By.id("j.password")).sendKeys(Password);
        driver.findElement(By.id("proceed")).click();
    }

}
