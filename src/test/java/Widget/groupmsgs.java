package Widget;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class groupmsgs {
	WebDriver driver;
	ExtentHtmlReporter htmlReporter;
	ExtentReports extent;

	String extentReportImage = System.getProperty("user.dir")+ "extentReportImage.png";
	@BeforeSuite
	public void StartTest() {
		htmlReporter = new ExtentHtmlReporter("groupmsgs&call.html");
		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
	}
	@Test
	public void test00() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/tvisha/Downloads/chromedriver_linux64/chromedriver");
		driver = new ChromeDriver();
		driver.get("http://192.168.2.55:3000/user/submit-app");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='troopGritEntryBtn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='troopGritLoginUsernameInput']")).sendKeys("abc");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='troopGritLoginPasswordInput']")).sendKeys("123456");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id='troopGritLoginBtn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@data-name='dfsdst']")).click();
		Thread.sleep(1000);
		ExtentTest test= extent.createTest("Click on group");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Click on on-site monitoring");
		test.info("Enter username : abc");
		test.info("Enter password : 123456");
		test.info("Click on login button");
		test.info("Click on group : dfsdst");
		test.info("EXPECTED RESULT:: It should click on group");
		String a=driver.findElement(By.xpath("//div[@data-name='dfsdst']")).getAttribute("data-name");
		Assert.assertEquals(a, "dfsdst");
		test.pass(a);
		test.log(Status.PASS,"ACTUAL RESULT:: It is clicking on group");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println();
		driver.close();
	}
	@Test
	public void test01() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/tvisha/Downloads/chromedriver_linux64/chromedriver");
		driver = new ChromeDriver();
		driver.get("http://192.168.2.55:3000/user/submit-app");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='troopGritEntryBtn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='troopGritLoginUsernameInput']")).sendKeys("abc");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='troopGritLoginPasswordInput']")).sendKeys("123456");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id='troopGritLoginBtn']")).click();
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//div[@id='troopGritEntityListWrapper']")).getAttribute("id");
		Assert.assertEquals(a1, "troopGritEntityListWrapper");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@data-name='dfsdst']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@class='troop-grit-message-input']")).sendKeys("test");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@id='troopGritSendMessageBtn']")).click();
		Thread.sleep(1000);
		ExtentTest test= extent.createTest("Enter text & send it");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Click on on-site monitoring");
		test.info("Enter username : abc");
		test.info("Enter password : 123456");
		test.info("Click on login button");
		test.info("Click on group : dfsdst");
		test.info("Enter text : text");
		test.info("Click on send button");
		test.info("EXPECTED RESULT:: It should send the msg to the group");
		test.pass(a1);
		String a2=driver.findElement(By.xpath("//span[@class='received-message-text']")).getText();
		Assert.assertEquals(a2, "test");
		test.pass(a2);
		test.log(Status.PASS,"ACTUAL RESULT:: It is sending the msg to the group");
		test.log(Status.PASS, "Test Case:: TestCase PASSED");
		System.out.println(1);
		driver.close();
	}
	@Test
	public void test02() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/tvisha/Downloads/chromedriver_linux64/chromedriver");
		driver = new ChromeDriver();
		driver.get("chrome://flags");
		ChromeOptions options = new ChromeOptions()
			    .addArguments("--unsafely-treat-insecure-origin-as-secure=http://192.168.2.55:3000/user/submit-app");
		options.addArguments("use-fake-device-for-media-stream");
	    options.addArguments("use-fake-ui-for-media-stream");
		ChromeDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("http://192.168.2.55:3000/user/submit-app");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='troopGritEntryBtn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='troopGritLoginUsernameInput']")).sendKeys("abc");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='troopGritLoginPasswordInput']")).sendKeys("123456");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id='troopGritLoginBtn']")).click();
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//div[@id='troopGritEntityListWrapper']")).getAttribute("id");
		Assert.assertEquals(a1, "troopGritEntityListWrapper");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@data-name='dfsdst']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div//div[@data-type='audio'])")).click();
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("(//div//div[@data-type='audio'])")).getAttribute("data-type");
		Thread.sleep(5000);
		ExtentTest test= extent.createTest("Click on audio call to the group");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Click on on-site monitoring");
		test.info("Enter username : abc");
		test.info("Enter password : 123456");
		test.info("Click on login button");
		test.info("Click on group : dfsdst");
		test.info("Click on audio call button");
		test.info("EXPECTED RESULT:: It should click on audio call button to the group");
		test.pass(a1);
		Assert.assertEquals(a2, "audio");
		test.pass(a2);
		String a=driver.findElement(By.xpath("//div[@id='groupCallAddUsersContainer']")).getText();
		Assert.assertEquals(a, "Group Conferencing\n"
				+ "RA\n"
				+ "RAVI\n"
				+ "abcd\n"
				+ "abcde\n"
				+ "akash\n"
				+ "sharath\n"
				+ "Prefer video call\n"
				+ "Deselect All\n"
				+ "RAVI, +4");
		test.pass(a);
		test.log(Status.PASS,"ACTUAL RESULT:: It is clicking on audio call button to the group");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println(2);
		driver.close();
	}
	@Test
	public void test03() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/tvisha/Downloads/chromedriver_linux64/chromedriver");
		driver = new ChromeDriver();
		driver.get("chrome://flags");
		ChromeOptions options = new ChromeOptions()
			    .addArguments("--unsafely-treat-insecure-origin-as-secure=http://192.168.2.55:3000/user/submit-app");
		options.addArguments("use-fake-device-for-media-stream");
	    options.addArguments("use-fake-ui-for-media-stream");
		ChromeDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("http://192.168.2.55:3000/user/submit-app");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='troopGritEntryBtn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='troopGritLoginUsernameInput']")).sendKeys("abc");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='troopGritLoginPasswordInput']")).sendKeys("123456");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id='troopGritLoginBtn']")).click();
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//div[@id='troopGritEntityListWrapper']")).getAttribute("id");
		Assert.assertEquals(a1, "troopGritEntityListWrapper");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@data-name='dfsdst']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div//div[@data-type='audio'])")).click();
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("(//div//div[@data-type='audio'])")).getAttribute("data-type");
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[@id='groupCallAddUsersContainer']")).getText();
		String a3=driver.findElement(By.xpath("//div[@class='deselect-all-btn']")).getText();
		driver.findElement(By.xpath("//div[@class='deselect-all-btn']")).click();
		Thread.sleep(2000);
		String a4=driver.findElement(By.xpath("//div[@class='deselect-all-btn']")).getText();
		ExtentTest test= extent.createTest("Click on deselect all in the group audio call");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Click on on-site monitoring");
		test.info("Enter username : abc");
		test.info("Enter password : 123456");
		test.info("Click on login button");
		test.info("Click on group : dfsdst");
		test.info("Click on audio call button");
		test.info("Click on deselect all button");
		test.info("EXPECTED RESULT:: It should click on deselect all button in the group audio call");
		test.pass(a1);
		Assert.assertEquals(a2, "audio");
		test.pass(a2);
		Assert.assertEquals(a, "Group Conferencing\n"
				+ "RA\n"
				+ "RAVI\n"
				+ "abcd\n"
				+ "abcde\n"
				+ "akash\n"
				+ "sharath\n"
				+ "Prefer video call\n"
				+ "Deselect All\n"
				+ "RAVI, +4");
		test.pass(a);
		Assert.assertEquals(a3, "Deselect All");
		test.pass(a3);
		Assert.assertEquals(a4, "Select All");
		test.pass(a4);
		test.log(Status.PASS,"ACTUAL RESULT:: It is clicking on deselect all button in the group audio call");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println(3);
		driver.close();
	}
	@Test
	public void test04() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/tvisha/Downloads/chromedriver_linux64/chromedriver");
		driver = new ChromeDriver();
		driver.get("chrome://flags");
		ChromeOptions options = new ChromeOptions()
			    .addArguments("--unsafely-treat-insecure-origin-as-secure=http://192.168.2.55:3000/user/submit-app");
		options.addArguments("use-fake-device-for-media-stream");
	    options.addArguments("use-fake-ui-for-media-stream");
		ChromeDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("http://192.168.2.55:3000/user/submit-app");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='troopGritEntryBtn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='troopGritLoginUsernameInput']")).sendKeys("abc");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='troopGritLoginPasswordInput']")).sendKeys("123456");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id='troopGritLoginBtn']")).click();
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//div[@id='troopGritEntityListWrapper']")).getAttribute("id");
		Assert.assertEquals(a1, "troopGritEntityListWrapper");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@data-name='dfsdst']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div//div[@data-type='audio'])")).click();
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("(//div//div[@data-type='audio'])")).getAttribute("data-type");
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[@id='groupCallAddUsersContainer']")).getText();
		String a3=driver.findElement(By.xpath("//div[@class='deselect-all-btn']")).getText();
		driver.findElement(By.xpath("//div[@class='deselect-all-btn']")).click();
		Thread.sleep(2000);
		String a4=driver.findElement(By.xpath("//div[@class='deselect-all-btn']")).getText();
		ExtentTest test= extent.createTest("View the count of the user");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Click on on-site monitoring");
		test.info("Enter username : abc");
		test.info("Enter password : 123456");
		test.info("Click on login button");
		test.info("Click on group : dfsdst");
		test.info("Click on audio call button");
		test.info("Click on deselect all button");
		test.info("EXPECTED RESULT:: It should not display the count of the users in group audio call");
		test.pass(a1);
		Assert.assertEquals(a2, "audio");
		test.pass(a2);
		Assert.assertEquals(a, "Group Conferencing\n"
				+ "RA\n"
				+ "RAVI\n"
				+ "abcd\n"
				+ "abcde\n"
				+ "akash\n"
				+ "sharath\n"
				+ "Prefer video call\n"
				+ "Deselect All\n"
				+ "RAVI, +4");
		test.pass(a);
		Assert.assertEquals(a3, "Deselect All");
		test.pass(a3);
		Assert.assertEquals(a4, "Select All");
		test.pass(a4);
		String a5=driver.findElement(By.xpath("//span[@class='selected-users-text']")).getText();
		Assert.assertEquals(a5, "");
		test.pass(a5);
		test.log(Status.PASS,"ACTUAL RESULT:: It is not displaying count of the users in group audio call");
		test.log(Status.PASS,"Test Case:: TestCase FAILED");
		System.out.println(4);
		driver.close();
	}
	@Test
	public void test05() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/tvisha/Downloads/chromedriver_linux64/chromedriver");
		driver = new ChromeDriver();
		driver.get("chrome://flags");
		ChromeOptions options = new ChromeOptions()
			    .addArguments("--unsafely-treat-insecure-origin-as-secure=http://192.168.2.55:3000/user/submit-app");
		options.addArguments("use-fake-device-for-media-stream");
	    options.addArguments("use-fake-ui-for-media-stream");
		ChromeDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("http://192.168.2.55:3000/user/submit-app");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='troopGritEntryBtn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='troopGritLoginUsernameInput']")).sendKeys("abc");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='troopGritLoginPasswordInput']")).sendKeys("123456");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id='troopGritLoginBtn']")).click();
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//div[@id='troopGritEntityListWrapper']")).getAttribute("id");
		Assert.assertEquals(a1, "troopGritEntityListWrapper");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@data-name='dfsdst']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div//div[@data-type='audio'])")).click();
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("(//div//div[@data-type='audio'])")).getAttribute("data-type");
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[@id='groupCallAddUsersContainer']")).getText();
		String a5=driver.findElement(By.xpath("//div[@class='deselect-all-btn']")).getText();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='deselect-all-btn']")).click();
		Thread.sleep(2000);
		String a4=driver.findElement(By.xpath("//div[@class='deselect-all-btn']")).getText();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='deselect-all-btn']")).click();
		String a3=driver.findElement(By.xpath("//div[@class='deselect-all-btn']")).getText();
		Thread.sleep(2000);
		ExtentTest test= extent.createTest("Click on select all in the group audio call");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Click on on-site monitoring");
		test.info("Enter username : abc");
		test.info("Enter password : 123456");
		test.info("Click on login button");
		test.info("Click on group : dfsdst");
		test.info("Click on audio call button");
		test.info("Click on deselect all button");
		test.info("Click on select all button");
		test.info("EXPECTED RESULT:: It should click on select all button in the group audio call");
		test.pass(a1);
		Assert.assertEquals(a2, "audio");
		test.pass(a2);
		Assert.assertEquals(a, "Group Conferencing\n"
				+ "RA\n"
				+ "RAVI\n"
				+ "abcd\n"
				+ "abcde\n"
				+ "akash\n"
				+ "sharath\n"
				+ "Prefer video call\n"
				+ "Deselect All\n"
				+ "RAVI, +4");
		test.pass(a);
		Assert.assertEquals(a5, "Deselect All");
		test.pass(a5);
		Assert.assertEquals(a4, "Select All");
		test.pass(a4);
		Assert.assertEquals(a3, "Deselect All");
		test.pass(a3);
		test.log(Status.PASS,"ACTUAL RESULT:: It is clicking on select all button in the group audio call");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println(5);
		driver.close();
	}
	@Test
	public void test06() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/tvisha/Downloads/chromedriver_linux64/chromedriver");
		driver = new ChromeDriver();
		driver.get("chrome://flags");
		ChromeOptions options = new ChromeOptions()
			    .addArguments("--unsafely-treat-insecure-origin-as-secure=http://192.168.2.55:3000/user/submit-app");
		options.addArguments("use-fake-device-for-media-stream");
	    options.addArguments("use-fake-ui-for-media-stream");
		ChromeDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("http://192.168.2.55:3000/user/submit-app");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='troopGritEntryBtn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='troopGritLoginUsernameInput']")).sendKeys("abc");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='troopGritLoginPasswordInput']")).sendKeys("123456");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id='troopGritLoginBtn']")).click();
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//div[@id='troopGritEntityListWrapper']")).getAttribute("id");
		Assert.assertEquals(a1, "troopGritEntityListWrapper");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@data-name='dfsdst']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div//div[@data-type='audio'])")).click();
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("(//div//div[@data-type='audio'])")).getAttribute("data-type");
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[@id='groupCallAddUsersContainer']")).getText();
		String a5=driver.findElement(By.xpath("//label[@for='preferVideoCall']")).getAttribute("for");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[@for='preferVideoCall']")).click();
		Thread.sleep(2000);
		ExtentTest test= extent.createTest("Click on checkbox of prefer video call in the group audio call");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Click on on-site monitoring");
		test.info("Enter username : abc");
		test.info("Enter password : 123456");
		test.info("Click on login button");
		test.info("Click on group : dfsdst");
		test.info("Click on audio call button");
		test.info("Click on checkbox of prefer video call");
		test.info("EXPECTED RESULT:: It should click on checkbox of prefer video call in the group audio call");
		test.pass(a1);
		Assert.assertEquals(a2, "audio");
		test.pass(a2);
		Assert.assertEquals(a, "Group Conferencing\n"
				+ "RA\n"
				+ "RAVI\n"
				+ "abcd\n"
				+ "abcde\n"
				+ "akash\n"
				+ "sharath\n"
				+ "Prefer video call\n"
				+ "Deselect All\n"
				+ "RAVI, +4");
		test.pass(a);
		Assert.assertEquals(a5, "preferVideoCall");
		test.pass(a5);
		test.log(Status.PASS,"ACTUAL RESULT:: It is clicking on checkbox of prefer video call in the group audio call");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println(6);
		driver.close();
	}
	@Test
	public void test07() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/tvisha/Downloads/chromedriver_linux64/chromedriver");
		driver = new ChromeDriver();
		driver.get("chrome://flags");
		ChromeOptions options = new ChromeOptions()
			    .addArguments("--unsafely-treat-insecure-origin-as-secure=http://192.168.2.55:3000/user/submit-app");
		options.addArguments("use-fake-device-for-media-stream");
	    options.addArguments("use-fake-ui-for-media-stream");
		ChromeDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("http://192.168.2.55:3000/user/submit-app");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='troopGritEntryBtn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='troopGritLoginUsernameInput']")).sendKeys("abc");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='troopGritLoginPasswordInput']")).sendKeys("123456");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id='troopGritLoginBtn']")).click();
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//div[@id='troopGritEntityListWrapper']")).getAttribute("id");
		Assert.assertEquals(a1, "troopGritEntityListWrapper");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@data-name='dfsdst']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div//div[@data-type='audio'])")).click();
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("(//div//div[@data-type='audio'])")).getAttribute("data-type");
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[@id='groupCallAddUsersContainer']")).getText();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='callUsersSearch']")).sendKeys("sharath");
		String a5=driver.findElement(By.xpath("//div[@id='callAllUsers']")).getText();
		Thread.sleep(2000);
		ExtentTest test= extent.createTest("Click on search the valid user in the group audio call");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Click on on-site monitoring");
		test.info("Enter username : abc");
		test.info("Enter password : 123456");
		test.info("Click on login button");
		test.info("Click on group : dfsdst");
		test.info("Click on audio call button");
		test.info("Click on search");
		test.info("Enter valid text : sharath");
		test.info("EXPECTED RESULT:: It should search the valid user in group audio call");
		test.pass(a1);
		Assert.assertEquals(a2, "audio");
		test.pass(a2);
		Assert.assertEquals(a, "Group Conferencing\n"
				+ "RA\n"
				+ "RAVI\n"
				+ "abcd\n"
				+ "abcde\n"
				+ "akash\n"
				+ "sharath\n"
				+ "Prefer video call\n"
				+ "Deselect All\n"
				+ "RAVI, +4");
		test.pass(a);
		Assert.assertEquals(a5, "sharath");
		test.pass(a5);
		test.log(Status.PASS,"ACTUAL RESULT:: It is searching the valid user in group audio call");
		test.log(Status.PASS,"Test Case:: TestCase FAILED");
		System.out.println(7);
		driver.close();
	}
	@Test
	public void test08() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/tvisha/Downloads/chromedriver_linux64/chromedriver");
		driver = new ChromeDriver();
		driver.get("chrome://flags");
		ChromeOptions options = new ChromeOptions()
			    .addArguments("--unsafely-treat-insecure-origin-as-secure=http://192.168.2.55:3000/user/submit-app");
		options.addArguments("use-fake-device-for-media-stream");
	    options.addArguments("use-fake-ui-for-media-stream");
		ChromeDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("http://192.168.2.55:3000/user/submit-app");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='troopGritEntryBtn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='troopGritLoginUsernameInput']")).sendKeys("abc");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='troopGritLoginPasswordInput']")).sendKeys("123456");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id='troopGritLoginBtn']")).click();
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//div[@id='troopGritEntityListWrapper']")).getAttribute("id");
		Assert.assertEquals(a1, "troopGritEntityListWrapper");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@data-name='dfsdst']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div//div[@data-type='audio'])")).click();
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("(//div//div[@data-type='audio'])")).getAttribute("data-type");
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[@id='groupCallAddUsersContainer']")).getText();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='callUsersSearch']")).sendKeys("sai");
		String a5=driver.findElement(By.xpath("//div[@id='callAllUsers']")).getText();
		Thread.sleep(2000);
		ExtentTest test= extent.createTest("Click on search the invalid user in the group audio call");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Click on on-site monitoring");
		test.info("Enter username : abc");
		test.info("Enter password : 123456");
		test.info("Click on login button");
		test.info("Click on group : dfsdst");
		test.info("Click on audio call button");
		test.info("Click on search");
		test.info("Enter invalid text : sai");
		test.info("EXPECTED RESULT:: It should search the invalid user in group audio call");
		test.pass(a1);
		Assert.assertEquals(a2, "audio");
		test.pass(a2);
		Assert.assertEquals(a, "Group Conferencing\n"
				+ "RA\n"
				+ "RAVI\n"
				+ "abcd\n"
				+ "abcde\n"
				+ "akash\n"
				+ "sharath\n"
				+ "Prefer video call\n"
				+ "Deselect All\n"
				+ "RAVI, +4");
		test.pass(a);
		Assert.assertEquals(a5, "");
		test.pass(a5);
		test.log(Status.PASS,"ACTUAL RESULT:: It is searching the invalid user in group audio call");
		test.log(Status.PASS,"Test Case:: TestCase PASSED");
		System.out.println(8);
		driver.close();
	}
	@Test
	public void test09() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/tvisha/Downloads/chromedriver_linux64/chromedriver");
		driver = new ChromeDriver();
		driver.get("chrome://flags");
		ChromeOptions options = new ChromeOptions()
			    .addArguments("--unsafely-treat-insecure-origin-as-secure=http://192.168.2.55:3000/user/submit-app");
		options.addArguments("use-fake-device-for-media-stream");
	    options.addArguments("use-fake-ui-for-media-stream");
		ChromeDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("http://192.168.2.55:3000/user/submit-app");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='troopGritEntryBtn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='troopGritLoginUsernameInput']")).sendKeys("abc");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='troopGritLoginPasswordInput']")).sendKeys("123456");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id='troopGritLoginBtn']")).click();
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//div[@id='troopGritEntityListWrapper']")).getAttribute("id");
		Assert.assertEquals(a1, "troopGritEntityListWrapper");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@data-name='dfsdst']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div//div[@data-type='audio'])")).click();
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("(//div//div[@data-type='audio'])")).getAttribute("data-type");
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[@id='groupCallAddUsersContainer']")).getText();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[5]/div[1]/div/span[1]")).click();
		String a5=driver.findElement(By.xpath("//div[@id='messengerConversationMessage']")).getAttribute("id");
		Thread.sleep(2000);
		ExtentTest test= extent.createTest("Click on close button in group conference call");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Click on on-site monitoring");
		test.info("Enter username : abc");
		test.info("Enter password : 123456");
		test.info("Click on login button");
		test.info("Click on group : dfsdst");
		test.info("Click on audio call button");
		test.info("Click on close button");
		test.info("EXPECTED RESULT:: It should click on close button in group conference call");
		test.pass(a1);
		Assert.assertEquals(a2, "audio");
		test.pass(a2);
		Assert.assertEquals(a, "Group Conferencing\n"
				+ "RA\n"
				+ "RAVI\n"
				+ "abcd\n"
				+ "abcde\n"
				+ "akash\n"
				+ "sharath\n"
				+ "Prefer video call\n"
				+ "Deselect All\n"
				+ "RAVI, +4");
		test.pass(a);
		Assert.assertEquals(a5, "messengerConversationMessage");
		test.pass(a5);
		test.log(Status.PASS,"ACTUAL RESULT:: It is clicking on close button in group conference call");
		test.log(Status.PASS,"Test Case:: TestCase PASSED");
		System.out.println(9);
		driver.close();
	}
	@Test
	public void test10() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/tvisha/Downloads/chromedriver_linux64/chromedriver");
		driver = new ChromeDriver();
		driver.get("chrome://flags");
		ChromeOptions options = new ChromeOptions()
			    .addArguments("--unsafely-treat-insecure-origin-as-secure=http://192.168.2.55:3000/user/submit-app");
		options.addArguments("use-fake-device-for-media-stream");
	    options.addArguments("use-fake-ui-for-media-stream");
		ChromeDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("http://192.168.2.55:3000/user/submit-app");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='troopGritEntryBtn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='troopGritLoginUsernameInput']")).sendKeys("abc");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='troopGritLoginPasswordInput']")).sendKeys("123456");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id='troopGritLoginBtn']")).click();
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//div[@id='troopGritEntityListWrapper']")).getAttribute("id");
		Assert.assertEquals(a1, "troopGritEntityListWrapper");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@data-name='dfsdst']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div//div[@data-type='audio'])")).click();
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("(//div//div[@data-type='audio'])")).getAttribute("data-type");
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[@id='groupCallAddUsersContainer']")).getText();
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//div[@id='troopGritConversationBackBtn']")).getAttribute("id");
		driver.findElement(By.xpath("//div[@id='troopGritConversationBackBtn']")).click();
		Thread.sleep(2000);
		String a3=driver.findElement(By.xpath("//span[@data-lang-key='Chat Users']")).getAttribute("data-lang-key");
		Thread.sleep(2000);
		ExtentTest test= extent.createTest("Click on back button in group conference call");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Click on on-site monitoring");
		test.info("Enter username : abc");
		test.info("Enter password : 123456");
		test.info("Click on login button");
		test.info("Click on group : dfsdst");
		test.info("Click on audio call button");
		test.info("Click on back button");
		test.info("EXPECTED RESULT:: It should click on back button & It should close the group conference call");
		test.pass(a1);
		Assert.assertEquals(a2, "audio");
		test.pass(a2);
		Assert.assertEquals(a, "Group Conferencing\n"
				+ "RA\n"
				+ "RAVI\n"
				+ "abcd\n"
				+ "abcde\n"
				+ "akash\n"
				+ "sharath\n"
				+ "Prefer video call\n"
				+ "Deselect All\n"
				+ "RAVI, +4");
		test.pass(a);
		Assert.assertEquals(a5, "troopGritConversationBackBtn");
		test.pass(a5);
		Assert.assertEquals(a3, "Chat Users");
		test.pass(a3);
		test.log(Status.PASS,"ACTUAL RESULT:: It is clicking on back button & It is closing the group conference call");
		test.log(Status.PASS,"Test Case:: TestCase PASSED");
		System.out.println(10);
		driver.close();
	}
	@Test
	public void test11() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/tvisha/Downloads/chromedriver_linux64/chromedriver");
		driver = new ChromeDriver();
		driver.get("chrome://flags");
		ChromeOptions options = new ChromeOptions()
			    .addArguments("--unsafely-treat-insecure-origin-as-secure=http://192.168.2.55:3000/user/submit-app");
		options.addArguments("use-fake-device-for-media-stream");
	    options.addArguments("use-fake-ui-for-media-stream");
		ChromeDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("http://192.168.2.55:3000/user/submit-app");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='troopGritEntryBtn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='troopGritLoginUsernameInput']")).sendKeys("abc");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='troopGritLoginPasswordInput']")).sendKeys("123456");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id='troopGritLoginBtn']")).click();
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//div[@id='troopGritEntityListWrapper']")).getAttribute("id");
		Assert.assertEquals(a1, "troopGritEntityListWrapper");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@data-name='dfsdst']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div//div[@data-type='audio'])")).click();
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("(//div//div[@data-type='audio'])")).getAttribute("data-type");
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[@id='groupCallAddUsersContainer']")).getText();
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//input[@id='callUsersSubmitBtn']")).getAttribute("id");
		driver.findElement(By.xpath("//input[@id='callUsersSubmitBtn']")).click();
		Thread.sleep(2000);
		String a3=driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[4]/div[3]/div[1]/div[2]")).getText();
		Thread.sleep(2000);
		ExtentTest test= extent.createTest("Click on call button in group conference call");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Click on on-site monitoring");
		test.info("Enter username : abc");
		test.info("Enter password : 123456");
		test.info("Click on login button");
		test.info("Click on group : dfsdst");
		test.info("Click on audio call button");
		test.info("Click on call button");
		test.info("EXPECTED RESULT:: It should click on call button & It should call to group users");
		test.pass(a1);
		Assert.assertEquals(a2, "audio");
		test.pass(a2);
		Assert.assertEquals(a, "Group Conferencing\n"
				+ "RA\n"
				+ "RAVI\n"
				+ "abcd\n"
				+ "abcde\n"
				+ "akash\n"
				+ "sharath\n"
				+ "Prefer video call\n"
				+ "Deselect All\n"
				+ "RAVI, +4");
		test.pass(a);
		Assert.assertEquals(a5, "callUsersSubmitBtn");
		test.pass(a5);
		Assert.assertEquals(a3, "calling sharath, +4 ...");
		test.pass(a3);
		test.log(Status.PASS,"ACTUAL RESULT:: It is clicking on call button & It is calling to group users");
		test.log(Status.PASS,"Test Case:: TestCase PASSED");
		System.out.println(11);
		driver.close();
	}
	@Test
	public void test12() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/tvisha/Downloads/chromedriver_linux64/chromedriver");
		driver = new ChromeDriver();
		driver.get("chrome://flags");
		ChromeOptions options = new ChromeOptions()
			    .addArguments("--unsafely-treat-insecure-origin-as-secure=http://192.168.2.55:3000/user/submit-app");
		options.addArguments("use-fake-device-for-media-stream");
	    options.addArguments("use-fake-ui-for-media-stream");
		ChromeDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("http://192.168.2.55:3000/user/submit-app");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='troopGritEntryBtn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='troopGritLoginUsernameInput']")).sendKeys("abc");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='troopGritLoginPasswordInput']")).sendKeys("123456");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id='troopGritLoginBtn']")).click();
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//div[@id='troopGritEntityListWrapper']")).getAttribute("id");
		Assert.assertEquals(a1, "troopGritEntityListWrapper");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@data-name='dfsdst']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div//div[@data-type='audio'])")).click();
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("(//div//div[@data-type='audio'])")).getAttribute("data-type");
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[@id='groupCallAddUsersContainer']")).getText();
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[@class='deselect-all-btn']")).getText();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='deselect-all-btn']")).click();
		Thread.sleep(2000);
		String a5=driver.findElement(By.xpath("//input[@id='callUsersSubmitBtn']")).getAttribute("id");
		driver.findElement(By.xpath("//input[@id='callUsersSubmitBtn']")).click();
		Thread.sleep(1000);
		String a3=driver.switchTo().alert().getText();
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		ExtentTest test= extent.createTest("Click on call button without selecting any user");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Click on on-site monitoring");
		test.info("Enter username : abc");
		test.info("Enter password : 123456");
		test.info("Click on login button");
		test.info("Click on group : dfsdst");
		test.info("Click on audio call button");
		test.info("Deselect all the users");
		test.info("Click on call button");
		test.info("EXPECTED RESULT:: It should click on call button & It should display toast msg");
		test.pass(a1);
		Assert.assertEquals(a2, "audio");
		test.pass(a2);
		Assert.assertEquals(a, "Group Conferencing\n"
				+ "RA\n"
				+ "RAVI\n"
				+ "abcd\n"
				+ "abcde\n"
				+ "akash\n"
				+ "sharath\n"
				+ "Prefer video call\n"
				+ "Deselect All\n"
				+ "RAVI, +4");
		test.pass(a);
		Assert.assertEquals(a4, "Deselect All");
		test.pass(a4);
		Assert.assertEquals(a5, "callUsersSubmitBtn");
		test.pass(a5);
		Assert.assertEquals(a3, "Please select atleast one user");
		test.pass(a3);
		test.log(Status.PASS,"ACTUAL RESULT:: It is clicking on call button & It is displaying toast as please select atleast one user");
		test.log(Status.PASS,"Test Case:: TestCase PASSED");
		System.out.println(12);
		driver.close();
	}
	@Test
	public void test13() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/tvisha/Downloads/chromedriver_linux64/chromedriver");
		driver = new ChromeDriver();
		driver.get("chrome://flags");
		ChromeOptions options = new ChromeOptions()
				.addArguments("--unsafely-treat-insecure-origin-as-secure=http://192.168.2.55:3000/user/submit-app");
		options.addArguments("use-fake-device-for-media-stream");
		options.addArguments("use-fake-ui-for-media-stream");
		ChromeDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("http://192.168.2.55:3000/user/submit-app");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='troopGritEntryBtn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='troopGritLoginUsernameInput']")).sendKeys("abc");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='troopGritLoginPasswordInput']")).sendKeys("123456");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id='troopGritLoginBtn']")).click();
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//div[@id='troopGritEntityListWrapper']")).getAttribute("id");
		Assert.assertEquals(a1, "troopGritEntityListWrapper");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@data-name='dfsdst']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div//div[@data-type='audio'])")).click();
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("(//div//div[@data-type='audio'])")).getAttribute("data-type");
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[@id='groupCallAddUsersContainer']")).getText();
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[@class='deselect-all-btn']")).getText();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='deselect-all-btn']")).click();
		Thread.sleep(2000);
		String a6=driver.findElement(By.xpath("//div[@data-username='sharath']")).getText();
		driver.findElement(By.xpath("//div[@data-username='sharath']")).click();
		String a5=driver.findElement(By.xpath("//input[@id='callUsersSubmitBtn']")).getAttribute("id");
		driver.findElement(By.xpath("//input[@id='callUsersSubmitBtn']")).click();
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[4]/div[3]/div[1]/div[2]")).getText();
		Thread.sleep(2000);
		ExtentTest test= extent.createTest("Click on call to the selected user");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Click on on-site monitoring");
		test.info("Enter username : abc");
		test.info("Enter password : 123456");
		test.info("Click on login button");
		test.info("Click on group : dfsdst");
		test.info("Click on audio call button");
		test.info("Deselect all the users");
		test.info("Select one user");
		test.info("Click on call button");
		test.info("EXPECTED RESULT:: It should click on call button & It should call to selected users");
		test.pass(a1);
		Assert.assertEquals(a2, "audio");
		test.pass(a2);
		Assert.assertEquals(a, "Group Conferencing\n"
				+ "RA\n"
				+ "RAVI\n"
				+ "abcd\n"
				+ "abcde\n"
				+ "akash\n"
				+ "sharath\n"
				+ "Prefer video call\n"
				+ "Deselect All\n"
				+ "RAVI, +4");
		test.pass(a);
		Assert.assertEquals(a4, "Deselect All");
		test.pass(a4);
		Assert.assertEquals(a6, "sharath");
		test.pass(a6);
		Assert.assertEquals(a5, "callUsersSubmitBtn");
		test.pass(a5);
		Assert.assertEquals(a3, "calling sharath ...");
		test.pass(a3);
		test.log(Status.PASS,"ACTUAL RESULT:: It is clicking on call button & It is calling to selected users");
		test.log(Status.PASS,"Test Case:: TestCase PASSED");
		System.out.println(13);
		driver.close();
	}
	@Test
	public void test14() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/tvisha/Downloads/chromedriver_linux64/chromedriver");
		driver = new ChromeDriver();
		driver.get("chrome://flags");
		ChromeOptions options = new ChromeOptions()
				.addArguments("--unsafely-treat-insecure-origin-as-secure=http://192.168.2.55:3000/user/submit-app");
		options.addArguments("use-fake-device-for-media-stream");
		options.addArguments("use-fake-ui-for-media-stream");
		ChromeDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("http://192.168.2.55:3000/user/submit-app");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='troopGritEntryBtn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='troopGritLoginUsernameInput']")).sendKeys("abc");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='troopGritLoginPasswordInput']")).sendKeys("123456");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id='troopGritLoginBtn']")).click();
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//div[@id='troopGritEntityListWrapper']")).getAttribute("id");
		Assert.assertEquals(a1, "troopGritEntityListWrapper");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@data-name='dfsdst']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div//div[@data-type='audio'])")).click();
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("(//div//div[@data-type='audio'])")).getAttribute("data-type");
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[@id='groupCallAddUsersContainer']")).getText();
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//label[@for='preferVideoCall']")).getAttribute("for");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[@for='preferVideoCall']")).click();
		Thread.sleep(2000);
		String a5=driver.findElement(By.xpath("//input[@id='callUsersSubmitBtn']")).getAttribute("id");
		driver.findElement(By.xpath("//input[@id='callUsersSubmitBtn']")).click();
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[4]/div[3]/div[1]/div[2]")).getText();
		Thread.sleep(2000);
		ExtentTest test= extent.createTest("Select prefer video call & Call to the users");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Click on on-site monitoring");
		test.info("Enter username : abc");
		test.info("Enter password : 123456");
		test.info("Click on login button");
		test.info("Click on group : dfsdst");
		test.info("Click on audio call button");
		test.info("Click on prefer video call");
		test.info("Click on call button");
		test.info("EXPECTED RESULT:: It should select prefer video call & Call to the group users");
		test.pass(a1);
		Assert.assertEquals(a2, "audio");
		test.pass(a2);
		Assert.assertEquals(a, "Group Conferencing\n"
				+ "RA\n"
				+ "RAVI\n"
				+ "abcd\n"
				+ "abcde\n"
				+ "akash\n"
				+ "sharath\n"
				+ "Prefer video call\n"
				+ "Deselect All\n"
				+ "RAVI, +4");
		test.pass(a);
		Assert.assertEquals(a4, "preferVideoCall");
		test.pass(a4);
		Assert.assertEquals(a5, "callUsersSubmitBtn");
		test.pass(a5);
		Assert.assertEquals(a3, "calling sharath, +4 ...");
		test.pass(a3);
		test.log(Status.PASS,"ACTUAL RESULT:: It is selecting prefer video call & Calling to the group users");
		test.log(Status.PASS,"Test Case:: TestCase PASSED");
		System.out.println(14);
		driver.close();
	}
	@Test
	public void test15() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/tvisha/Downloads/chromedriver_linux64/chromedriver");
		driver = new ChromeDriver();
		driver.get("chrome://flags");
		ChromeOptions options = new ChromeOptions()
				.addArguments("--unsafely-treat-insecure-origin-as-secure=http://192.168.2.55:3000/user/submit-app");
		options.addArguments("use-fake-device-for-media-stream");
		options.addArguments("use-fake-ui-for-media-stream");
		ChromeDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("http://192.168.2.55:3000/user/submit-app");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='troopGritEntryBtn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='troopGritLoginUsernameInput']")).sendKeys("abc");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='troopGritLoginPasswordInput']")).sendKeys("123456");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id='troopGritLoginBtn']")).click();
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//div[@id='troopGritEntityListWrapper']")).getAttribute("id");
		Assert.assertEquals(a1, "troopGritEntityListWrapper");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@data-name='dfsdst']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div//div[@data-type='audio'])")).click();
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("(//div//div[@data-type='audio'])")).getAttribute("data-type");
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[@id='groupCallAddUsersContainer']")).getText();
		Thread.sleep(1000);
		String a7=driver.findElement(By.xpath("//div[@class='deselect-all-btn']")).getText();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='deselect-all-btn']")).click();
		Thread.sleep(2000);
		String a6=driver.findElement(By.xpath("//div[@data-username='sharath']")).getText();
		driver.findElement(By.xpath("//div[@data-username='sharath']")).click();
		String a4=driver.findElement(By.xpath("//label[@for='preferVideoCall']")).getAttribute("for");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[@for='preferVideoCall']")).click();
		Thread.sleep(2000);
		String a5=driver.findElement(By.xpath("//input[@id='callUsersSubmitBtn']")).getAttribute("id");
		driver.findElement(By.xpath("//input[@id='callUsersSubmitBtn']")).click();
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[4]/div[3]/div[1]/div[2]")).getText();
		Thread.sleep(2000);
		ExtentTest test= extent.createTest("Select prefer video call & Call to selected users");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Click on on-site monitoring");
		test.info("Enter username : abc");
		test.info("Enter password : 123456");
		test.info("Click on login button");
		test.info("Click on group : dfsdst");
		test.info("Click on audio call button");
		test.info("Deselect all the users");
		test.info("Select one user");
		test.info("Click on prefer video call");
		test.info("Click on call button");
		test.info("EXPECTED RESULT:: It should select prefer video call & Call to the selected users");
		test.pass(a1);
		Assert.assertEquals(a2, "audio");
		test.pass(a2);
		Assert.assertEquals(a, "Group Conferencing\n"
				+ "RA\n"
				+ "RAVI\n"
				+ "abcd\n"
				+ "abcde\n"
				+ "akash\n"
				+ "sharath\n"
				+ "Prefer video call\n"
				+ "Deselect All\n"
				+ "RAVI, +4");
		test.pass(a);
		Assert.assertEquals(a7, "Deselect All");
		test.pass(a7);
		Assert.assertEquals(a6, "sharath");
		test.pass(a6);
		Assert.assertEquals(a4, "preferVideoCall");
		test.pass(a4);
		Assert.assertEquals(a5, "callUsersSubmitBtn");
		test.pass(a5);
		Assert.assertEquals(a3, "calling sharath ...");
		test.pass(a3);
		test.log(Status.PASS,"ACTUAL RESULT:: It is selecting prefer video call & Calling to the selected users");
		test.log(Status.PASS,"Test Case:: TestCase PASSED");
		System.out.println(14);
		driver.close();
	}
	@Test
	public void test16() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/tvisha/Downloads/chromedriver_linux64/chromedriver");
		driver = new ChromeDriver();
		driver.get("http://192.168.2.55:3000/user/submit-app");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='troopGritEntryBtn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='troopGritLoginUsernameInput']")).sendKeys("abc");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='troopGritLoginPasswordInput']")).sendKeys("123456");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id='troopGritLoginBtn']")).click();
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//div[@id='troopGritEntityListWrapper']")).getAttribute("id");
		Assert.assertEquals(a1, "troopGritEntityListWrapper");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@data-name='Test 123']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@class='troop-grit-message-input']")).sendKeys("test");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@id='troopGritSendMessageBtn']")).click();
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//span[@class='received-message-text']")).getText();
		Thread.sleep(1000);
		WebElement e=driver.findElement(By.xpath("//span[@class='received-message-text']"));
		Actions ac=new Actions(driver);
		ac.contextClick(e).perform();
		Thread.sleep(1000);
		ExtentTest test= extent.createTest("Enter text & send it");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Click on on-site monitoring");
		test.info("Enter username : abc");
		test.info("Enter password : 123456");
		test.info("Click on login button");
		test.info("Click on group : Test 123");
		test.info("Enter text : text");
		test.info("Click on send button");
		test.info("Right click on sended msg");
		test.info("EXPECTED RESULT:: It should display reply,edit,forward,recall & delete");
		test.pass(a1);
		Assert.assertEquals(a2, "test");
		test.pass(a2);
		String a3=driver.findElement(By.xpath("//ul[@class='context-menu__items']")).getText();
		Assert.assertEquals(a3, "Reply\n"
				+ "Edit\n"
				+ "Forward\n"
				+ "Recall\n"
				+ "Delete");
		test.pass(a3);
		test.log(Status.PASS,"ACTUAL RESULT:: It is displaying reply,edit,forward,recall & delete");
		test.log(Status.PASS, "Test Case:: TestCase PASSED");
		System.out.println(16);
		driver.close();
	}
	@Test
	public void test17() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/tvisha/Downloads/chromedriver_linux64/chromedriver");
		driver = new ChromeDriver();
		driver.get("http://192.168.2.55:3000/user/submit-app");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='troopGritEntryBtn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='troopGritLoginUsernameInput']")).sendKeys("abc");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='troopGritLoginPasswordInput']")).sendKeys("123456");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id='troopGritLoginBtn']")).click();
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//div[@id='troopGritEntityListWrapper']")).getAttribute("id");
		Assert.assertEquals(a1, "troopGritEntityListWrapper");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@data-name='Test 123']")).click();
		Thread.sleep(1000);
		//driver.findElement(By.xpath("//span[@class='troop-grit-message-input']")).sendKeys("test");
		Thread.sleep(1000);
		//driver.findElement(By.xpath("//span[@id='troopGritSendMessageBtn']")).click();
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//span[@class='received-message-text']")).getText();
		Thread.sleep(1000);
		WebElement e=driver.findElement(By.xpath("//span[@class='received-message-text']"));
		WebElement e1=driver.findElement(By.xpath("//div[@class='conversation-option-wrapper']"));
		Actions ac=new Actions(driver);
		ac.moveToElement(e).click(e1).perform();
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[@class='conversation-option-menu']")).getText();
		ExtentTest test= extent.createTest("Enter text & send it");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Click on on-site monitoring");
		test.info("Enter username : abc");
		test.info("Enter password : 123456");
		test.info("Click on login button");
		test.info("Click on group : Test 123");
		test.info("Enter text : text");
		test.info("Click on send button");
		test.info("Dropdown on sended msg");
		test.info("EXPECTED RESULT:: It should display reply,edit,forward,recall & delete");
		test.pass(a1);
		Assert.assertEquals(a2, "test");
		test.pass(a2);
		Assert.assertEquals(a, "Reply\n"
				+ "Forward\n"
				+ "Edit\n"
				+ "Recall\n"
				+ "Delete");
		test.pass(a);
		test.log(Status.PASS,"ACTUAL RESULT:: It is displaying reply,edit,forward,recall & delete");
		test.log(Status.PASS, "Test Case:: TestCase PASSED");
		System.out.println(17);
		driver.close();
	}
	@Test
	public void test18() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/tvisha/Downloads/chromedriver_linux64/chromedriver");
		driver = new ChromeDriver();
		driver.get("http://192.168.2.55:3000/user/submit-app");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='troopGritEntryBtn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='troopGritLoginUsernameInput']")).sendKeys("abc");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='troopGritLoginPasswordInput']")).sendKeys("123456");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id='troopGritLoginBtn']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@data-name='dev']")).click();
		Thread.sleep(1000);
		//driver.findElement(By.xpath("//span[@class='troop-grit-message-input']")).sendKeys("test");
		Thread.sleep(1000);
		//driver.findElement(By.xpath("//span[@id='troopGritSendMessageBtn']")).click();
		Thread.sleep(1000);
		WebElement e=driver.findElement(By.xpath("//span[@class='received-message-text']"));
		WebElement e1=driver.findElement(By.xpath("//div[@class='conversation-option-wrapper']"));
		Actions ac=new Actions(driver);
		ac.moveToElement(e).click(e1).perform();
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[@class='conversation-option-menu']")).getText();
		Thread.sleep(1000);
		Thread.sleep(1000);
		ExtentTest test= extent.createTest("Select previous msg & Click on drop down");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Click on on-site monitoring");
		test.info("Enter username : abc");
		test.info("Enter password : 123456");
		test.info("Click on login button");
		test.info("Click on group : dev");
		test.info("Enter text : test");
		test.info("Click on send button");
		test.info("Select previous msg");
		test.info("Click on drop down");
		test.info("View the page");
		test.info("EXPECTED RESULT:: It should display only reply,forward,delete");
		Assert.assertEquals(a, "Reply\n"
				+ "Forward\n"
				+ "Delete");
		test.pass(a);
		test.log(Status.PASS,"ACTUAL RESULT:: It is displaying reply,forward & delete");
		test.log(Status.PASS,"Test Case:: TestCase PASSED");
		System.out.println(18);
		driver.close();
	}
	@Test
	public void test19() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/tvisha/Downloads/chromedriver_linux64/chromedriver");
		driver = new ChromeDriver();
		driver.get("http://192.168.2.55:3000/user/submit-app");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='troopGritEntryBtn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='troopGritLoginUsernameInput']")).sendKeys("abc");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='troopGritLoginPasswordInput']")).sendKeys("123456");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id='troopGritLoginBtn']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@data-name='dfsdst']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@class='troop-grit-message-input']")).sendKeys("test");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@id='troopGritSendMessageBtn']")).click();
		Thread.sleep(1000);
		WebElement e=driver.findElement(By.xpath("//span[@class='received-message-text']"));
		Actions ac=new Actions(driver);
		ac.contextClick(e).perform();
		driver.findElement(By.xpath("//a[@data-action='reply']")).click();
		String a1=driver.findElement(By.xpath("//a[@data-action='reply']")).getAttribute("data-action");
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[@class='chat-reply-message-wrapper']")).getAttribute("class");
		String a2=driver.findElement(By.xpath("//span[@class='chat-reply-close']")).getAttribute("class");
		driver.findElement(By.xpath("//span[@class='chat-reply-close']")).click();
		Thread.sleep(1000);
		Thread.sleep(1000);
		ExtentTest test= extent.createTest("Close the reply msg");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Click on on-site monitoring");
		test.info("Enter username : abc");
		test.info("Enter password : 123456");
		test.info("Click on login button");
		test.info("Click on group : dfsdst");
		test.info("Enter text : test");
		test.info("Click on send button");
		test.info("Right click on that msg");
		test.info("Click on reply");
		test.info("Close the reply msg");
		test.info("EXPECTED RESULT:: It should close the reply msg");
		Assert.assertEquals(a1, "reply");
		test.pass(a1);
		Assert.assertEquals(a, "chat-reply-message-wrapper");
		test.pass(a);
		Assert.assertEquals(a2, "chat-reply-close");
		test.pass(a2);
		test.log(Status.PASS,"ACTUAL RESULT:: It is closing the reply msg");
		test.log(Status.PASS,"Test Case:: TestCase PASSED");
		System.out.println(19);
		driver.close();
	}
	@Test
	public void test20() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/tvisha/Downloads/chromedriver_linux64/chromedriver");
		driver = new ChromeDriver();
		driver.get("http://192.168.2.55:3000/user/submit-app");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='troopGritEntryBtn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='troopGritLoginUsernameInput']")).sendKeys("abc");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='troopGritLoginPasswordInput']")).sendKeys("123456");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id='troopGritLoginBtn']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@data-name='dfsdst']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@class='troop-grit-message-input']")).sendKeys("test");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@id='troopGritSendMessageBtn']")).click();
		Thread.sleep(1000);
		WebElement e=driver.findElement(By.xpath("//span[@class='received-message-text']"));
		Actions ac=new Actions(driver);
		ac.contextClick(e).perform();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@data-action='reply']")).click();
		String a1=driver.findElement(By.xpath("//a[@data-action='reply']")).getAttribute("data-action");
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[@class='chat-reply-message-wrapper']")).getAttribute("class");
		driver.findElement(By.xpath("//span[@class='troop-grit-message-input']")).sendKeys("1");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@id='troopGritSendMessageBtn']")).click();
		Thread.sleep(1000);
		ExtentTest test= extent.createTest("Send the msg & reply it");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Click on on-site monitoring");
		test.info("Enter username : abc");
		test.info("Enter password : 123456");
		test.info("Click on login button");
		test.info("Click on group : dfsdst");
		test.info("Enter text : test");
		test.info("Click on send button");
		test.info("Right click on that msg");
		test.info("Click on reply");
		test.info("Send reply msg");
		test.info("EXPECTED RESULT:: It should reply to the sended msg");
		Assert.assertEquals(a1, "reply");
		test.pass(a1);
		Assert.assertEquals(a, "chat-reply-message-wrapper");
		test.pass(a);
		String a2=driver.findElement(By.xpath("//div[@class='conversation-message-reply-text conversation-message-reply-wrapper']")).getText();
		Assert.assertEquals(a2, "You\n"
				+ "test");
		test.pass(a2);
		test.log(Status.PASS,"ACTUAL RESULT:: It is replied to the sended msg");
		test.log(Status.PASS,"Test Case:: TestCase PASSED");
		System.out.println(20);
		driver.close();
	}
	@Test
	public void test21() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/tvisha/Downloads/chromedriver_linux64/chromedriver");
		driver = new ChromeDriver();
		driver.get("http://192.168.2.55:3000/user/submit-app");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='troopGritEntryBtn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='troopGritLoginUsernameInput']")).sendKeys("abc");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='troopGritLoginPasswordInput']")).sendKeys("123456");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id='troopGritLoginBtn']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@data-name='dfsdst']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@class='troop-grit-message-input']")).sendKeys("test");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@id='troopGritSendMessageBtn']")).click();
		Thread.sleep(1000);
		WebElement e=driver.findElement(By.xpath("//span[@class='received-message-text']"));
		Actions ac=new Actions(driver);
		ac.contextClick(e).perform();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@data-action='reply']")).click();
		String a1=driver.findElement(By.xpath("//a[@data-action='reply']")).getAttribute("data-action");
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[@class='chat-reply-message-wrapper']")).getAttribute("class");
		driver.findElement(By.xpath("//span[@class='troop-grit-message-input']")).sendKeys("1");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@id='troopGritSendMessageBtn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='conversation-message-reply-text conversation-message-reply-wrapper']")).click();
		Thread.sleep(1000);
		ExtentTest test= extent.createTest("Click on replied msg");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Click on on-site monitoring");
		test.info("Enter username : abc");
		test.info("Enter password : 123456");
		test.info("Click on login button");
		test.info("Click on group : dfsdst");
		test.info("Enter text : test");
		test.info("Click on send button");
		test.info("Right click on that msg");
		test.info("Click on reply");
		test.info("Send reply msg");
		test.info("Click on replied msg");
		test.info("EXPECTED RESULT:: It should click on replied msg");
		Assert.assertEquals(a1, "reply");
		test.pass(a1);
		Assert.assertEquals(a, "chat-reply-message-wrapper");
		test.pass(a);
		String a2=driver.findElement(By.xpath("//div[@class='conversation-message-reply-text conversation-message-reply-wrapper']")).getText();
		Assert.assertEquals(a2, "You\n"
				+ "test");
		test.pass(a2);
		test.log(Status.PASS,"ACTUAL RESULT:: It is clicking on replied msg");
		test.log(Status.PASS,"Test Case:: TestCase PASSED");
		System.out.println(21);
		driver.close();
	}
	@Test
	public void test22() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/tvisha/Downloads/chromedriver_linux64/chromedriver");
		driver = new ChromeDriver();
		driver.get("http://192.168.2.55:3000/user/submit-app");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='troopGritEntryBtn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='troopGritLoginUsernameInput']")).sendKeys("abc");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='troopGritLoginPasswordInput']")).sendKeys("123456");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id='troopGritLoginBtn']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@data-name='Test 123']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@class='troop-grit-message-input']")).sendKeys("test");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@id='troopGritSendMessageBtn']")).click();
		Thread.sleep(1000);
		WebElement e=driver.findElement(By.xpath("//span[@class='received-message-text']"));
		WebElement e1=driver.findElement(By.xpath("//div[@class='conversation-option-wrapper']"));
		Actions ac=new Actions(driver);
		ac.moveToElement(e).click(e1).perform();
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//div[@class='conversation-edit-button conversation-option']")).getText();
		driver.findElement(By.xpath("//div[@class='conversation-edit-button conversation-option']")).click();
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[@class='chat-edit-message-wrapper']")).getText();
		String a2=driver.findElement(By.xpath("//span[@class='chat-edit-close']")).getAttribute("class");
		driver.findElement(By.xpath("//span[@class='chat-edit-close']")).click();
		Thread.sleep(1000);
		Thread.sleep(1000);
		ExtentTest test= extent.createTest("Click on edit & Click on close");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Click on on-site monitoring");
		test.info("Enter username : abc");
		test.info("Enter password : 123456");
		test.info("Click on login button");
		test.info("Click on group : Test 123");
		test.info("Enter text : test");
		test.info("Click on send button");
		test.info("Select previous msg");
		test.info("Click on drop down");
		test.info("Click on edit");
		test.info("Click on close button");
		test.info("EXPECTED RESULT:: It should close the edit option");
		Assert.assertEquals(a1, "Edit");
		test.pass(a1);
		Assert.assertEquals(a, "Me\n"
				+ "test");
		test.pass(a);
		Assert.assertEquals(a2, "chat-edit-close");
		test.pass(a2);
		test.log(Status.PASS,"ACTUAL RESULT:: It is closing the edit option");
		test.log(Status.PASS,"Test Case:: TestCase PASSED");
		System.out.println(22);
		driver.close();
	}
	@Test
	public void test23() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/tvisha/Downloads/chromedriver_linux64/chromedriver");
		driver = new ChromeDriver();
		driver.get("http://192.168.2.55:3000/user/submit-app");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='troopGritEntryBtn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='troopGritLoginUsernameInput']")).sendKeys("abc");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='troopGritLoginPasswordInput']")).sendKeys("123456");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id='troopGritLoginBtn']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@data-name='Test 123']")).click();
		Thread.sleep(1000);
		//driver.findElement(By.xpath("//span[@class='troop-grit-message-input']")).sendKeys("test");
		Thread.sleep(1000);
		//driver.findElement(By.xpath("//span[@id='troopGritSendMessageBtn']")).click();
		Thread.sleep(1000);
		WebElement e=driver.findElement(By.xpath("//span[@class='received-message-text']"));
		WebElement e1=driver.findElement(By.xpath("//div[@class='conversation-option-wrapper']"));
		Actions ac=new Actions(driver);
		ac.moveToElement(e).click(e1).perform();
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//div[@class='conversation-edit-button conversation-option']")).getText();
		driver.findElement(By.xpath("//div[@class='conversation-edit-button conversation-option']")).click();
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[@class='chat-edit-message-wrapper']")).getText();
		driver.findElement(By.xpath("//span[@class='troop-grit-message-input']")).sendKeys("1");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@id='troopGritSendMessageBtn']")).click();
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//span[@class='edited-conversation-icon']")).getAttribute("class");
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//span[@class='received-message-text']")).getText();
		Thread.sleep(1000);
		ExtentTest test= extent.createTest("Click on edit & Edit the text");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Click on on-site monitoring");
		test.info("Enter username : abc");
		test.info("Enter password : 123456");
		test.info("Click on login button");
		test.info("Click on group : Test 123");
		test.info("Enter text : test");
		test.info("Click on send button");
		test.info("Select previous msg");
		test.info("Click on drop down");
		test.info("Click on edit");
		test.info("Enter text : 1");
		test.info("Click on send");
		test.info("EXPECTED RESULT:: It should edit the text");
		Assert.assertEquals(a1, "Edit");
		test.pass(a1);
		Assert.assertEquals(a, "Me\n"
				+ "test");
		test.pass(a);
		Assert.assertEquals(a2, "edited-conversation-icon");
		test.pass(a2);
		Assert.assertEquals(a3, "test1");
		test.pass(a3);
		test.log(Status.PASS,"ACTUAL RESULT:: It is editing the text");
		test.log(Status.PASS,"Test Case:: TestCase PASSED");
		System.out.println(23);
		driver.close();
	}
	@Test
	public void test24() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/tvisha/Downloads/chromedriver_linux64/chromedriver");
		driver = new ChromeDriver();
		driver.get("http://192.168.2.55:3000/user/submit-app");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='troopGritEntryBtn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='troopGritLoginUsernameInput']")).sendKeys("abc");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='troopGritLoginPasswordInput']")).sendKeys("123456");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id='troopGritLoginBtn']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@data-name='dfsdst']")).click();
		Thread.sleep(1000);
		//driver.findElement(By.xpath("//span[@class='troop-grit-message-input']")).sendKeys("test");
		Thread.sleep(1000);
		//driver.findElement(By.xpath("//span[@id='troopGritSendMessageBtn']")).click();
		Thread.sleep(1000);
		WebElement e=driver.findElement(By.xpath("//span[@class='received-message-text']"));
		WebElement e1=driver.findElement(By.xpath("//div[@class='conversation-option-wrapper']"));
		Actions ac=new Actions(driver);
		ac.moveToElement(e).click(e1).perform();
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//div[@class='conversation-forward-button conversation-option']")).getText();
		driver.findElement(By.xpath("//div[@class='conversation-forward-button conversation-option']")).click();
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//span[@id='forwardMessageSendBtn']")).getText();
		driver.findElement(By.xpath("//span[@id='forwardMessageSendBtn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[@for='forwardUser_19-1']")).click();
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//span[@class='modal-bottom-selected-users-text']")).getText();
		driver.findElement(By.xpath("//div[@id='modalForwardSendMessageBtn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id='troopGritConversationBackBtn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@data-name='abc']")).click();
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//span[@class='forward-conversation-label-icon']")).getAttribute("class");
		Thread.sleep(1000);
		Thread.sleep(1000);
		ExtentTest test= extent.createTest("Click on forward & Select the user & send it");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Click on on-site monitoring");
		test.info("Enter username : abc");
		test.info("Enter password : 123456");
		test.info("Click on login button");
		test.info("Click on group : dfsdst");
		test.info("Enter text : test");
		test.info("Click on send button");
		test.info("Select msg");
		test.info("Click on drop down");
		test.info("Click on forward");
		test.info("Click on forward button");
		test.info("Select the user");
		test.info("Click on send");
		test.info("Click on back button");
		test.info("Select the forwarded user");
		test.info("View the msg");
		test.info("EXPECTED RESULT:: It should forward the msg to selected user");
		Assert.assertEquals(a1, "Forward");
		test.pass(a1);
		Assert.assertEquals(a, "FRWD");
		test.pass(a);
		Assert.assertEquals(a5, "1 users");
		test.pass(a5);
		Assert.assertEquals(a2, "forward-conversation-label-icon");
		test.pass(a2);
		test.log(Status.PASS,"ACTUAL RESULT:: It is forwarding the msg to selected user");
		test.log(Status.PASS,"Test Case:: TestCase PASSED");
		System.out.println(24);
		driver.close();
	}
	@Test
	public void test25() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/tvisha/Downloads/chromedriver_linux64/chromedriver");
		driver = new ChromeDriver();
		driver.get("http://192.168.2.55:3000/user/submit-app");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='troopGritEntryBtn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='troopGritLoginUsernameInput']")).sendKeys("abc");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='troopGritLoginPasswordInput']")).sendKeys("123456");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id='troopGritLoginBtn']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@data-name='dfsdst']")).click();
		Thread.sleep(1000);
		//driver.findElement(By.xpath("//span[@class='troop-grit-message-input']")).sendKeys("test");
		Thread.sleep(1000);
		//driver.findElement(By.xpath("//span[@id='troopGritSendMessageBtn']")).click();
		Thread.sleep(1000);
		WebElement e=driver.findElement(By.xpath("//span[@class='received-message-text']"));
		WebElement e1=driver.findElement(By.xpath("//div[@class='conversation-option-wrapper']"));
		Actions ac=new Actions(driver);
		ac.moveToElement(e).click(e1).perform();
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//div[@class='conversation-forward-button conversation-option']")).getText();
		driver.findElement(By.xpath("//div[@class='conversation-forward-button conversation-option']")).click();
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//span[@id='forwardMessageSendBtn']")).getText();
		driver.findElement(By.xpath("//span[@id='forwardMessageSendBtn']")).click();
		Thread.sleep(1000);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id='modalForwardSendMessageBtn']")).click();
		Thread.sleep(1000);
		String a2=driver.switchTo().alert().getText();
		driver.switchTo().alert().accept();
		Thread.sleep(1000);
		ExtentTest test= extent.createTest("Click on forward & Don't select the user & send it");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Click on on-site monitoring");
		test.info("Enter username : abc");
		test.info("Enter password : 123456");
		test.info("Click on login button");
		test.info("Click on group : dfsdst");
		test.info("Enter text : test");
		test.info("Click on send button");
		test.info("Select msg");
		test.info("Click on drop down");
		test.info("Click on forward");
		test.info("Click on forward button");
		test.info("Don't Select the user");
		test.info("Click on send");
		test.info("View the msg");
		test.info("EXPECTED RESULT:: It should display toast msg");
		Assert.assertEquals(a1, "Forward");
		test.pass(a1);
		Assert.assertEquals(a, "FRWD");
		test.pass(a);
		Assert.assertEquals(a2, "Please select at least one user");
		test.pass(a2);
		test.log(Status.PASS,"ACTUAL RESULT:: It is displaying toast msg");
		test.log(Status.PASS,"Test Case:: TestCase PASSED");
		System.out.println(25);
		driver.close();
	}
	@Test
	public void test26() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/tvisha/Downloads/chromedriver_linux64/chromedriver");
		driver = new ChromeDriver();
		driver.get("http://192.168.2.55:3000/user/submit-app");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='troopGritEntryBtn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='troopGritLoginUsernameInput']")).sendKeys("abc");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='troopGritLoginPasswordInput']")).sendKeys("123456");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id='troopGritLoginBtn']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@data-name='dfsdst']")).click();
		Thread.sleep(1000);
		WebElement e=driver.findElement(By.xpath("//span[@class='received-message-text']"));
		WebElement e1=driver.findElement(By.xpath("//div[@class='conversation-option-wrapper']"));
		Actions ac=new Actions(driver);
		ac.moveToElement(e).click(e1).perform();
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//div[@class='conversation-forward-button conversation-option']")).getText();
		driver.findElement(By.xpath("//div[@class='conversation-forward-button conversation-option']")).click();
		Thread.sleep(1000);
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//label[@for='forwardMessage_13692']")).getAttribute("for");
		driver.findElement(By.xpath("//label[@for='forwardMessage_13692']")).click();
		Thread.sleep(1000);
		Thread.sleep(1000);
		ExtentTest test= extent.createTest("Click on forward & Deselect the selected checkbox");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Click on on-site monitoring");
		test.info("Enter username : abc");
		test.info("Enter password : 123456");
		test.info("Click on login button");
		test.info("Click on user");
		test.info("Enter text : test");
		test.info("Click on send button");
		test.info("Select msg");
		test.info("Click on drop down");
		test.info("Click on forward");
		test.info("De-select the selected checkbox");
		test.info("EXPECTED RESULT:: It should not display forward & cancel button");
		Assert.assertEquals(a1, "Forward");
		test.pass(a1);
		Assert.assertEquals(a, "forwardMessage_13692");
		test.pass(a);
		test.log(Status.PASS,"ACTUAL RESULT:: It is not displaying forward & cancel button");
		test.log(Status.PASS,"Test Case:: TestCase PASSED");
		System.out.println(26);
		driver.close();
	}
	@Test
	public void test27() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/tvisha/Downloads/chromedriver_linux64/chromedriver");
		driver = new ChromeDriver();
		driver.get("http://192.168.2.55:3000/user/submit-app");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='troopGritEntryBtn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='troopGritLoginUsernameInput']")).sendKeys("abc");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='troopGritLoginPasswordInput']")).sendKeys("123456");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id='troopGritLoginBtn']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@data-name='dfsdst']")).click();
		Thread.sleep(1000);
		//driver.findElement(By.xpath("//span[@class='troop-grit-message-input']")).sendKeys("test");
		Thread.sleep(1000);
		//driver.findElement(By.xpath("//span[@id='troopGritSendMessageBtn']")).click();
		Thread.sleep(1000);
		WebElement e=driver.findElement(By.xpath("//span[@class='received-message-text']"));
		WebElement e1=driver.findElement(By.xpath("//div[@class='conversation-option-wrapper']"));
		Actions ac=new Actions(driver);
		ac.moveToElement(e).click(e1).perform();
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//div[@class='conversation-forward-button conversation-option']")).getText();
		driver.findElement(By.xpath("//div[@class='conversation-forward-button conversation-option']")).click();
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//span[@id='forwardMessageCloseBtn']")).getText();
		driver.findElement(By.xpath("//span[@id='forwardMessageCloseBtn']")).click();
		Thread.sleep(1000);
		Thread.sleep(1000);
		ExtentTest test= extent.createTest("Click on cancel");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Click on on-site monitoring");
		test.info("Enter username : abc");
		test.info("Enter password : 123456");
		test.info("Click on login button");
		test.info("Click on group : dfsdst");
		test.info("Enter text : test");
		test.info("Click on send button");
		test.info("Select msg");
		test.info("Click on drop down");
		test.info("Click on forward");
		test.info("Click on cancel button");
		test.info("EXPECTED RESULT:: It should click on cancel button");
		Assert.assertEquals(a1, "Forward");
		test.pass(a1);
		Assert.assertEquals(a, "CANCEL");
		test.pass(a);
		test.log(Status.PASS,"ACTUAL RESULT:: It is clicking on cancel button");
		test.log(Status.PASS,"Test Case:: TestCase PASSED");
		System.out.println(27);
		driver.close();
	}
	@Test
	public void test28() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/tvisha/Downloads/chromedriver_linux64/chromedriver");
		driver = new ChromeDriver();
		driver.get("http://192.168.2.55:3000/user/submit-app");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='troopGritEntryBtn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='troopGritLoginUsernameInput']")).sendKeys("abc");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='troopGritLoginPasswordInput']")).sendKeys("123456");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id='troopGritLoginBtn']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@data-name='dfsdst']")).click();
		Thread.sleep(1000);
		//driver.findElement(By.xpath("//span[@class='troop-grit-message-input']")).sendKeys("test");
		Thread.sleep(1000);
		//driver.findElement(By.xpath("//span[@id='troopGritSendMessageBtn']")).click();
		Thread.sleep(1000);
		WebElement e=driver.findElement(By.xpath("//span[@class='received-message-text']"));
		WebElement e1=driver.findElement(By.xpath("//div[@class='conversation-option-wrapper']"));
		Actions ac=new Actions(driver);
		ac.moveToElement(e).click(e1).perform();
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//div[@class='conversation-forward-button conversation-option']")).getText();
		driver.findElement(By.xpath("//div[@class='conversation-forward-button conversation-option']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[@for='forwardMessage_13699']")).click();
		driver.findElement(By.xpath("//label[@for='forwardMessage_13700']")).click();
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//span[@id='forwardMessageSendBtn']")).getText();
		driver.findElement(By.xpath("//span[@id='forwardMessageSendBtn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[@for='forwardUser_19-1']")).click();
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//span[@class='modal-bottom-selected-users-text']")).getText();
		driver.findElement(By.xpath("//div[@id='modalForwardSendMessageBtn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id='troopGritConversationBackBtn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@data-name='abc']")).click();
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//span[@class='forward-conversation-label-icon']")).getAttribute("class");
		Thread.sleep(1000);
		Thread.sleep(1000);
		ExtentTest test= extent.createTest("Click on forward & Select the multiple checkbox");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Click on on-site monitoring");
		test.info("Enter username : abc");
		test.info("Enter password : 123456");
		test.info("Click on login button");
		test.info("Click on group : dfsdst");
		test.info("Enter text : test");
		test.info("Click on send button");
		test.info("Select msg");
		test.info("Click on drop down");
		test.info("Click on forward");
		test.info("Select the multiple checkbox");
		test.info("Click on forward");
		test.info("Select the user");
		test.info("Click on send button");
		test.info("Click on back button");
		test.info("Click on the forwarded user");
		test.info("EXPECTED RESULT:: It should display multiple forward msg");
		Assert.assertEquals(a1, "Forward");
		test.pass(a1);
		Assert.assertEquals(a, "FRWD");
		test.pass(a);
		Assert.assertEquals(a5, "1 users");
		test.pass(a5);
		Assert.assertEquals(a2, "forward-conversation-label-icon");
		test.pass(a2);
		test.log(Status.PASS,"ACTUAL RESULT:: It is displaying multiple forward msg");
		test.log(Status.PASS,"Test Case:: TestCase PASSED");
		System.out.println(28);
		driver.close();
	}
	@Test
	public void test29() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/tvisha/Downloads/chromedriver_linux64/chromedriver");
		driver = new ChromeDriver();
		driver.get("http://192.168.2.55:3000/user/submit-app");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='troopGritEntryBtn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='troopGritLoginUsernameInput']")).sendKeys("abc");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='troopGritLoginPasswordInput']")).sendKeys("123456");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id='troopGritLoginBtn']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@data-name='dfsdst']")).click();
		Thread.sleep(1000);
		//driver.findElement(By.xpath("//span[@class='troop-grit-message-input']")).sendKeys("test");
		Thread.sleep(1000);
		//driver.findElement(By.xpath("//span[@id='troopGritSendMessageBtn']")).click();
		Thread.sleep(1000);
		WebElement e=driver.findElement(By.xpath("//span[@class='received-message-text']"));
		WebElement e1=driver.findElement(By.xpath("//div[@class='conversation-option-wrapper']"));
		Actions ac=new Actions(driver);
		ac.moveToElement(e).click(e1).perform();
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//div[@class='conversation-forward-button conversation-option']")).getText();
		driver.findElement(By.xpath("//div[@class='conversation-forward-button conversation-option']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[@for='forwardMessage_13699']")).click();
		driver.findElement(By.xpath("//label[@for='forwardMessage_13700']")).click();
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//span[@id='forwardMessageSendBtn']")).getText();
		driver.findElement(By.xpath("//span[@id='forwardMessageSendBtn']")).click();
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[@data-username='abc']")).getAttribute("data-username");
		driver.findElement(By.xpath("//label[@for='forwardUser_19-1']")).click();
		String a4=driver.findElement(By.xpath("//div[@data-username='abcd']")).getAttribute("data-username");
		driver.findElement(By.xpath("//label[@for='forwardUser_32-1']")).click();
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//span[@class='modal-bottom-selected-users-text']")).getText();
		driver.findElement(By.xpath("//div[@id='modalForwardSendMessageBtn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id='troopGritConversationBackBtn']")).click();
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[@data-name='abc']")).getAttribute("data-name");
		driver.findElement(By.xpath("//div[@data-name='abc']")).click();
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//span[@class='forward-conversation-label-icon']")).getAttribute("class");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id='troopGritConversationBackBtn']")).click();
		Thread.sleep(1000);
		String a7=driver.findElement(By.xpath("//div[@data-name='abcd']")).getAttribute("data-name");
		driver.findElement(By.xpath("//div[@data-name='abcd']")).click();
		Thread.sleep(1000);
		String a8=driver.findElement(By.xpath("//span[@class='forward-conversation-label-icon']")).getAttribute("class");
		Thread.sleep(1000);
		Thread.sleep(1000);
		ExtentTest test= extent.createTest("Click on forward & Select the multiple users");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Click on on-site monitoring");
		test.info("Enter username : abc");
		test.info("Enter password : 123456");
		test.info("Click on login button");
		test.info("Click on group : dfsdst");
		test.info("Enter text : test");
		test.info("Click on send button");
		test.info("Select msg");
		test.info("Click on drop down");
		test.info("Click on forward");
		test.info("Select the multiple checkbox");
		test.info("Click on forward");
		test.info("Select the multiple users");
		test.info("Click on send button");
		test.info("Click on back button");
		test.info("Click on the forwarded users");
		test.info("EXPECTED RESULT:: It should display forwarded msg for multiple users");
		Assert.assertEquals(a1, "Forward");
		test.pass(a1);
		Assert.assertEquals(a, "FRWD");
		test.pass(a);
		Assert.assertEquals(a5, "2 users");
		test.pass(a5);
		Assert.assertEquals(a3, "abc");
		test.pass(a3);
		Assert.assertEquals(a4, "abcd");
		test.pass(a4);
		Assert.assertEquals(a6, "abc");
		test.pass(a6);
		Assert.assertEquals(a2, "forward-conversation-label-icon");
		test.pass(a2);
		Assert.assertEquals(a7, "abcd");
		test.pass(a7);
		Assert.assertEquals(a8, "forward-conversation-label-icon");
		test.pass(a8);
		test.log(Status.PASS,"ACTUAL RESULT:: It is displaying forwarded msg for multiple users");
		test.log(Status.PASS,"Test Case:: TestCase PASSED");
		System.out.println(29);
		driver.close();
	}
	@Test
	public void test30() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/tvisha/Downloads/chromedriver_linux64/chromedriver");
		driver = new ChromeDriver();
		driver.get("http://192.168.2.55:3000/user/submit-app");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='troopGritEntryBtn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='troopGritLoginUsernameInput']")).sendKeys("abc");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='troopGritLoginPasswordInput']")).sendKeys("123456");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id='troopGritLoginBtn']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@data-name='dfsdst']")).click();
		Thread.sleep(1000);
		//driver.findElement(By.xpath("//span[@class='troop-grit-message-input']")).sendKeys("test");
		Thread.sleep(1000);
		//driver.findElement(By.xpath("//span[@id='troopGritSendMessageBtn']")).click();
		Thread.sleep(1000);
		WebElement e=driver.findElement(By.xpath("//span[@class='received-message-text']"));
		WebElement e1=driver.findElement(By.xpath("//div[@class='conversation-option-wrapper']"));
		Actions ac=new Actions(driver);
		ac.moveToElement(e).click(e1).perform();
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//div[@class='conversation-forward-button conversation-option']")).getText();
		driver.findElement(By.xpath("//div[@class='conversation-forward-button conversation-option']")).click();
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//span[@id='forwardMessageSendBtn']")).getText();
		driver.findElement(By.xpath("//span[@id='forwardMessageSendBtn']")).click();
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[@data-username='abcd']")).getAttribute("data-username");
		driver.findElement(By.xpath("//label[@for='forwardUser_32-1']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[@for='forwardMarkerCheckbox']")).click();
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//span[@class='modal-bottom-selected-users-text']")).getText();
		driver.findElement(By.xpath("//div[@id='modalForwardSendMessageBtn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id='troopGritConversationBackBtn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@data-name='abcd']")).click();
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//span[@class='forward-conversation-label-icon']")).getText();
		Thread.sleep(1000);
		Thread.sleep(1000);
		ExtentTest test= extent.createTest("Click on forward & De-Select the marker");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Click on on-site monitoring");
		test.info("Enter username : abc");
		test.info("Enter password : 123456");
		test.info("Click on login button");
		test.info("Click on group : dfsdst");
		test.info("Enter text : test");
		test.info("Click on send button");
		test.info("Select msg");
		test.info("Click on drop down");
		test.info("Click on forward");
		test.info("Click on forward button");
		test.info("Select the user");
		test.info("Deselect the marker");
		test.info("Click on send button");
		test.info("Click on back button");
		test.info("Click on the forwarded user");
		test.info("EXPECTED RESULT:: It should not display the marker for forward msg");
		Assert.assertEquals(a1, "Forward");
		test.pass(a1);
		Assert.assertEquals(a, "FRWD");
		test.pass(a);
		Assert.assertEquals(a5, "1 users");
		test.pass(a5);
		Assert.assertEquals(a4, "abcd");
		test.pass(a4);
		Assert.assertEquals(a2, "");
		test.pass(a2);
		test.log(Status.PASS,"ACTUAL RESULT:: It is not displaying the marker for forward msg");
		test.log(Status.PASS,"Test Case:: TestCase PASSED");
		System.out.println(30);
		driver.close();
	}
	@Test
	public void test31() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/tvisha/Downloads/chromedriver_linux64/chromedriver");
		driver = new ChromeDriver();
		driver.get("http://192.168.2.55:3000/user/submit-app");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='troopGritEntryBtn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='troopGritLoginUsernameInput']")).sendKeys("abc");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='troopGritLoginPasswordInput']")).sendKeys("123456");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id='troopGritLoginBtn']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@data-name='dfsdst']")).click();
		Thread.sleep(1000);
		//driver.findElement(By.xpath("//span[@class='troop-grit-message-input']")).sendKeys("test");
		Thread.sleep(1000);
		//driver.findElement(By.xpath("//span[@id='troopGritSendMessageBtn']")).click();
		Thread.sleep(1000);
		WebElement e=driver.findElement(By.xpath("//span[@class='received-message-text']"));
		WebElement e1=driver.findElement(By.xpath("//div[@class='conversation-option-wrapper']"));
		Actions ac=new Actions(driver);
		ac.moveToElement(e).click(e1).perform();
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//div[@class='conversation-forward-button conversation-option']")).getText();
		driver.findElement(By.xpath("//div[@class='conversation-forward-button conversation-option']")).click();
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//span[@id='forwardMessageSendBtn']")).getText();
		driver.findElement(By.xpath("//span[@id='forwardMessageSendBtn']")).click();
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[@data-username='abcd']")).getAttribute("data-username");
		driver.findElement(By.xpath("//label[@for='forwardUser_32-1']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[@for='forwardMarkerCheckbox']")).click();
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//span[@class='modal-bottom-selected-users-text']")).getText();
		driver.findElement(By.xpath("//span[@class='modal-bottom-reset-icon']")).click();
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//span[@class='modal-bottom-reset-icon']")).getAttribute("id");
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//span[@class='modal-bottom-selected-users-text hidden']")).getAttribute("class");
		Thread.sleep(1000);
		ExtentTest test= extent.createTest("Click on reset button");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Click on on-site monitoring");
		test.info("Enter username : abc");
		test.info("Enter password : 123456");
		test.info("Click on login button");
		test.info("Click on group : dfsdst");
		test.info("Enter text : test");
		test.info("Click on send button");
		test.info("Select msg");
		test.info("Click on drop down");
		test.info("Click on forward");
		test.info("Click on forward button");
		test.info("Select the user");
		test.info("Click on reset button");
		test.info("EXPECTED RESULT:: It should click on reset button & Deselect the user");
		Assert.assertEquals(a1, "Forward");
		test.pass(a1);
		Assert.assertEquals(a, "FRWD");
		test.pass(a);
		Assert.assertEquals(a5, "1 users");
		test.pass(a5);
		Assert.assertEquals(a4, "abcd");
		test.pass(a4);
		Assert.assertEquals(a2, "addForwardModalResetBtn");
		test.pass(a2);
		Assert.assertEquals(a3, "modal-bottom-selected-users-text hidden");
		test.pass(a3);
		test.log(Status.PASS,"ACTUAL RESULT:: It is clicking on reset button & Deselecting the user");
		test.log(Status.PASS,"Test Case:: TestCase PASSED");
		System.out.println(31);
		driver.close();
	}
	@Test
	public void test32() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/tvisha/Downloads/chromedriver_linux64/chromedriver");
		driver = new ChromeDriver();
		driver.get("http://192.168.2.55:3000/user/submit-app");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='troopGritEntryBtn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='troopGritLoginUsernameInput']")).sendKeys("abc");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='troopGritLoginPasswordInput']")).sendKeys("123456");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id='troopGritLoginBtn']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@data-name='dfsdst']")).click();
		Thread.sleep(1000);
		//driver.findElement(By.xpath("//span[@class='troop-grit-message-input']")).sendKeys("test");
		Thread.sleep(1000);
		//driver.findElement(By.xpath("//span[@id='troopGritSendMessageBtn']")).click();
		Thread.sleep(1000);
		WebElement e=driver.findElement(By.xpath("//span[@class='received-message-text']"));
		WebElement e1=driver.findElement(By.xpath("//div[@class='conversation-option-wrapper']"));
		Actions ac=new Actions(driver);
		ac.moveToElement(e).click(e1).perform();
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//div[@class='conversation-forward-button conversation-option']")).getText();
		driver.findElement(By.xpath("//div[@class='conversation-forward-button conversation-option']")).click();
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//span[@id='forwardMessageSendBtn']")).getText();
		driver.findElement(By.xpath("//span[@id='forwardMessageSendBtn']")).click();
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[@data-username='abcd']")).getAttribute("data-username");
		driver.findElement(By.xpath("//label[@for='forwardUser_32-1']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[@for='forwardMarkerCheckbox']")).click();
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//span[@class='modal-bottom-selected-users-text']")).getText();
		String a2=driver.findElement(By.xpath("//span[@id='forwardMessageModelCloseBtn']")).getAttribute("id");
		driver.findElement(By.xpath("//span[@id='forwardMessageModelCloseBtn']")).click();
		Thread.sleep(1000);
		Thread.sleep(1000);
		ExtentTest test= extent.createTest("Click on close button");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Click on on-site monitoring");
		test.info("Enter username : abc");
		test.info("Enter password : 123456");
		test.info("Click on login button");
		test.info("Click on group : dfsdst");
		test.info("Enter text : test");
		test.info("Click on send button");
		test.info("Select msg");
		test.info("Click on drop down");
		test.info("Click on forward");
		test.info("Click on forward button");
		test.info("Select the user");
		test.info("Click on close button");
		test.info("EXPECTED RESULT:: It should click on close button");
		Assert.assertEquals(a1, "Forward");
		test.pass(a1);
		Assert.assertEquals(a, "FRWD");
		test.pass(a);
		Assert.assertEquals(a5, "1 users");
		test.pass(a5);
		Assert.assertEquals(a4, "abcd");
		test.pass(a4);
		Assert.assertEquals(a2, "forwardMessageModelCloseBtn");
		test.pass(a2);
		test.log(Status.PASS,"ACTUAL RESULT:: It is clicking on close button");
		test.log(Status.PASS,"Test Case:: TestCase PASSED");
		System.out.println(32);
		driver.close();
	}
	@Test
	public void test33() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/tvisha/Downloads/chromedriver_linux64/chromedriver");
		driver = new ChromeDriver();
		driver.get("http://192.168.2.55:3000/user/submit-app");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='troopGritEntryBtn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='troopGritLoginUsernameInput']")).sendKeys("abc");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='troopGritLoginPasswordInput']")).sendKeys("123456");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id='troopGritLoginBtn']")).click();
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='troopGritEntryBtn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@data-name='dfsdst']")).click();
		Thread.sleep(1000);
		//driver.findElement(By.xpath("//span[@class='troop-grit-message-input']")).sendKeys("test");
		Thread.sleep(1000);
		//driver.findElement(By.xpath("//span[@id='troopGritSendMessageBtn']")).click();
		Thread.sleep(1000);
		WebElement e=driver.findElement(By.xpath("//span[@class='received-message-text']"));
		WebElement e1=driver.findElement(By.xpath("//div[@class='conversation-option-wrapper']"));
		Actions ac=new Actions(driver);
		ac.moveToElement(e).click(e1).perform();
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//div[@class='conversation-forward-button conversation-option']")).getText();
		driver.findElement(By.xpath("//div[@class='conversation-forward-button conversation-option']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[@for='forwardMessage_13699']")).click();
		driver.findElement(By.xpath("//label[@for='forwardMessage_13700']")).click();
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//span[@id='forwardMessageCloseBtn']")).getText();
		driver.findElement(By.xpath("//span[@id='forwardMessageCloseBtn']")).click();
		Thread.sleep(1000);
		ac.moveToElement(e).click(e1).perform();
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[@class='conversation-forward-button conversation-option']")).getText();
		driver.findElement(By.xpath("//div[@class='conversation-forward-button conversation-option']")).click();
		Thread.sleep(1000);
		Thread.sleep(1000);
		ExtentTest test= extent.createTest("Select the multiple checkbox & Click on cancel & Again forward the msg");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Click on on-site monitoring");
		test.info("Enter username : abc");
		test.info("Enter password : 123456");
		test.info("Click on login button");
		test.info("Click on group : dfsdst");
		test.info("Enter text : test");
		test.info("Click on send button");
		test.info("Select msg");
		test.info("Click on drop down");
		test.info("Click on forward");
		test.info("Select the multiple checkbox");
		test.info("Click on cancel button");
		test.info("Again select the msg");
		test.info("Click on drop down");
		test.info("Click on forward");
		test.info("View the page");
		test.info("EXPECTED RESULT:: It should not select previous msgs checkboxes");
		Assert.assertEquals(a1, "Forward");
		test.pass(a1);
		Assert.assertEquals(a, "CANCEL");
		test.pass(a);
		Assert.assertEquals(a2, "Forward");
		test.pass(a2);
		test.log(Status.PASS,"ACTUAL RESULT:: It is not selecting previous msgs checkboxes");
		test.log(Status.PASS,"Test Case:: TestCase PASSED");
		System.out.println(33);
		driver.close();
	}
	@AfterSuite
	public void endTest() {
		extent.flush();
	}
}
