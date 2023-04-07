package Selenium;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage_Facebook {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
      WebDriver driver=new ChromeDriver();
      driver.get("https://www.facebook.com/");
      driver.findElement(By.xpath("//input[@type='text']")).sendKeys("patilnita1011@gmail.com");
      driver.findElement(By.xpath("//input[@type='text']")).clear();
      driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Shinderam4@");
      Thread.sleep(3000);
     // driver.findElement(By.xpath("//button[@value='1']")).click();
     driver.findElement(By.xpath("//a[contains(@class,\"_42ft\")]")).click();
      Thread.sleep(3000);
      driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("nita");
      driver.findElement(By.xpath("//input[contains(@name,'last')]")).sendKeys("patil");
      Thread.sleep(2000);
      driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("9960804765");
      Thread.sleep(3000);	
      
      driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("abc@aer123");
	
     WebElement female = driver.findElement(By.xpath("//input[@type='radio']"));
     
    // female.click();
     
      boolean result1 = female.isSelected();
     
     System.out.println(result1);
     
     if(result1==true)
     {
    	 System.out.println("radio button is selected");
     }
     else
     {
    	 System.out.println("radio button is not selected");
     }
     
     driver.findElement(By.xpath("//input[@value='-1']")).click();
     WebElement custom = driver.findElement(By.xpath("//input[@name='custom_gender']"));
     boolean result2 = custom.isDisplayed();
     
     System.out.println(result2);
     
    
     
    
     
     
     
      
      
	
	}}