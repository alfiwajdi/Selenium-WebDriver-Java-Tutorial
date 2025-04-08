package alfipackage;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddToCartArrayList4 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver.", "/Users/USER/documents/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		String[] itemNeeded = { "Brocolli", "Cucumber", "Beetroot", "Carrot" };
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		Thread.sleep(300);
		AddToCartArrayList4 b = new AddToCartArrayList4();
		b.addItems(driver, itemNeeded);
		driver.findElement(By.cssSelector("img[alt='Cart']")).click();
		driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();
		driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacadeny");

	}

	
	public void addItems(WebDriver driver, String[] itemNeeded) {
		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));
		int j = 0;

		for (int i = 0; i < products.size(); i++) {

			// Brocolli - 1 Kg
			// Brocolli, 1 kg
			String[] name = products.get(i).getText().split("-");
			String formattedName = name[0].trim();

			List itemNeededList = Arrays.asList(itemNeeded);

			// format it to get actual vegetable name

			// Check whether formattedName present in itemNeeded array list or not
			// Convert array into array list for easy search
			if (itemNeededList.contains(formattedName)) {
				j++;
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();

				if (j == itemNeeded.length) {
					break;

				}

			}

		}

	}

}
