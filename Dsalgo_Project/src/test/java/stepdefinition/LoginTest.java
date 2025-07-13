package stepdefinition;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

import io.cucumber.java.en.Then;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.testng.Assert.*;


public class LoginTest {
	WebDriver driver;  
@Given("User is on the login page")
public void userOnLoginPage() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
 driver = new ChromeDriver();

   
    driver.manage().window().maximize();
    Thread.sleep(2000);
    driver.get("https://dsportalapp.herokuapp.com/login"); 
    Thread.sleep(2000);
}

@When("User enters valid credentials")
public void userEntersValidCredentials() throws InterruptedException {
	
  // enter username/password
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	WebElement user = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("id_username")));
	Thread.sleep(2000);
	user.sendKeys("usha.amaravadi@gmail.com");

	WebElement pass = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("id_password")));
	Thread.sleep(2000);
	pass.sendKeys("Numpi3737");

	WebElement loginBtn = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("input[type='submit']")));
	Thread.sleep(2000);
	loginBtn.click();

}

@Then("User should see the {string} heading")
public void userShouldSeeTheHeading(String headingText) {
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    WebElement heading = wait.until(
        ExpectedConditions.visibilityOfElementLocated(
            By.xpath("//*[text()='" + headingText + "']")));
    Assert.assertTrue(heading.isDisplayed(),
        "Expected heading '" + headingText + "' not visible");
}

}






