package Wedriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class mahabcp {  //LMS

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver cd = new ChromeDriver();
		
		cd.get("https://lms.mahabcp.in/#/");
		Thread.sleep(2000);
		
		WebElement EmployeeCode = cd.findElement(By.xpath("//input[@placeholder='Employee Code']"));
		EmployeeCode.sendKeys("Admin");
		Thread.sleep(2000);
		
		WebElement Password = cd.findElement(By.xpath("//input[contains(@placeholder,'Password')]"));
		Password.sendKeys("Sipl@123");
		Thread.sleep(2000);

		WebElement Login = cd.findElement(By.xpath("//button[contains(@class,'button-color ng-tns-c213-2 mat-raised-button')]"));
		Login.click();
		Thread.sleep(2000);		
		
	}

}
