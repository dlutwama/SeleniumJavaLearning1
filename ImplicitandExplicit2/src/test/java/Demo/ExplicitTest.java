package Demo;

import java.util.concurrent.TimeUnit;

import org.apache.commons.lang3.exception.ExceptionContext;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExplicitTest {
	
	static WebDriver driver = null;

	public static void main(String[] args)
	{
		test2();
	}

	public static void test2()
	{
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		driver.get("https://msn.com");
		driver.findElement(By.name("q")).sendKeys("Tupac Shakur");
		driver.findElement(By.id("sb_form_go")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, 20);
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.id("abcdef")));
		
		driver.findElement(By.id("abcded")).click();

		driver.close();
		driver.quit();

		System.out.println("Test completed");

	}


}
