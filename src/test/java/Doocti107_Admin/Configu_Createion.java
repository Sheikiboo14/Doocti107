package Doocti107_Admin;

import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import DooctiAdmin.SeleniumBase;

public class Configu_Createion extends SeleniumBase {

	@BeforeMethod
	public void openConfig() {

		click(driver.findElement(By.xpath("//div[text()='Configurations']")));

	}

	@AfterMethod
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
	}

	@Test(dataProvider = "DispoData")
	public void create_DispowithoutAction(String DispoData[]) {

		click(driver.findElement(By.xpath("//span[text()='Dispositions']")));

		click(driver.findElement(By.xpath("//div[text()=' Add Disposition ']")));

		type(driver.findElement(By.xpath("(//input[@aria-label='Disposition'])[2]")),DispoData[0]);

		type(driver.findElement(By.xpath("(//input[@aria-label='Description'])[2]")),DispoData[1]);

		click(driver.findElement(By.xpath("//div[text()='Create']")));

		click(driver.findElement(By.xpath("(//div[text()='Close'])[3]")));
	}

	@Test(dataProvider = "SubDispoData")
	public void create_Subdispo(String SubDispoData[]) {


		scroll(driver.findElement(By.xpath("app-sidebar")), 300);

		click(driver.findElement(By.xpath("//span[text()='Sub-Dispositions']")));

		click(driver.findElement(By.xpath("//div[text()=' Add Sub-Dispo ']")));

		type(driver.findElement(By.xpath("//input[@aria-label='Sub-Disposition']")),SubDispoData[1]);

		type(driver.findElement(By.xpath("(//input[@aria-label='Description'])[2]")),SubDispoData[2]);

		click(driver.findElement(By.xpath("(//label[text()='Disposition']/following-sibling::div)[3]")));

		click(driver.findElement(By.xpath("(//div[text()='"+SubDispoData[0]+"'])[2]")));

		click(driver.findElement(By.xpath("//div[text()='Create']")));

		click(driver.findElement(By.xpath("(//div[text()='Close'])[3]")));
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

	}

	@Test(dataProvider = "LeadStatusData")
	public void create_LeadStatuswithoutClosed(String LeadStatusData[]) {

		click(driver.findElement(By.xpath("//span[text()='Lead Status']")));

		click(driver.findElement(By.xpath("//div[text()=' Add Lead Status ']")));

		type(driver.findElement(By.xpath("(//input[@aria-label='Name'])[2]")),LeadStatusData[0]);

		type(driver.findElement(By.xpath("(//input[@aria-label='Description'])[2]")),LeadStatusData[1]);

		click(driver.findElement(By.xpath("//div[text()='Create']")));

		click(driver.findElement(By.xpath("(//div[text()='Close'])[3]")));

	}

	@Test(dataProvider = "TicketStatusData")
	public void create_TicketStatuswithClosed(String TicketStatusData[]) {

		click(driver.findElement(By.xpath("//span[text()='Ticket Status']")));

		click(driver.findElement(By.xpath("//div[text()=' Add New ']")));

		type(driver.findElement(By.xpath("(//input[@aria-label='Name'])[2]")),TicketStatusData[5]);

		type(driver.findElement(By.xpath("(//input[@aria-label='Description'])[2]")),TicketStatusData[1]);

		click(driver.findElement(By.xpath("(//label[text()='is closed'])[2]")));

		click(driver.findElement(By.xpath("//div[text()='Create']")));

		click(driver.findElement(By.xpath("(//div[text()='Close'])[3]")));

	}

	@Test(dataProvider = "TicketStatusData")
	public void create_TicketStatuswithoutClosed(String TicketStatusData[]) {

		click(driver.findElement(By.xpath("//span[text()='Ticket Status']")));

		click(driver.findElement(By.xpath("//div[text()=' Add New ']")));

		type(driver.findElement(By.xpath("(//input[@aria-label='Name'])[2]")),TicketStatusData[0]);

		type(driver.findElement(By.xpath("(//input[@aria-label='Description'])[2]")),TicketStatusData[1]);

		click(driver.findElement(By.xpath("//div[text()='Create']")));

		click(driver.findElement(By.xpath("(//div[text()='Close'])[3]")));

	}

	@Test(dataProvider = "PausecodeData")
	public void create_PauseCode(String PausecodeData[]) {

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
		
		
		
	}
	
	@Test(dataProvider = "TagData")
	public void create_Tag(String TagData[]) throws InterruptedException {
		
		click(driver.findElement(By.xpath("//span[text()='Tags']")));
		
		click(driver.findElement(By.xpath("//div[text()=' Add Tag ']")));
		
		type(driver.findElement(By.xpath("(//input[@aria-label='Name'])[2]")),TagData[0]);
		
		type(driver.findElement(By.xpath("(//input[@aria-label='Description'])[2]")), TagData[1]);
		
		click(driver.findElement(By.xpath("//div[text()='Create']")));
		
		click(driver.findElement(By.xpath("//div[text()='Close']")));
		
		
		
	}
	
	@Test(dataProvider = "AnnouncementData")
	public void create_Announcement(String AnnouncementData[] ) {
		
	click(driver.findElement(By.xpath("//span[text()='Announcements']")));
	
	click(driver.findElement(By.xpath("//div[text()=' Add Announcement ']")));
	
	type(driver.findElement(By.xpath("(//input[@aria-label='Name'])[2]")), AnnouncementData[0]);
	
	type(driver.findElement(By.xpath("(//textarea[@aria-label='Announcement'])[2]")), AnnouncementData[2]);

	click(driver.findElement(By.xpath("(//label[text()='Campaign']/following-sibling::div)[3]")));
	
	click(driver.findElement(By.xpath("(//div[text()='Preview Campaign'])[2]")));
	
	click(driver.findElement(By.xpath("//span[text()='Create Announcement']")));
	
	click(driver.findElement(By.xpath("//div[text()='Create']")));
	
	click(driver.findElement(By.xpath("(//div[@class='v-btn__content'][normalize-space()='Close'])[4]")));
	
	}

	
	@Test(dataProvider = "RemainderData")
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

	@Test(dataProvider = "ScriptData")
	public void create_ScriptURL(String ScriptData[]) {
		
		click(driver.findElement(By.xpath("//span[text()='Scripts']")));
		
		click(driver.findElement(By.xpath("//div[text()=' Add Script ']")));

		type(driver.findElement(By.xpath("//input[@aria-label='Script Name']")), ScriptData[0]);
		
		type(driver.findElement(By.xpath("(//input[@aria-label='Description'])[2]")), ScriptData[2]);
		
		click(driver.findElement(By.xpath("//label[text()='Enter a URL']")));
		
		type(driver.findElement(By.xpath("//input[@placeholder='Enter a valid URL']")), ScriptData[3]);

		click(driver.findElement(By.xpath("//div[text()='Create']")));
		
		click(driver.findElement(By.xpath("(//div[text()='Close'])[3]")));
	
	}
	
	@Test(dataProvider = "ScriptData")
	public void create_ScriptText(String ScriptData[]) {
		
		click(driver.findElement(By.xpath("//span[text()='Scripts']")));
		
		click(driver.findElement(By.xpath("//div[text()=' Add Script ']")));

		type(driver.findElement(By.xpath("//input[@aria-label='Script Name']")), ScriptData[1]);
		
		type(driver.findElement(By.xpath("(//input[@aria-label='Description'])[2]")), ScriptData[2]);
		
		click(driver.findElement(By.xpath("//label[text()='Enter Text']")));
		
		type(driver.findElement(By.xpath("//label[text()='Enter Text']/following::textarea")), ScriptData[4]);

		click(driver.findElement(By.xpath("//div[text()='Create']")));
		
		click(driver.findElement(By.xpath("(//div[text()='Close'])[3]")));
	
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
		
		click(driver.findElement(By.xpath("(//div[text()='"+InboundData[3]+"'])[3]")));
	
		click(driver.findElement(By.xpath("//span[text()='Create Inbound Route']")));
		
		click(driver.findElement(By.xpath("(//label[text()='Blocklist'])[2]")));
		
		click(driver.findElement(By.xpath("//div[text()='Create']")));
		
		click(driver.findElement(By.xpath("(//div[text()='Close'])[3]")));
		
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
		
		click(driver.findElement(By.xpath("(//div[text()='"+InboundData[3]+"'])[3]")));
	
		click(driver.findElement(By.xpath("//span[text()='Create Inbound Route']")));
				
		click(driver.findElement(By.xpath("//div[text()='Create']")));
		
		click(driver.findElement(By.xpath("(//div[text()='Close'])[3]")));
		
	}
}





