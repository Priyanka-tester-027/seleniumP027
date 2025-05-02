package Wedriver;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Disabledfield {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver wd = new ChromeDriver();
		wd.get("https://proposalfinder.com/create-wedding-profile");
		Thread.sleep(4000);
		
		WebElement edit = wd.findElement(By.xpath("(//input[@value='Edit'])[1]"));
				edit.click();
				Thread.sleep(4000);
				//Actions a = new Actions(wd);
				
			JavascriptExecutor js = (JavascriptExecutor)wd;
			
			WebElement gender = wd.findElement(By.xpath("//select[@id='cp-gender']"));
			js.executeScript("arguments[0].removeAttribute('disabled');", gender);
			Select s1 = new Select(gender);
			s1.selectByVisibleText("Male");
			Thread.sleep(4000);
			
			WebElement rel = wd.findElement(By.xpath("(//select[@id='cp-religion'])[1]"));
			js.executeScript("arguments[0].removeAttribute('disabled');", rel);
			Select s2 = new Select(rel);
			s2.selectByVisibleText("Hindu");
			Thread.sleep(2000);
		
	}

}
