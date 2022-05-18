package steps;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import pages.LoginPage;
import pages.TestBase;

public class TechfiosStepDefinition extends TestBase {
	
	
	
	LoginPage loginPage;
	
	@Before
	public void BeforeRun() {
		
		InitDriver();
		loginPage = PageFactory.initElements(driver, LoginPage.class);
	
		
	}
	
	@Given ("^User is on techfios login page$")
	public void user_is_on_techfios_login_page() {
	driver.get("https://techfios.com/billing/?ng=login/");
		
		
	}
	
	// demo@techfios.com ---> becomes ----> \"([^\"]*)\"
	
	
	@When ("^User enters username as \"([^\"]*)\"$")
	public void user_enters_username_as(String username) throws InterruptedException {
		loginPage.enterUsername(username);
		Thread.sleep(3000);
	}
	
	
	
	@When("^User enters password as \"([^\"]*)\"$")
	public void user_enters_password_as(String password) throws Throwable {
	    
	    loginPage.enterPassword(password);
	    Thread.sleep(3000);
	}

	

	@When("^User clicks on signin button$")
public void user_clicks_on_signin_button() throws Throwable {
	
	loginPage.clickSignInButton();
	Thread.sleep(3000);
}

@Then("^User should land on dashboard page$")
public void user_should_land_on_dashboard_page() throws Throwable {
  
	
	
   Assert.assertEquals("Dashboard- iBilling", loginPage.getPageTitle());
   
   
}

@Then("^User should not land on dashboard page$")
public void user_should_not_land_on_dashboard_page() throws Throwable {
    
	Assert.assertEquals("Dashboard- iBilling", loginPage.getPageTitle());
	takeScreenshot(driver);
	
	
    throw new PendingException();
}







private void takeScreenshot(WebDriver driver) {
	// TODO Auto-generated method stub
	
}

@After

public void teardown () {
	
	driver.close();
	driver.quit();
	
	
	
}
	
}
