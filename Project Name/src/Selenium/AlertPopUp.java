package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUp {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://nxtgenaiacademy.com/alertandpopup/");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@name='confirmalertbox']")).click();
		
		Thread.sleep(2000);
		
		driver.switchTo().alert().dismiss();

	}

}
