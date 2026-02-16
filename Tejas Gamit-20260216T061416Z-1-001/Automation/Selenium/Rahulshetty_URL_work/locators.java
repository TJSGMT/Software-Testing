package Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class locators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();  
		driver.get("https://rahulshettyacademy.com/locatorspractice/"); 
		
		// Click on link
		driver.findElement(By.linkText("Forgot your password?")).click();
		driver.findElement(By.cssSelector("input[placeholder='Name']")).sendKeys("Tjs");
		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("Cognac@gmail.com");
		driver.findElement(By.cssSelector("input[placeholder='Phone Number']")).sendKeys("9945623476");
		Thread.sleep(3000);
		driver.navigate().refresh();
		driver.findElement(By.linkText("Forgot your password?")).click();
		driver.findElement(By.className("reset-pwd-btn")).click();
//		WebElement text = driver.findElement(By.tagName("p"));
//		String s1 = text.getText();
//		System.out.println(s1);
//		Thread.sleep(5000);
		driver.quit();
	}

}
