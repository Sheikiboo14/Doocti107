package Doocti107_Admin;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.AssertJUnit;
import java.awt.AWTException;
import java.time.Duration;

import org.doocti.seleniumEnum.Locators;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import DooctiAdmin.SeleniumBase;

public class Config_Update extends SeleniumBase{
	
	@BeforeClass
	public void openConfig() {

		click(driver.findElement(By.xpath("//div[text()='Configurations']")));

	}

	@AfterClass
	public void closeConfig() {

		click(driver.findElement(By.xpath("//div[text()='Configurations']")));

	}
	
	@Test(dataProvider = "DispoData")
	public void Update_Dispo(String DispoData[]) {
		
		click(driver.findElement(By.xpath("//span[text()='Dispositions']")));
		
		configFilter(element(Locators.xpath, "//i[@class='fas fa-filter']"),
				element(Locators.xpath, "(//input[@aria-label='Disposition'])[3]"),
				DispoData[0], true);
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
		click(element(Locators.xpath, "//i[text()='edit']"));
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		click(element(Locators.xpath, "(//i[text()='arrow_drop_down'])[2]"));
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		click(element(Locators.xpath, "(//div[text()='"+DispoData[5]+"'])[2]"));
		
		click(element(Locators.xpath, "//div[text()='Update']"));
		
		click(driver.findElement(By.xpath("(//div[text()='Close'])[3]")));
		
		updateAssert(DispoData[0], DispoData[5]);
		
	}
	
	@Test(dataProvider = "DispoData")
	public void Update_Dispowithaction(String DispoData[]) {
		
		click(driver.findElement(By.xpath("//span[text()='Dispositions']")));
		
		configFilter(element(Locators.xpath, "//i[@class='fas fa-filter']"),
				element(Locators.xpath, "(//input[@aria-label='Disposition'])[3]"),
				DispoData[7], true);
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
		click(element(Locators.xpath, "//i[text()='edit']"));
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		click(element(Locators.xpath, "(//i[text()='arrow_drop_down'])[2]"));
		
		
		
		click(element(Locators.xpath, "(//div[text()='"+DispoData[5]+"'])[2]"));
		
		click(element(Locators.xpath, "//div[text()='Update']"));
		
		click(driver.findElement(By.xpath("(//div[text()='Close'])[3]")));
		
		updateAssert(DispoData[7], DispoData[5]);
		
	}
	
	@Test(dataProvider = "SubDispoData")
	public void update_SubDispo(String SubDispoData[]) {
		
		click(driver.findElement(By.xpath("//span[text()='Sub-Dispositions']")));
		
		configFilter(element(Locators.xpath, "//i[@class='fas fa-filter']"),
				element(Locators.xpath, "//input[@aria-label='Sub Disposition']"),
				SubDispoData[1], true);
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
		click(element(Locators.xpath, "//i[text()='edit']"));
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		click(element(Locators.xpath, "(//i[text()='arrow_drop_down'])[2]"));
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		click(element(Locators.xpath, "(//div[text()='"+SubDispoData[5]+"'])[2]"));
		
		click(element(Locators.xpath, "//div[text()='Update']"));
		
		click(driver.findElement(By.xpath("(//div[text()='Close'])[3]")));
		
		updateAssert(SubDispoData[1], SubDispoData[5]);


	}
	
	@Test(dataProvider = "LeadStatusData")
	public void update_LeadStatus(String LeadStatusData[]) {
		
		click(driver.findElement(By.xpath("//span[text()='Lead Status']")));
		
		configFilter(element(Locators.xpath, "//i[@class='fas fa-filter']"),
				element(Locators.xpath, "(//input[@aria-label='Name'])[3]"),
				LeadStatusData[0], true);

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
		click(element(Locators.xpath, "//i[text()='edit']"));
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		click(element(Locators.xpath, "(//i[text()='arrow_drop_down'])[1]"));
		
		click(element(Locators.xpath, "(//div[text()='"+LeadStatusData[3]+"'])[2]"));
		
		click(element(Locators.xpath, "//div[text()='Update']"));

		click(driver.findElement(By.xpath("(//div[text()='Close'])[3]")));
		
		updateAssert(LeadStatusData[0], LeadStatusData[3]);
		
		
	}
	
	
	@Test(dataProvider = "LeadStatusData")
	public void update_LeadStatuswithclosed(String LeadStatusData[]) {
		
		click(driver.findElement(By.xpath("//span[text()='Lead Status']")));
		
		configFilter(element(Locators.xpath, "//i[@class='fas fa-filter']"),
				element(Locators.xpath, "(//input[@aria-label='Name'])[3]"),
				LeadStatusData[2], true);

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
		click(element(Locators.xpath, "//i[text()='edit']"));
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		click(element(Locators.xpath, "(//i[text()='arrow_drop_down'])[1]"));
		
		click(element(Locators.xpath, "(//div[text()='"+LeadStatusData[3]+"'])[2]"));
		
		click(element(Locators.xpath, "//div[text()='Update']"));

		click(driver.findElement(By.xpath("(//div[text()='Close'])[3]")));
		
		updateAssert(LeadStatusData[2], LeadStatusData[3]);
		
		
	}
	
	@Test(dataProvider = "TicketStatusData")
	public void update_TicketStatus(String TicketStatusData[]) {
		
		scroll(element(Locators.id, "app-sidebar"), 200);
		
		click(driver.findElement(By.xpath("//span[text()='Ticket Status']")));
		
		configFilter(element(Locators.xpath, "//i[@class='fas fa-filter']"),
				element(Locators.xpath, "(//input[@aria-label='Name'])[3]"),
				TicketStatusData[0], false);
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		click(element(Locators.xpath, "(//i[@class='v-icon mr-4 v-icon--link material-icons theme--light blue--text'][normalize-space()='edit'])[1]"));
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		click(element(Locators.xpath, "(//i[text()='arrow_drop_down'])[1]"));
		
		click(element(Locators.xpath, "(//div[text()='"+TicketStatusData[4]+"'])[2]"));
		
		click(element(Locators.xpath, "//div[text()='Update']"));

		click(driver.findElement(By.xpath("(//div[text()='Close'])[3]")));
		
		updateAssert(TicketStatusData[0], TicketStatusData[4]);
		
		
	}
	

	@Test(dataProvider = "TicketStatusData")
	public void update_TicketStatuswithclosed(String TicketStatusData[]) {
		
		scroll(element(Locators.id, "app-sidebar"), 200);
		
		click(driver.findElement(By.xpath("//span[text()='Ticket Status']")));
		
		configFilter(element(Locators.xpath, "//i[@class='fas fa-filter']"),
				element(Locators.xpath, "(//input[@aria-label='Name'])[3]"),
				TicketStatusData[5], false);
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		click(element(Locators.xpath, "(//i[@class='v-icon mr-4 v-icon--link material-icons theme--light blue--text'][normalize-space()='edit'])[1]"));
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		click(element(Locators.xpath, "(//i[text()='arrow_drop_down'])[1]"));
		
		click(element(Locators.xpath, "(//div[text()='"+TicketStatusData[4]+"'])[2]"));
		
		click(element(Locators.xpath, "//div[text()='Update']"));

		click(driver.findElement(By.xpath("(//div[text()='Close'])[3]")));
		
		updateAssert(TicketStatusData[5], TicketStatusData[4]);
		
		
	}
	@Test(dataProvider = "PausecodeData")
	public void update_Pausecode(String PausecodeData[]) {
		
		scroll(element(Locators.id, "app-sidebar"), 200);
		
		click(driver.findElement(By.xpath("//span[text()='Pause Codes']")));
		
		configFilter(element(Locators.xpath, "//i[@class='fas fa-filter']"),
				element(Locators.xpath, "//input[@aria-label='Name']"),
				PausecodeData[0], true);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		click(element(Locators.xpath, "//i[text()='edit']"));
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		click(element(Locators.xpath, "(//i[text()='arrow_drop_down'])[1]"));
		
		click(element(Locators.xpath, "//div[text()='"+PausecodeData[6]+"']"));
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		click(element(Locators.xpath, "//div[text()='Update']"));

		click(driver.findElement(By.xpath("(//div[text()='Close'])[3]")));
		
		updateAssert(PausecodeData[0], PausecodeData[6]);
		
		
	}
	
	
	@Test(dataProvider = "AudioData")
	public void update_Audio(String AudioData[])  { 

		click(driver.findElement(By.xpath("//span[text()='Audio Store']")));
		
		configFilter(element(Locators.xpath, "//i[@class='fas fa-filter']"),
				element(Locators.xpath, "//input[@aria-label='Name']"),
				AudioData[3], true);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		click(element(Locators.xpath, "//i[text()='edit']"));
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		click(element(Locators.xpath, "(//i[text()='arrow_drop_down'])[1]"));
		
		click(element(Locators.xpath, "(//div[text()='"+AudioData[2]+"'])[2]"));
		
		click(element(Locators.xpath, "//div[text()='Update']"));

		click(driver.findElement(By.xpath("(//div[text()='Close'])[3]")));

//		updateAssert(AudioData[3], AudioData[2]);

	}	
	
	@Test(dataProvider = "DidData")
	public void update_DID(String DidData[])  {
	
		click(driver.findElement(By.xpath("//span[text()='DID Number']")));
		
		type(element(Locators.xpath, "(//input[@aria-label='DID Number'])[3]"), DidData[0]);
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		click(element(Locators.xpath, "//i[text()='edit']"));
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		click(element(Locators.xpath, "(//i[text()='arrow_drop_down'])[1]"));

		click(element(Locators.xpath, "//div[text()='"+DidData[5]+"']"));
		
		click(element(Locators.xpath, "(//i[text()='arrow_drop_down'])[2]"));
		
		click(element(Locators.xpath, "//div[text()='"+DidData[6]+"']"));
		
		click(element(Locators.xpath, "//div[text()='Update']"));
		
		click(element(Locators.xpath, "(//div[@class='v-btn__content'][normalize-space()='Close'])[4]"));
		
		updateAssert(DidData[0], DidData[5]);


	 }
	
	
	@Test(dataProvider = "TagData")
	public void update_Tag(String TagData[])  {

		click(driver.findElement(By.xpath("//span[text()='Tags']")));
		
		configFilter(element(Locators.xpath, "//i[@class='fas fa-filter']"),
				element(Locators.xpath, "(//input[@aria-label='Name'])[3]"),
				TagData[0], true);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		click(element(Locators.xpath, "//i[text()='edit']"));
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		click(element(Locators.xpath, "(//i[text()='arrow_drop_down'])[1]"));
		
		click(element(Locators.xpath, "//div[text()='"+TagData[4]+"']"));
		
		click(element(Locators.xpath, "//div[text()='Update']"));
		
		click(element(Locators.xpath, "//div[text()='Close']"));
		
		updateAssert(TagData[0], TagData[4]);



	}
	
	
	@Test(dataProvider = "AnnouncementData")
	public void update_Announcement(String AnnouncementData[] ) {

		click(driver.findElement(By.xpath("//span[text()='Announcements']")));
		
		configFilter(element(Locators.xpath, "//i[@class='fas fa-filter']"),
				element(Locators.xpath, "(//input[@aria-label='Name'])[3]"),
				AnnouncementData[0], true);
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		click(element(Locators.xpath, "//i[text()='edit']"));
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		click(element(Locators.xpath, "(//i[text()='arrow_drop_down'])[1]"));
		
		click(element(Locators.xpath, "(//div[text()='"+AnnouncementData[5]+"'])[2]"));
		
		click(element(Locators.xpath, "(//i[text()='arrow_drop_down'])[2]"));
		
		click(element(Locators.xpath, "(//div[text()='"+AnnouncementData[2]+"'])[2]"));

		click(element(Locators.xpath, "(//div[text()='"+AnnouncementData[6]+"'])[1]"));
		
		click(element(Locators.xpath, "(//div[@class='v-toolbar__content'])[1]"));
		
		click(element(Locators.xpath, "//div[text()='Update']"));
		
		click(element(Locators.xpath, "(//div[@class='v-btn__content'][normalize-space()='Close'])[4]"));
		
		updateAssert(AnnouncementData[0], AnnouncementData[5]);
		
		updateAssert(AnnouncementData[0], AnnouncementData[6]);

		
	}


	@Test(dataProvider = "ScriptData")
	public void update_ScriptURL(String ScriptData[]) {

		click(driver.findElement(By.xpath("//span[text()='Scripts']")));

		configFilter(element(Locators.xpath, "//i[@class='fas fa-filter']"),
				element(Locators.xpath, "(//label[text()='Name']/following::input)[1]"),
				ScriptData[0], true);
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		click(element(Locators.xpath, "//i[text()='edit']"));
	
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		click(element(Locators.xpath, "(//i[text()='arrow_drop_down'])[1]"));
		
		click(element(Locators.xpath, "//div[text()='"+ScriptData[8]+"']"));
		
		click(element(Locators.xpath, "//div[text()='Update']"));
		
		click(element(Locators.xpath , "(//div[text()='Close'])[3]"));

		configFilter(element(Locators.xpath, "//i[@class='fas fa-filter']"),
				element(Locators.xpath, "(//label[text()='Name']/following::input)[1]"),
				ScriptData[0], true);
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		click(element(Locators.xpath, "//i[text()='edit']"));
		
		String actualValue = getText(element(Locators.xpath, "//label[text()='Status']/following-sibling::div"));
		
		Assert.assertEquals(actualValue, ScriptData[8], "Script is Not Updated");
		
		click(element(Locators.xpath, "(//div[text()='Close'])[1]"));

		
		
	}
	
	
	@Test(dataProvider = "ScriptData")
	public void update_ScriptText(String ScriptData[]) {

		click(driver.findElement(By.xpath("//span[text()='Scripts']")));

		configFilter(element(Locators.xpath, "//i[@class='fas fa-filter']"),
				element(Locators.xpath, "(//label[text()='Name']/following::input)[1]"),
				ScriptData[1], true);
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		click(element(Locators.xpath, "//i[text()='edit']"));
	
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		click(element(Locators.xpath, "(//i[text()='arrow_drop_down'])[1]"));
		
		click(element(Locators.xpath, "//div[text()='"+ScriptData[8]+"']"));
		
		click(element(Locators.xpath, "//div[text()='Update']"));
		
		click(element(Locators.xpath , "(//div[text()='Close'])[3]"));

		configFilter(element(Locators.xpath, "//i[@class='fas fa-filter']"),
				element(Locators.xpath, "(//label[text()='Name']/following::input)[1]"),
				ScriptData[1], true);
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		click(element(Locators.xpath, "//i[text()='edit']"));
		
		String actualValue = getText(element(Locators.xpath, "//label[text()='Status']/following-sibling::div"));
		
		Assert.assertEquals(actualValue, ScriptData[8], "Script is Not Updated");
		
		click(element(Locators.xpath, "(//div[text()='Close'])[1]"));

		
		
	}
	
	@Test(dataProvider = "SLAData")
	public void update_SLA(String SLAData[]) {

		click(driver.findElement(By.xpath("//span[text()='SLA']")));


		configFilter(element(Locators.xpath, "//i[@class='fas fa-filter']"),
				element(Locators.xpath, "(//input[@aria-label='Name'])[3]"),
				SLAData[0], true);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		click(element(Locators.xpath, "//i[text()='edit']"));
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		click(element(Locators.xpath, "(//i[text()='arrow_drop_down'])[2]"));
		
		click(element(Locators.xpath, "(//div[text()='"+SLAData[6]+"'])[3]"));
		
		click(element(Locators.xpath, "(//div[@class='v-toolbar__content'])[1]"));
		
		click(element(Locators.xpath, "(//button[contains(@class,'v-btn theme--light')]//div)[1]"));
		
		
		click(element(Locators.xpath, "(//div[text()='Close'])[3]"));
		
//		System.out.println(getText(element(Locators.xpath, "(//div[@class='v-snack__wrapper']//div)[1]")));

		
		updateAssert(SLAData[0], SLAData[6].toLowerCase());
				
		
	}
	
	@Test(dataProvider = "SchedulerData")
	public void update_Schedule(String SchedulerData[]) {


		click(driver.findElement(By.xpath("//span[text()='Scheduler']")));
		
		configFilter(element(Locators.xpath, "//i[@class='fas fa-filter']"),
				element(Locators.xpath, "//input[@aria-label='Email']"),
				SchedulerData[2], true);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		click(element(Locators.xpath, "//i[text()='edit']"));
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		click(element(Locators.xpath, "(//i[text()='arrow_drop_down'])[2]"));
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		click(element(Locators.xpath, "(//div[text()='"+SchedulerData[3]+"'])[2]"));

		click(element(Locators.xpath, "//div[text()='Update']"));
		
		click(element(Locators.xpath, "(//div[text()='Close'])[3]"));
		
		updateAssert(SchedulerData[0], " "+SchedulerData[3]+" ");

		
	}
	
	
	@Test(dataProvider = "InboundData")
	public void update_Inbound(String InboundData[]) {


		click(driver.findElement(By.xpath("//span[text()='Inbound Route']")));
		
		click(element(Locators.xpath, "//table//tr//td[text()='"+InboundData[0]+"']//following-sibling::td[3]//i[text()='edit']"));
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		click(element(Locators.xpath, "(//i[text()='arrow_drop_down'])[1]"));
		
		
		click(element(Locators.xpath, "(//div[text()='"+InboundData[7]+"'])[2]"));
		
		click(element(Locators.xpath, "(//i[text()='arrow_drop_down'])[2]"));
		
		click(element(Locators.xpath, "(//div[text()='"+InboundData[8]+"'])[1]"));
		
		click(element(Locators.xpath, "//div[text()='Update']"));

		click(element(Locators.xpath , "(//div[text()='Close'])[3]"));
		
		updateAssert(InboundData[0], InboundData[7]);
		
	
	}
	
	@Test(dataProvider = "InboundData")
	public void update_Inboundwithblk(String InboundData[]) {


		click(driver.findElement(By.xpath("//span[text()='Inbound Route']")));
		
		click(element(Locators.xpath, "//table//tr//td[text()='"+InboundData[6]+"']//following-sibling::td[3]//i[text()='edit']"));
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		click(element(Locators.xpath, "(//i[text()='arrow_drop_down'])[1]"));
		
		
		click(element(Locators.xpath, "(//div[text()='"+InboundData[7]+"'])[2]"));
		
		click(element(Locators.xpath, "(//i[text()='arrow_drop_down'])[2]"));
		
		click(element(Locators.xpath, "(//div[text()='"+InboundData[8]+"'])[1]"));
		
		click(element(Locators.xpath, "//div[text()='Update']"));

		click(element(Locators.xpath , "(//div[text()='Close'])[3]"));
		
		updateAssert(InboundData[6], InboundData[7]);
		
	
	}
	
	
	
	@Test(dataProvider ="TimezoneData")
	public void update_TimeZone(String TimezoneData[]) {

		click(driver.findElement(By.xpath("//span[text()='Timezone']")));

		configFilter(element(Locators.xpath, "//i[@class='fas fa-filter']"),
				element(Locators.xpath, "//input[@aria-label='Timezone']"),
				TimezoneData[0], true);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		click(element(Locators.xpath, "//i[text()='edit']"));
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		click(element(Locators.xpath, "(//i[text()='arrow_drop_down'])[1]"));
		
		click(element(Locators.xpath, "(//div[text()='"+TimezoneData[9]+"'])[2]"));
		
		click(element(Locators.xpath, "//div[text()='Update']"));
		
		click(element(Locators.xpath , "(//div[text()='Close'])[3]"));
		
		updateAssert(TimezoneData[0], TimezoneData[9]);


 
		
	}
	
	
	
	@Test(dataProvider = "NotiData")
	public void update_Noti(String NotiData[]) {

		click(driver.findElement(By.xpath("//span[text()='Notification']")));
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
		click(driver.findElement(By.xpath("//table//tr//td[text()='"+NotiData[0]+"']//following-sibling::td[4]//i[text()='edit']")));
		
		click(driver.findElement(By.xpath("(//input[@role='checkbox']/following-sibling::div)[1]")));
		
		click(driver.findElement(By.xpath("//div[text()='Update']")));
		
		click(element(Locators.xpath, "//div[text()='Close']"));
		
		updateAssert(NotiData[0], NotiData[6]);


	}
	
	
	@Test(dataProvider = "MeetingTitleData")
	public void update_MeetingTitle(String MeetingTitleData[]) {

		click(driver.findElement(By.xpath("//span[text()='Meeting Title']")));

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		//Using filter
//		click(element(Locators.xpath, "//i[@class='fas fa-filter']"));
//		
//		click(element(Locators.xpath, "//label[text()='Title']/following-sibling::div"));
//	
//		click(element(Locators.xpath, "//div[text()='"+MeetingTitleData[0]+"']"));
//		
//		click(element(Locators.xpath, "(//div[text()='Filter'])[2]"));
		
		//Without filter
		
		click(element(Locators.xpath,"//table//tr//td[text()='"+MeetingTitleData[0]+"']//following-sibling::td[4]//i[text()='edit']"));

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		click(element(Locators.xpath, "(//i[text()='arrow_drop_down'])[1]"));
		
		click(element(Locators.xpath, "(//div[text()='"+MeetingTitleData[5]+"'])[2]"));
		
		click(element(Locators.xpath, "//div[text()='Update']"));
		
		click(element(Locators.xpath , "(//div[text()='Close'])[3]"));
		
		updateAssert(MeetingTitleData[0], MeetingTitleData[5]);
	}
}

