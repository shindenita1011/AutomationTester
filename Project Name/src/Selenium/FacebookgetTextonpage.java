package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookgetTextonpage {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		 WebDriver driver=new ChromeDriver();
	      driver.get("https://www.facebook.com/reg/");
	    //  driver.findElement(By.xpath("//input[@type='text']")).sendKeys("patilnita1011@gmail.com");
	      driver.findElement(By.xpath("//input[@type='text']")).clear();
	   //   driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Shinderam4@");
	      Thread.sleep(3000);
	      WebElement text = driver.findElement(By.xpath("//div[@class='_8esf _8f3m _9bpz _9bq9']"));
	      String result3= text.getText();
	      
	      System.out.println(result3);
	      
	     WebElement ele = driver.findElement(By.xpath("//input[@type='text']"));
	     
	     String attribute = ele.getAttribute("name");
	     
	     System.out.println(attribute);
	     
	     
	     WebElement Day = driver.findElement(By.xpath("//select[@title='Day']"));
	     
	     Select s=new Select(Day);
	    // s.selectByIndex(9);
	      
	     s.selectByValue("6");
	     
	     WebElement Month = driver.findElement(By.xpath("//select[@title='Month']"));
	     
	     Select s1=new Select(Month);
	     
	     s1.selectByVisibleText("Apr");
	     
	  //   driver.findElement(By.id("\"u_0_g_K/\"")).sendKeys("123456789");
	     driver.findElement(By.name("reg_email__")).sendKeys("123456701");
	 //    driver.findElement(By.tagName("input")).sendKeys("Nita");
	  //   driver.findElement(By.linkText("Games")).click();
	     //driver.findElement(By.partialLinkText("Uploading")).click();
	     
	     

	}

}
