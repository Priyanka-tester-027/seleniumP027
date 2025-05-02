package Wedriver;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImageUpload {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver wd = new ChromeDriver();
		wd.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(2000);
		
		WebElement username = wd.findElement(By.xpath("//input[@name='username']"));
		username.sendKeys("Admin");
		Thread.sleep(1000);
		
		
		WebElement password = wd.findElement(By.xpath("//input[@type='password']"));
		password.sendKeys("admin123");
		Thread.sleep(1000);
		
		WebElement login = wd.findElement(By.xpath("//button[@type='submit']"));
		login.click();
		Thread.sleep(3000);
		
		WebElement PIM = wd.findElement(By.xpath("//a[contains(.,'PIM')]"));
		PIM.click();
		Thread.sleep(3000);
		

		WebElement Add = wd.findElement(By.xpath("//button[contains(.,'Add')]"));
		Add.click();
		Thread.sleep(1000);
		
		File f = new File("C:\\Users\\Admin\\Downloads\\pf.jpg");
		
		WebElement upload = wd.findElement(By.cssSelector("input[type='file']"));
		upload.sendKeys(f.getAbsolutePath());
		
		
		
		
		
		
		
		
		
		
		
	}

}
