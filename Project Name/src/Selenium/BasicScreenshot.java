package Selenium;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class BasicScreenshot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/reg/");
		
		
			File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			
			
			File destination= new File ("C:\\Users\\shind\\Desktop\\Screenshot\\basic.jpg");

			FileHandler.copy(source , destination);
		
		

	}

}
