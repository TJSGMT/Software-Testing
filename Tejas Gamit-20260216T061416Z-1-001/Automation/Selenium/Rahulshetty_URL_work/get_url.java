package Practics_progrmas;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class get_url {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com./");
		String actualurl= driver.getCurrentUrl();	
		String expectedurl = "https://livestrong.com/";
		if(actualurl.equalsIgnoreCase(expectedurl)) {
			System.out.println("Your're on the right address");
		}
		else
			System.out.println("Wrong address!!!!");
	//	assertEquals("https://www.google.com/", driver.getCurrentUrl());
		
	}

}
