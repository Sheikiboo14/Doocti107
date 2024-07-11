package Doocti107_Admin;

import org.doocti.seleniumEnum.Locators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import DooctiAdmin.SeleniumBase;

public class Config_Createion extends SeleniumBase {

	@BeforeClass
	public void openConfig() {

		click(driver.findElement(By.xpath("//div[text()='Configurations']")));

	}

	@AfterClass
	public void closeConfig() {

		click(driver.findElement(By.xpath("//div[text()='Configurations']")));

	}




	@Test(dataProvider = "QueueData")
	public void create_Queue(String QueueData[]) {

		click(driver.findElement(By.xpath("//span[text()='Queues']")));

		click(driver.findElement(By.xpath("//div[text()=' Add Queue ']")));

		type(driver.findElement(By.xpath("(//input[@aria-label='Queues'])[2]")),QueueData[0]);

		click(driver.findElement(By.xpath("//div[text()='Create']")));

		click(driver.findElement(By.xpath("(//div[text()='Close'])[3]")));

		AssertwithFilterdropdown(element(Locators.xpath, "//i[@class='fas fa-filter']"), 
				QueueData[0], element(Locators.xpath, "(//input[@aria-label='Queues'])[3]"),true);

	}

	@Test(dataProvider = "DispoData")
	public void create_DispowithAction(String DispoData[]) {

		click(driver.findElement(By.xpath("//span[text()='Dispositions']")));

		click(driver.findElement(By.xpath("//div[text()=' Add Disposition ']")));

		type(driver.findElement(By.xpath("(//input[@aria-label='Disposition'])[2]")),DispoData[7]);

		type(driver.findElement(By.xpath("(//input[@aria-label='Description'])[2]")),DispoData[1]);

		click(driver.findElement(By.xpath("(//label[text()='Action']/following-sibling::div)[3]")));

		click(driver.findElement(By.xpath("(//div[text()='"+DispoData[6]+"'])[2]")));

		click(driver.findElement(By.xpath("//div[text()='Create']")));

		click(driver.findElement(By.xpath("(//div[text()='Close'])[3]")));

		AssertwithFilterdropdown(element(Locators.xpath, "//i[@class='fas fa-filter']"), 
				DispoData[7], element(Locators.xpath, "(//input[@aria-label='Disposition'])[3]"),true);

	}

	@Test(dataProvider = "DispoData")
	public void create_DispowithoutAction(String DispoData[]) {

		click(driver.findElement(By.xpath("//span[text()='Dispositions']")));

		click(driver.findElement(By.xpath("//div[text()=' Add Disposition ']")));

		type(driver.findElement(By.xpath("(//input[@aria-label='Disposition'])[2]")),DispoData[0]);

		type(driver.findElement(By.xpath("(//input[@aria-label='Description'])[2]")),DispoData[1]);

		click(driver.findElement(By.xpath("//div[text()='Create']")));

		click(driver.findElement(By.xpath("(//div[text()='Close'])[3]")));

		AssertwithFilterdropdown(element(Locators.xpath, "//i[@class='fas fa-filter']"), 
				DispoData[0], element(Locators.xpath, "(//input[@aria-label='Disposition'])[3]"),true);
	}


	@Test(dataProvider = "SubDispoData")
	public void create_Subdispo(String SubDispoData[]) {


		click(driver.findElement(By.xpath("//span[text()='Sub-Dispositions']")));

		//		click(driver.findElement(By.xpath("//div[text()=' Add Sub-Dispo ']")));

		click(element(Locators.xpath, "//div[text()=' Add ']"));

		type(driver.findElement(By.xpath("//input[@aria-label='Sub-Disposition']")),SubDispoData[1]);

		type(driver.findElement(By.xpath("(//input[@aria-label='Description'])[2]")),SubDispoData[2]);

		click(driver.findElement(By.xpath("(//label[text()='Disposition']/following-sibling::div)[3]")));

		click(driver.findElement(By.xpath("(//div[text()='"+SubDispoData[0]+"'])[2]")));

		click(driver.findElement(By.xpath("//span[text()='Create Sub-Disposition']")));

		click(driver.findElement(By.xpath("//div[text()='Create']")));

		click(driver.findElement(By.xpath("(//div[text()='Close'])[3]")));

		AssertwithFilterdropdown(element(Locators.xpath, "//i[@class='fas fa-filter']"), 
				SubDispoData[1], element(Locators.xpath, "//input[@aria-label='Sub Disposition']"),true);
	}


	@Test(dataProvider = "LeadStatusData")
	public void create_LeadStatuswithClosed(String LeadStatusData[]) {

		click(driver.findElement(By.xpath("//span[text()='Lead Status']")));

		click(driver.findElement(By.xpath("//div[text()=' Add Lead Status ']")));

		type(driver.findElement(By.xpath("(//input[@aria-label='Name'])[2]")),LeadStatusData[2]);

		type(driver.findElement(By.xpath("(//input[@aria-label='Description'])[2]")),LeadStatusData[1]);

		click(driver.findElement(By.xpath("(//label[text()='is closed'])[2]")));

		click(driver.findElement(By.xpath("//div[text()='Create']")));

		click(driver.findElement(By.xpath("(//div[text()='Close'])[3]")));

		AssertwithFilterdropdown(element(Locators.xpath, "//i[@class='fas fa-filter']"), 
				LeadStatusData[2], element(Locators.xpath, "(//input[@aria-label='Name'])[3]"),true);

	}

	@Test(dataProvider = "LeadStatusData")
	public void create_LeadStatuswithoutClosed(String LeadStatusData[]) {

		click(driver.findElement(By.xpath("//span[text()='Lead Status']")));

		click(driver.findElement(By.xpath("//div[text()=' Add Lead Status ']")));

		type(driver.findElement(By.xpath("(//input[@aria-label='Name'])[2]")),LeadStatusData[0]);

		type(driver.findElement(By.xpath("(//input[@aria-label='Description'])[2]")),LeadStatusData[1]);

		click(driver.findElement(By.xpath("//div[text()='Create']")));

		click(driver.findElement(By.xpath("(//div[text()='Close'])[3]")));

		AssertwithFilterdropdown(element(Locators.xpath, "//i[@class='fas fa-filter']"), 
				LeadStatusData[0], element(Locators.xpath, "(//input[@aria-label='Name'])[3]"),true);

	}

	@Test(dataProvider = "TicketStatusData")
	public void create_TicketStatuswithClosed(String TicketStatusData[]) {

		scroll(element(Locators.id, "app-sidebar"), 200);

		click(driver.findElement(By.xpath("//span[text()='Ticket Status']")));

		click(driver.findElement(By.xpath("//div[text()=' Add New ']")));

		type(driver.findElement(By.xpath("(//input[@aria-label='Name'])[2]")),TicketStatusData[5]);

		type(driver.findElement(By.xpath("(//input[@aria-label='Description'])[2]")),TicketStatusData[1]);

		click(driver.findElement(By.xpath("(//label[text()='is closed'])[2]")));

		click(driver.findElement(By.xpath("//div[text()='Create']")));

		click(driver.findElement(By.xpath("(//div[text()='Close'])[3]")));

		AssertwithFilterdropdown(element(Locators.xpath, "//i[@class='fas fa-filter']"), 
				TicketStatusData[5], element(Locators.xpath, "(//input[@aria-label='Name'])[3]"),false);

	}

	@Test(dataProvider = "TicketStatusData")
	public void create_TicketStatuswithoutClosed(String TicketStatusData[]) {

		scroll(element(Locators.id, "app-sidebar"), 200);

		click(driver.findElement(By.xpath("//span[text()='Ticket Status']")));

		click(driver.findElement(By.xpath("//div[text()=' Add New ']")));

		type(driver.findElement(By.xpath("(//input[@aria-label='Name'])[2]")),TicketStatusData[0]);

		type(driver.findElement(By.xpath("(//input[@aria-label='Description'])[2]")),TicketStatusData[1]);

		click(driver.findElement(By.xpath("//div[text()='Create']")));

		click(driver.findElement(By.xpath("(//div[text()='Close'])[3]")));

		AssertwithFilterdropdown(element(Locators.xpath, "//i[@class='fas fa-filter']"), 
				TicketStatusData[0], element(Locators.xpath, "(//input[@aria-label='Name'])[3]"),false);


	}

	@Test(dataProvider = "PausecodeData")
	public void create_PauseCode(String PausecodeData[]) {

		scroll(element(Locators.id, "app-sidebar"), 200);

		click(driver.findElement(By.xpath("//span[text()='Pause Codes']")));

		click(driver.findElement(By.xpath("//div[text()=' Add Pause Code ']")));

		type(driver.findElement(By.xpath("(//input[@aria-label='Pause Code'])[2]")),PausecodeData[0]);

		type(driver.findElement(By.xpath("(//input[@aria-label='Description'])[2]")),PausecodeData[1]);

		click(driver.findElement(By.xpath("(//input[@aria-label='Time'])[2]")));

		click(driver.findElement(By.xpath("//span[text()='"+PausecodeData[2]+"']")));

		click(driver.findElement(By.xpath("//span[text()='"+PausecodeData[3]+"']")));

		click(driver.findElement(By.xpath("//div[text()=' OK ']")));

		click(driver.findElement(By.xpath("//div[text()='Create']")));

		click(driver.findElement(By.xpath("(//div[text()='Close'])[3]")));

		AssertwithFilterdropdown(element(Locators.xpath, "//i[@class='fas fa-filter']"), 
				PausecodeData[0], element(Locators.xpath, "//input[@aria-label='Name']"),true);

	}

	@Test(dataProvider = "AudioData")
	public void upload_Audio(String AudioData[]) throws InterruptedException { 

		click(driver.findElement(By.xpath("//span[text()='Audio Store']")));

		click(driver.findElement(By.xpath("//div[text()=' Upload ']")));

		type(driver.findElement(By.xpath("(//input[@aria-label='Description'])[1]")), AudioData[0]);

		click(driver.findElement(By.xpath("//span[text()='Upload Audio']")));

		click(driver.findElement(By.xpath("(//div[@class='flex xs12']/following-sibling::div)[1]")));

		Thread.sleep(1000);

		robot(AudioData[1]);

		Thread.sleep(1000);

		click(driver.findElement(By.xpath("(//div[text()='Close'])[1]")));

		AssertwithFilterdropdown(element(Locators.xpath, "//i[@class='fas fa-filter']"), 
				AudioData[3], element(Locators.xpath, "//input[@aria-label='Name']"),true);

	}

	@Test(dataProvider = "BlocklistData")
	public void upload_Blocklist(String BlocklistData[]) throws InterruptedException {

		click(driver.findElement(By.xpath("//span[text()='Block List']")));

		click(driver.findElement(By.xpath("//div[text()=' Upload ']")));

		click(driver.findElement(By.xpath("(//div[@class='container grid-list-md']//div)[1]")));

		Thread.sleep(1000);

		robot(BlocklistData[0]);

		Thread.sleep(1000);

		click(driver.findElement(By.xpath("//div[text()='Close']")));



	}

	@Test(dataProvider = "DNCData")
	public void upload_DNC(String DNCData[]) throws InterruptedException {

		click(driver.findElement(By.xpath("//span[text()='DNC']")));

		click(driver.findElement(By.xpath("//div[text()=' Upload ']")));

		click(driver.findElement(By.xpath("(//div[@class='container grid-list-md']//div)[1]")));

		Thread.sleep(1000);

		robot(DNCData[0]);

		Thread.sleep(1000);

		click(driver.findElement(By.xpath("//div[text()='Close']")));



	}

	@Test(dataProvider = "DidData")
	public void upload_DID(String DidData[]) throws InterruptedException {

		click(driver.findElement(By.xpath("//span[text()='DID Number']")));

		click(driver.findElement(By.xpath("//div[text()=' Upload ']")));

		click(driver.findElement(By.xpath("(//div[@class='container grid-list-md']//div)[1]")));

		Thread.sleep(1000);

		robot(DidData[2]);

		Thread.sleep(1000);

		click(driver.findElement(By.xpath("(//div[text()='Close'])[1]")));



	}

	@Test(dataProvider = "DidData")
	public void create_DID(String DidData[]) throws InterruptedException {

		click(driver.findElement(By.xpath("//span[text()='DID Number']")));

		click(driver.findElement(By.xpath("//i[text()='add']")));

		type(driver.findElement(By.xpath("(//input[@aria-label='DID Number'])[2]")),DidData[0]);

		type(driver.findElement(By.xpath("//input[@aria-label='Trunk']")), DidData[1]);

		click(driver.findElement(By.xpath("//div[text()='Create']")));

		click(driver.findElement(By.xpath("(//div[@class='v-btn__content'][normalize-space()='Close'])[4]")));

		refresh();


	}

	@Test(dataProvider = "TagData")
	public void create_Tag(String TagData[]) throws InterruptedException {

		click(driver.findElement(By.xpath("//span[text()='Tags']")));

		click(driver.findElement(By.xpath("//div[text()=' Add Tag ']")));

		type(driver.findElement(By.xpath("(//input[@aria-label='Name'])[2]")),TagData[0]);

		type(driver.findElement(By.xpath("(//input[@aria-label='Description'])[2]")), TagData[1]);

		click(driver.findElement(By.xpath("//div[text()='Create']")));

		click(driver.findElement(By.xpath("//div[text()='Close']")));

		AssertwithFilterdropdown(element(Locators.xpath, "//i[@class='fas fa-filter']"), 
				TagData[0], element(Locators.xpath, "(//input[@aria-label='Name'])[3]"),true);



	}

	@Test(dataProvider = "AnnouncementData")
	public void create_Announcement(String AnnouncementData[] ) {

		click(driver.findElement(By.xpath("//span[text()='Announcements']")));

		click(driver.findElement(By.xpath("//div[text()=' Add Announcement ']")));

		type(driver.findElement(By.xpath("(//input[@aria-label='Name'])[2]")), AnnouncementData[0]);

		type(driver.findElement(By.xpath("(//textarea[@aria-label='Announcement'])[2]")), AnnouncementData[1]);

		click(driver.findElement(By.xpath("(//label[text()='Campaign']/following-sibling::div)[3]")));

		click(driver.findElement(By.xpath("(//div[text()='"+AnnouncementData[2]+"'])[2]")));

		click(driver.findElement(By.xpath("//span[text()='Create Announcement']")));

		click(driver.findElement(By.xpath("//div[text()='Create']")));

		click(driver.findElement(By.xpath("(//div[@class='v-btn__content'][normalize-space()='Close'])[4]")));

		AssertwithFilterdropdown(element(Locators.xpath, "//i[@class='fas fa-filter']"), 
				AnnouncementData[0], element(Locators.xpath, "(//input[@aria-label='Name'])[3]"),false);
	}

	/*
	@Test(dataProvider = "RemainderData",enabled = false)
	public void create_Remainder(String RemainderData[]) {

		click(driver.findElement(By.xpath("//span[text()='Reminders']")));

		click(driver.findElement(By.xpath("//div[text()=' Add Reminder ']")));

		type(driver.findElement(By.xpath("(//input[@aria-label='Name'])[2]")), RemainderData[0]);

		click(driver.findElement(By.xpath("(//label[text()='Campaign']/following-sibling::div)[3]")));

		click(driver.findElement(By.xpath("(//div[text()='"+RemainderData[1]+"'])[2]")));

		click(driver.findElement(By.xpath("//span[text()='Create Reminder']")));

		click(driver.findElement(By.xpath("//label[text()='Template']/following-sibling::div")));

		click(driver.findElement(By.xpath("//div[text()='"+RemainderData[2]+"']")));

		click(driver.findElement(By.xpath("//span[text()='Create Reminder']")));

		click(driver.findElement(By.xpath("(//label[text()='Disposition']/following-sibling::div)[3]")));

		click(driver.findElement(By.xpath("//div[text()='"+RemainderData[3]+"']")));

		click(driver.findElement(By.xpath("//span[text()='Create Reminder']")));

		click(driver.findElement(By.xpath("(//label[text()='Time Value']/following-sibling::div)[3]")));

		click(driver.findElement(By.xpath("//div[text()='"+RemainderData[4]+"']")));

		click(driver.findElement(By.xpath("//span[text()='Create Reminder']")));

		click(driver.findElement(By.xpath("(//label[text()='Reminder Time']/following-sibling::div)[3]")));

		click(driver.findElement(By.xpath("//div[text()='"+RemainderData[5]+"']")));

		click(driver.findElement(By.xpath("//span[text()='Create Reminder']")));

		click(driver.findElement(By.xpath("(//label[text()='Reminder Medium']/following-sibling::div)[3]")));

		click(driver.findElement(By.xpath("//div[text()='"+RemainderData[6]+"']")));

		click(driver.findElement(By.xpath("//span[text()='Create Reminder']")));

		String rm = getText(driver.findElement(By.xpath("(//label[text()='Reminder Medium']/following-sibling::div)[3]")));

		if(rm.equalsIgnoreCase("Email"))
		{

			click(driver.findElement(By.xpath("//label[text()='Email']/following-sibling::div")));

			click(driver.findElement(By.xpath("//div[text()='"+RemainderData[7]+"']")));

			click(driver.findElement(By.xpath("//span[text()='Create Reminder']")));

		}

		else if(rm.equalsIgnoreCase("SMS")) {

			click(driver.findElement(By.xpath("//label[text()='Email']/following-sibling::div")));

			click(driver.findElement(By.xpath("//div[text()='"+RemainderData[7]+"']")));

			click(driver.findElement(By.xpath("//span[text()='Create Reminder']")));

		}

		else if(rm.equalsIgnoreCase("Whatsapp")) {

			click(driver.findElement(By.xpath("//label[text()='Whatsapp']/following-sibling::div")));

			click(driver.findElement(By.xpath("//div[text()='"+RemainderData[7]+"']")));

			click(driver.findElement(By.xpath("//span[text()='Create Reminder']")));

		}

		else {

			click(driver.findElement(By.xpath("//label[text()='Call']/following-sibling::div")));

			click(driver.findElement(By.xpath("//div[text()='"+RemainderData[7]+"']")));

			click(driver.findElement(By.xpath("//span[text()='Create Reminder']")));
		}

		click(driver.findElement(By.xpath("//div[text()='Create']")));

	}


	 */

	@Test(dataProvider = "ScriptData")
	public void create_ScriptURL(String ScriptData[]) {

		click(driver.findElement(By.xpath("//span[text()='Scripts']")));

		click(driver.findElement(By.xpath("//div[text()=' Add Script ']")));
		/*107
		type(driver.findElement(By.xpath("//input[@aria-label='Script Name']")), ScriptData[0]);

		type(driver.findElement(By.xpath("(//input[@aria-label='Description'])[2]")), ScriptData[2]);

		click(driver.findElement(By.xpath("//label[text()='Enter a URL']")));

		type(driver.findElement(By.xpath("//input[@placeholder='Enter a valid URL']")), ScriptData[3]);

		 */

		type(driver.findElement(By.xpath("//input[@aria-label='Script_name']")), ScriptData[0]);

		type(driver.findElement(By.xpath("(//input[@aria-label='Description'])[2]")), ScriptData[2]);

		click(driver.findElement(By.xpath("//label[text()='URL']")));

		type(driver.findElement(By.xpath("(//input[@aria-label='URL'])[2]")), ScriptData[3]);

		click(driver.findElement(By.xpath("//div[text()='Create']")));

		click(driver.findElement(By.xpath("(//div[text()='Close'])[3]")));

		AssertwithFilterdropdown(element(Locators.xpath, "//i[@class='fas fa-filter']"), 
				ScriptData[0], element(Locators.xpath, "//input[@aria-label='Name']"),true);

	}

	@Test(dataProvider = "ScriptData")
	public void create_ScriptText(String ScriptData[]) {

		click(driver.findElement(By.xpath("//span[text()='Scripts']")));

		click(driver.findElement(By.xpath("//div[text()=' Add Script ']")));
		/*107
		type(driver.findElement(By.xpath("//input[@aria-label='Script Name']")), ScriptData[1]);

		type(driver.findElement(By.xpath("(//input[@aria-label='Description'])[2]")), ScriptData[2]);

		click(driver.findElement(By.xpath("//label[text()='Enter Text']")));

		type(driver.findElement(By.xpath("//label[text()='Enter Text']/following::textarea")), ScriptData[4]);

		 */
		type(driver.findElement(By.xpath("//input[@aria-label='Script_name']")), ScriptData[1]);

		type(driver.findElement(By.xpath("(//input[@aria-label='Description'])[2]")), ScriptData[2]);

		click(driver.findElement(By.xpath("//label[text()='Text']")));

		type(driver.findElement(By.xpath("//label[text()='Text']/following::textarea")), ScriptData[4]);

		click(driver.findElement(By.xpath("//div[text()='Create']")));

		click(driver.findElement(By.xpath("(//div[text()='Close'])[3]")));

		AssertwithFilterdropdown(element(Locators.xpath, "//i[@class='fas fa-filter']"), 
				ScriptData[1], element(Locators.xpath, "//input[@aria-label='Name']"),true);

	}

	@Test(dataProvider = "SLAData")
	public void create_SLA(String SLAData[]) {

		click(driver.findElement(By.xpath("//span[text()='SLA']")));

		click(driver.findElement(By.xpath("//div[text()=' Add ']")));

		type(driver.findElement(By.xpath("(//input[@aria-label='Name'])[2]")), SLAData[0]);

		type(driver.findElement(By.xpath("(//input[@aria-label='Description'])[2]")), SLAData[1]);

		click(driver.findElement(By.xpath("(//label[text()='Priority']/following-sibling::div)[3]")));

		click(driver.findElement(By.xpath("(//div[text()='"+SLAData[2]+"'])[3]")));

		click(driver.findElement(By.xpath("//span[text()='Create']")));

		click(driver.findElement(By.xpath("(//label[text()='Status']/following-sibling::div)[3]")));

		click(driver.findElement(By.xpath("(//div[@class='v-list__tile__title'][normalize-space()='"+SLAData[3]+"'])[3]")));

		click(driver.findElement(By.xpath("//span[text()='Create']")));

		click(driver.findElement(By.xpath("(//input[@aria-label='Time'])[2]")));

		click(driver.findElement(By.xpath("//span[text()='"+SLAData[4]+"']")));

		click(driver.findElement(By.xpath("//span[text()='"+SLAData[5]+"']")));

		click(driver.findElement(By.xpath("//span[text()='Create']")));

		click(driver.findElement(By.xpath("(//button[contains(@class,'v-btn theme--light')]//div)[2]")));

		click(driver.findElement(By.xpath("(//div[text()='Close'])[3]")));

		AssertwithFilterdropdown(element(Locators.xpath, "//i[@class='fas fa-filter']"), 
				SLAData[0], element(Locators.xpath, "(//input[@aria-label='Name'])[3]"),true);

	}

	@Test(dataProvider = "SchedulerData")
	public void create_Schedule(String SchedulerData[]) {


		click(driver.findElement(By.xpath("//span[text()='Scheduler']")));

		click(driver.findElement(By.xpath("//div[text()=' Add Scheduler ']")));

		type(driver.findElement(By.xpath("(//input[@aria-label='Scheduler name'])[2]")), SchedulerData[0]);

		type(driver.findElement(By.xpath("(//input[@aria-label='Description'])[2]")), SchedulerData[1]);

		type(driver.findElement(By.xpath("(//input[@aria-label='E-mail'])[2]")), SchedulerData[2]);

		click(driver.findElement(By.xpath("//input[@aria-label='Months']")));

		click(driver.findElement(By.xpath("(//div[@class='v-list__tile__title'][normalize-space()='Select All'])[7]")));

		click(driver.findElement(By.xpath("//span[text()='Create Scheduler']")));

		click(driver.findElement(By.xpath("(//input[@aria-label='Days'])[2]")));

		click(driver.findElement(By.xpath("(//div[@class='v-list__tile__title'][normalize-space()='Select All'])[6]")));

		click(driver.findElement(By.xpath("//span[text()='Create Scheduler']")));

		click(driver.findElement(By.xpath("(//input[@aria-label='Days'])[2]")));

		click(driver.findElement(By.xpath("(//div[@class='v-list__tile__title'][normalize-space()='Select All'])[6]")));

		click(driver.findElement(By.xpath("//span[text()='Create Scheduler']")));

		click(driver.findElement(By.xpath("(//input[@aria-label='Time'])[2]")));

		click(driver.findElement(By.xpath("//span[text()='12']")));	

		click(driver.findElement(By.xpath("//span[text()='00']")));

		click(driver.findElement(By.xpath("//div[text()=' OK ']")));

		click(driver.findElement(By.xpath("//span[text()='Create Scheduler']")));

		click(driver.findElement(By.xpath("(//label[text()='Reports']/following-sibling::div)[3]")));

		click(driver.findElement(By.xpath("//div[text()=' Select All ']")));

		click(driver.findElement(By.xpath("//span[text()='Create Scheduler']")));

		click(driver.findElement(By.xpath("//div[text()='Create']")));

		click(driver.findElement(By.xpath("(//div[text()='Close'])[3]")));

		AssertwithFilterdropdown(element(Locators.xpath, "//i[@class='fas fa-filter']"), 
				SchedulerData[2], element(Locators.xpath, "//input[@aria-label='Email']"),true);
	}

	@Test(dataProvider = "InboundData")
	public void create_InboundwithBlklist(String InboundData[]) {


		click(driver.findElement(By.xpath("//span[text()='Inbound Route']")));

		click(driver.findElement(By.xpath("//div[text()=' New ']")));

		type(driver.findElement(By.xpath("(//input[@aria-label='DID Number'])[2]")), InboundData[0]);

		type(driver.findElement(By.xpath("(//input[@aria-label='DID Name'])[2]")), InboundData[1]);

		click(driver.findElement(By.xpath("//label[text()='Destination Name']/following-sibling::div")));

		click(driver.findElement(By.xpath("(//div[text()='"+InboundData[2]+"'])[3]")));

		click(driver.findElement(By.xpath("//span[text()='Create Inbound Route']")));

		click(driver.findElement(By.xpath("//label[text()='Destination Value']/following-sibling::div")));

		click(driver.findElement(By.xpath("(//div[text()='"+InboundData[3]+"'])[2]")));

		click(driver.findElement(By.xpath("//span[text()='Create Inbound Route']")));

		click(driver.findElement(By.xpath("(//label[text()='Blocklist'])[2]")));

		click(driver.findElement(By.xpath("//div[text()='Create']")));

		click(driver.findElement(By.xpath("(//div[text()='Close'])[3]")));


		WebElement Element = driver.findElement(By.xpath("//table//tr//td[text()='"+InboundData[0]+"']"));

		boolean expectedValue=isDisplay(Element);

		Assert.assertTrue(expectedValue, "Inbound is Not Created");
	}

	@Test(dataProvider = "InboundData")
	public void create_InboundwithoutBlklist(String InboundData[]) {


		click(driver.findElement(By.xpath("//span[text()='Inbound Route']")));

		click(driver.findElement(By.xpath("//div[text()=' New ']")));

		type(driver.findElement(By.xpath("(//input[@aria-label='DID Number'])[2]")), InboundData[6]);

		type(driver.findElement(By.xpath("(//input[@aria-label='DID Name'])[2]")), InboundData[1]);

		click(driver.findElement(By.xpath("//label[text()='Destination Name']/following-sibling::div")));

		click(driver.findElement(By.xpath("(//div[text()='"+InboundData[2]+"'])[3]")));

		click(driver.findElement(By.xpath("//span[text()='Create Inbound Route']")));

		click(driver.findElement(By.xpath("//label[text()='Destination Value']/following-sibling::div")));

		click(driver.findElement(By.xpath("(//div[text()='"+InboundData[3]+"'])[2]")));

		click(driver.findElement(By.xpath("//span[text()='Create Inbound Route']")));

		click(driver.findElement(By.xpath("//div[text()='Create']")));

		click(driver.findElement(By.xpath("(//div[text()='Close'])[3]")));

		WebElement Element = driver.findElement(By.xpath("//table//tr//td[text()='"+InboundData[6]+"']"));

		boolean expectedValue=isDisplay(Element);		

		Assert.assertTrue(expectedValue, "Inbound is Not Created");

	}



	@Test(dataProvider = "OminiData")
	public void create_OminiChannel(String OminiData[]) {

		click(driver.findElement(By.xpath("//span[text()='Omnichannel Route']")));

		click(driver.findElement(By.xpath("//div[text()=' New Routing ']")));

		type(driver.findElement(By.xpath("(//label[text()=' DID Routing']/following::input)[1]")), OminiData[1]);

		click(driver.findElement(By.xpath("(//label[text()='Channel']/following-sibling::div)[3]")));

		click(driver.findElement(By.xpath("(//div[text()='"+OminiData[0]+"'])[2]")));

		click(driver.findElement(By.xpath("//span[text()='Create Omni-Channel Route']")));

		click(driver.findElement(By.xpath("(//label[text()='Campaign']/following-sibling::div)[3]")));

		click(driver.findElement(By.xpath("(//div[text()='"+OminiData[2]+"'])[3]")));

		click(driver.findElement(By.xpath("//span[text()='Create Omni-Channel Route']")));

		click(driver.findElement(By.xpath("(//label[text()='Queue']/following-sibling::div)[3]")));

		click(driver.findElement(By.xpath("(//div[text()='"+OminiData[3]+"'])[3]")));

		click(driver.findElement(By.xpath("//span[text()='Create Omni-Channel Route']")));

		click(driver.findElement(By.xpath("//div[text()='Create']")));

		click(driver.findElement(By.xpath("(//div[text()='Close'])[3]")));


	}

	@Test(dataProvider ="TimezoneData")
	public void create_TimeZone(String TimezoneData[]) {

		click(driver.findElement(By.xpath("//span[text()='Timezone']")));

		click(driver.findElement(By.xpath("//div[text()=' Add Timezone ']")));

		type(driver.findElement(By.xpath("(//input[@aria-label='Zone Name'])[2]")), TimezoneData[0]);

		type(driver.findElement(By.xpath("(//input[@aria-label='Description'])[2]")), TimezoneData[1]);

		click(driver.findElement(By.xpath("(//input[@aria-label='Start Time'])[2]")));

		click(driver.findElement(By.xpath("//span[text()='"+TimezoneData[2]+"']")));

		click(driver.findElement(By.xpath("//span[text()='"+TimezoneData[3]+"']")));

		click(driver.findElement(By.xpath("(//input[@aria-label='End Time'])[2]")));

		click(driver.findElement(By.xpath("//span[text()='"+TimezoneData[4]+"']")));

		click(driver.findElement(By.xpath("//span[text()='"+TimezoneData[5]+"']")));

		click(driver.findElement(By.xpath("(//label[text()='Status']/following-sibling::div)[3]")));

		click(driver.findElement(By.xpath("(//div[text()='"+TimezoneData[6]+"'])[3]")));

		click(driver.findElement(By.xpath("//span[text()='Create Timezone']")));	

		click(driver.findElement(By.xpath("//div[text()='Create']")));	

		click(driver.findElement(By.xpath("(//div[text()='Close'])[3]")));

		AssertwithFilterdropdown(element(Locators.xpath, "//i[@class='fas fa-filter']"), 
				TimezoneData[0], element(Locators.xpath, "//input[@aria-label='Timezone']"),true);

	}

	@Test(dataProvider = "NotiData")
	public void create_Noti(String NotiData[]) {

		click(driver.findElement(By.xpath("//span[text()='Notification']")));

		click(driver.findElement(By.xpath("//div[text()=' New ']")));

		type(driver.findElement(By.xpath("//input[@aria-label='Name']")), NotiData[0]);

		click(driver.findElement(By.xpath("//label[text()='Rule Module']/following-sibling::div")));

		click(driver.findElement(By.xpath("//div[text()='"+NotiData[1]+"']")));

		click(driver.findElement(By.xpath("//div[text()='Create Notification Rules']")));

		click(driver.findElement(By.xpath("//label[text()='Template']/following-sibling::div")));

		click(driver.findElement(By.xpath("//div[text()='"+NotiData[2]+"']")));

		click(driver.findElement(By.xpath("//div[text()='Create Notification Rules']")));

		click(driver.findElement(By.xpath("//label[text()='Notify Type']/following-sibling::div")));

		click(driver.findElement(By.xpath("//div[text()='"+NotiData[3]+"']")));

		click(driver.findElement(By.xpath("//div[text()='Create Notification Rules']")));

		type(driver.findElement(By.xpath("//label[text()='Template Message']/following::textarea")), NotiData[4]);

		click(driver.findElement(By.xpath("//label[text()='Notify To']/following-sibling::div")));

		click(driver.findElement(By.xpath("//div[text()='"+NotiData[5]+"']")));

		click(driver.findElement(By.xpath("//div[text()='Create Notification Rules']")));
		
		click(element(Locators.xpath, "(//input[@type='checkbox']/following-sibling::div)[1]"));


		click(driver.findElement(By.xpath("//div[text()='Create']")));

		click(driver.findElement(By.xpath("//div[text()='Close']")));

		WebElement Element = driver.findElement(By.xpath("//table//tr//td[text()='"+NotiData[0]+"']"));

		boolean expectedValue=isDisplay(Element);		

		Assert.assertTrue(expectedValue, "Noti is Not Created");

	}

	@Test(dataProvider = "SystemSettingData")
	public void create_SystemSettingDataLead(String SystemSettingData[]) {

		click(driver.findElement(By.xpath("//span[text()='System Settings']")));

		click(driver.findElement(By.xpath("(//label[text()='Configuration']/following-sibling::div)[1]")));

		click(driver.findElement(By.xpath("(//div[text()='"+SystemSettingData[0]+"'])[2]")));

		click(driver.findElement(By.xpath("//div[text()='System Settings']")));

		click(driver.findElement(By.xpath("//div[text()='Update']")));

		click(driver.findElement(By.xpath("//div[text()='Close']")));

		WebElement Element = driver.findElement(By.xpath("(//div[@class='v-select__selections'])[1]"));

		String expectedValue=getText(Element);		

		AssertJUnit.assertEquals(expectedValue,SystemSettingData[0]);
	}


	@Test(dataProvider = "SystemSettingData")
	public void create_SystemSettingDataTicket(String SystemSettingData[]) {

		click(driver.findElement(By.xpath("//span[text()='System Settings']")));

		click(driver.findElement(By.xpath("(//div[@class='v-select__selections'])[2]")));

		click(driver.findElement(By.xpath("(//div[text()='"+SystemSettingData[1]+"'])[1]")));

		click(driver.findElement(By.xpath("//div[text()='System Settings']")));	

		click(driver.findElement(By.xpath("//div[text()='Update']")));

		click(driver.findElement(By.xpath("//div[text()='Close']")));

		WebElement Element = driver.findElement(By.xpath("(//div[@class='v-select__selections'])[2]"));

		String expectedValue=getText(Element);		

		AssertJUnit.assertEquals(expectedValue,SystemSettingData[1]);

	}

	@Test(dataProvider = "MeetingTitleData")
	public void create_MeetingTitle(String MeetingTitleData[]) {

		click(driver.findElement(By.xpath("//span[text()='Meeting Title']")));

		click(driver.findElement(By.xpath("//div[text()=' Add Meeting Title ']")));

		type(driver.findElement(By.xpath("(//input[@aria-label='Meeting Title'])[2]")), MeetingTitleData[0]);

		type(driver.findElement(By.xpath("//input[@aria-label='Meeting Sub Title']")), MeetingTitleData[1]);

		type(driver.findElement(By.xpath("(//input[@aria-label='Description'])[3]")), MeetingTitleData[2]);

		click(driver.findElement(By.xpath("//div[text()='Create']")));

		click(driver.findElement(By.xpath("(//div[text()='Close'])[3]")));

		click(element(Locators.xpath, "//i[@class='fas fa-filter']"));

		click(element(Locators.xpath, "//label[text()='Title']/following-sibling::div"));

		boolean expectedValue=isDisplay(element(Locators.xpath, "//div[text()='"+MeetingTitleData[0]+"']"));

		Assert.assertTrue(expectedValue, "Meeting Title is Not created");

		click(element(Locators.xpath, "(//div[text()='Filter'])[2]"));



	}



}





