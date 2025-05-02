package Wedriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class vehicledata {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver wd = new ChromeDriver();
		wd.get("https://vehicledata.mahabcp.in/");
		
		WebElement LoginName = wd.findElement(By.xpath("//input[@name='loginName']"));
		LoginName.sendKeys("pravash.behera1");
		Thread.sleep(2000);
		
		WebElement Password = wd.findElement(By.xpath("//input[@name='password']"));
		Password.sendKeys("Sipl@123");
		Thread.sleep(2000);
		
		WebElement Login = wd.findElement(By.xpath("//button[@color='primary']"));
		Login.click();
		Thread.sleep(2000);
		
		WebElement Preavcc = wd.findElement(By.xpath("(//span[contains(.,'PreAVCC')])[2]"));
		Preavcc.click();
		Thread.sleep(1000);
		
		WebElement PreavccAudit = wd.findElement(By.xpath("//span[contains(.,'Audit PreAVCC Transaction Report')]"));
		PreavccAudit.click();
		Thread.sleep(1000);
		
		WebElement SelectBCP = wd.findElement(By.xpath("(//div[contains(.,'Voilation Cases')])[6]"));
		Select s1 = new Select(SelectBCP);
		s1.selectByContainsVisibleText("Not binding to preavcc");
		Thread.sleep(2000);
		

	}

}
