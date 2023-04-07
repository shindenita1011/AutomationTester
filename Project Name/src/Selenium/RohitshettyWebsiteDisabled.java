package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RohitshettyWebsiteDisabled {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://sso.teachable.com/secure/9521/identity/login");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("patilnita1011@gmail.com");
		
		WebElement submit = driver.findElement(By.xpath("//input[@type='submit']"));
		
		submit.click();
		
		boolean result = submit.isEnabled();
		
		System.out.println(result);
		
		

	}

}
