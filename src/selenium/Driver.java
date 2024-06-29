package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class Driver {
	
	public static void main(String[] args) {
		//System.setProperty("webdriver.gecko.driver", "resources\\geckodriver.exe");
		System.setProperty("webdriver.chrome.driver", "resources\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();		
		driver.get("https:\\www.3ds.com");
		driver.manage().window().maximize();
		driver.quit();
	}
}
