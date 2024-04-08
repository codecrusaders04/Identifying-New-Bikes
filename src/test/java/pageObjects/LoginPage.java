package pageObjects;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{
	WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="//*[text()='Google']")
	WebElement googleButton;
	
	@FindBy(xpath="//input[@id='identifierId']")
	WebElement inputTextBox;
	
	@FindBy(xpath="//*[text()='Next']")
	WebElement nextButton;
	
	@FindBy(xpath="/*[@id='yDmH0d']/c-wiz/div/div[2]/div/div/div[1]/form/span/section/div/div/div[1]/div/div[2]/div[2]/div")
	WebElement errorMessage;
	
	public void clickGoogleButton() throws InterruptedException {
		googleButton.click();
		Thread.sleep(3000);
		Set<String> Id = driver.getWindowHandles();
		List<String> windowsId = new ArrayList<String>(Id);
		String childId = windowsId.get(1);
		driver.switchTo().window(childId);
	}
	public void clickTextBox() {
		inputTextBox.click();
	}
	
	public void setEmail(String email) {
		inputTextBox.sendKeys(email);
	}
	
	public void clickNextButton() {
		nextButton.click();
	}
	
	public String displayErrorMessage() {
		String message=errorMessage.getText();
		return message;
		
	}

}
	





