package com.sparta;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import sun.security.krb5.internal.crypto.Des;

import java.net.MalformedURLException;
import java.net.URL;

public abstract class BrowserFactory
{
    public static WebDriver driver;

    public static WebDriver StartBrowser(String Browser, String URL) throws MalformedURLException, InterruptedException
    {
        if(driver==null||!isSessionActive())
        {
            driver = startRemoteWebBrowser (Browser, URL);
        }
        driver.manage().window().maximize();
        return driver;
    }

    public static WebDriver getDriver()
    {
        return driver;
    }

    public static boolean isSessionActive() {
        try
        {
            return driver.findElement(By.tagName("body")).size()>0;
        }
        catch (Exception e)
        {
    }
        return false;
    }
    public static void QuitBrowser()
    {
     //   getDriver().quit();
        driver=null;
    }
    protected static WebDriver startRemoteWebBrowser (String browser, String URL)
    {
        if (true)
    } try

    {
        //System.setProperty("webdriver.chrome.driver","/usr/local/bin/chromedriver");
        System.out.println("grid started...");
        DesiredCapabilities caps = DesiredCapabilities.android().firefox();
        caps.setCapability("platform", "MAC");
        caps.setCapability("browserName", "firefox");


        driver = new RemoteWebDriver(new URL("http://128.65.99.136:8080/spartaweb/login"), caps);
    }
    catch (Exception e)
    {
        System.out.println(e.getMessage());
    }

    } else {
        try{
        if(browser.equalsIgnoreCase ("Firefox")){
        FirefoxProfile firefoxprofile = new FirefosProfile();
        }
        }
        }

