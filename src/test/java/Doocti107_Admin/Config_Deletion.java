package Doocti107_Admin;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import static org.testng.Assert.assertFalse;

import org.doocti.seleniumEnum.Locators;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import DooctiAdmin.SeleniumBase;

public class Config_Deletion extends SeleniumBase{



	@BeforeClass
	public void openConfig() {

		click(driver.findElement(By.xpath("//div[text()='Configurations']")));

	}

	@AfterClass
	public void closeConfig() {

		click(driver.findElement(By.xpath("//div[text()='Configurations']")));

	}


	@Test(dataProvider = "QueueData")
	public void delete_Queue(String QueueData[]) {

		click(driver.findElement(By.xpath("//span[text()='Queues']")));

		configFilter(element(Locators.xpath, "//i[@class='fas fa-filter']"),
				element(Locators.xpath, "(//input[@aria-label='Queues'])[3]"),
				QueueData[0], true);


		//		try {
		//			Thread.sleep(2000);
		//		} catch (InterruptedException e) {
		//			// TODO Auto-generated catch block
		//			e.printStackTrace();
		//		}

		click(element(Locators.xpath, "//i[text()='delete']"));

		click(element(Locators.xpath, "//div[text()='Yes, Delete !']"));

		click(driver.findElement(By.xpath("(//div[text()='Close'])[3]")));

		refresh();

		deleteAssert(QueueData[0]);

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}


	@Test(dataProvider = "DispoData")
	public void delete_Dispo(String DispoData[]) {

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
		click(element(Locators.xpath, "//i[text()='delete']"));

		click(element(Locators.xpath, "//div[text()='Yes, Delete !']"));

		click(driver.findElement(By.xpath("(//div[text()='Close'])[3]")));

		refresh();

		deleteAssert(DispoData[0]);

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test(dataProvider = "DispoData")
	public void delete_Dispowithaction(String DispoData[]) {

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
		click(element(Locators.xpath, "//i[text()='delete']"));

		click(element(Locators.xpath, "//div[text()='Yes, Delete !']"));

		click(driver.findElement(By.xpath("(//div[text()='Close'])[3]")));

		refresh();

		deleteAssert(DispoData[7]);

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test(dataProvider = "SubDispoData")
	public void delete_SubDispo(String SubDispoData[]) {

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



		click(element(Locators.xpath, "//i[text()='delete']"));

		click(element(Locators.xpath, "//div[text()='Yes, Delete !']"));

		click(driver.findElement(By.xpath("(//div[text()='Close'])[3]")));

		refresh();

		deleteAssert(SubDispoData[1]);

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test(dataProvider = "LeadStatusData")
	public void delete_LeadStatus(String LeadStatusData[]) {

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

		click(element(Locators.xpath, "(//i[text()='delete'])[1]"));

		click(element(Locators.xpath, "//div[text()='Yes, Delete !']"));

		click(driver.findElement(By.xpath("(//div[text()='Close'])[3]")));

		refresh();

		deleteAssert(LeadStatusData[0]);

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	
	
	@Test(dataProvider = "LeadStatusData")
	public void delete_LeadStatuswithclosed(String LeadStatusData[]) {

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

		click(element(Locators.xpath, "(//i[text()='delete'])[1]"));

		click(element(Locators.xpath, "//div[text()='Yes, Delete !']"));

		click(driver.findElement(By.xpath("(//div[text()='Close'])[3]")));

		refresh();

		deleteAssert(LeadStatusData[2]);

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Test(dataProvider = "TicketStatusData")
	public void delete_TicketStatus(String TicketStatusData[]) {

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

		click(element(Locators.xpath, "//i[text()='delete']"));

		click(element(Locators.xpath, "//div[text()='Yes, Delete !']"));

		click(driver.findElement(By.xpath("(//div[text()='Close'])[3]")));

		refresh();

		deleteAssert(TicketStatusData[0]);

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	@Test(dataProvider = "TicketStatusData")
	public void delete_TicketStatuswithclosed(String TicketStatusData[]) {

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

		click(element(Locators.xpath, "//i[text()='delete']"));

		click(element(Locators.xpath, "//div[text()='Yes, Delete !']"));

		click(driver.findElement(By.xpath("(//div[text()='Close'])[3]")));

		refresh();

		deleteAssert(TicketStatusData[5]);

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Test(dataProvider = "PausecodeData")
	public void delete_Pausecode(String PausecodeData[]) {

		scroll(element(Locators.id, "app-sidebar"), 200);

		click(driver.findElement(By.xpath("//span[text()='Pause Codes']")));

		configFilter(element(Locators.xpath, "//i[@class='fas fa-filter']"),
				element(Locators.xpath, "//input[@aria-label='Name']"),
				PausecodeData[0], true);

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		click(element(Locators.xpath, "//i[text()='delete']"));

		click(element(Locators.xpath, "//div[text()='Yes, Delete !']"));

		click(driver.findElement(By.xpath("(//div[text()='Close'])[3]")));

		refresh();

		deleteAssert(PausecodeData[0]);

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	/*
//Need to Automate
	@Test(dataProvider = "AudioData")
	public void delete_Audio(String AudioData[])  { 

		click(driver.findElement(By.xpath("//span[text()='Audio Store']")));

		configFilter(element(Locators.xpath, "//i[@class='fas fa-filter']"),
				element(Locators.xpath, "//input[@aria-label='Name']"),
				AudioData[3], true);

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

		//			updateAssert(AudioData[3], AudioData[2]);

	}	
	 */
	@Test(dataProvider = "DidData")
	public void delete_DID(String DidData[])  {

		click(driver.findElement(By.xpath("//span[text()='DID Number']")));

		type(element(Locators.xpath, "(//input[@aria-label='DID Number'])[3]"), DidData[0]);

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		click(element(Locators.xpath, "//i[text()='delete']"));

		click(element(Locators.xpath, "//div[text()='Yes, Delete !']"));

		click(element(Locators.xpath, "(//div[@class='v-btn__content'][normalize-space()='Close'])[4]"));

		refresh();

		deleteAssert(DidData[0]);

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


	}


	@Test(dataProvider = "TagData")
	public void delete_Tag(String TagData[])  {

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

		click(element(Locators.xpath, "//i[text()='delete']"));

		click(element(Locators.xpath, "//div[text()='Yes, Delete !']"));

		click(element(Locators.xpath, "//div[text()='Close']"));

		refresh();

		deleteAssert(TagData[0]);

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


	}


	@Test(dataProvider = "AnnouncementData")
	public void delete_Announcement(String AnnouncementData[] ) {

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
		click(element(Locators.xpath, "//i[text()='delete']"));

		click(element(Locators.xpath, "//div[text()='Yes, Delete !']"));

		click(element(Locators.xpath, "(//div[@class='v-btn__content'][normalize-space()='Close'])[4]"));

		refresh();

		deleteAssert(AnnouncementData[0]);

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


	@Test(dataProvider = "ScriptData")
	public void delete_ScriptURL(String ScriptData[]) {

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
		click(element(Locators.xpath, "//i[text()='delete']"));

		click(element(Locators.xpath, "//div[text()='Yes, Delete !']"));

		click(element(Locators.xpath , "(//div[text()='Close'])[3]"));

		refresh();

		deleteAssert(ScriptData[0]);

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	@Test(dataProvider = "ScriptData")
	public void delete_ScriptText(String ScriptData[]) {

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
		click(element(Locators.xpath, "//i[text()='delete']"));

		click(element(Locators.xpath, "//div[text()='Yes, Delete !']"));

		click(element(Locators.xpath , "(//div[text()='Close'])[3]"));

		refresh();

		deleteAssert(ScriptData[1]);

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Test(dataProvider = "SLAData")
	public void delete_SLA(String SLAData[]) {

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

		click(element(Locators.xpath, "//i[text()='delete']"));

		click(element(Locators.xpath, "//div[text()='Yes, Delete !']"));

		click(element(Locators.xpath, "(//div[text()='Close'])[3]"));

		refresh();

		deleteAssert(SLAData[0]);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test(dataProvider = "SchedulerData")
	public void delete_Scheduler(String SchedulerData[]) {


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

		click(element(Locators.xpath, "//i[text()='delete']"));

		click(element(Locators.xpath, "//div[text()='Yes, Delete !']"));

		click(element(Locators.xpath, "(//div[text()='Close'])[3]"));

		refresh();

		deleteAssert(SchedulerData[0]);

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


	@Test(dataProvider = "InboundData")
	public void delete_Inbound(String InboundData[]) {


		click(driver.findElement(By.xpath("//span[text()='Inbound Route']")));

		click(element(Locators.xpath, "//table//tr//td[text()='"+InboundData[0]+"']//following-sibling::td[3]//i[text()='delete']"));

		click(element(Locators.xpath, "//div[text()='Yes, Delete !']"));

		click(element(Locators.xpath , "(//div[text()='Close'])[3]"));

		refresh();

		deleteAssert(InboundData[0]);

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test(dataProvider = "InboundData")
	public void delete_Inboundwithblk(String InboundData[]) {


		click(driver.findElement(By.xpath("//span[text()='Inbound Route']")));

		click(element(Locators.xpath, "//table//tr//td[text()='"+InboundData[6]+"']//following-sibling::td[3]//i[text()='delete']"));

		click(element(Locators.xpath, "//div[text()='Yes, Delete !']"));

		click(element(Locators.xpath , "(//div[text()='Close'])[3]"));

		refresh();

		deleteAssert(InboundData[6]);

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test(dataProvider ="TimezoneData")
	public void delete_TimeZone(String TimezoneData[]) {

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

		click(element(Locators.xpath, "//i[text()='delete']"));

		click(element(Locators.xpath, "//div[text()='Yes, Delete !']"));

		click(element(Locators.xpath , "(//div[text()='Close'])[3]"));

		refresh();

		deleteAssert(TimezoneData[0]);

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}



	}



	@Test(dataProvider = "NotiData")
	public void delete_Noti(String NotiData[]) {

		click(driver.findElement(By.xpath("//span[text()='Notification']")));

		click(driver.findElement(By.xpath("//table//tr//td[text()='"+NotiData[0]+"']//following-sibling::td[4]//i[text()='delete']")));

		click(element(Locators.xpath, "//div[text()='Yes, Delete !']"));

		click(element(Locators.xpath, "//div[text()='Close']"));

		refresh();

		deleteAssert(NotiData[0]);

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


	@Test(dataProvider = "MeetingTitleData")
	public void delete_MeetingTitle(String MeetingTitleData[]) {

		click(driver.findElement(By.xpath("//span[text()='Meeting Title']")));

		//Using filter
		//			click(element(Locators.xpath, "//i[@class='fas fa-filter']"));
		//			
		//			click(element(Locators.xpath, "//label[text()='Title']/following-sibling::div"));
		//	
		//			click(element(Locators.xpath, "//div[text()='"+MeetingTitleData[0]+"']"));
		//			
		//			click(element(Locators.xpath, "(//div[text()='Filter'])[2]"));

		//Without filter

		click(element(Locators.xpath,"//table//tr//td[text()='"+MeetingTitleData[0]+"']//following-sibling::td[4]//i[text()='delete']"));


		click(element(Locators.xpath, "//div[text()='Yes, Delete !']"));

		click(element(Locators.xpath , "(//div[text()='Close'])[3]"));

		refresh();

		deleteAssert(MeetingTitleData[0]);

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

