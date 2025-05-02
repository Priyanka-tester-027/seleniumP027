package Wedriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PixelPosition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver wd = new ChromeDriver();
		
		wd.get("https://lms.mahabcp.in/#/");
		
		Point p;
		
		WebElement Login = wd.findElement(By.xpath("//span[contains(.,'Login')]"));
		
		p = Login.getLocation();		
		int Xcord = p.getX();
		int Ycord = p.getY();
		
		System.out.println("X Cordinate : "+ Xcord);
		System.out.println("Y Cordinate : "+ Ycord);
		
		
		

	}

}
