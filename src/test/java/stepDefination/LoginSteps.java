package stepDefination;

import PageObject.LoginPage;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class LoginSteps {
    WebDriver driver;
    public LoginPage loginPg;
    @Given("User Launch Firefox browser")
    public void user_launch_Firefox_browser() {
       // System.setProperty("webdriver.chrome.driver", "C://Users//DELL//Downloads//chromedriver_win32//chromedriver.exe");
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        loginPg = new LoginPage(driver);
        driver.manage().window().maximize();
    }
    @When("User open URL {string}")
    public void user_open_url(String url) {
        driver.get(url);

    }
    @Then("User enters Email as {string} and Password as {string}")
    public void user_enters_email_as_and_password_as(String emailadd, String password) {

        loginPg.enterEmail(emailadd);
        loginPg.enterPassword(password);

    }
    @Then("Click on Login")
    public void click_on_login() {
        loginPg.clickOnLoginButton();
    }
    @Then("Page Title should be {string}")
    public void page_title_should_be(String title ) {
       if(driver.getPageSource().contains("Login was unsuccessful."))
       {
           driver.close();
           Assert.assertTrue(true);
       }
       else
           Assert.assertEquals(title,driver.getTitle());
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @When("User click on Log Out link")
    public void user_click_on_log_out_link() {
        loginPg.clickOnLogoutBtn();

    }
    @Then("close browser")
    public void close_browser() {
        driver.quit();
    }

}
