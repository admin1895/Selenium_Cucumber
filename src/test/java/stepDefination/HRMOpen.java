package stepDefination;

import io.cucumber.java.en.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HRMOpen {
    WebDriver driver;

    @Given("User Launch Chrome browser")
    public void user_launch_chrome_browser() {
        System.setProperty("webdriver.chrome.driver", "C://Users//DELL//Downloads//chromedriver_win32//chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();

    }
    @When("User Open HRMLogo browser")
    public void user_open_hrm_logo_browser() {
        driver.get("https://www.orangehrm.com/open-source/open-source-on-demand");
            }
    @Then("User accept to Platform")
    public void user_accept_to_platform() throws InterruptedException {
        Actions act=new Actions(driver);
        act.moveToElement(driver.findElement(By.xpath("//a[text()='Platform']"))).build().perform();
        Thread.sleep(3000);
    }
    @And("User close browser")
    public void user_close_browser(){
        driver.quit();
    }
}
