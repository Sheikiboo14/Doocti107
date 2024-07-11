package Doocti107_Admin;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.AssertJUnit;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.doocti.seleniumEnum.Locators;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import DooctiAdmin.SeleniumBase;

public class UserGroupUpdate extends SeleniumBase{

	@BeforeClass
	public void Open_usergroup() {

		click(driver.findElement(By.xpath("//div[text()='Users & Groups']")));

	}

	@AfterClass
	public void Close_usergroup() {

		click(driver.findElement(By.xpath("//div[text()='Users & Groups']")));

	}

	@Test(dataProvider = "UserGroupData")
	public void Update_Usergroups(String UserGroupData[]) {
		
		click(driver.findElement(By.xpath("//span[text()='User Group']")));
		click(driver.findElement(By.xpath("//i[text()='arrow_drop_down']")));
		click(driver.findElement(By.xpath("(//div[text()='"+UserGroupData[0]+"'])[1]")));
		clear(element(Locators.xpath, "(//label[text()='Group']/following::input)[1]"));
		type(element(Locators.xpath, "(//label[text()='Group']/following::input)[1]"), UserGroupData[1]);
		click(driver.findElement(By.xpath("(//input[@role='checkbox']/following-sibling::div)[1]")));
		click(driver.findElement(By.xpath("//i[text()='save']")));
		isDisplay(driver.findElement(By.xpath("//span[text()='Save Group info']")));
		click(driver.findElement(By.xpath("//div[text()='Yes, Save !']")));
		click(driver.findElement(By.xpath("(//div[normalize-space()='Close'])[1]"))); 
		
		// Assert
		click(driver.findElement(By.xpath("//i[text()='arrow_drop_down']")));
		click(driver.findElement(By.xpath("(//div[text()='"+UserGroupData[1]+"'])[1]")));
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String actualValue =element(Locators.xpath, "(//label[text()='Group']/following::input)[1]").getAttribute("value");
		
		System.out.println(actualValue);
		
		assertEquals(actualValue, UserGroupData[1], "User Groups is Not Created...!");
		
	}

	@Test(dataProvider = "UserData")
	public void Update_User(String UserData[]) throws InterruptedException {
		
		click(driver.findElement(By.xpath("//span[text()='Users']")));
		click(driver.findElement(By.xpath("//td[text()='"+UserData[3]+"']//following-sibling::td[3]//i[text()='editz']")));
		isDisplay(driver.findElement(By.xpath("//span[text()='Update User']")));
		scroll(driver.findElement(By.xpath("(//nav[contains(@class,'modal-header--sticky v-toolbar')]/following-sibling::div)[3]")), 200);
		click(driver.findElement(By.xpath("//label[text()='Status']/following-sibling::div")));
		Thread.sleep(1000);
		click(driver.findElement(By.xpath("//div[text()='"+UserData[12]+"']")));
		click(driver.findElement(By.xpath("//div[text()='Update']")));
		click(driver.findElement(By.xpath("(//div[@class='v-btn__content'][normalize-space()='Close'])[7]")));
		
		updateAssert(element(Locators.xpath, "//table//tr//td[text()='"+UserData[3]+"']//following-sibling::td[1]"), UserData[12]);

		
	}
	
	
	@Test(dataProvider = "TeamData")
	public void Update_Team(String TeamData[])  throws InterruptedException {
		
		click(driver.findElement(By.xpath("//span[text()='Team']")));
		click(driver.findElement(By.xpath("//td[text()='"+TeamData[0]+"']//following-sibling::td[4]//i[@class='v-icon mr-4 v-icon--link material-icons theme--light blue--text']")));
		isDisplay(driver.findElement(By.xpath("//span[text()='Update Team']")));
		scroll(driver.findElement(By.xpath("(//div[@class='container grid-list-md'])[1]")), 200);
		click(driver.findElement(By.xpath("//label[text()='Status']/following-sibling::div")));
		Thread.sleep(1000);
		click(driver.findElement(By.xpath("//div[text()='"+TeamData[9]+"']")));
		scroll(driver.findElement(By.xpath("(//div[@class='container grid-list-md'])[1]")), 200);
		click(driver.findElement(By.xpath("//div[text()='Update']")));
		click(driver.findElement(By.xpath("(//div[@class='v-btn__content'][normalize-space()='Close'])[3]")));
		
		updateAssert(element(Locators.xpath, "//table//tr//td[text()='"+TeamData[0]+"']//following-sibling::td[3]"), TeamData[9]);

	}

	@Test(dataProvider = "ChannelData")
	public void Update_Channel(String ChannelData[]) throws InterruptedException {
		
		click(driver.findElement(By.xpath("//span[text()='Channel']")));
		click(driver.findElement(By.xpath("//td[text()='"+ChannelData[0]+"']//following-sibling::td[3]//i[@class='v-icon mr-4 v-icon--link material-icons theme--light blue--text']")));
		isDisplay(driver.findElement(By.xpath("//span[text()='Update Channel']")));
		Thread.sleep(1000);
		click(driver.findElement(By.xpath("//label[text()='Status']/following-sibling::div")));
		click(driver.findElement(By.xpath("//div[text()='"+ChannelData[4]+"']")));
		click(driver.findElement(By.xpath("//span[text()='Update Channel']")));
		click(driver.findElement(By.xpath("//div[text()='Update']")));
		click(driver.findElement(By.xpath("(//div[@class='v-btn__content'][normalize-space()='Close'])[3]")));

		updateAssert(element(Locators.xpath, "//table//tr//td[text()='"+ChannelData[0]+"']//following-sibling::td[2]"), ChannelData[4]);

		
	}
	
	
	@Test(dataProvider = "SourceData")
	public void Update_Source(String SourceData[]) throws InterruptedException {
		
		click(driver.findElement(By.xpath("//span[text()='Source']")));
		click(driver.findElement(By.xpath("//td[text()='"+SourceData[0]+"']//following-sibling::td[3]//i[@class='v-icon mr-4 v-icon--link material-icons theme--light blue--text']")));
		isDisplay(driver.findElement(By.xpath("//span[text()='Update Source']")));
		Thread.sleep(1000);

		click(driver.findElement(By.xpath("//label[text()='Status']/following-sibling::div")));

		click(driver.findElement(By.xpath("//div[text()='"+SourceData[4]+"']")));
		click(driver.findElement(By.xpath("//span[text()='Update Source']")));
		click(driver.findElement(By.xpath("//div[text()='Update']")));
		click(driver.findElement(By.xpath("(//div[text()='Close'])[3]")));

		
		updateAssert(element(Locators.xpath, "//table//tr//td[text()='"+SourceData[0]+"']//following-sibling::td[2]"), SourceData[4]);

		
	}
	}
