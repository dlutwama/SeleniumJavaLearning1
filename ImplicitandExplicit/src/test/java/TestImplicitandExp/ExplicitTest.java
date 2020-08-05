package TestImplicitandExp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExplicitTest {
	 static WebDriver driver = null;

	public static void main(String[] args) {
		testExplicit();

	}
	

	public static void testExplicit()
	{
		//WebDriverManager.chromedriver().setup();
		//driver = new ChromeDriver();
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		driver.get("https://google.com");
		driver.findElement(By.name("q")).sendKeys("What is my name");
		//driver.findElement(By.name("btnk")).sendKeys(Keys.RETURN);
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.name("abcdef")));
		
		driver.findElement(By.name("abcd")).click();
		
		driver.close();
		driver.quit();
		
		
	}


}
