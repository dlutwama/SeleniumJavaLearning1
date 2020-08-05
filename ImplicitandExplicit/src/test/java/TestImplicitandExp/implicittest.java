package TestImplicitandExp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class implicittest {
	static WebDriver driver = null;

	public static void main(String[] args) {
		testImplicit();

	}
	
	public static void testImplicit()
	{
		//WebDriverManager.chromedriver().setup();
		//driver = new ChromeDriver();
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://google.com");
		driver.findElement(By.name("q")).sendKeys("What is my name");
		//driver.findElement(By.name("btnk")).sendKeys(Keys.RETURN);
		driver.findElement(By.name("abcd")).click();
		
		driver.close();
		driver.quit();
		
		
	}

}
