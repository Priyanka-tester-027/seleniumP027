package Wedriver;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LMSImageupload {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		WebDriver wd = new ChromeDriver();
		
		wd.get("https://lms.mahabcp.in/#/");
		Thread.sleep(2000);
		
		WebElement EmplyoeeCode = wd.findElement(By.xpath("//input[@ng-reflect-placeholder='Employee Code']"));
		EmplyoeeCode.sendKeys("BSPL/TP/016");
		Thread.sleep(2000);
		
		WebElement Password = wd.findElement(By.xpath("//input[@ng-reflect-name='Password']"));
		Password.sendKeys("sIPL@1234");
		Thread.sleep(3000);
		
		WebElement login = wd.findElement(By.xpath("//span[contains(.,'Login')]"));
		login.click();
		Thread.sleep(3000);
		
		WebElement NewReq = wd.findElement(By.xpath("//button[contains(.,'New Request')]"));
		NewReq.click();
		Thread.sleep(3000);
		
		//WebElement UploadDoc = wd.findElement(By.xpath("//span[contains(.,'add Upload Approved Doc')]"));
		//UploadDoc.click();
		
		WebElement upload = wd.findElement(By.cssSelector("input[type='File']"));

		
		File fl = new File("C:\\Users\\Admin\\Downloads\\pf");
		upload.sendKeys(fl.getAbsolutePath());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
