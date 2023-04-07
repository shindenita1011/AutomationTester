package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Checkedge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.edge.driver","C:\\Users\\shind\\ChromeDrivers\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver= (WebDriver) new EdgeDriver();
		driver.get("https://www.facebook.com/");

		

	}

}
