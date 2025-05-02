package Wedriver;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scrolling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver wd = new ChromeDriver();
		
		wd.get("https://www.apple.com/");
		
		Actions a = new Actions(wd);
		
		for(int i=1;i<=100;i++) 
		{
		a.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(100);
		}
		
		
	}

}
