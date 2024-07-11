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

public class UserGroupCreation extends SeleniumBase{

	@BeforeClass
	public void Open_usergroup() {

		click(driver.findElement(By.xpath("//div[text()='Users & Groups']")));

	}

	@AfterClass
	public void Close_usergroup() {

		click(driver.findElement(By.xpath("//div[text()='Users & Groups']")));

	}
 

	@Test(dataProvider = "UserGroupData")
	public void Create_Usergroup(String UserGroupData[]) {


		click(driver.findElement(By.xpath("//span[text()='User Group']")));
		click(driver.findElement(By.xpath("//i[text()='add_circle']")));
		type(driver.findElement(By.xpath("//input[@aria-label='New Group']")), UserGroupData[0]);
		click(driver.findElement(By.xpath("//div[text()='Save']")));
		click(driver.findElement(By.xpath("//i[text()='arrow_drop_down']")));
		click(driver.findElement(By.xpath("//div[text()='Test']")));
		click(driver.findElement(By.xpath("(//input[@role='checkbox']/following-sibling::div)[1]")));
		click(driver.findElement(By.xpath("//i[text()='save']")));
		click(driver.findElement(By.xpath("(//div[normalize-space()='Close'])[1]")));
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		//Assert
		click(element(Locators.xpath, "//i[text()='arrow_drop_down']"));
		click(element(Locators.xpath, "//div[text()='"+UserGroupData[0]+"']"));
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String actualValue =element(Locators.xpath, "(//label[text()='Group']/following::input)[1]").getAttribute("value");
		
		Assert.assertEquals(actualValue, UserGroupData[0], "User Groups is Not Created...!");
		

	}

	@Test(dataProvider = "UserData")
	public void Create_User(String UserData[])  {

		click(driver.findElement(By.xpath("//span[text()='Users']")));
		click(driver.findElement(By.xpath("//div[text()=' Add User ']")));
		isDisplay(driver.findElement(By.xpath("//span[text()='Create User']")));
		type(driver.findElement(By.xpath("(//input[@aria-label='User Id'])[2]")), UserData[0]);
		type(driver.findElement(By.xpath("(//input[@aria-label='Name'])[2]")),UserData[1]);
		type(driver.findElement(By.xpath("(//input[@aria-label='Mobile Number'])[2]")), UserData[2]);
		type(driver.findElement(By.xpath("(//input[@aria-label='Email Id'])[2]")), UserData[3]);
		type(driver.findElement(By.xpath("//input[@aria-label='Password']")), UserData[4]);
		scroll(driver.findElement(By.xpath("(//div[@class='v-card__text'])[3]")), 200);
		click(driver.findElement(By.xpath("(//label[text()='Role']/following-sibling::div)[3]")));
		click(driver.findElement(By.xpath("(//div[text()='"+UserData[5]+"'])[2]")));
		click(driver.findElement(By.xpath("//span[text()='Create User']")));
		click(driver.findElement(By.xpath("//label[text()='Group']/following-sibling::div")));
		click(driver.findElement(By.xpath("(//div[text()='"+UserData[6]+"'])[2]")));
		click(driver.findElement(By.xpath("//span[text()='Create User']")));
		click(driver.findElement(By.xpath("(//div[text()='Create'])[2]")));
		click(driver.findElement(By.xpath("(//div[@class='v-btn__content'][normalize-space()='Close'])[7]")));
		
		// Assert
		
		createAssert(elements(Locators.xpath, "//table//tr//td[3]"), UserData[3]);

		
//		click(element(Locators.xpath, "//i[@class='fas fa-filter']"));
//		try {
//			Thread.sleep(1000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		click(element(Locators.xpath, "(//label[text()='EmailId']/following::input)[1]"));
//		click(element(Locators.xpath, "//div[text()='"+UserData[3]+"']"));
//		click(element(Locators.xpath, "(//div[text()='Filter'])[2]"));
//		click(element(Locators.xpath, "//i[@class='fas fa-close']"));
//		
//		boolean actualvalue = isDisplay(element(Locators.xpath, "//table//tr//td[text()='"+UserData[3]+"']"));
//		Assert.assertTrue(actualvalue, "User is Not Created...!");

		
		

	}

	@Test(dataProvider = "ChannelData")
	public void Create_Channel(String ChannelData[]) {

		click(driver.findElement(By.xpath("//span[text()='Channel']")));
		click(driver.findElement(By.xpath("//div[text()=' Add Channel ']")));
		isDisplay(driver.findElement(By.xpath("(//input[@aria-label='Name'])[2]")));
		type(driver.findElement(By.xpath("(//input[@aria-label='Name'])[2]")), ChannelData[0]);
		type(driver.findElement(By.xpath("(//input[@aria-label='Description'])[2]")), ChannelData[1]);
		click(driver.findElement(By.xpath("//div[text()='Create']")));
		click(driver.findElement(By.xpath("(//div[@class='v-btn__content'][normalize-space()='Close'])[3]")));
		
		createAssert(elements(Locators.xpath, "//table//tr//td[1]"),ChannelData[0] );

	}

	@Test(dataProvider = "SourceData")
	public void Create_Source(String SourceData[]) {

		click(driver.findElement(By.xpath("//span[text()='Source']")));
		click(driver.findElement(By.xpath("//div[text()=' Add Source ']")));
		isDisplay(driver.findElement(By.xpath("(//input[@aria-label='Name'])[2]")));
		type(driver.findElement(By.xpath("(//input[@aria-label='Name'])[2]")), SourceData[0]);
		type(driver.findElement(By.xpath("(//input[@aria-label='Description'])[2]")), SourceData[1]);
		click(driver.findElement(By.xpath("//div[text()='Create']")));
		click(driver.findElement(By.xpath("(//div[@class='v-btn__content'][normalize-space()='Close'])[3]")));
		
		createAssert(elements(Locators.xpath, "//table//tr//td[1]"),SourceData[0] );

	}

	@Test(dataProvider = "TeamData")
	public void Create_Team(String Teamdata[]) {

		click(driver.findElement(By.xpath("//span[text()='Team']")));
		click(driver.findElement(By.xpath("//div[text()=' Add Team ']")));
		isDisplay(driver.findElement(By.xpath("(//input[@aria-label='Name'])[2]")));
		type(driver.findElement(By.xpath("(//input[@aria-label='Name'])[2]")), Teamdata[0]);
		type(driver.findElement(By.xpath("(//input[@aria-label='Description'])[2]")), Teamdata[1]);
		click(driver.findElement(By.xpath("(//label[text()='Type']/following-sibling::div)[3]")));
		click(driver.findElement(By.xpath("(//div[text()='"+Teamdata[2]+"'])[2]")));

		String teamType = getText(driver.findElement(By.xpath("(//label[text()='Type']/following-sibling::div)[3]")));

		if (teamType.equals("All")) {

			click(driver.findElement(By.xpath("//label[text()='Lead Source']/following-sibling::div")));
			click(driver.findElement(By.xpath("//div[text()='"+Teamdata[3]+"']")));
			click(driver.findElement(By.xpath("//span[text()='Create Team']")));

			click(driver.findElement(By.xpath("//label[text()='Channel']/following-sibling::div")));
			click(driver.findElement(By.xpath("//div[text()='"+Teamdata[4]+"']")));
			click(driver.findElement(By.xpath("//span[text()='Create Team']")));

			click(driver.findElement(By.xpath("(//label[text()='Campagin']/following-sibling::div)[3]")));
			click(driver.findElement(By.xpath("(//div[text()='"+Teamdata[5]+"'])[2]")));
			click(driver.findElement(By.xpath("//span[text()='Create Team']")));

			scroll(driver.findElement(By.xpath("(//div[@class='container grid-list-md'])[2]")), 200);

			click(driver.findElement(By.xpath("(//input[@aria-label='User Assign'])[2]")));
			click(driver.findElement(By.xpath("(//div[text()='"+Teamdata[6]+"'])[2]")));
			click(driver.findElement(By.xpath("//span[text()='Create Team']")));

			click(driver.findElement(By.xpath("//div[text()='Create']")));
			click(driver.findElement(By.xpath("(//div[@class='v-btn__content'][normalize-space()='Close'])[3]")));


		}

		else if(teamType.equals("Lead Source")) {


			click(driver.findElement(By.xpath("//label[text()='Lead Source']/following-sibling::div")));
			click(driver.findElement(By.xpath("//div[text()='"+Teamdata[3]+"']")));
			click(driver.findElement(By.xpath("//span[text()='Create Team']")));


			click(driver.findElement(By.xpath("(//label[text()='Campagin']/following-sibling::div)[3]")));
			click(driver.findElement(By.xpath("(//div[text()='"+Teamdata[5]+"'])[2]")));
			click(driver.findElement(By.xpath("//span[text()='Create Team']")));

			scroll(driver.findElement(By.xpath("(//div[@class='container grid-list-md'])[2]")), 200);

			click(driver.findElement(By.xpath("(//input[@aria-label='User Assign'])[2]")));
			click(driver.findElement(By.xpath("(//div[text()='"+Teamdata[6]+"'])[2]")));
			click(driver.findElement(By.xpath("//span[text()='Create Team']")));

			click(driver.findElement(By.xpath("//div[text()='Create']")));
			click(driver.findElement(By.xpath("(//div[@class='v-btn__content'][normalize-space()='Close'])[3]")));
		}

		else {


			click(driver.findElement(By.xpath("//label[text()='Channel']/following-sibling::div")));
			click(driver.findElement(By.xpath("//div[text()='"+Teamdata[4]+"']")));
			click(driver.findElement(By.xpath("//span[text()='Create Team']")));


			click(driver.findElement(By.xpath("(//label[text()='Campagin']/following-sibling::div)[3]")));
			click(driver.findElement(By.xpath("(//div[text()='"+Teamdata[5]+"'])[2]")));
			click(driver.findElement(By.xpath("//span[text()='Create Team']")));

			scroll(driver.findElement(By.xpath("(//div[@class='container grid-list-md'])[2]")), 200);

			click(driver.findElement(By.xpath("(//input[@aria-label='User Assign'])[2]")));
			click(driver.findElement(By.xpath("(//div[text()='"+Teamdata[6]+"'])[2]")));
			click(driver.findElement(By.xpath("//span[text()='Create Team']")));

			click(driver.findElement(By.xpath("//div[text()='Create']")));
			click(driver.findElement(By.xpath("(//div[@class='v-btn__content'][normalize-space()='Close'])[3]")));
		}

		createAssert(elements(Locators.xpath, "//table//tr//td[1]"),Teamdata[0] );


	}
}
