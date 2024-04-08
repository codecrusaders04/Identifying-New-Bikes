package stepDefinitions;

import java.time.Duration;
import java.util.HashMap;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import factory.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import utilities.DataReader;

public class LoginSteps{
//	WebDriver driver;
//	LoginPage lp;
//	
//	List<HashMap<String, String>> datamap;
//	
//	@Given("the user navigates to login page")
//	public void the_user_navigates_to_login_page() {
//	    // Write code here that turns the phrase above into concrete actions
//		BaseClass.getLogger().info("Go to Home Page --> Click on Login...");
//		HomePage hp = new HomePage(BaseClass.getDriver());
//		hp.clickLoginButton();
//	}
//		
//	@Then("the user should be redirected to the Google Account Page for passing email with excel row {string}")
//	public void the_user_should_be_redirected_to_the_google_account_page_for_passing_email_with_excel_row(String rows) {
//	    // Write code here that turns the phrase above into concrete actions
//		datamap = DataReader.data(System.getProperty("user.dir") + "\\testData\\Login_e-mail_data.xlsx", "Sheet1");
//		int index = Integer.parseInt(rows)-1;
//		String email = datamap.get(index).get("Invalid_ID");
//		String exp_res = datamap.get(index).get("Result");
//		
//		lp = new LoginPage(BaseClass.getDriver());
//		lp.clickGoogleButton();
//		lp.setEmail(email);
//		
//		try {
//			if(exp_res.equals(lp.displayErrorMessage())) {
//				Assert.assertTrue(true);
//			}
//			else {
//				Assert.assertTrue(false);
//			}
//		}
//		catch(Exception e) {
//			
//		}
//		
//		
//		
//		
//		
//		
//		
//		
//
//	    
//	}
	WebDriver driver;
	LoginPage lp = new LoginPage(BaseClass.getDriver());
	
	List<HashMap<String, String>> datamap;
	
	@Given("the user is on Google Account Page")
	public void the_user_is_on_google_account_page() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		HomePage hp = new HomePage(BaseClass.getDriver());
		hp.clickLoginButton();
		lp.clickGoogleButton();
		Thread.sleep(3000);
//		lp.clickTextBox();
//		lp.clickNextButton();
		
		
	    
	}

	@When("the user clicks on the Email text box")
	public void the_user_clicks_on_the_email_text_box() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(3000);
		lp.clickTextBox();
		Thread.sleep(5000);
		
	    
	}

	@When("the user enters the invalid credential email with the excel row {string}")
	public void the_user_enters_the_invalid_credential_email_with_the_excel_row(String rows) throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(4000);
		lp.setEmail(rows);
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10000));
		WebDriverWait mywait = new WebDriverWait(driver,Duration.ofSeconds(7000));
		
		//Thread.sleep(6000);
		datamap = DataReader.data(System.getProperty("user.dir") + "\\testData\\Login_e-mail_data.xlsx", "Sheet1");
		int index = Integer.parseInt(rows)-1;
		String email = datamap.get(index).get("Email");
		
		lp.clickNextButton();
		
		
	   
	}

	@Then("the user should get a error message with the excel row {string}")
	public void the_user_should_get_a_error_message_with_the_excel_row(String rows) {
	    // Write code here that turns the phrase above into concrete actions
		datamap = DataReader.data(System.getProperty("user.dir") + "\\testData\\Login_e-mail_data.xlsx", "Sheet1");
		int index = Integer.parseInt(rows)-1;
		String exp_res = datamap.get(index).get("Result");
		try {
			if(exp_res.equals(lp.displayErrorMessage())) {
				Assert.assertTrue(true);
			}
			else {
				Assert.assertTrue(false);
			}
		}
		catch(Exception e) {
			
		}
	    
	}

}

