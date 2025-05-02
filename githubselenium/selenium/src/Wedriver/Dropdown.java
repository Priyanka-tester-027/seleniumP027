package Wedriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver wd = new ChromeDriver();
		
		wd.get("https://proposalfinder.com/");
		Thread.sleep(1000);
		
		WebElement gender = wd.findElement(By.xpath("//select[@id='register-gender']"));
		Select s1 = new Select(gender);
		s1.selectByContainsVisibleText("Female");
		
		
		WebElement religion = wd.findElement(By.xpath("//select[@id='cp-religion']"));
		Select s2 = new Select(religion);
		s2.selectByContainsVisibleText("Hindu");
		
		
		
		

	}

}
