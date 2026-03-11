package Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class task1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new  ChromeDriver();
		driver.get("https://rahulshettyacademy.com/locatorspractice");		
		Thread.sleep(2000);
		driver.findElement(By.linkText("Forgot your password?")).click();
		driver.findElement(By.xpath("//input[placeholder='Name']")).sendKeys("Cognac");
		driver.findElement(By.xpath("//input[placeholder='Email']")).sendKeys("TJSGMT@gmail.com");
		driver.findElement(By.xpath("//input[placeholder='Phone Number']")).sendKeys("9945623476");
//		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
	//	Thread.sleep(3000);
//		driver.findElement(By.className("go-to-login-btn")).click();
//		driver.findElement(By.id("inputUsername")).sendKeys("Tjs");
//		driver.findElement(By.name("inputPassword")).sendKeys("rahulshettyacademy");
//		Thread.sleep(3000);
//		driver.findElement(By.id("chkboxTwo")).click();
//		driver.findElement(By.cssSelector(".signInBtn")).click();
//
//		System.out.println("Task from 1 To 7 Done !!!");
//		
		Thread.sleep(4000);
		driver.close();
	}

}
