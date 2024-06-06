package DooctiAdmin;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AdminLogin {
	
	protected RemoteWebDriver driver = null;
	
	WebDriverWait wait = null;

	String Admin_URL ="http://localhost:8080/v2.1.106/";
	
	String UserName = "testenv_admin@doocti.com";
	
	String Password ="Doocti@123";
	
	@BeforeTest
	public void StartApp() {
		
		
		WebDriverManager.chromedriver().setup();
		
		ChromeOptions option = new ChromeOptions();
		
		option.addArguments("--incognito");
		
		driver = new ChromeDriver(option);
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		wait = new WebDriverWait(driver, Duration.ofSeconds(30));

		
		driver.get(Admin_URL);
		
		driver.findElement(By.xpath("//input[@aria-label='UserName']")).sendKeys(UserName);
		
		driver.findElement(By.xpath("//input[@aria-label='Password']")).sendKeys(Password);
		
		driver.findElement(By.xpath("//div[text()='Login']")).click();
		

		
		
	}
	
	@AfterTest(enabled = false)
	public void closeApp() {
		
		driver.findElement(By.xpath("//i[@title='Sign Out']")).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='OK']")));
		
		driver.findElement(By.xpath("//div[text()='OK']")).click();
	}
	

}
