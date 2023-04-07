package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Email {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
	      driver.get("https://www.gmail.com/");
	      driver.findElement(By.xpath("//input[@type='email']")).sendKeys("patilnita1011@gmail.com");
	      Thread.sleep(3000);
	      driver.findElement(By.xpath("//button[@class='next']")).click();
	      Thread.sleep(3000);
	      
	}

}
