package Cucumber.stepdef;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import com.generic.PageFactoryLogin;
import com.util.BaseConfig;
import com.util.HandleClick;
import com.util.Highlighter;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginStepdef {
	WebDriver driver;
	PageFactoryLogin obj;
	@Given("Open Browser")
	public void getBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}
	@Given("Go to Application URL")
	public void getURL() throws Exception {
		driver.get(BaseConfig.getValue("URL"));
		driver.manage().window().maximize();
	}
	@When("Put valid username")
	public void getUsername() throws Exception{
	obj = new PageFactoryLogin(driver);
	Highlighter.getColor(obj.getUser(), driver, "red");
	obj.getUser().sendKeys(BaseConfig.getValue("user"));
	}
    @When("Put valid password")
    public void getPassword() throws Exception{
    Highlighter.getColor(obj.getPassword(), driver);
	obj.getPassword().sendKeys(BaseConfig.getValue("password"));
    }
    @When("Click sumbit button")
    public void clickSubmit() {
    Highlighter.getColor(obj.getSubmitButton(), driver);
	HandleClick.getJSEClick(driver, obj.getSubmitButton());
    }
    @Then("Login should be successful and show sign out button")
    public void checkSigninValidation() {
    Assert.assertEquals(obj.getLoginStatusSuccessMsg().getText(), "Login Successfully");
	Assert.assertTrue(obj.getSignOffList().get(7).isDisplayed());
    }
    @Then("Close browser") 
    public void closeBrowser() {
    driver.quit();
    }
}
