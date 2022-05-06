package POM;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Zerodalogin {
	@FindBy(xpath="//input[@id='userid']")private WebElement username;
	@FindBy(xpath="//input[@id='password']")private WebElement password;
	@FindBy(xpath="//button[@type='submit']")private WebElement submit;
	@FindBy(xpath="//input[@type='password']")private WebElement pin;
	@FindBy(xpath="//button[@type='submit']")private WebElement login;
	@FindBy(xpath="//a[text()='Forgot user ID or password?']")private WebElement forgot;
	@FindBy(xpath="//a[@class='text-light']")private WebElement signin;
	
	
	
	public Zerodalogin(WebDriver driver){
		PageFactory.initElements(driver, this);
	    }
	
	public void enterUserName(String user) {
		
		username.sendKeys(user);
		}
	
	public void enterPassWord(String Pass) {
		password.sendKeys(Pass);
	    }
	
	public void clickonSubmit() {
		submit.click();
	    } 
	
	public void enterPin(String pan,WebDriver driver) {
		
		FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver);
		wait.withTimeout(Duration.ofMillis(3000));
		wait.pollingEvery(Duration.ofMillis(50));
		wait.ignoring(Exception.class);
		wait.until(ExpectedConditions.visibilityOf(pin));
		pin.sendKeys(pan);
	}
	
	public void clickonLogin() {
		login.click();
	}
	
	public void clickonForgot() {
		forgot.click();
	    }
	
	public void clickonSignin() 
	{		signin.click();
	    }


}
