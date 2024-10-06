package pageObjects;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage2 extends BasePage{
	
	//public WebDriver driver;
	
	public LoginPage2(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(xpath="//input[@id='email']")
	WebElement username;
	
	@FindBy(name = "pass")
	WebElement password;
	
	@FindBy(name="login")
	WebElement loginbutton;
	
	@FindBy(xpath="//span[text()='Feeling/activity']")
	WebElement activity;
	
	@FindBy(xpath="//button[@id='loginbutton']//parent::div//preceding-sibling::div/div[@class='_9ay7']")
	WebElement errormsg;
	
	public void getUsername(String user)
	{
		username.sendKeys(user);
	}
	public void getPassword(String pass)
	{
		password.sendKeys(pass);
	}
	public void clickLoginButton()
	{
		loginbutton.click();
	}
	public void validCredentials()
	{
		boolean displayed = activity.isDisplayed();
		Assert.assertEquals(displayed, true);
	}
	
	public void invalidCredentials()
	{
		boolean errmsg = errormsg.isDisplayed();
		Assert.assertEquals(errmsg, true);
	}
}
