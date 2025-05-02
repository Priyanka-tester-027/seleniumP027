package Wedriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver cd = new ChromeDriver();
		//object created for webdriver ex.chrome, firefox, safari
		
		cd.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(2000);
		
		WebElement Username = cd.findElement(By.xpath("//input[@placeholder='Username']"));
		Username.sendKeys("Admin");
		Thread.sleep(2000);
		
		WebElement Password = cd.findElement(By.xpath("//input[@placeholder='Password']"));
		Password.sendKeys("admin123");
		Thread.sleep(2000);
		
		WebElement Login = cd.findElement(By.xpath("//button[@type='submit']"));
		Login.click();
		Thread.sleep(2000);
		

	}

}
