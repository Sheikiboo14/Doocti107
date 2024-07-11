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

public class UserGroupDelete extends SeleniumBase{

	@BeforeClass
	public void Open_usergroup() {

		click(driver.findElement(By.xpath("//div[text()='Users & Groups']")));

	}

	@AfterClass
	public void Close_usergroup() {

		click(driver.findElement(By.xpath("//div[text()='Users & Groups']")));

	}
 
	@Test(dataProvider ="UserGroupData")
	public void Delete_Usergroup(String UserGroupData[]) {
		
		click(driver.findElement(By.xpath("//span[text()='User Group']")));
		click(driver.findElement(By.xpath("//i[text()='arrow_drop_down']")));
		click(driver.findElement(By.xpath("(//div[text()='"+UserGroupData[1]+"'])[1]")));
		click(driver.findElement(By.xpath("//i[text()='delete']")));
		isDisplay(driver.findElement(By.xpath("//span[text()='Delete Group info']")));
		click(driver.findElement(By.xpath("//div[text()='Yes, Delete !']")));
		click(driver.findElement(By.xpath("(//div[normalize-space()='Close'])[1]")));
		
		click(driver.findElement(By.xpath("//i[text()='arrow_drop_down']")));
		
		deleteAssert(elements(Locators.xpath, "(//div[@role='list'])[1]"),UserGroupData[1] );

	}
	
	@Test(dataProvider = "UserData")
	public void Delete_User(String UserData[]) throws InterruptedException {
		
		click(driver.findElement(By.xpath("//span[text()='Users']")));
		
		refresh();
/*
		click(element(Locators.xpath, "//i[@class='fas fa-filter']"));
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		click(element(Locators.xpath, "(//label[text()='EmailId']/following::input)[1]"));
		click(element(Locators.xpath, "//div[text()='"+UserData[3]+"']"));
		click(element(Locators.xpath, "(//div[text()='Filter'])[2]"));
		click(element(Locators.xpath, "//i[@class='fas fa-close']"));
		
		*/
		
		click(driver.findElement(By.xpath("//td[text()='"+UserData[3]+"']//following-sibling::td[3]//i[text()='delete']")));

		
		isDisplay(driver.findElement(By.xpath("//span[text()='Detele user info']")));
		click(driver.findElement(By.xpath("//div[text()='Yes, Delete !']")));
		
		click(driver.findElement(By.xpath("(//div[@class='v-btn__content'][normalize-space()='Close'])[7]")));
		
		//Delete
		
//		click(element(Locators.xpath, "//i[@class='fas fa-filter']"));
//		click(element(Locators.xpath, "(//label[text()='EmailId']/following::input)[1]"));
//		click(element(Locators.xpath, "//i[@class='fas fa-close']"));
		
		deleteAssert(elements(Locators.xpath, "//table//tr//td[3]"), UserData[3]);






	}
	
	
	@Test(dataProvider = "TeamData")
	public void Delete_Team(String TeamData[])  throws InterruptedException {
		
		click(driver.findElement(By.xpath("//span[text()='Team']")));
		click(driver.findElement(By.xpath("//table//tr//td[text()='"+TeamData[0]+"']//following-sibling::td[4]//i[text()='delete']")));
		isDisplay(driver.findElement(By.xpath("//span[text()='Delete Team']")));
		click(element(Locators.xpath, "//div[text()='Yes, Delete !']"));
		click(element(Locators.xpath, "(//div[text()='Close'])[3]"));
		
		deleteAssert(elements(Locators.xpath, "//table//tr//td[1]"), TeamData[0]);
		
	}
	
	@Test(dataProvider = "ChannelData")
	public void Delete_Channel(String ChannelData[])  throws InterruptedException {
		
		click(driver.findElement(By.xpath("//span[text()='Channel']")));
		click(driver.findElement(By.xpath("//table//tr//td[text()='"+ChannelData[0]+"']//following-sibling::td[3]//i[text()='delete']")));
		isDisplay(driver.findElement(By.xpath("//span[text()='Delete Channel']")));
		click(element(Locators.xpath, "//div[text()='Yes, Delete !']"));
		click(element(Locators.xpath, "(//div[text()='Close'])[3]"));
		
		deleteAssert(elements(Locators.xpath, "//table//tr//td[1]"), ChannelData[0]);
		
	}
	
	@Test(dataProvider = "SourceData")
	public void Delete_Source(String SourceData[])  throws InterruptedException {
		
		click(driver.findElement(By.xpath("//span[text()='Source']")));
		click(driver.findElement(By.xpath("//table//tr//td[text()='"+SourceData[0]+"']//following-sibling::td[3]//i[text()='delete']")));
		isDisplay(driver.findElement(By.xpath("//span[text()='Delete Source']")));
		click(element(Locators.xpath, "//div[text()='Yes, Delete !']"));
		click(element(Locators.xpath, "(//div[text()='Close'])[3]"));
		
		deleteAssert(elements(Locators.xpath, "//table//tr//td[1]"), SourceData[0]);
		
	}
}
