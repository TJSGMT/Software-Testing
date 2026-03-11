package Practics_progrmas;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByCssSelector;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Loketors {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://rahulshettyacademy.com/locatorspractice");
		//Link text
		//driver.findElement(By.linkText("Forgot your password?")).click(); // find element to click and clicking it	
	//	driver.findElement(By.partialLinkText("Forgot")).click(); // second trick	
		
		//ID
		WebElement name = driver.findElement(By.id("inputUsername"));// make an object of that element	
		name.click();
		name.sendKeys("Tejas"); // for adding values to element
		
		//name
//		WebElement pass =driver.findElement(By.name("inputPassword"));
//		pass.click();
//		pass.sendKeys("#$%#@tjs");
		
		//css selector
//		driver.findElement(By.cssSelector("input[placeholder=Password]")).sendKeys("TJSGMT");
		
		//Xpath  (Relative path)
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("cognac");
		Thread.sleep(4000);
		driver.quit();
	}

}
