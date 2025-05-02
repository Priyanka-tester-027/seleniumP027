package Wedriver;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DoubleClick_Alert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver d =new ChromeDriver();
		d.get("https://www.demoblaze.com/");
		Thread.sleep(2000);
		
		WebElement clk = d.findElement(By.xpath("//a[contains(.,'Sign up')]"));
		clk.click();
		Thread.sleep(2000);
		
		WebElement Username = d.findElement(By.xpath("//input[@id='sign-username']")) ;
		Username.sendKeys("Admin");
		Thread.sleep(2000);
		
		WebElement Password = d.findElement(By.xpath("//input[@id='sign-password']"));
		Password.sendKeys("admin@123");
		Thread.sleep(2000);
		
		WebElement Signup = d.findElement(By.xpath("//button[contains(.,'Sign up')]"));
		Signup.click();
		Thread.sleep(4000);
		
		Alert al = d.switchTo().alert();  // add alert laibraries and create object for alert
		
		al.accept(); // accept action perform using alert class object as al
		Thread.sleep(4000);
			
	}

}
