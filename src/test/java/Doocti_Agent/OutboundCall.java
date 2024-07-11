package Doocti_Agent;

import org.doocti.seleniumEnum.Locators;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import DooctiAdmin.SeleniumBaseAgent;

public class OutboundCall extends SeleniumBaseAgent{
	
	
	@Test(dataProvider="OutboundCallData")
	public void dialCall(String OutboundCallData[]) throws InterruptedException {
				
		click(element(Locators.xpath , "//span[text()='Dial Pad']"));
		
		isEnabled(element(Locators.xpath, "//button[text()='Call Now']"));
		
		type(element(Locators.xpath , "(//span[text()='Dial Pad']/following::input)[1]"), OutboundCallData[0]);
		
		click(element(Locators.xpath, "//button[text()='Call Now']"));
		
		scroll(element(Locators.xpath, "//div[@class='Customform-catagory']/following-sibling::div[1]"), 200);
	
		String className=element(Locators.xpath, "(//label[@class='label_cls required'])[2]").getAttribute("class");

		System.out.println(className);

		
		isDisplay(element(Locators.xpath, "//p[text()='Oncall']"));
		
		try {
			WaitForAnswer(element(Locators.link, "mic_off"));
			

			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			click(element(Locators.xpath, "//span[text()='call_end']"));
						
			isDisplay(element(Locators.xpath, "//p[text()='Dispo']"));
						
			
			
			if(className.equalsIgnoreCase("label_cls required")) {
				
				click(element(Locators.xpath, "//div[text()='source']/following-sibling::div"));
				
				Thread.sleep(1000);
				
				click(element(Locators.xpath, "//div[text()='"+OutboundCallData[2]+"']"));
			}

			click(element(Locators.xpath, "//div[text()='"+OutboundCallData[1]+"']//following-sibling::div[text()='check']"));
			
			click(element(Locators.xpath, "//button[text()='Ok!']"));
			
			isDisplay(element(Locators.xpath, "//p[text()='Available']"));
			
		} catch (Exception e) {

		System.err.println("Element is Unavailable");
				
		isDisplay(element(Locators.xpath, "//p[text()='Dispo']"));
		
		if(className.equalsIgnoreCase("label_cls required")) {
			
			click(element(Locators.xpath, "//div[text()='source']/following-sibling::div"));
			
			Thread.sleep(1000);
			
			click(element(Locators.xpath, "//div[text()='"+OutboundCallData[2]+"']"));
		}

		click(element(Locators.xpath, "//div[text()='"+OutboundCallData[1]+"']//following-sibling::div[text()='check']"));
		
		click(element(Locators.xpath, "//button[text()='Ok!']"));

		
		isDisplay(element(Locators.xpath, "//p[text()='Available']"));
		
		}
		
		
		}

		
		
	}


