package pom;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ZerodhaLoginPage {
	@FindBy (xpath ="//input[@id='userid']") private WebElement userName;
	@FindBy (xpath ="//input[@id='password']") private WebElement password;
	@FindBy (xpath ="//button[@type='submit']") private WebElement submit;
	@FindBy (xpath ="//a[text()='Forgot user ID or password?']") private WebElement forgot;
	@FindBy (xpath ="//a[text()=\"Don't have an account? Signup now!\"]") private WebElement signUp;
	@FindBy (xpath ="//input[@id='pin']") private WebElement pin;
	@FindBy (xpath ="//button[@type='submit']") private WebElement submitpin;
	
	public ZerodhaLoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void enterUserName(String user)
	{
		userName.sendKeys(user);
	}
	
	public void enterPassWord(String pass)
	{
		password.sendKeys(pass);
	}
	
	public void clickOnSubmit()
	{
		submit.click();
	}
	
	public void clickOnForgot()
	{
		forgot.click();
	}
	
	public void signUp()
	{
		signUp.click();
	}
	
	public void enterPin(String pinNumber,WebDriver driver)
	{
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofMillis(2000));
		wait.until(ExpectedConditions.visibilityOf(pin));
		pin.sendKeys(pinNumber);
		
	}
	//{
	//	pin.sendKeys(pinNumber);
//	}
	
	//public void enterpin(String PinNumber,WebDriver driver)
//	{
	//	FluentWait<WebDriver> wait= new FluentWait<WebDriver>(driver);
//		wait.withTimeout(Duration.ofMillis(20000)); // this is maximum time of wait
	//	wait.pollingEvery(Duration.ofMillis(5000)); // this is pooling time
	//	wait.ignoring(Exception.class); // this will handle exceptions
	//	wait.until(ExpectedConditons.visibilityOf(pin)); // condition
	//	pin.sendKeys(pinNumber);
//	}

	public void clickOnContinue()
	{
		submitpin.click();
	}
}

		
	


