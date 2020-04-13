import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class WebDriverforGitHub {
	
	WebDriver driver = null;
	
	@BeforeSuite
	public void setup() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vishant.landge\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	@Test
	public void doLogin() {
		
		driver.get("http://gmail.com");		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5L, TimeUnit.SECONDS);
		driver.findElement(By.name("identifier"));
		driver.findElement(By.xpath("//*[@id='identifierNext']/span/span"));
		
	}
	
	@AfterSuite
	public void turndown() {
		
	//	driver.quit();
	}
}
