package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mock2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver(); 
		
		driver.get("https://www.facebook.com/reg/");
		
		WebElement day = driver.findElement(By.xpath("select[@id='Day']"));
		
		
		
		
		

	}

}
