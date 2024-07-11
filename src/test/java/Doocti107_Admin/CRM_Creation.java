package Doocti107_Admin;

import java.awt.AWTException;
import java.time.Duration;

import org.doocti.seleniumEnum.Locators;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import DooctiAdmin.SeleniumBase;
 
public class CRM_Creation extends SeleniumBase {


	@BeforeClass
	public void Open_CRM() {

		click(driver.findElement(By.xpath("//div[text()='CRM']")));

	}

	@AfterClass
	public void Close_CRM() {

		click(driver.findElement(By.xpath("//div[text()='CRM']")));

	}
 
	
	@Test(dataProvider = "CampaignData")
	public void Create_PreviewCampaign(String CampaignData[]) {

		click(driver.findElement(By.xpath("//span[text()='Campaigns']")));
		click(driver.findElement(By.xpath("//div[text()=' Add Campaign ']")));
		type(driver.findElement(By.xpath("(//input[@aria-label='Name'])[2]")), CampaignData[0]);
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		click(driver.findElement(By.xpath("(//label[text()='Type']/following-sibling::div)[3]")));
		click(driver.findElement(By.xpath("(//div[text()='PREVIEW'])[3]")));
		click(driver.findElement(By.xpath("//span[text()='Create Campaign']")));
		click(driver.findElement(By.xpath("(//label[text()='Process']/following-sibling::div)[3]")));
		click(driver.findElement(By.xpath("(//div[text()='Leads'])[2]")));
		click(driver.findElement(By.xpath("(//div[text()='Tickets'])[2]")));
		click(driver.findElement(By.xpath("(//div[text()='Meetings'])[2]")));
		click(driver.findElement(By.xpath("//span[text()='Create Campaign']")));
	
		click(driver.findElement(By.xpath("(//input[@aria-label='Outbound Caller ID'])[2]")));
		click(driver.findElement(By.xpath("(//div[text()='"+CampaignData[1]+"'])[2]")));
		click(driver.findElement(By.xpath("//span[text()='Create Campaign']")));
		click(driver.findElement(By.xpath("(//label[text()='Industry']/following-sibling::div)[3]")));
		click(driver.findElement(By.xpath("(//div[text()='IT'])[2]")));
		click(driver.findElement(By.xpath("//span[text()='Create Campaign']")));
		click(driver.findElement(By.xpath("(//label[text()='Template Name']/following-sibling::div)[3]")));
		click(driver.findElement(By.xpath("//div[text()='"+CampaignData[3]+"']")));
		click(driver.findElement(By.xpath("//span[text()='Create Campaign']")));
		click(driver.findElement(By.xpath("(//input[@aria-label='Add Queue'])[2]")));
		click(driver.findElement(By.xpath("(//div[text()='"+CampaignData[4]+"'])[2]")));
		click(driver.findElement(By.xpath("//span[text()='Create Campaign']")));
		click(driver.findElement(By.xpath("(//input[@aria-label='Pause Code'])[2]")));
		click(driver.findElement(By.xpath("(//div[text()='Meeting'])[2]"))); 
		click(driver.findElement(By.xpath("(//div[text()='Lunch'])[2]")));
		click(driver.findElement(By.xpath("(//div[text()='Tea Break'])[2]")));
		click(driver.findElement(By.xpath("//span[text()='Create Campaign']")));
		click(driver.findElement(By.xpath("(//input[@aria-label='Dial Status'])[2]")));
		click(driver.findElement(By.xpath("(//div[@class='v-list__tile__title'][normalize-space()='ANSWER'])[4]")));
		click(driver.findElement(By.xpath("(//div[@class='v-list__tile__title'][normalize-space()='CALLBACK'])[4]")));
		click(driver.findElement(By.xpath("(//div[@class='v-list__tile__title'][normalize-space()='Not Interested'])[4]")));
		click(driver.findElement(By.xpath("//span[text()='Create Campaign']")));
		click(driver.findElement(By.xpath("(//input[@aria-label='Dispo Status'])[2]")));
		click(driver.findElement(By.xpath("(//div[text()='ANSWER'])[3]")));
		click(driver.findElement(By.xpath("(//div[text()='CALLBACK'])[3]")));
		click(driver.findElement(By.xpath("(//div[text()='Not Interested'])[3]")));
		click(driver.findElement(By.xpath("//span[text()='Create Campaign']")));
//		click(driver.findElement(By.xpath("(//input[@aria-label='Inbound'])[2]")));
//		click(driver.findElement(By.xpath("(//div[text()='"+CampaignData[10]+"'])[2]")));
//		click(driver.findElement(By.xpath("//span[text()='Create Campaign']")));
		click(driver.findElement(By.xpath("(//label[text()='Script_name']/following-sibling::div)[3]")));
		click(driver.findElement(By.xpath("(//div[text()='"+CampaignData[8]+"'])[2]")));
		click(driver.findElement(By.xpath("//div[text()='Create']")));
		click(driver.findElement(By.xpath("(//div[@class='v-btn__content'][normalize-space()='Close'])[4]")));

	}


	@Test(dataProvider = "CampaignData")
	public void Create_InboundCampaign(String CampaignData[]) throws InterruptedException {

		click(driver.findElement(By.xpath("//span[text()='Campaigns']")));
		click(driver.findElement(By.xpath("//div[text()=' Add Campaign ']")));
		type(driver.findElement(By.xpath("(//input[@aria-label='Name'])[2]")), CampaignData[13]);
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		click(driver.findElement(By.xpath("(//label[text()='Type']/following-sibling::div)[3]")));
		click(driver.findElement(By.xpath("(//div[text()='INBOUND'])[3]")));
		click(driver.findElement(By.xpath("//span[text()='Create Campaign']")));
		click(driver.findElement(By.xpath("(//label[text()='Process']/following-sibling::div)[3]")));
		click(driver.findElement(By.xpath("(//div[text()='Leads'])[2]")));
		click(driver.findElement(By.xpath("(//div[text()='Tickets'])[2]")));
		click(driver.findElement(By.xpath("(//div[text()='Meetings'])[2]")));
		click(driver.findElement(By.xpath("//span[text()='Create Campaign']")));
		click(driver.findElement(By.xpath("(//input[@aria-label='Outbound Caller ID'])[2]")));
		click(driver.findElement(By.xpath("(//div[text()='"+CampaignData[1]+"'])[2]")));
		click(driver.findElement(By.xpath("//span[text()='Create Campaign']")));
		click(driver.findElement(By.xpath("(//label[text()='Industry']/following-sibling::div)[3]")));
		click(driver.findElement(By.xpath("(//div[text()='IT'])[2]")));
		click(driver.findElement(By.xpath("//span[text()='Create Campaign']")));
		click(driver.findElement(By.xpath("(//label[text()='Template Name']/following-sibling::div)[3]")));
		click(driver.findElement(By.xpath("//div[text()='"+CampaignData[3]+"']")));
		click(driver.findElement(By.xpath("//span[text()='Create Campaign']")));
		click(driver.findElement(By.xpath("(//input[@aria-label='Add Queue'])[2]")));
		click(driver.findElement(By.xpath("(//div[text()='"+CampaignData[4]+"'])[2]")));
		click(driver.findElement(By.xpath("//span[text()='Create Campaign']")));
		click(driver.findElement(By.xpath("(//input[@aria-label='Pause Code'])[2]")));
		click(driver.findElement(By.xpath("(//div[text()='Meeting'])[2]")));
		click(driver.findElement(By.xpath("(//div[text()='Lunch'])[2]")));
		click(driver.findElement(By.xpath("(//div[text()='Tea Break'])[2]")));
		click(driver.findElement(By.xpath("//span[text()='Create Campaign']")));
		click(driver.findElement(By.xpath("(//input[@aria-label='Dial Status'])[2]")));
		click(driver.findElement(By.xpath("(//div[@class='v-list__tile__title'][normalize-space()='ANSWER'])[4]")));
		click(driver.findElement(By.xpath("(//div[@class='v-list__tile__title'][normalize-space()='CALLBACK'])[4]")));
		click(driver.findElement(By.xpath("(//div[@class='v-list__tile__title'][normalize-space()='Not Interested'])[4]")));
		click(driver.findElement(By.xpath("//span[text()='Create Campaign']")));
		click(driver.findElement(By.xpath("(//input[@aria-label='Dispo Status'])[2]")));
		click(driver.findElement(By.xpath("(//div[text()='ANSWER'])[3]")));
		click(driver.findElement(By.xpath("(//div[text()='CALLBACK'])[3]")));
		click(driver.findElement(By.xpath("(//div[text()='Not Interested'])[3]")));
		click(driver.findElement(By.xpath("//span[text()='Create Campaign']")));
//		click(driver.findElement(By.xpath("(//input[@aria-label='Inbound'])[2]")));
//		click(driver.findElement(By.xpath("(//div[text()='"+CampaignData[10]+"'])[2]")));
//		click(driver.findElement(By.xpath("//span[text()='Create Campaign']")));
		click(driver.findElement(By.xpath("(//label[text()='Script_name']/following-sibling::div)[3]")));
		click(driver.findElement(By.xpath("(//div[text()='"+CampaignData[8]+"'])[2]")));
		click(driver.findElement(By.xpath("//div[text()='Create']")));
		click(driver.findElement(By.xpath("(//div[@class='v-btn__content'][normalize-space()='Close'])[4]")));

	}

	@Test(dataProvider = "CampaignData")
	public void Create_PredictiveCampaign(String CampaignData[]) {

		click(driver.findElement(By.xpath("//span[text()='Campaigns']")));
		click(driver.findElement(By.xpath("//div[text()=' Add Campaign ']")));
		type(driver.findElement(By.xpath("(//input[@aria-label='Name'])[2]")), CampaignData[12]);
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		click(driver.findElement(By.xpath("(//label[text()='Type']/following-sibling::div)[3]")));
		click(driver.findElement(By.xpath("(//div[text()='PREDICTIVE'])[3]")));
		click(driver.findElement(By.xpath("//span[text()='Create Campaign']")));
		click(driver.findElement(By.xpath("(//label[text()='Process']/following-sibling::div)[3]")));
		click(driver.findElement(By.xpath("(//div[text()='Leads'])[2]")));
		click(driver.findElement(By.xpath("(//div[text()='Tickets'])[2]")));
		click(driver.findElement(By.xpath("(//div[text()='Meetings'])[2]")));
		click(driver.findElement(By.xpath("//span[text()='Create Campaign']")));
		click(driver.findElement(By.xpath("(//input[@aria-label='Outbound Caller ID'])[2]")));
		click(driver.findElement(By.xpath("(//div[text()='"+CampaignData[1]+"'])[2]")));
		click(driver.findElement(By.xpath("//span[text()='Create Campaign']")));
		click(driver.findElement(By.xpath("(//label[text()='Industry']/following-sibling::div)[3]")));
		click(driver.findElement(By.xpath("(//div[text()='IT'])[2]")));
		click(driver.findElement(By.xpath("//span[text()='Create Campaign']")));
		click(driver.findElement(By.xpath("(//label[text()='Template Name']/following-sibling::div)[3]")));
		click(driver.findElement(By.xpath("//div[text()='"+CampaignData[3]+"']")));
		click(driver.findElement(By.xpath("//span[text()='Create Campaign']")));
		click(driver.findElement(By.xpath("(//input[@aria-label='Add Queue'])[2]")));
		click(driver.findElement(By.xpath("(//div[text()='"+CampaignData[4]+"'])[2]")));
		click(driver.findElement(By.xpath("//span[text()='Create Campaign']")));
		click(driver.findElement(By.xpath("(//input[@aria-label='Pause Code'])[2]")));
		click(driver.findElement(By.xpath("(//div[text()='Meeting'])[2]")));
		click(driver.findElement(By.xpath("(//div[text()='Lunch'])[2]")));
		click(driver.findElement(By.xpath("(//div[text()='Tea Break'])[2]")));
		click(driver.findElement(By.xpath("//span[text()='Create Campaign']")));
		click(driver.findElement(By.xpath("(//input[@aria-label='Dial Status'])[2]")));
		click(driver.findElement(By.xpath("(//div[@class='v-list__tile__title'][normalize-space()='ANSWER'])[4]")));
		click(driver.findElement(By.xpath("(//div[@class='v-list__tile__title'][normalize-space()='CALLBACK'])[4]")));
		click(driver.findElement(By.xpath("(//div[@class='v-list__tile__title'][normalize-space()='Not Interested'])[4]")));
		click(driver.findElement(By.xpath("//span[text()='Create Campaign']")));
		click(driver.findElement(By.xpath("(//input[@aria-label='Dispo Status'])[2]")));
		click(driver.findElement(By.xpath("(//div[text()='ANSWER'])[3]")));
		click(driver.findElement(By.xpath("(//div[text()='CALLBACK'])[3]")));
		click(driver.findElement(By.xpath("(//div[text()='Not Interested'])[3]")));
		click(driver.findElement(By.xpath("//span[text()='Create Campaign']")));
		click(driver.findElement(By.xpath("//label[text()='Buffer Level']/following-sibling::div")));
		click(driver.findElement(By.xpath("(//div[text()='"+CampaignData[5]+"'])[1]")));
		click(driver.findElement(By.xpath("//span[text()='Create Campaign']")));
		click(driver.findElement(By.xpath("//label[text()='Dial Ratio']/following-sibling::div")));
		click(driver.findElement(By.xpath("(//div[text()='"+CampaignData[6]+"'])[1]")));
		click(driver.findElement(By.xpath("//span[text()='Create Campaign']")));
//		click(driver.findElement(By.xpath("(//input[@aria-label='Inbound'])[2]")));
//		click(driver.findElement(By.xpath("(//div[text()='"+CampaignData[10]+"'])[2]")));
//		click(driver.findElement(By.xpath("//span[text()='Create Campaign']")));
		click(driver.findElement(By.xpath("(//label[text()='Script_name']/following-sibling::div)[3]")));
		click(driver.findElement(By.xpath("(//div[text()='"+CampaignData[8]+"'])[2]")));
		click(driver.findElement(By.xpath("//div[text()='Create']")));
		click(driver.findElement(By.xpath("(//div[@class='v-btn__content'][normalize-space()='Close'])[4]")));

	}

	@Test(dataProvider = "CampaignData")
	public void Create_PowerCampaign(String CampaignData[]) {

		click(driver.findElement(By.xpath("//span[text()='Campaigns']")));
		click(driver.findElement(By.xpath("//div[text()=' Add Campaign ']")));
		type(driver.findElement(By.xpath("(//input[@aria-label='Name'])[2]")),CampaignData[15] );
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		click(driver.findElement(By.xpath("(//label[text()='Type']/following-sibling::div)[3]")));
		click(driver.findElement(By.xpath("(//div[text()='POWER'])[3]")));
		click(driver.findElement(By.xpath("//span[text()='Create Campaign']")));
		
		click(driver.findElement(By.xpath("(//label[text()='Process']/following-sibling::div)[3]")));
		click(driver.findElement(By.xpath("(//div[text()='Leads'])[2]")));
		click(driver.findElement(By.xpath("(//div[text()='Tickets'])[2]")));
		click(driver.findElement(By.xpath("(//div[text()='Meetings'])[2]")));
		click(driver.findElement(By.xpath("//span[text()='Create Campaign']")));
		click(driver.findElement(By.xpath("(//input[@aria-label='Outbound Caller ID'])[2]")));
		click(driver.findElement(By.xpath("(//div[text()='"+CampaignData[1]+"'])[2]")));
		click(driver.findElement(By.xpath("//span[text()='Create Campaign']")));
		click(driver.findElement(By.xpath("(//label[text()='Industry']/following-sibling::div)[3]")));
		click(driver.findElement(By.xpath("(//div[text()='IT'])[2]")));
		click(driver.findElement(By.xpath("//span[text()='Create Campaign']")));
		click(driver.findElement(By.xpath("(//label[text()='Template Name']/following-sibling::div)[3]")));
		click(driver.findElement(By.xpath("//div[text()='"+CampaignData[3]+"']")));
		click(driver.findElement(By.xpath("//span[text()='Create Campaign']")));
		click(driver.findElement(By.xpath("(//input[@aria-label='Add Queue'])[2]")));
		click(driver.findElement(By.xpath("(//div[text()='"+CampaignData[4]+"'])[2]")));
		click(driver.findElement(By.xpath("//span[text()='Create Campaign']")));
		click(driver.findElement(By.xpath("(//input[@aria-label='Pause Code'])[2]")));
		click(driver.findElement(By.xpath("(//div[text()='Meeting'])[2]")));
		click(driver.findElement(By.xpath("(//div[text()='Lunch'])[2]")));
		click(driver.findElement(By.xpath("(//div[text()='Tea Break'])[2]")));
		click(driver.findElement(By.xpath("//span[text()='Create Campaign']")));
		click(driver.findElement(By.xpath("(//input[@aria-label='Dial Status'])[2]")));
		click(driver.findElement(By.xpath("(//div[@class='v-list__tile__title'][normalize-space()='ANSWER'])[4]")));
		click(driver.findElement(By.xpath("(//div[@class='v-list__tile__title'][normalize-space()='CALLBACK'])[4]")));
		click(driver.findElement(By.xpath("(//div[@class='v-list__tile__title'][normalize-space()='Not Interested'])[4]")));
		click(driver.findElement(By.xpath("//span[text()='Create Campaign']")));
		click(driver.findElement(By.xpath("(//input[@aria-label='Dispo Status'])[2]")));
		click(driver.findElement(By.xpath("(//div[text()='ANSWER'])[3]")));
		click(driver.findElement(By.xpath("(//div[text()='CALLBACK'])[3]")));
		click(driver.findElement(By.xpath("(//div[text()='Not Interested'])[3]")));
		click(driver.findElement(By.xpath("//span[text()='Create Campaign']")));
		click(driver.findElement(By.xpath("//label[text()='Buffer Level']/following-sibling::div")));
		click(driver.findElement(By.xpath("(//div[text()='"+CampaignData[5]+"'])[1]")));
		click(driver.findElement(By.xpath("//span[text()='Create Campaign']")));
		click(driver.findElement(By.xpath("//label[text()='Dial Ratio']/following-sibling::div")));
		click(driver.findElement(By.xpath("(//div[text()='"+CampaignData[6]+"'])[1]")));
		click(driver.findElement(By.xpath("//span[text()='Create Campaign']")));
//		click(driver.findElement(By.xpath("(//input[@aria-label='Inbound'])[2]")));
//		click(driver.findElement(By.xpath("(//div[text()='"+CampaignData[10]+"'])[1]")));
//		click(driver.findElement(By.xpath("//span[text()='Create Campaign']")));
		click(driver.findElement(By.xpath("(//label[text()='Script_name']/following-sibling::div)[3]")));
		click(driver.findElement(By.xpath("(//div[text()='"+CampaignData[8]+"'])[2]")));
		click(driver.findElement(By.xpath("//div[text()='Create']")));
		click(driver.findElement(By.xpath("(//div[@class='v-btn__content'][normalize-space()='Close'])[4]")));

	}


	@Test(dataProvider = "CampaignData")
	public void Create_VoiceCampaign(String CampaignData[]) {

		click(driver.findElement(By.xpath("//span[text()='Campaigns']")));
		click(driver.findElement(By.xpath("//div[text()=' Add Campaign ']")));
		type(driver.findElement(By.xpath("(//input[@aria-label='Name'])[2]")), CampaignData[17]);
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		click(driver.findElement(By.xpath("(//label[text()='Process']/following-sibling::div)[3]")));
		click(driver.findElement(By.xpath("(//div[text()='Leads'])[2]")));
		click(driver.findElement(By.xpath("(//div[text()='Tickets'])[2]")));
		click(driver.findElement(By.xpath("(//div[text()='Meetings'])[2]")));
		click(driver.findElement(By.xpath("//span[text()='Create Campaign']")));
		click(driver.findElement(By.xpath("(//label[text()='Type']/following-sibling::div)[3]")));
		click(driver.findElement(By.xpath("(//div[text()='VOICE BLAST'])[3]")));
		click(driver.findElement(By.xpath("//span[text()='Create Campaign']")));

		click(driver.findElement(By.xpath("(//input[@aria-label='Outbound Caller ID'])[2]")));
		click(driver.findElement(By.xpath("(//div[text()='"+CampaignData[1]+"'])[2]")));
		click(driver.findElement(By.xpath("//span[text()='Create Campaign']")));
		click(driver.findElement(By.xpath("(//label[text()='Industry']/following-sibling::div)[3]")));
		click(driver.findElement(By.xpath("(//div[text()='IT'])[2]")));
		click(driver.findElement(By.xpath("//span[text()='Create Campaign']")));
		click(driver.findElement(By.xpath("(//label[text()='Template Name']/following-sibling::div)[3]")));
		click(driver.findElement(By.xpath("//div[text()='"+CampaignData[3]+"']")));
		click(driver.findElement(By.xpath("//span[text()='Create Campaign']")));
		click(driver.findElement(By.xpath("(//input[@aria-label='Add Queue'])[2]")));
		click(driver.findElement(By.xpath("(//div[text()='"+CampaignData[4]+"'])[2]")));
		click(driver.findElement(By.xpath("//span[text()='Create Campaign']")));
		click(driver.findElement(By.xpath("(//input[@aria-label='Pause Code'])[2]")));
		click(driver.findElement(By.xpath("(//div[text()='Meeting'])[2]")));
		click(driver.findElement(By.xpath("(//div[text()='Lunch'])[2]")));
		click(driver.findElement(By.xpath("(//div[text()='Tea Break'])[2]")));
		click(driver.findElement(By.xpath("//span[text()='Create Campaign']")));
		click(driver.findElement(By.xpath("(//input[@aria-label='Dial Status'])[2]")));
		click(driver.findElement(By.xpath("(//div[@class='v-list__tile__title'][normalize-space()='ANSWER'])[4]")));
		click(driver.findElement(By.xpath("(//div[@class='v-list__tile__title'][normalize-space()='CALLBACK'])[4]")));
		click(driver.findElement(By.xpath("(//div[@class='v-list__tile__title'][normalize-space()='Not Interested'])[4]")));
		click(driver.findElement(By.xpath("//span[text()='Create Campaign']")));
		click(driver.findElement(By.xpath("(//input[@aria-label='Dispo Status'])[2]")));
		click(driver.findElement(By.xpath("(//div[text()='ANSWER'])[3]")));
		click(driver.findElement(By.xpath("(//div[text()='CALLBACK'])[3]")));
		click(driver.findElement(By.xpath("(//div[text()='Not Interested'])[3]")));
		click(driver.findElement(By.xpath("//span[text()='Create Campaign']")));
		click(driver.findElement(By.xpath("//label[text()='Buffer Level']/following-sibling::div")));
		click(driver.findElement(By.xpath("(//div[text()='"+CampaignData[5]+"'])[1]")));
		click(driver.findElement(By.xpath("//span[text()='Create Campaign']")));
//		click(driver.findElement(By.xpath("(//input[@aria-label='Inbound'])[2]")));
//		click(driver.findElement(By.xpath("(//div[text()='"+CampaignData[10]+"'])[2]")));
//		click(driver.findElement(By.xpath("//span[text()='Create Campaign']")));
		click(driver.findElement(By.xpath("//label[text()='Channels']/following-sibling::div")));
		click(driver.findElement(By.xpath("(//div[text()='"+CampaignData[7]+"'])")));
		click(driver.findElement(By.xpath("//span[text()='Create Campaign']")));
		click(driver.findElement(By.xpath("//input[@aria-label='Start Time']")));
		click(driver.findElement(By.xpath("(//span[text()='1'])[1]")));
		click(driver.findElement(By.xpath("//span[text()='00']")));
		click(driver.findElement(By.xpath("//span[text()='Create Campaign']")));
		click(driver.findElement(By.xpath("//input[@aria-label='End Time']")));
		click(driver.findElement(By.xpath("//span[text()='11']")));
		click(driver.findElement(By.xpath("//span[text()='00']")));
		click(driver.findElement(By.xpath("//span[text()='Create Campaign']")));
		click(driver.findElement(By.xpath("//input[@aria-label='Days']")));
		click(driver.findElement(By.xpath("//div[text()='Sunday']")));
		click(driver.findElement(By.xpath("//div[text()='Monday']")));
		click(driver.findElement(By.xpath("//div[text()='Tuesday']")));
		click(driver.findElement(By.xpath("//div[text()='Wednesday']")));
		click(driver.findElement(By.xpath("//div[text()='Thursday']")));
		click(driver.findElement(By.xpath("//div[text()='Friday']")));
		click(driver.findElement(By.xpath("//div[text()='Saturday']")));
		click(driver.findElement(By.xpath("//span[text()='Create Campaign']")));
		click(driver.findElement(By.xpath("(//label[text()='Script_name']/following-sibling::div)[3]")));
		click(driver.findElement(By.xpath("(//div[text()='"+CampaignData[8]+"'])[2]")));
		click(driver.findElement(By.xpath("//div[text()='Create']")));
		click(driver.findElement(By.xpath("(//div[@class='v-btn__content'][normalize-space()='Close'])[4]")));

	}

	@Test(dataProvider = "ListData")
	public void create_List(String ListData[]) {

		click(driver.findElement(By.xpath("//span[text()='Lists']")));
		click(driver.findElement(By.xpath("//div[text()=' Add List ']")));
		type(driver.findElement(By.xpath("(//input[@aria-label='List ID'])[2]")), ListData[0]);
		type(driver.findElement(By.xpath("(//input[@aria-label='Name'])[2]")),ListData[1]);
		type(driver.findElement(By.xpath("(//input[@aria-label='Description'])[2]")), ListData[2]);
		click(driver.findElement(By.xpath("(//label[text()='Campaign']/following-sibling::div)[3]")));
		click(driver.findElement(By.xpath("(//div[text()='"+ListData[3]+"'])[3]")));
		click(driver.findElement(By.xpath("//span[text()='Create List']")));
		
		click(driver.findElement(By.xpath("(//label[text()='Recycling']/following-sibling::div)[3]")));
		click(driver.findElement(By.xpath("(//div[text()='"+ListData[4]+"'])[2]")));
		
//		click(driver.findElement(By.xpath("(//label[text()='Auto Recycling Count']/following-sibling::div)[3]")));
//		click(driver.findElement(By.xpath("(//div[text()='"+ListData[4]+"'])[2]")));
		click(driver.findElement(By.xpath("//span[text()='Create List']")));
		click(driver.findElement(By.xpath("(//div[text()='Create'])[1]")));
		click(driver.findElement(By.xpath("(//div[@class='v-btn__content'][normalize-space()='Close'])[4]")));

	}

	@Test(dataProvider = "LeadData")
	public void upload_Leads(String LeadData[]) throws AWTException, InterruptedException {

		click(driver.findElement(By.xpath("//span[text()='Leads']")));
		click(driver.findElement(By.xpath("//label[text()='Select Template']/following-sibling::div")));
		click(driver.findElement(By.xpath("//div[text()='"+LeadData[2]+"']")));
		click(driver.findElement(By.xpath("//i[@title='Upload Leads']")));
		click(driver.findElement(By.xpath("(//div[@class='v-expansion-panel__header'])[2]")));
		click(driver.findElement(By.xpath("//span[text()='Choose File']")));

		Thread.sleep(1000);

		robot(LeadData[1]);

		Thread.sleep(1000);	

		scroll(driver.findElement(By.xpath("(//div[@class='contentdiv']//div)[3]")), 800);

		click(driver.findElement(By.xpath("//div[text()=' Select List Id ']")));
		click(driver.findElement(By.xpath("//label[text()='Select List Id']/following-sibling::div")));

		click(driver.findElement(By.xpath("//div[text()='"+LeadData[0]+"']"))); 
		click(driver.findElement(By.xpath("//div[text()=' Select List Id ']")));
		click(driver.findElement(By.xpath("//div[text()='Lead Upload']")));

		click(driver.findElement(By.xpath("//div[text()=' Duplicate Check ']")));
		click(driver.findElement(By.xpath("//label[text()='Select Duplicate Check ']/following-sibling::div")));
		click(driver.findElement(By.xpath("(//div[text()='Yes'])[2]")));
		
		scroll(driver.findElement(By.xpath("(//div[@class='contentdiv']//div)[3]")), 200);


		click(driver.findElement(By.xpath("//label[text()='Select Duplicate Check Field']/following-sibling::div")));
		click(driver.findElement(By.xpath("//div[text()='phone_number']")));
		click(driver.findElement(By.xpath("//div[text()=' Duplicate Check ']")));
		click(driver.findElement(By.xpath("//div[text()='Lead Upload']")));




		click(driver.findElement(By.xpath("//div[text()=' Auto Assign ']")));
		scroll(driver.findElement(By.xpath("(//div[@class='contentdiv']//div)[3]")), 200);

		click(driver.findElement(By.xpath("//label[text()='Select Auto assign need or not']/following-sibling::div")));
		click(driver.findElement(By.xpath("(//div[text()='Yes'])[1]")));
		scroll(driver.findElement(By.xpath("(//div[@class='contentdiv']//div)[3]")), 600);


		click(driver.findElement(By.xpath("//label[text()='Select User ']/following-sibling::div")));
		
		click(driver.findElement(By.xpath("//div[text()='"+LeadData[4]+"']")));
		click(driver.findElement(By.xpath("//div[text()='Upload']")));

		click(driver.findElement(By.xpath("//div[text()='Close']")));



	}
/*
	@Test(dataProvider = "LeadData")
	public void upload_Leadswithoutdpchk(String LeadData[]) throws AWTException, InterruptedException {

		click(driver.findElement(By.xpath("//span[text()='Leads']")));
		click(driver.findElement(By.xpath("//label[text()='Select Template']/following-sibling::div")));
		click(driver.findElement(By.xpath("//div[text()='"+LeadData[2]+"']")));
		click(driver.findElement(By.xpath("//i[@title='Upload Leads']")));
		click(driver.findElement(By.xpath("(//div[@class='v-expansion-panel__header'])[2]")));
		click(driver.findElement(By.xpath("//span[text()='Choose File']")));

		Thread.sleep(1000);

		robot(LeadData[1]);

		Thread.sleep(1000);	

		scroll(driver.findElement(By.xpath("(//div[@class='contentdiv']//div)[3]")), 800);

		click(driver.findElement(By.xpath("//div[text()=' Select List Id ']")));
		click(driver.findElement(By.xpath("//label[text()='Select List Id']/following-sibling::div")));

		click(driver.findElement(By.xpath("//div[text()='"+LeadData[0]+"']"))); 
		click(driver.findElement(By.xpath("//div[text()=' Select List Id ']")));
		click(driver.findElement(By.xpath("//div[text()='Lead Upload']")));
		scroll(driver.findElement(By.xpath("(//div[@class='contentdiv']//div)[3]")), 600);

		click(driver.findElement(By.xpath("//div[text()='Lead Upload']")));




		click(driver.findElement(By.xpath("//div[text()=' Auto Assign ']")));
		scroll(driver.findElement(By.xpath("(//div[@class='contentdiv']//div)[3]")), 200);

		click(driver.findElement(By.xpath("//label[text()='Select Auto assign need or not']/following-sibling::div")));
		click(driver.findElement(By.xpath("(//div[text()='Yes'])[1]")));
		scroll(driver.findElement(By.xpath("(//div[@class='contentdiv']//div)[3]")), 600);


		click(driver.findElement(By.xpath("//label[text()='Select User ']/following-sibling::div")));
		
		click(driver.findElement(By.xpath("//div[text()='"+LeadData[4]+"']")));
		click(driver.findElement(By.xpath("//div[text()='Upload']")));

		click(driver.findElement(By.xpath("//div[text()='Close']")));



	}

	@Test(dataProvider = "LeadData")
	public void upload_LeadswithoutAS(String LeadData[]) throws AWTException, InterruptedException {

		click(driver.findElement(By.xpath("//span[text()='Leads']")));
		click(driver.findElement(By.xpath("//label[text()='Select Template']/following-sibling::div")));
		click(driver.findElement(By.xpath("//div[text()='"+LeadData[2]+"']")));
		click(driver.findElement(By.xpath("//i[@title='Upload Leads']")));
		click(driver.findElement(By.xpath("(//div[@class='v-expansion-panel__header'])[2]")));
		click(driver.findElement(By.xpath("//span[text()='Choose File']")));

		Thread.sleep(1000);

		robot(LeadData[1]);

		Thread.sleep(1000);	

		scroll(driver.findElement(By.xpath("(//div[@class='contentdiv']//div)[3]")), 800);

		click(driver.findElement(By.xpath("//div[text()=' Select List Id ']")));
		click(driver.findElement(By.xpath("//label[text()='Select List Id']/following-sibling::div")));

		click(driver.findElement(By.xpath("//div[text()='"+LeadData[0]+"']"))); 
		click(driver.findElement(By.xpath("//div[text()=' Select List Id ']")));
		click(driver.findElement(By.xpath("//div[text()='Lead Upload']")));

		click(driver.findElement(By.xpath("//div[text()=' Duplicate Check ']")));
		click(driver.findElement(By.xpath("//label[text()='Select Duplicate Check ']/following-sibling::div")));
		click(driver.findElement(By.xpath("(//div[text()='Yes'])[2]")));
		
		scroll(driver.findElement(By.xpath("(//div[@class='contentdiv']//div)[3]")), 200);


		click(driver.findElement(By.xpath("//label[text()='Select Duplicate Check Field']/following-sibling::div")));
		click(driver.findElement(By.xpath("//div[text()='phone_number']")));
		click(driver.findElement(By.xpath("//div[text()=' Duplicate Check ']")));
		click(driver.findElement(By.xpath("//div[text()='Lead Upload']")));



		click(driver.findElement(By.xpath("//div[text()='Upload']")));

		click(driver.findElement(By.xpath("//div[text()='Close']")));



	}
	
	@Test(dataProvider = "LeadData")
	public void upload_LeadswithoutDA(String LeadData[]) throws AWTException, InterruptedException {

		click(driver.findElement(By.xpath("//span[text()='Leads']")));
		click(driver.findElement(By.xpath("//label[text()='Select Template']/following-sibling::div")));
		click(driver.findElement(By.xpath("//div[text()='"+LeadData[2]+"']")));
		click(driver.findElement(By.xpath("//i[@title='Upload Leads']")));
		click(driver.findElement(By.xpath("(//div[@class='v-expansion-panel__header'])[2]")));
		click(driver.findElement(By.xpath("//span[text()='Choose File']")));

		Thread.sleep(1000);

		robot("D:\\onelead.csv");

		Thread.sleep(1000);	

		scroll(driver.findElement(By.xpath("(//div[@class='contentdiv']//div)[3]")), 800);

		click(driver.findElement(By.xpath("//div[text()=' Select List Id ']")));
		click(driver.findElement(By.xpath("//label[text()='Select List Id']/following-sibling::div")));

		click(driver.findElement(By.xpath("//div[text()='"+LeadData[0]+"']"))); 
		click(driver.findElement(By.xpath("//div[text()=' Select List Id ']")));
		click(driver.findElement(By.xpath("//div[text()='Lead Upload']")));


		click(driver.findElement(By.xpath("//div[text()='Upload']")));

		click(driver.findElement(By.xpath("//div[text()='Close']")));



	}
	
	*/
	
	@Test(dataProvider = "LeadData")
	public void upload_Lead(String LeadData[]) throws InterruptedException {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		
		click(driver.findElement(By.xpath("//span[text()='Leads']")));
		click(driver.findElement(By.xpath("//label[text()='Select Template']/following-sibling::div")));
		click(driver.findElement(By.xpath("//div[text()='"+LeadData[2]+"']")));
		click(element(Locators.xpath, "//i[@title='Upload Leads']"));
	//  yet to automated facing some issuse in list creation	
		
	}
	
	@Test(dataProvider = "LeadData")
	public void create_Lead(String LeadData[]) throws InterruptedException {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		
		click(driver.findElement(By.xpath("//span[text()='Leads']")));
		click(driver.findElement(By.xpath("//label[text()='Select Template']/following-sibling::div")));
		click(driver.findElement(By.xpath("//div[text()='"+LeadData[2]+"']")));
		click(driver.findElement(By.xpath("//i[@title='Create Leads']")));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@aria-label='First Name']")));
		type(driver.findElement(By.xpath("//input[@aria-label='First Name']")), LeadData[5]);
		type(driver.findElement(By.xpath("//input[@aria-label='Phone Number']")), LeadData[3]);
		click(driver.findElement(By.xpath("//input[@aria-label='Source']")));
		click(driver.findElement(By.xpath("//div[text()='"+LeadData[6]+"']")));
		click(driver.findElement(By.xpath("//i[contains(@class,'fa fa-floppy-o')]")));
		click(driver.findElement(By.xpath("//div[text()='Yes, Create !']")));

	}
	
	@Test(dataProvider = "ContactData")
	public void upload_Contact(String ContactData[]) throws InterruptedException {
		
		click(driver.findElement(By.xpath("//span[text()='Contacts']")));
		click(driver.findElement(By.xpath("//div[text()=' Upload ']")));
		click(driver.findElement(By.xpath("//div[text()=' Please select some files ']")));
		
		Thread.sleep(1000);

		robot(ContactData[2]);

		Thread.sleep(1000);
		
		String actualValue = getText(driver.findElement(By.xpath("(//div[@class='container grid-list-md']//div)[1]")));
				
		if(actualValue.equalsIgnoreCase("Uploaded Successfully")) {
			
			click(driver.findElement(By.xpath("//div[text()='Close']")));
		}
		
		else {
			System.err.println("Not Uploaded : "+actualValue);
			
			click(driver.findElement(By.xpath("//div[text()='Close']")));

		}
		
	}


	@Test(dataProvider = "ContactData")
	public void create_Contact(String ContactData[]) throws InterruptedException {
		
		click(driver.findElement(By.xpath("//span[text()='Contacts']")));
		
		click(driver.findElement(By.xpath("//i[@class='fas fa-plus']")));
		consoleLog();
		type(driver.findElement(By.xpath("//input[@aria-label='Name']")), ContactData[0]);
		type(driver.findElement(By.xpath("//input[@aria-label='PhoneNumber']")),  ContactData[1]);
		click(driver.findElement(By.xpath("//i[contains(@class,'fa fa-floppy-o')]")));
		click(driver.findElement(By.xpath("//div[text()='Yes, Create !']")));
	
	}
	
	
	@Test(dataProvider = "TicketData")
	public void create_Tickets(String TicketData[]) {
		
		click(driver.findElement(By.xpath("//span[text()='Tickets']")));
		click(driver.findElement(By.xpath("//i[@class='fas fa-plus']")));
		consoleLog();
		click(driver.findElement(By.xpath("//input[@aria-label='Status']")));
		click(driver.findElement(By.xpath("//div[text()='"+TicketData[0]+"']")));
		type(driver.findElement(By.xpath("//input[@aria-label='Account Name']")), TicketData[1]);
		type(driver.findElement(By.xpath("(//input[@aria-label='Subject'])[2]")), TicketData[2]);
		type(driver.findElement(By.xpath("//textarea[@aria-label='Description']")), TicketData[3]);
		type(driver.findElement(By.xpath("(//input[@aria-label='PhoneNumber'])[2]")), TicketData[4]);
		click(driver.findElement(By.xpath("//input[@aria-label='DueDate']")));
		click(driver.findElement(By.xpath("//div[text()='"+TicketData[5]+"']")));
		
		click(driver.findElement(By.xpath("(//input[@aria-label='Priority'])[2]")));
		click(driver.findElement(By.xpath("(//div[text()='"+TicketData[6]+"'])[1]")));
		
		click(driver.findElement(By.xpath("//input[@placeholder='Channel']")));
		click(driver.findElement(By.xpath("//div[text()='"+TicketData[7]+"']")));
		click(driver.findElement(By.xpath("//i[contains(@class,'fa fa-floppy-o')]"))); 
	}
	
	
	@Test(dataProvider = "MeetingData")
	public void create_Meeting(String MeetingData[]) {
		
		click(driver.findElement(By.xpath("//span[text()='Meetings']")));
		click(driver.findElement(By.xpath("//div[text()=' Add Meetings ']")));
//		consoleLog();


		type(driver.findElement(By.xpath("(//input[@aria-label='Description'])[2]")),MeetingData[1]);
		type(driver.findElement(By.xpath("//input[@aria-label='Phone Number']")), MeetingData[2]);
		
		click(driver.findElement(By.xpath("//label[text()='Meeting title']/following-sibling::div")));
		click(driver.findElement(By.xpath("//div[text()='"+MeetingData[0]+"']")));
		click(driver.findElement(By.xpath("//span[text()='Create Meetings']")));
		click(driver.findElement(By.xpath("(//label[text()='Agent']/following-sibling::div)[3]")));
		click(driver.findElement(By.xpath("(//div[text()='"+MeetingData[3]+"'])[3]")));
		click(driver.findElement(By.xpath("//span[text()='Create Meetings']")));
		click(element(Locators.xpath, "((//label[text()='Meeting Date'])[2]/following::input)[1]"));
		click(element(Locators.xpath, "//div[text()='Ok']"));
		click(element(Locators.xpath, "//div[text()='Ok']"));

		
		click(driver.findElement(By.xpath("(//label[text()='Module']/following-sibling::div)[1]")));
		click(driver.findElement(By.xpath("(//div[text()='"+MeetingData[5]+"'])[2]")));
		click(driver.findElement(By.xpath("//span[text()='Create Meetings']")));
		click(driver.findElement(By.xpath("//label[text()='Template']/following-sibling::div")));
		click(driver.findElement(By.xpath("//div[text()='"+MeetingData[7]+"']")));
		click(driver.findElement(By.xpath("//span[text()='Create Meetings']")));
		click(driver.findElement(By.xpath("//div[text()='Create']")));
		
		click(driver.findElement(By.xpath("(//div[text()='Close'])[3]")));
	}
}
