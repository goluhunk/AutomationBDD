package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Browser {

	WebDriver driver;
	ReadConfig readconfig;

	public Browser() {
		readconfig=new ReadConfig();
	}

	public WebDriver getDriver() {
		switch(readconfig.getBrowser().toLowerCase())
		{
		case
		"chrome":System. setProperty("webdriver.chrome.driver", "C:\\Users\\singh\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		driver=new ChromeDriver();
		break;
		case
		"firefox":WebDriverManager.firefoxdriver().setup();
		driver=new FirefoxDriver();
		break;
		case
		"edge":WebDriverManager.edgedriver().setup();
		driver=new EdgeDriver();
		break;
		default:
			driver=null;
			break;
		}
		return driver;
	}

}
