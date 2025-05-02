package Wedriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DRagDrop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver wd = new ChromeDriver();
		
		wd.get("https://only-testing-blog.blogspot.com/2014/09/drag-and-drop.html");
		Thread.sleep(2000);
		
		Actions a = new Actions(wd);
		
		WebElement dr = wd.findElement(By.xpath("//p[contains(.,'Drag me to my target')]"));
		
		WebElement dp = wd.findElement(By.xpath("//div[@id='dropdiv']"));
		
		a.dragAndDrop(dr, dp).build().perform();		
		//Thread.sleep(2000);
		//dragAndDrop is predefined method of Actions class
		//it is used to drag and drop the elements

	}

}
