package Selenium;




import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Basic {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\shind\\ChromeDrivers\\chromedriver_win32 (1)\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		//driver.get("https://www.amazon.com/");
		//driver.get("https://www.facebook.com/");
		//driver.switchTo().newWindow(WindowType.WINDOW);
		//driver.navigate().to("https://www.facebook.com/");
		//driver.switchTo().newWindow(WindowType.TAB);
	//	driver.close();//current tab closed
		//driver.quit();//current browser closed
	//	String title = driver.getTitle();
	//	System.out.println(title);
	//	String Exptitle="Amazon.com. Spend less. Smile more.";
	/*  if(title.equalsIgnoreCase(Exptitle))
	  {
		  System.out.println("Correct page");
	  }
	  else
	  {
		  System.out.println("InCorrect page");
	  }
	  driver.navigate().back();
	  driver.navigate().forward();
	  driver.navigate().refresh();
	  driver.manage().window().maximize();
	  Thread.sleep(5000);
	  driver.manage().window().minimize();
	  driver.manage().window().maximize();
	  
	 Dimension D=new Dimension(200, 300);
	 driver.manage().window().setSize(D);
	 Point P=new Point(200, 400);
	 driver.manage().window().setPosition(P);*/
	// System.out.println(driver.manage().window().getSize());
	
	}

}
