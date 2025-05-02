package Wedriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MainPOM {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver wd = new ChromeDriver();
		
		wd.get("https://proposalfinder.com/");
		Thread.sleep(2000);
		wd.manage().window().fullscreen();
		Thread.sleep(1000);
		
		POM p = new POM(wd);
	
		p.LoginTab.click();
		Thread.sleep(2000);
		
		p.EmailId.sendKeys("ABC");
		Thread.sleep(1000);
		
		p.Password.sendKeys("ABC@123");
		Thread.sleep(1000);
		
		p.Check.click();
		p.Loginbutton.click();
		
	}

}