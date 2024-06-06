package DooctiAdmin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.WheelInput;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

public class UserCreation extends AdminLogin{
	
	@Test
	public void createUser() {
		
		driver.findElement(By.xpath("//div[text()='Users & Groups']")).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Users']")));
		
		driver.findElement(By.xpath("//span[text()='Users']")).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()=' Add User ']")));
		
		driver.findElement(By.xpath("//div[text()=' Add User ']")).click();
		
		WebElement header = driver.findElement(By.xpath("//span[text()='Create User']"));
		
		driver.findElement(By.xpath("(//input[@aria-label='User Id'])[2]")).sendKeys("Test");
		
		driver.findElement(By.xpath("(//input[@aria-label='Name'])[2]")).sendKeys("Testing");
		
		driver.findElement(By.xpath("(//input[@aria-label='Mobile Number'])[2]")).sendKeys("123");
				
		driver.findElement(By.xpath("(//input[@aria-label='Email Id'])[2]")).sendKeys("testenv_agent001@doocti.com");
		
		driver.findElement(By.xpath("//input[@aria-label='Password']")).sendKeys("Doocti@123");
		
		WebElement Popup = driver.findElement(By.xpath("(//div[@class='v-card__text'])[3]"));
		
		WheelInput.ScrollOrigin scroll = WheelInput.ScrollOrigin.fromElement(Popup);
		new Actions(driver)
			.scrollFromOrigin(scroll, 0,400)
			.perform();
		
		
		driver.findElement(By.xpath("(//label[text()='Role']/following-sibling::div)[3]")).click();
		
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("(//div[text()='Agent'])[2]")));
		
		driver.findElement(By.xpath("(//div[text()='Agent'])[2]")).click();
		
		header.click();
		
		driver.findElement(By.xpath("//label[text()='Group']/following-sibling::div")).click();
		
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("(//div[text()='testenv_admin'])[2]")));
		
		driver.findElement(By.xpath("(//div[text()='testenv_admin'])[2]")).click();
		
		header.click();

		driver.findElement(By.xpath("(//div[text()='Create'])[2]")).click();
		
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("(//div[@class='v-btn__content'][normalize-space()='Close'])[7]")));
		
		driver.findElement(By.xpath("(//div[@class='v-btn__content'][normalize-space()='Close'])[7]")).click();
	}
	
	

}
