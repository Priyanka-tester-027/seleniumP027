package Wedriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MOuseHover {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		WebDriver wd = new ChromeDriver();
		
		wd.get("https://proposalfinder.com/");
		Thread.sleep(2000);
		wd.manage().window().maximize();
		
		Actions a = new Actions(wd);
	
		WebElement Login = wd.findElement(By.xpath("//a[@id='open-login-modal']"));
		a.moveToElement(Login).perform();
		Thread.sleep(2000);

		WebElement Matches = wd.findElement(By.xpath("//a[contains(.,'Matches')]"));
		a.moveToElement(Matches).perform();
		Thread.sleep(1000);
		
	}

}
