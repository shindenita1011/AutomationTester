package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IFrame {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
		
		 WebElement iframe = driver.findElement(By.xpath("//div[@id='iframeResult']"));
		 
		 driver.switchTo().frame(iframe);
		 
		 driver.findElement(By.xpath("//button[@type='button']")).click();
		 
		 driver.switchTo().defaultContent();
		 
		// driver.switchTo().parentFrame();
		 
		// Thread.sleep(2000);
		 
		 driver.findElement(By.xpath("//a[@id='tryhome']")).click();
		 
	//	 Thread.sleep(3000);
		 
		 
		 
		
		

	}

}
