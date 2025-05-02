package Wedriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM {

	private WebDriver wd;
	
	POM(WebDriver wd)
	{
		this.wd = wd;
		PageFactory.initElements(wd, this);
		//
		
	}
	
	@FindBy(xpath="//a[@id='open-login-modal']")
	WebElement LoginTab;
	
	@FindBy(xpath = "//input[@id='username']")
	WebElement EmailId;
	
	@FindBy(xpath = "//input[@id='userpassword']")
	WebElement Password;
	
	@FindBy(xpath = "//input[contains(@id,'checkbox')]")
	WebElement Check;
	
	@FindBy(xpath = "//input[@value='Login']")
	WebElement Loginbutton;
	
}
