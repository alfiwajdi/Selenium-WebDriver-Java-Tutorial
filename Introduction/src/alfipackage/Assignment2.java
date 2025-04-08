package alfipackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("driver.chrome.driver", "/Users/USER/documents/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.manage().window().maximize();
		driver.findElement(By.name("name")).click();
		driver.findElement(By.name("name")).sendKeys("Alfi");
		driver.findElement(By.name("email")).click();
		driver.findElement(By.name("email")).sendKeys("alfiwajdi@gmail.com");
		driver.findElement(By.id("exampleInputPassword1")).click();
		driver.findElement(By.id("exampleInputPassword1")).sendKeys("1234");
//		driver.findElement(By.id("exampleCheck1")).click();
//		driver.findElement(By.cssSelector("input[type='checkbox']")).click();
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		System.out.println(driver.findElement(By.cssSelector("input[type='checkbox']")).isSelected());
		WebElement staticDropdown = driver.findElement(By.id("exampleFormControlSelect1"));
		Select dropdown = new Select(staticDropdown);
		dropdown.selectByIndex(1);
		//To know which one get selected
		System.out.println(dropdown.getFirstSelectedOption().getText());
		////To make sure/check whether that checkbox is selected or not.
		System.out.println(driver.findElement(By.cssSelector("input[id='inlineRadio1']")).isSelected());
		driver.findElement(By.cssSelector("input[id='inlineRadio1']")).click();
		System.out.println(driver.findElement(By.cssSelector("input[id='inlineRadio1']")).isSelected());
		driver.findElement(By.xpath("//input[@name='bday']")).sendKeys("16/01/1998");
		driver.findElement(By.className("btn-success")).click();
		System.out.println(driver.findElement(By.className("alert-dismissible")).getText());
		
	}

}
