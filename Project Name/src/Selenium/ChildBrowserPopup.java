package Selenium;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class ChildBrowserPopup {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
WebDriver driver = new ChromeDriver(); // upcasting
		
		driver.get("https://skpatro.github.io/demo/links/");
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@name='NewTab']")).click();
		
		Set<String> id = driver.getWindowHandles();
		
		ArrayList<String> al = new ArrayList<String>(id);
		
		String cbadd = al.get(1);// child browser adress
		
		driver.switchTo().window(cbadd);
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//span[text()='Training'])[1]")).click();
		
		driver.switchTo().window(al.get(0));
		
		driver.findElement(By.xpath("//input[@name='NewTab']")).click();
		
		
		
		
		
		
		
		
		
		

	}

}
