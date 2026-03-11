package Programs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import jdk.internal.org.jline.terminal.TerminalBuilder.SystemOutput;

public class basic_commands {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();  // whichever browser we're gonna work we need to first add it's driver
		WebDriver driver = new ChromeDriver();  // make object
		driver.get("https://google.com/"); // to interact with whichever  url 
		String actualtitle = driver.getTitle();
		String expectedtitle = "Goole";
		
		if(actualtitle.equalsIgnoreCase(expectedtitle))
		{
			System.out.println("Titile matched");
		}
		else
		{
			System.out.println("Title Not as expected");
		}
		driver.close();  // closes the recent window opened
		// driver.quit(); // closes all the windows
	}
}
