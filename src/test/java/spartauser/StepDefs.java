package spartauser;


import java.util.concurrent.TimeUnit;

import cucumber.annotation.en.And;
import cucumber.annotation.en.Given;
import cucumber.annotation.en.Then;
import cucumber.annotation.en.When;
import cucumber.runtime.PendingException;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.annotation.Before;
import cucumber.annotation.After;

/**
 * Created by ammaskuldeep on 23/02/15.
 */
public class StepDefs {
    public WebDriver driver;
    @Before
    public void startBrowser()
    {
        driver = new FirefoxDriver();
        driver.get("http://128.65.99.136:8080/spartaweb/login");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.findElement(By.xpath ("//*[@id='_title_title_id_pane']/div[1]")).click();
        driver.manage().window().maximize();

    }

    @After
    public void stopBrowser()
    {
        driver.quit();
    }

    @Given("^I am on login page$")
    public void I_am_on_login_page() {
        Assert.assertTrue(driver.findElement(By.linkText("Forgotten Username")).isDisplayed());
    }

    @When("^I enter Username as ‘Kuldeep’$")
    public void I_enter_Username_as_Kuldeep() {
        WebElement Username = driver.findElement(By.id("j_username"));
    }

    @When("^I enter Password as ‘Kuldeep_opencast(\\d+)’$")
    public void I_enter_Password_as_Kuldeep_opencast_(int arg1) {
        WebElement Password = driver.findElement(By.id("j_password"));
    }

    @When("^I select Submit button$")
    public void I_select_Submit_button() {
        WebElement Submit = driver.findElement(By.id("proceed"));
    }

    @Then("^I should see a pop up$")
    public void I_should_see_a_pop_up() {
        Assert.assertTrue(driver.findElement(By.partialLinkText("queries@civicuk.com")).isDisplayed());
    }

    @Then("^I select ok$")
    public void I_select_ok() {
        driver.findElement(By.linkText("OK"));
    }

    @Then("^I should be on Home Page$")
    public void I_should_be_on_Home_Page() {
        driver.findElement(By.className("login-title"));
    }

    @When("^I enter ‘kuldeep(\\d+)’ and 'kuldeep_opencast'$")
    public void I_enter_kuldeep_and_kuldeep_opencast(int arg1) {
        // Express the Regexp above with the code you wish you had
        throw new PendingException();
    }

    @Then("^I should not logged in$")
    public void I_should_not_logged_in() {
        Assert.assertEquals(driver.findElement(By.tagName("Login failed")).isDisplayed());
    }

    @Then("^I should see a message as 'Login failed'$")
    public void I_should_see_a_message_as_Login_failed() {
        // Express the Regexp above with the code you wish you had
        throw new PendingException();
    }

    @When("^I enter ‘’ and ''$")
    public void I_enter_and_() {
        // Express the Regexp above with the code you wish you had
        throw new PendingException();
    }

    @When("^I enter ‘kuldeep’ and 'kdiiuueert'$")
    public void I_enter_kuldeep_and_kdiiuueert() {
        // Express the Regexp above with the code you wish you had
        throw new PendingException();
    }

    @When("^i select Reset button$")
    public void i_select_Reset_button() {
        // Express the Regexp above with the code you wish you had
        throw new PendingException();
    }

    @Then("^I should see Username and Password text box blank$")
    public void I_should_see_Username_and_Password_text_box_blank() {
        // Express the Regexp above with the code you wish you had
        throw new PendingException();
    }

}
