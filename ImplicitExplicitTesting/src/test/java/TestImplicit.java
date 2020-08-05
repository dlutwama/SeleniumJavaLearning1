import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestImplicit {
	
	static WebDriver driver = null;
	
	public static void main(String[] args) {
		test1();
		
	}
	
	public static void test1()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://msn.com");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.name("q")).sendKeys("Tupac Shakur");
		driver.findElement(By.id("sb_form_go")).click();
		driver.findElement(By.id("abcdef")).click();
		driver.close();
		driver.quit();
		System.out.println("Test completed");
		
		
	}
	

}
