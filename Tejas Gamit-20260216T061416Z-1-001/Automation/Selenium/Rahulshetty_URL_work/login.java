package Practics_progrmas;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByCssSelector;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class login {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/locatorspractice");
		driver.manage().window().maximize();
		driver.findElement(By.id("inputUsername")).sendKeys("Tejas");
		driver.findElement(By.name("inputPassword")).sendKeys("$#@#123");
		driver.findElement(By.cssSelector(".signInBtn")).click(); // css loactor
		Thread.sleep(4000);
	    driver.findElement(By.linkText("Forgot your password?")).click();
		WebElement tag =driver.findElement(By.tagName("p"));
		String s1 = tag.getText();
		System.out.println(s1);
		
		driver.close();
	}

}
