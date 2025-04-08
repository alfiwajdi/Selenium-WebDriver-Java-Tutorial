package alfipackage;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddToCartArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/USER/documents/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		String[] itemNeeded = {"Brocolli", "Cucumber", "Beetroot"};
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		driver.manage().window().maximize();

		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));

		for (int i = 0; i < products.size(); i++) 
		{
			//name we got from the product
			String name =products.get(i).getText();
			//format it to get actual vegetable name
			
			//Check whether name you extracted is present in array or not
			//Convert array into array list for easy search
			List itemNeededList = Arrays.asList(itemNeeded);

			if(itemNeededList.contains(name))
			{
				driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
				break;
			}

		}

	}

}
