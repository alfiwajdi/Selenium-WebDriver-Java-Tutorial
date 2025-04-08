package alfipackage;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class SelfIntroduction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Invoking browser
		//Chrome - ChromeDriver exten -> Methods close get
		//Firefox - FirefoxDriver -> methods close get
		//Safari safariDriver -> methods close get
		//webDriver close get
		//webDriver methods + class method
		
		//ChromeDriver.exe -> chrome browser     Selenium Manager
		//Step to invoke chrome driver //
		//Selenium Manager
		
		// chromedriver.exe -> chrome browser 
		System.setProperty("webdriver.chrome.driver", "/Users/USER/documents/chromedriver.exe");
		
		//webdriver.chrome.driver -> value of the path
		WebDriver driver = new ChromeDriver();
		
		
		//FireFox launch
		//geckodriver
			
		//webdriver.geckodriver
//		System.setProperty("webdriver.gecko.driver", "/Users/USER/documents/geckodriver.exe");
//		WebDriver driver = new FirefoxDriver();
		
		//Microsoft Edge
//		WebDriver driver = new EdgeDriver();
//		System.setProperty("webdriver.edge.driver", "/Users/USER/documents/msedgedriver.exe");
			
		driver.get("https://rahulshettyacademy.com");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.close();
		
		

	}

}
