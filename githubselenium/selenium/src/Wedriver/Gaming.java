package Wedriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Gaming {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver wd = new ChromeDriver();
		wd.get("https://selenium08.blogspot.com/2020/01/click-and-hold.html");
		Actions a = new Actions(wd);
		
		WebElement A = wd.findElement(By.xpath("//li[@name='A']"));
		WebElement B = wd.findElement(By.xpath("//li[@name='B']"));
		
		Action ac= a.clickAndHold(B).pause(2).moveToElement(A).pause(2).build();	
		
		ac.perform();
		
		
	}

}