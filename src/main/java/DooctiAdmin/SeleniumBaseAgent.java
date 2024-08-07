 package DooctiAdmin;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.rmi.AccessException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.doocti.seleniumEnum.Browser;
import org.doocti.seleniumEnum.Locators;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.WheelInput;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumBaseAgent implements SeleniumInterface {


	Long timeOut = 30L; 

	Long waitTime = 10l;

	protected RemoteWebDriver driver = null;

	WebDriverWait wait = null;
	
	Robot rb = null;
	
	Actions action = null;
	
	String Url = "https://web-test.doocti.com/v2.1.106/";
	
	String UserEmail = "v2testdoocti_agent02@doocti.com";

	String UserPassword = "Doocti@123";
	
	String CampaignName = "Test Preview";
	
	String QueueName ="v2testdoocti_8633544661";

	


	@BeforeSuite
	public void setUp() {

		browaerSetup(Url);
		type(element(Locators.xpath, "(//input[@class='form-control'])[1]"), UserEmail);
		type(element(Locators.xpath, "(//input[@class='form-control'])[2]"), UserPassword);
		click(element(Locators.xpath, "//button[@type='submit']"));
		isDisplay(element(Locators.xpath, "//h3[text()='Select Campaign']"));

		click(element(Locators.xpath, "//div[text()='Select Campaign']/following-sibling::div"));
		click(element(Locators.xpath, "//div[text()='"+CampaignName+"']/following-sibling::div"));
		click(element(Locators.xpath, "//button[@type='submit']"));
		isDisplay(element(Locators.xpath, "//div[text()='Select Queue']"));

		click(element(Locators.xpath, "//div[text()='Please Select']/following-sibling::div"));
		click(element(Locators.xpath, "//div[text()='"+QueueName+"']"));
		click(element(Locators.xpath, "//button[text()='Save']"));
		isDisplay(element(Locators.xpath, "//div[text()=' Dashboard']"));

		
	}
	
	@AfterSuite
	public void setDown() 
	
	{	
//		click(element(Locators.xpath, "(//div[@class='navbar-notification']//img)[2]"));
//		click(element(Locators.xpath, "//div[text()='Log Out']"));
//		isDisplay(element(Locators.xpath, "//h3[text()='Login']"));
//		quit();
//		 
	}
	
	public void browaerSetup(String url) {
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions option = new ChromeOptions();
		option.addArguments("use-fake-ui-for-media-stream","--incognito");
		driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(timeOut, TimeUnit.SECONDS);
		driver.get(url);
		wait = new WebDriverWait(driver,Duration.ofSeconds(waitTime));



	}


	public void browserSetup(Browser browserName, String url) {

		switch (browserName) {

		case Chrome:
			driver = new ChromeDriver();
			break;
		case Edge:
			driver = new EdgeDriver();
			break;	
		case FireFox:
			driver = new FirefoxDriver();
			break;	
		case Safari:
			driver = new SafariDriver();
			break;
		default:
			System.err.println("Undefined Browser");
			break;
		}


		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(timeOut, TimeUnit.SECONDS);
		driver.get(url);
		wait = new WebDriverWait(driver,Duration.ofSeconds(waitTime));

	}


	public void close() {

		driver.close();

	}


	public void quit() {

		driver.quit();
	}


	public  boolean isEnabled(WebElement ele) {

		WebElement Element = wait.until(ExpectedConditions.visibilityOf(ele));
		
		boolean expecedValue = Element.isEnabled();;
		
		Assert.assertFalse(expecedValue, "Element is Enabled");
				
		return expecedValue;
		
	}
	public WebElement element(Locators type,String value) {

		switch (type) {

		case id:

			return driver.findElement(By.id(value));

		case className:

			return driver.findElement(By.className(value));

		case cssSelector:

			return driver.findElement(By.cssSelector(value));

		case xpath:

			return driver.findElement(By.xpath(value));

		case link:

			return driver.findElement(By.linkText(value));

		case tagName:

			return driver.findElement(By.tagName(value));



		default:

			System.err.println("Invalid Locator");

			break;
		}

		return null;
	}


	public List<WebElement> elements(Locators type,String value) {

		switch (type) {

		case id:

			return driver.findElements(By.id(value));

		case className:

			return driver.findElements(By.className(value));

		case cssSelector:

			return driver.findElements(By.cssSelector(value));

		case xpath:

			return driver.findElements(By.xpath(value));

		case link:

			return driver.findElements(By.linkText(value));

		case tagName:

			return driver.findElements(By.tagName(value));



		default:

			System.err.println("Invalid Locator");

			break;
		}

		return null;
	}



	public void click(WebElement ele) {

		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(ele));

		element.click();
	}


	public void type(WebElement ele,String testData) {

		WebElement element = wait.until(ExpectedConditions.visibilityOf(ele));

		element.clear();
		element.sendKeys(testData);

	}

	public void type(WebElement ele, String testData, Keys keys) {

		WebElement element = wait.until(ExpectedConditions.visibilityOf(ele));

		element.clear();
		element.sendKeys(testData);

	}


	public void append(WebElement ele,String testData) {

		WebElement element = wait.until(ExpectedConditions.visibilityOf(ele));

		element.sendKeys(testData);

	}


	public void switchToWindow(int i) {

		Set<String> AllWindows = driver.getWindowHandles();
		ArrayList<String> list = new ArrayList<String>(AllWindows);
		driver.switchTo().window(list.get(i));
	}






	public void dropdown(WebElement ele, WebElement selectEle) {


		WebElement element = wait.until(ExpectedConditions.visibilityOf(ele));

		WebElement dropdownValue = wait.until(ExpectedConditions.visibilityOf(selectEle));

		dropdownValue.click();
	}


	public boolean isDisplay(WebElement ele) {

		WebElement element = wait.until(ExpectedConditions.visibilityOf(ele));
		
		boolean expecedValue = element.isDisplayed();
		
		Assert.assertTrue(expecedValue, "Element is Not displayed");
		
//		System.out.println(expecedValue);
		
		return expecedValue;
		
	}
	
	

	public boolean isSelect(WebElement ele) {
		
		WebElement element = wait.until(ExpectedConditions.visibilityOf(ele));

		boolean expecedValue = element.isSelected();
		

		return expecedValue;



	}
	
	public void createAssert(List<WebElement> ele,String value) {

		List<WebElement> elements =	wait.until(ExpectedConditions.visibilityOfAllElements(ele));
		
		boolean flag = false;
		
		for(WebElement Data : elements)
		{
			String actualValue = Data.getText();
			
			if(actualValue.contains(value)) {
				
				flag = true;
						
			}
		}

		Assert.assertTrue(flag, "Not Created...!");
	}

	public void deleteAssert(List<WebElement> ele,String value) {

		List<WebElement> elements =	wait.until(ExpectedConditions.visibilityOfAllElements(ele));
		
		boolean flag = false;
		
		for(WebElement Data : elements)
		{
			String actualValue = Data.getText();
			
			if(actualValue.contains(value)) {
				
				flag = true;
					

		}
	}

		Assert.assertFalse(flag, "Not Deleted...!");
	}
	
	public void updateAssert(WebElement ele, String expectedValue) {

		WebElement element = wait.until(ExpectedConditions.visibilityOf(ele));
		
		assertEquals(element.getText(), expectedValue,"Not Updated...!");
		

	}
	public void getTitle() {
		
		driver.getTitle();
		
	}


	public void getUrl() {

		driver.getCurrentUrl();
	}

	public String getText(WebElement ele) {
		
		WebElement element = wait.until(ExpectedConditions.visibilityOf(ele));
		
		String expectedValue = element.getText();
		
		System.out.println(expectedValue);
		
		return expectedValue;
		
		
	}
	
	public void getText(WebElement ele ,String expectedcreateValue) {
		
		WebElement element = wait.until(ExpectedConditions.visibilityOf(ele));
		
		String text = element.getAttribute("value");
		
		System.out.println(text);
		
		Assert.assertEquals(text, expectedcreateValue, "Not Created...!");
	}
	
	


	
	public void scroll(WebElement ele , int scrollAmount) {
		
        WheelInput.ScrollOrigin scrollOrigin = WheelInput.ScrollOrigin.fromElement(ele);
        new Actions(driver)
                .scrollFromOrigin(scrollOrigin, 0, scrollAmount)
                .perform();
	}
	
	public void scrollhorizontal(WebElement ele , int scrollAmount) {
		
        WheelInput.ScrollOrigin scrollOrigin = WheelInput.ScrollOrigin.fromElement(ele);
        new Actions(driver)
                .scrollFromOrigin(scrollOrigin, scrollAmount, 0)
                .perform();
	}
	
	public void robot(String filelocation) {
		
		try {
			rb = new Robot();
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		StringSelection path= new StringSelection(filelocation);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(path, null);
		
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);
		
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);
		
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		
				
	}

	public void consoleLog() {
		
		try {
			rb = new Robot();
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_SHIFT);
		rb.keyPress(KeyEvent.VK_J);
	}
	
	
	public void AssertwithFilterdropdown(WebElement ele,String actualVaule ,WebElement filterele, Boolean dropdown) {
		
		
		WebElement element = wait.until(ExpectedConditions.visibilityOf(ele));
		
		ele.click();
		
		WebElement filterelement = wait.until(ExpectedConditions.visibilityOf(filterele));
		
		clear(filterelement);
		
		filterelement.sendKeys(actualVaule);
		
	if(dropdown == false) {
		
		

		String expectedValue= filterele.getAttribute("value");
		

		
		Assert.assertEquals(actualVaule, expectedValue,"Assert Failed" );
		
		
//		click(element(Locators.xpath, "//i[@class='fas fa-close']"));
		
		click(element(Locators.xpath, "(//div[text()='Filter'])[2]"));
		
	}
	else {
		click(element(Locators.xpath,"//span[text()='"+actualVaule+"']"));
				

		
		String expectedValue= filterele.getAttribute("value");
		

		
		Assert.assertEquals(actualVaule, expectedValue,"Assert Failed" );
		
				
		click(element(Locators.xpath, "(//div[text()='Filter'])[2]"));

	}
		
	}
	
	public void refresh() {
		
		driver.navigate().refresh();
	}
	
	public void clear(WebElement ele) {
		
		Actions action = new Actions(driver);
		
		action.doubleClick(ele)
		.keyDown(Keys.BACK_SPACE)
		.build().perform();
		
	}
	
	
	public void configFilter(WebElement filtericon ,WebElement ele, String value, boolean DD) {
		
		WebElement filterelement = wait.until(ExpectedConditions.visibilityOf(filtericon));

		filterelement.click();
		
		
		WebElement element = wait.until(ExpectedConditions.visibilityOf(ele));
		
		element.sendKeys(value);
		
		if(DD == true) {
			
			click(element(Locators.xpath,"//span[text()='"+value+"']"));

		}
		
		click(element(Locators.xpath, "(//div[text()='Filter'])[2]"));

		
		
		
		
	}
	
	
	public void updateAssert(String value,String status) {
		
		
		boolean actualValue = element(Locators.xpath,"//table//tr//td[text()='"+value+"']//following-sibling::td[text()='"+status+"']").isDisplayed();
		
		Assert.assertTrue(actualValue,"Status Updation Failed");
		
		
	}
	
	
	public void deleteAssert(String deletedValue) {
		
		
		
		
		List<WebElement> Alldata = driver.findElements(By.xpath("//table//tr//td[1]"));
		
		
		boolean flag = false;
		
		for(WebElement Data : Alldata) {
			
			String value = Data.getText();
			
			System.out.println(value);
			if(value.contains(deletedValue))
			{
				
			flag = true;
			
			}
		}
		
		Assert.assertFalse(flag, "Deletion Failed..!");
		

	}
	
	
	public void WaitForAnswer(WebElement ele) {
		
		
		wait.until(ExpectedConditions.visibilityOf(ele));
		
		}
		
		
		
	
//  		<============================================ Configuration Data's ==============================================>
	

	/**
	 * Configuration Data's
	 * 
	 */

	@DataProvider(name ="OutboundCallData")
	public String[][] obData() {

		String [][]obdata = new String [1][3];

		obdata[0][0] ="9514380497"; //8056269371
		obdata[0][1] ="ANSWER";
		obdata[0][2] ="Test";


	


		return obdata;
	}

	@DataProvider(name = "DispoData")
	public String[][] dispoData() {

		String [][] ddata = new String[1][8];

		ddata[0][0]="Test Dispo";
		ddata[0][1]="Testing Purpose";
		ddata[0][2] ="Meeting";
		ddata[0][3] ="3";
		ddata[0][4] ="1";
		ddata[0][5] ="Inactive";
		ddata[0][6] ="Meeting";
		ddata[0][7]="Test Action";



		return ddata;

	}

	@DataProvider(name = "SubDispoData")
	public String[][] subdispoData() {

		String [][] sddata = new String[1][6];

		sddata[0][0]="Test Action";
		sddata[0][1]="Test Sub Dispo";
		sddata[0][2]="Testing Purpose";
		sddata[0][3] ="3";
		sddata[0][4] ="2";
		sddata[0][5] ="Active";


		return sddata;

	}
	
	@DataProvider(name = "LeadStatusData")
	public String[][] leadStatusData() {

		String [][] leadstatusdata = new String[1][4];

		leadstatusdata[0][0]="Test Lead Status";
		leadstatusdata[0][1]="Demo";
		leadstatusdata[0][2] ="Test closed";
		leadstatusdata[0][3] ="Inactive";



		return leadstatusdata;

	}

	@DataProvider(name = "TicketStatusData")
	public String[][] ticketStatusData() {

		String [][] ticketStatusdata = new String[1][6];

		ticketStatusdata[0][0]="Test Status";
		ticketStatusdata[0][1]="Demo";
		ticketStatusdata[0][2]="3";
		ticketStatusdata[0][3]="1";
		ticketStatusdata[0][4]="Inactive";
		ticketStatusdata[0][5]="Test Status Closed";



		return ticketStatusdata;

	}

	@DataProvider(name = "PausecodeData")
	public String[][] pausecodeData() {

		String [][] pausecodedata = new String[1][7];

		pausecodedata[0][0]="Test Pause Code";
		pausecodedata[0][1]="Demo";
		pausecodedata[0][2]="0";
		pausecodedata[0][3]="30";
		pausecodedata[0][4]="4";
		pausecodedata[0][5]="1";
		pausecodedata[0][6]="Inactive";



		return pausecodedata;

	}

	@DataProvider(name = "AudioData")
	public String[][] audioData() {

		String [][] audiodata = new String[1][4];

		audiodata[0][0]="Testing";
		audiodata[0][1]="C:\\Users\\admin\\Automation\\Doocti107_TestBuild\\Test Audio.mp3";
		audiodata[0][2]="Inactive";
		audiodata[0][3] ="Test_Audio.mp3";

		return audiodata;
 
	}

	@DataProvider(name = "BlocklistData")
	public String[][] blocklistData() {

		String [][]blocklistdata = new String[1][3];

		blocklistdata[0][0]= "C:\\Users\\admin\\Automation\\Doocti107_TestBuild\\sample_blocklist.csv";
		blocklistdata[0][1]= "1";
		blocklistdata[0][2]="9090909091";

		return blocklistdata;

	}

	
	@DataProvider(name ="DNCData") 
	public String[][] dncData(){
	
		String [][]dncData = new String[1][2];
		
		dncData[0][0] ="C:\\Users\\admin\\Automation\\Doocti107_TestBuild\\sample_dnc.csv";
		
		return dncData;
		
	}
	@DataProvider(name = "DidData")
	public String[][] didData() {

		String [][]diddata = new String[1][7];

		diddata[0][0]= "9876543210";
		diddata[0][1] ="Test purpose";
		diddata[0][2] ="C:\\Users\\admin\\Automation\\Doocti107_TestBuild\\sample_did.csv";
		diddata[0][3] ="4";
		diddata[0][4] ="2";
		diddata[0][5] ="Inactive";
		diddata[0][6] ="No";



		return diddata;

	}

	@DataProvider(name = "TagData")
	public String[][] tagData() {

		String [][]tagdata = new String[1][5];

		tagdata[0][0]= "Testing Tag";
		tagdata[0][1] ="Test purpose";
		tagdata[0][2] ="3";
		tagdata[0][3] ="1";
		tagdata[0][4] ="inactive";



		return tagdata;

	}

	@DataProvider(name = "AnnouncementData")
	public String[][] announcementData() {

		String [][]announcementdata = new String[1][7];

		announcementdata[0][0]= "Testing";
		announcementdata[0][1] ="Test Purpose";
		announcementdata[0][2] ="Test Preview";
		announcementdata[0][3] ="3";
		announcementdata[0][4] ="1";
		announcementdata[0][5] ="Inactive";
		announcementdata[0][6] ="Test Preview Campaign";



		return announcementdata;

	}

	@DataProvider(name = "RemainderData")
	public String[][] RemainderDate() {
		
		String [][]remainderdata = new String[1][8];
		
		remainderdata[0][0]="Test Remainder";
		remainderdata[0][1]="Preview Campaign";
		remainderdata[0][2]="Default";
		remainderdata[0][3]="Interested,Action,New";
		remainderdata[0][4]="immediate";
		remainderdata[0][5]="5 minutes";
		remainderdata[0][6]="Email";
		remainderdata[0][7]="Email";

		
		
		return remainderdata;
	
	}
	
	
	@DataProvider(name = "ScriptData")
	public String[][] scriptData() {

		String [][]scriptdata = new String[1][9];

		scriptdata[0][0]= "Testing Script URL";
		scriptdata[0][1]= "Testing Script Text";
		scriptdata[0][2] ="Test purpose";
		scriptdata[0][3] ="https://tevatel.com/";
		scriptdata[0][4] ="Hello Tevatel";
		scriptdata[0][5] ="URL";
		scriptdata[0][6] ="3";
		scriptdata[0][7] ="1";
		scriptdata[0][8] ="INACTIVE";

		return scriptdata;

	}

	@DataProvider(name = "SLAData")
	public String[][] SLAData() {
		
		String [][]slaData = new String [1][7];
		
		slaData[0][0] ="Test SLA";
		slaData[0][1] ="Testing";
		slaData[0][2] ="Low";
		slaData[0][3] ="Create";
		slaData[0][4] ="0";
		slaData[0][5] ="30";
		slaData[0][6] ="Update";

		
		return slaData;


		
	}

	@DataProvider(name="SchedulerData")
	public String[][] SchedulerData() {
		
		String [][] schedulerdata = new String [1][4];
		
		schedulerdata[0][0] = "Test Schedule";
		schedulerdata[0][1] = "Testing";
		schedulerdata[0][2] = "Test@doocti.com";
		schedulerdata[0][3] = "Inactive";


		
		return schedulerdata;
	}
	
	@DataProvider(name = "InboundData")
	public String[][] inboundData() {

		String [][]inbounddata = new String[1][9];

		inbounddata[0][0]= "123";
		inbounddata[0][1] ="Testing Inbound";
		inbounddata[0][2] ="queue";
		inbounddata[0][3] ="Test_Queue";
		inbounddata[0][4] ="3";
		inbounddata[0][5] ="1";
		inbounddata[0][6] ="1234";
		
		inbounddata[0][7] ="user";

		inbounddata[0][8] ="v2testdoocti_agent01@doocti.com";





		return inbounddata;

	}
	
	@DataProvider(name = "OminiData")
	public String[][] OminiData() {
		
		String [][] ominidata = new String[1][4];
		
		ominidata[0][0] ="WhatsApp";
		ominidata[0][1] ="123456789";
		ominidata[0][2] ="Preview Campaign";
		ominidata[0][3] ="Test_Queue";
		
		return ominidata;
	}

	@DataProvider(name = "TimezoneData")
	public String[][] timezoneData() {

		String [][]timezonedata = new String[1][10];

		timezonedata[0][0]= "Test Timezone";
		timezonedata[0][1] ="Testing";
		timezonedata[0][2] ="0";
		timezonedata[0][3] ="05";
		timezonedata[0][4] ="11";
		timezonedata[0][5] ="00";
		timezonedata[0][6] ="Active";
		timezonedata[0][7] ="5";
		timezonedata[0][8] ="1";
		timezonedata[0][9] ="Inactive";
		

		



		return timezonedata;

	}
	
	@DataProvider(name = "NotiData")
	public String[][] NotiData() {
		
		String[][]notidata = new String[1][7];
		
		notidata[0][0] ="Test Noti";
		notidata[0][1] ="Lead";
		notidata[0][2] ="Test_Template";
		notidata[0][3] ="SMS";
		notidata[0][4] ="Testing";
		notidata[0][5] ="Caller";
		notidata[0][6] ="Inactive";


		
		return notidata;

	}

	
	@DataProvider(name ="SystemSettingData")
	public String[][] SystemSettingData() {
		
		String[][]syssetdata = new String[1][2];
		
		syssetdata[0][0] ="Serial DateTime";
		syssetdata[0][1] ="Serial DateTime";

		
		return syssetdata;
	}
	
	
	@DataProvider(name = "MeetingTitleData")
	public String[][] meetingtitleData() {

		String[][] meetingtitledata = new String[1][6];

		meetingtitledata[0][0] ="Test Meeting Title";
		meetingtitledata[0][1] ="Testing";
		meetingtitledata[0][2] ="Testing Purpose";
		meetingtitledata[0][3] ="4";
		meetingtitledata[0][4] ="1";
		meetingtitledata[0][5] ="Inactive";



		return meetingtitledata;
	}

	
//			<============================================ Configuration Data's ==============================================>

	
//           <============================================ Users and Groups Data's ==============================================>
	

	@DataProvider(name= "UserGroupData")
	public String[][] usergroupData() {

		String[][] usergroupdata = new String[1][1];

		usergroupdata[0][0] = "Test";


		return usergroupdata;
	}

	@DataProvider(name= "UserData")
	public String[][] userData() {

		String[][] userdata = new String[1][13];

		userdata[0][0] = "testenv_agent21";
		userdata[0][1] = "Testing Purpose";
		userdata[0][2] = "376";
		userdata[0][3] = "test21@doocti.com";
		userdata[0][4] = "Doocti@123";
		userdata[0][5] = "Agent";
		userdata[0][6] = "testenv_admin";

		//Create and Delete Assert & Edit and Delete	

		userdata[0][7] = "3";

		//Update date	

		userdata[0][8] = "Demo";
		userdata[0][9] = "377";
		userdata[0][10] = "Administrator";
		userdata[0][11] = "developv2_admin";
		userdata[0][12] = "Inactive";






		return userdata;
	}

	@DataProvider(name = "ChannelData")
	public String[][] channelData() {

		String [][] channeldata = new String[1][6];

		channeldata[0][0] ="Test Channel";
		channeldata[0][1] ="Channel Description";

		//Create and Delete Assert Data

		channeldata[0][2] ="1";

		// Edit Data

		channeldata[0][3] ="3";

		// Update Data

		channeldata[0][4] ="Inactive";

		// Update Assert data

		channeldata[0][5] ="2";



		return channeldata;
	}

	@DataProvider(name = "SourceData")
	public String[][] sourceData() {

		String [][] sourcedata = new String[1][6];

		sourcedata[0][0] ="Test Source";
		sourcedata[0][1] ="Source Description";

		//Create and Delete Assert Data

		sourcedata[0][2] ="1";

		// Update Data

		sourcedata[0][3] ="3";
		sourcedata[0][4] ="Inactive";

		// Update Assert data

		sourcedata[0][5] ="2";

		return sourcedata;
	}

	@DataProvider(name = "TeamData")
	public String[][] teamData() {

		String [][] teamdata = new String[1][11];

		//Create Data

		teamdata[0][0] ="Test Team1";
		teamdata[0][1] ="Team Description";
		teamdata[0][2] ="All";
		teamdata[0][3] ="Test Source";
		teamdata[0][4] ="Test Channel";
		teamdata[0][5] ="Test Preview Campaign";
		teamdata[0][6] ="test21@doocti.com";

		//Create and Delete Assertion Data

		teamdata[0][7] ="1";

		// Update Data

		teamdata[0][8] ="4";
		teamdata[0][9]="Inactive";

		//Update Assertion Data

		teamdata[0][10]="3";




		return teamdata;
	}

//  		<============================================ Users and Groups Data's ==============================================>

//  		<============================================ CRM Data's ==============================================>

	/**
	 * CRM Data's
	 * @return 
	 * 
	 */


	@DataProvider(name = "CampaignData")
	public String[][] campaigndata() {

		String [][]campaigndata = new String [1][23];

		campaigndata[0][0] = "Test Preview Campaign";
		campaigndata[0][1] = "8633544661";
		campaigndata[0][2] = "IT";
		campaigndata[0][3] = "Test_Template";
		campaigndata[0][4] = "v2testdoocti_8633544661";
		campaigndata[0][5] = "500";
		campaigndata[0][6] = "1.2";
		campaigndata[0][7] = "10";
		campaigndata[0][8] = "Demo";
		campaigndata[0][9] = "5";
		campaigndata[0][10] = "9876543120";
		campaigndata[0][11] = "Text";	
		campaigndata[0][12] = "Test Predictive Campaign";
		campaigndata[0][13] = "Test Inbound Campaign";
		campaigndata[0][14] = "INBOUND";
		campaigndata[0][15] = "Test Power Campaign";
		campaigndata[0][16] = "POWER";
		campaigndata[0][17] = "Test VoiceBlast Campaign";
		campaigndata[0][18] = "VOICE BLAST";
		campaigndata[0][19] = "Test Whatsapp Blast Campaign";
		campaigndata[0][20] = "WHATSAPP BLAST";
		
		// Delete Column
		
		campaigndata[0][21] = "8";
		
		// Edit Assert data
		
		campaigndata[0][22] = "No";

		
		
		

		return campaigndata;
	}
	
	@DataProvider(name = "MeetingData")
	public String[][] meetingdata() {
		
		String[][]meetingdata = new String [1][8];
		
		meetingdata[0][0] ="Decision-making meeting";
		meetingdata[0][1] ="Testing";
		meetingdata[0][2] ="9514380497";
		meetingdata[0][3] ="v2testdoocti_agent02@doocti.com";
		meetingdata[0][4] ="11";
		meetingdata[0][5] ="lead";
		meetingdata[0][6] ="Testing";
		meetingdata[0][7] ="Test_Template";

		
		return meetingdata;
		
		
	}
	
	@DataProvider(name = "ListData")
	public String[][] listdata() {
		
		String[][]listdata = new String [1][5];
		
		listdata[0][0] ="4321";
		listdata[0][1] ="Test 4321";
		listdata[0][2] ="Testing";
		listdata[0][3] ="Test Preview Campaign";
		listdata[0][4] ="6";

		
		

		
		return listdata;
		
	}
	
	@DataProvider(name = "LeadData")
	public String[][] leaddata() {
		
		String[][]leaddata = new String [1][7];
		
		leaddata[0][0] ="12345678";
		leaddata[0][1] ="D:\\\\onelead.csv";
		leaddata[0][2] ="Test_Template";
		leaddata[0][3] ="9514380497";
		leaddata[0][4] ="testenv_agent05@doocti.com";
		leaddata[0][5] ="Test Lead";
		leaddata[0][6] ="Test Source";

		

		
		return leaddata;
		
	}
	
	@DataProvider(name = "ContactData")
	public String[][] contactdata() {
		
		String[][]contactdata = new String [1][3];
		
		contactdata[0][0] ="Test Contact";
		contactdata[0][1] ="9898989898";
		contactdata[0][2] ="C:\\Users\\admin\\Automation\\Doocti107_TestBuild\\samplefile.csv";

		
		return contactdata;
		
	}
	
	@DataProvider(name = "TicketData")
	public String[][] ticketdata() {
		
		String[][]ticketdata = new String [1][8];
		
		ticketdata[0][0] ="Open";
		ticketdata[0][1] ="Testing Ticket";
		ticketdata[0][2] ="Testing Subject";
		ticketdata[0][3] ="Testing Description";
		ticketdata[0][4] ="9514380497";
		ticketdata[0][5] ="30";
		ticketdata[0][6] ="Low";
		ticketdata[0][7] ="Test Channel";

		
		return ticketdata;
		
	}




//  		<============================================ CRM Data's ==============================================>



}
