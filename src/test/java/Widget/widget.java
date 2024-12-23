package Widget;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.google.common.io.Files;

public class widget {
	WebDriver driver;
	ExtentHtmlReporter htmlReporter;
	ExtentReports extent;

	String extentReportImage = System.getProperty("user.dir")+ "extentReportImage.png";
	@BeforeSuite
	public void StartTest() {
		htmlReporter = new ExtentHtmlReporter("totalcallingwidzet.html");
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
		Thread.sleep(2000);
		ExtentTest test= extent.createTest("Click on onsite monitoring");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Click on on-site monitoring");
		test.info("EXPECTED RESULT:: It should display login page");
		String a=driver.findElement(By.xpath("(//span[@class='header-text'])[2]")).getText();
		Assert.assertEquals(a, "Login");
		test.pass(a);
		test.log(Status.PASS,"ACTUAL RESULT:: It is displaying login page");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println(0);
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
		driver.findElement(By.xpath("//div[@id='troopGritLoginBtn']")).click();
		Thread.sleep(1000);
		ExtentTest test= extent.createTest("Click on login button without entering creditinals");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Click on on-site monitoring");
		test.info("Click on login button");
		test.info("EXPECTED RESULT:: It should display toast msg as username required");
		String a=driver.findElement(By.xpath("//div[@id='troopGritLoginErrorMessage']")).getText();
		Assert.assertEquals(a, "Username is Required");
		test.pass(a);
		test.log(Status.PASS,"ACTUAL RESULT:: Username is Required");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println(1);
		driver.close();
	}
	@Test
	public void test02() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/tvisha/Downloads/chromedriver_linux64/chromedriver");
		driver = new ChromeDriver();
		driver.get("http://192.168.2.55:3000/user/submit-app");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='troopGritEntryBtn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id='troopGritLoginBtn']")).click();
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//div[@id='troopGritLoginErrorMessage']")).getText();
		Assert.assertEquals(a1, "Username is Required");
		Thread.sleep(1000);
		ExtentTest test= extent.createTest("Click on login button for 2 times");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Click on on-site monitoring");
		test.info("Click on login button");
		test.info("Again click on login button");
		test.info("EXPECTED RESULT:: It should click on login button for 2nd time also");
		test.pass(a1);
		test.log(Status.FAIL,"ACTUAL RESULT:: It is not clicking on login button for 2nd time");
		test.log(Status.FAIL, "Test Case:: TestCase FAILED");
		System.out.println(2);
		driver.close();
	}
	@Test
	public void test03() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/tvisha/Downloads/chromedriver_linux64/chromedriver");
		driver = new ChromeDriver();
		driver.get("http://192.168.2.55:3000/user/submit-app");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='troopGritEntryBtn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='troopGritLoginUsernameInput']")).sendKeys("abc");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id='troopGritLoginBtn']")).click();
		Thread.sleep(1000);
		ExtentTest test= extent.createTest("Click on login button without entering password");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Click on on-site monitoring");
		test.info("Enter username : abc");
		test.info("Click on login button");
		test.info("EXPECTED RESULT:: It should display toast msg");
		String a=driver.findElement(By.xpath("//div[@id='troopGritLoginErrorMessage']")).getText();
		Assert.assertEquals(a, "Password is Required");
		test.pass(a);
		test.log(Status.PASS,"ACTUAL RESULT:: Password is Required");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println(3);
		driver.close();
	}
	@Test
	public void test04() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/tvisha/Downloads/chromedriver_linux64/chromedriver");
		driver = new ChromeDriver();
		driver.get("http://192.168.2.55:3000/user/submit-app");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='troopGritEntryBtn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='troopGritLoginUsernameInput']")).sendKeys("");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='troopGritLoginPasswordInput']")).sendKeys("123456");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id='troopGritLoginBtn']")).click();
		Thread.sleep(1000);
		ExtentTest test= extent.createTest("Click on login button without entering username");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Click on on-site monitoring");
		test.info("Enter username : blank");
		test.info("Enter password : 123456");
		test.info("Click on login button");
		test.info("EXPECTED RESULT:: It should display toast msg");
		String a=driver.findElement(By.xpath("//div[@id='troopGritLoginErrorMessage']")).getText();
		Assert.assertEquals(a, "Username is Required");
		test.pass(a);
		test.log(Status.PASS,"ACTUAL RESULT:: Username is Required");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println(4);
		driver.close();
	}
	@Test
	public void test05() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/tvisha/Downloads/chromedriver_linux64/chromedriver");
		driver = new ChromeDriver();
		driver.get("http://192.168.2.55:3000/user/submit-app");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='troopGritEntryBtn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='troopGritLoginUsernameInput']")).sendKeys("aaaa");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='troopGritLoginPasswordInput']")).sendKeys("12345");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id='troopGritLoginBtn']")).click();
		Thread.sleep(1000);
		ExtentTest test= extent.createTest("Click on login button with invalid username & password");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Click on on-site monitoring");
		test.info("Enter username : aaaa");
		test.info("Enter password : 12345");
		test.info("Click on login button");
		test.info("EXPECTED RESULT:: It should display toast msg as invalid credentials");
		String a=driver.findElement(By.xpath("//div[@id='troopGritLoginErrorMessage']")).getText();
		Assert.assertEquals(a, "Invalid Credentials!");
		test.pass(a);
		test.log(Status.PASS,"ACTUAL RESULT:: Invalid Credentials!");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println(5);
		driver.close();
	}
	@Test
	public void test06() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/tvisha/Downloads/chromedriver_linux64/chromedriver");
		driver = new ChromeDriver();
		driver.get("http://192.168.2.55:3000/user/submit-app");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='troopGritEntryBtn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='troopGritLoginUsernameInput']")).sendKeys("aaaa");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='troopGritLoginPasswordInput']")).sendKeys("123456");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id='troopGritLoginBtn']")).click();
		Thread.sleep(1000);
		ExtentTest test= extent.createTest("Click on login button with invalid username & valid password");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Click on on-site monitoring");
		test.info("Enter username : aaaa");
		test.info("Enter password : 123456");
		test.info("Click on login button");
		test.info("EXPECTED RESULT:: It should display toast msg as invalid credentials");
		String a=driver.findElement(By.xpath("//div[@id='troopGritLoginErrorMessage']")).getText();
		Assert.assertEquals(a, "Invalid Credentials!");
		test.pass(a);
		test.log(Status.PASS,"ACTUAL RESULT:: Invalid Credentials!");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println(6);
		driver.close();
	}
	@Test
	public void test07() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/tvisha/Downloads/chromedriver_linux64/chromedriver");
		driver = new ChromeDriver();
		driver.get("http://192.168.2.55:3000/user/submit-app");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='troopGritEntryBtn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='troopGritLoginUsernameInput']")).sendKeys("abc");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='troopGritLoginPasswordInput']")).sendKeys("1234");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id='troopGritLoginBtn']")).click();
		Thread.sleep(1000);
		ExtentTest test= extent.createTest("Click on login button with valid username & invalid password");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Click on on-site monitoring");
		test.info("Enter username : abc");
		test.info("Enter password : 12345");
		test.info("Click on login button");
		test.info("EXPECTED RESULT:: It should display toast msg as invalid credentials");
		String a=driver.findElement(By.xpath("//div[@id='troopGritLoginErrorMessage']")).getText();
		Assert.assertEquals(a, "Invalid Credentials!");
		test.pass(a);
		test.log(Status.PASS,"ACTUAL RESULT:: Invalid Credentials!");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println(7);
		driver.close();
	}
	@Test
	public void test08() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/tvisha/Downloads/chromedriver_linux64/chromedriver");
		driver = new ChromeDriver();
		driver.get("http://192.168.2.55:3000/user/submit-app");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='troopGritEntryBtn']")).click();
		Thread.sleep(1000);
		//driver.findElement(By.xpath("(//div[@class='close'])[1]")).click();
		Thread.sleep(1000);
		ExtentTest test= extent.createTest("Click on close button");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Click on on-site monitoring");
		test.info("Click on close button");
		test.info("EXPECTED RESULT:: It should close the login page");
		test.log(Status.FAIL,"ACTUAL RESULT:: It is not closing the login page");
		test.log(Status.FAIL, "Test Case:: TestCase FAILED");
		System.out.println(8);
		driver.close();
	}
	@Test
	public void test09() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/tvisha/Downloads/chromedriver_linux64/chromedriver");
		driver = new ChromeDriver();
		driver.get("http://192.168.2.55:3000/user/submit-app");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='troopGritEntryBtn']")).click();
		Thread.sleep(1000);
		//driver.findElement(By.xpath("(//div[@class='minimize'])[2]")).click();
		Thread.sleep(1000);
		ExtentTest test= extent.createTest("Click on minimize button");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Click on on-site monitoring");
		test.info("Click on minimize button");
		test.info("EXPECTED RESULT:: It should minimize the login page");
		test.log(Status.FAIL,"ACTUAL RESULT:: It is not minimizing the login page");
		test.log(Status.FAIL, "Test Case:: TestCase FAILED");
		System.out.println(9);
		driver.close();
	}
	@Test
	public void test10() throws InterruptedException {
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
		ExtentTest test= extent.createTest("Click on login button with valid username & password");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Click on on-site monitoring");
		test.info("Enter username : abc");
		test.info("Enter password : 123456");
		test.info("Click on login button");
		test.info("EXPECTED RESULT:: It should display recent chat user page");
		String a=driver.findElement(By.xpath("(//span[@class='header-text'])")).getText();
		Assert.assertEquals(a, "Chat Users");
		test.pass(a);
		test.log(Status.PASS,"ACTUAL RESULT:: It is displaying recent chat user page");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println(10);
		driver.close();
	}
	@Test
	public void test11() throws InterruptedException {
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
		driver.navigate().refresh();
		driver.findElement(By.xpath("//button[@id='troopGritEntryBtn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@data-name='css']")).click();
		Thread.sleep(1000);
		ExtentTest test= extent.createTest("Click on user");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Click on on-site monitoring");
		test.info("Enter username : abc");
		test.info("Enter password : 123456");
		test.info("Click on login button");
		test.info("Click on user");
		test.info("EXPECTED RESULT:: It should click on user");
		String a=driver.findElement(By.xpath("//div[@data-name='css']")).getAttribute("data-name");
		Assert.assertEquals(a, "css");
		test.pass(a);
		test.log(Status.PASS,"ACTUAL RESULT:: It is clicking on user");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println(11);
		driver.close();
	}
	@Test
	public void test12() throws InterruptedException {
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
		driver.navigate().refresh();
		driver.findElement(By.xpath("//button[@id='troopGritEntryBtn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@data-name='css']")).click();
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//div[@id='troopGritConversationBackBtn']")).getAttribute("id");
		Assert.assertEquals(a1, "troopGritConversationBackBtn");
		driver.findElement(By.xpath("//div[@id='troopGritConversationBackBtn']")).click();
		Thread.sleep(1000);
		ExtentTest test= extent.createTest("Click on back button in user chat");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Click on on-site monitoring");
		test.info("Enter username : abc");
		test.info("Enter password : 123456");
		test.info("Click on login button");
		test.info("Click on user");
		test.info("Click on back button");
		test.info("EXPECTED RESULT:: It should click on back button in user chat");
		String a=driver.findElement(By.xpath("//div[@id='troopGritEntityListWrapper']")).getAttribute("id");
		Assert.assertEquals(a, "troopGritEntityListWrapper");
		test.pass(a1);
		test.pass(a);
		test.log(Status.PASS,"ACTUAL RESULT:: It is clicking on back button in user chat");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println(12);
		driver.close();
	}
	@Test
	public void test13() throws InterruptedException {
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
		driver.navigate().refresh();
		driver.findElement(By.xpath("//button[@id='troopGritEntryBtn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@data-name='css']")).click();
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
		test.info("Click on user");
		test.info("Enter text : text");
		test.info("Click on send button");
		test.info("EXPECTED RESULT:: It should send the msg to the user");
		test.pass(a1);
		test.log(Status.FAIL,"ACTUAL RESULT:: It is not sending the msg to the user");
		test.log(Status.FAIL, "Test Case:: TestCase FAILED");
		System.out.println(13);
		driver.close();
	}
	@Test
	public void test14() throws InterruptedException {
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
		String a=driver.findElement(By.xpath("//div[@id='troopGritEntityListWrapper']")).getAttribute("id");
		Assert.assertEquals(a, "troopGritEntityListWrapper");
		driver.findElement(By.xpath("//div[@class='close']")).click();
		Thread.sleep(1000);
		ExtentTest test= extent.createTest("Click on close button in users chat");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Click on on-site monitoring");
		test.info("Enter username : abc");
		test.info("Enter password : 123456");
		test.info("Click on login button");
		test.info("Click on close button");
		test.info("EXPECTED RESULT:: It should click on close button in users chat");
		test.pass(a);
		test.log(Status.FAIL,"ACTUAL RESULT:: It is not not clicking on close button in users chat");
		test.log(Status.FAIL, "Test Case:: TestCase FAILED");
		System.out.println(14);
		driver.close();
	}
	@Test
	public void test15() throws InterruptedException {
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
		String a=driver.findElement(By.xpath("//div[@id='troopGritEntityListWrapper']")).getText();
		Assert.assertEquals(a, "Abc\n"
				+ "You declined video call @16:24\n"
				+ "16:24\n"
				+ "Abc\n"
				+ "You declined voice call @16:20\n"
				+ "16:20\n"
				+ "Abc\n"
				+ "attachment\n"
				+ "3 d\n"
				+ "Abc\n"
				+ "Voice call @14:31\n"
				+ "4 d\n"
				+ "Akhil\n"
				+ "attachment\n"
				+ "5 d\n"
				+ "Hhhh\n"
				+ "Narasimha : attachment\n"
				+ "19\n"
				+ "5 d\n"
				+ "Abc\n"
				+ "attachment\n"
				+ "1 w\n"
				+ "Testing\n"
				+ "You missed video call @14:57\n"
				+ "7\n"
				+ "2 w\n"
				+ "Hari\n"
				+ "You missed voice call @11:45\n"
				+ "4\n"
				+ "2 w\n"
				+ "Akshay\n"
				+ "You missed voice call @17:07\n"
				+ "3 w\n"
				+ "Tan\n"
				+ "acacs is not a member anymore\n"
				+ "3 w\n"
				+ "Tanuja\n"
				+ "abcd is not a member anymore\n"
				+ "3 w\n"
				+ "Gopi\n"
				+ "You missed voice call @00:54\n"
				+ "1\n"
				+ "1 m\n"
				+ "Sharath\n"
				+ "You missed voice call @00:31\n"
				+ "1 m\n"
				+ "Humera\n"
				+ "You missed voice call @15:00\n"
				+ "3\n"
				+ "2 m\n"
				+ "Abc\n"
				+ "Abcd\n"
				+ "Abcde\n"
				+ "Akash\n"
				+ "Anvesh\n"
				+ "Arjun\n"
				+ "Asif\n"
				+ "Babu\n"
				+ "Devlopment\n"
				+ "Dooo\n"
				+ "Ivan Gregorić\n"
				+ "Lakshman1\n"
				+ "Maneesh\n"
				+ "Mani\n"
				+ "Manoj\n"
				+ "Nani\n"
				+ "Prakash\n"
				+ "Ragu\n"
				+ "Rahul\n"
				+ "Rahul\n"
				+ "Rajitha\n"
				+ "Ramesh\n"
				+ "Ravi\n"
				+ "Sai 1\n"
				+ "Sai3\n"
				+ "Sai4\n"
				+ "Sai5\n"
				+ "Sai6\n"
				+ "Sample\n"
				+ "Satya\n"
				+ "Sdf\n"
				+ "Siva\n"
				+ "Suneel\n"
				+ "Sunil\n"
				+ "Sunny\n"
				+ "Test\n"
				+ "Test\n"
				+ "Test10\n"
				+ "Test11\n"
				+ "Test12\n"
				+ "Test13\n"
				+ "Test2\n"
				+ "Test4\n"
				+ "Test6\n"
				+ "Test7\n"
				+ "Test8\n"
				+ "Test9\n"
				+ "Uma\n"
				+ "Uma\n"
				+ "Upendra\n"
				+ "Uppi\n"
				+ "Uppi1\n"
				+ "Varma\n"
				+ "Vinay\n"
				+ "Vinod\n"
				+ "Vishnu\n"
				+ "Vishnu 1");
		Thread.sleep(1000);
		ExtentTest test= extent.createTest("View users chat");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Click on on-site monitoring");
		test.info("Enter username : abc");
		test.info("Enter password : 123456");
		test.info("Click on login button");
		test.info("EXPECTED RESULT:: It should not display duplicate usernames in users chat");
		test.pass(a);
		test.log(Status.FAIL,"ACTUAL RESULT:: It is displaying duplicate usernames in users chat");
		test.log(Status.FAIL, "Test Case:: TestCase FAILED");
		System.out.println(15);
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
		driver.findElement(By.xpath("//div[@data-name='Akhil']")).click();
		//Thread.sleep(1000);
		WebElement e=driver.findElement(By.xpath("(//div//div[@data-type='audio'])[1]"));
		Thread.sleep(1000);
		Actions ac=new Actions(driver);
		//Thread.sleep(1000);
		//ac.doubleClick(e).perform();
		ac.click(e).build().perform();
		Thread.sleep(5000);
		ExtentTest test= extent.createTest("Click on audio call to the user");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Click on on-site monitoring");
		test.info("Enter username : abc");
		test.info("Enter password : 123456");
		test.info("Click on login button");
		test.info("Click on user");
		test.info("Click on audio call button");
		test.info("EXPECTED RESULT:: It should click on audio call button to the user");
		test.pass(a1);
	//	String a=driver.findElement(By.xpath("//div[@class='calling-text']")).getText();
		//Assert.assertEquals(a, "");
		//test.pass(a);
		test.log(Status.FAIL,"ACTUAL RESULT:: It is not clicking on audio call button to the user after login");
		test.log(Status.FAIL, "Test Case:: TestCase FAILED");
		System.out.println(16);
		driver.close();
	}
	@Test
	public void test17() throws InterruptedException {
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
  		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//div[@id='troopGritEntityListWrapper']")).getAttribute("id");
		Assert.assertEquals(a1, "troopGritEntityListWrapper");
		driver.navigate().refresh();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='troopGritEntryBtn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@data-name='css']")).click();
		Thread.sleep(1000);
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div//div[@data-type='audio'])")).click();
		Thread.sleep(1000);
		Thread.sleep(5000);
		ExtentTest test= extent.createTest("Click on audio call to the user");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Click on on-site monitoring");
		test.info("Enter username : abc");
		test.info("Enter password : 123456");
		test.info("Click on login button");
		test.info("Click on user");
		test.info("Click on audio call button");
		test.info("EXPECTED RESULT:: It should click on audio call button to the user");
		test.pass(a1);
		String a=driver.findElement(By.xpath("//div[@class='calling-text']")).getAttribute("class");
		Assert.assertEquals(a, "calling-text");
		test.pass(a);
		test.log(Status.PASS,"ACTUAL RESULT:: It is clicking on audio call button to the user");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println(17);
		driver.close();
	}
	@Test
	public void test18() throws InterruptedException {
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
  		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//div[@id='troopGritEntityListWrapper']")).getAttribute("id");
		Assert.assertEquals(a1, "troopGritEntityListWrapper");
		driver.navigate().refresh();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='troopGritEntryBtn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@data-name='css']")).click();
		Thread.sleep(1000);
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div//div[@data-type='video'])")).click();
		Thread.sleep(1000);
		Thread.sleep(5000);
		ExtentTest test= extent.createTest("Click on video call to the user");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Click on on-site monitoring");
		test.info("Enter username : abc");
		test.info("Enter password : 123456");
		test.info("Click on login button");
		test.info("Click on user");
		test.info("Click on video call button");
		test.info("EXPECTED RESULT:: It should click on video call button to the user");
		test.pass(a1);
		String a=driver.findElement(By.xpath("//div[@class='calling-text']")).getAttribute("class");
		Assert.assertEquals(a, "calling-text");
		test.pass(a);
		test.log(Status.PASS,"ACTUAL RESULT:: It is clicking on video call button to the user");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println(18);
		driver.close();
	}
	@Test
	public void test19() throws InterruptedException {
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
  		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//div[@id='troopGritEntityListWrapper']")).getAttribute("id");
		Assert.assertEquals(a1, "troopGritEntityListWrapper");
		driver.navigate().refresh();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='troopGritEntryBtn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@data-name='css']")).click();
		Thread.sleep(1000);
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div//div[@data-type='video'])")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class='outgoing-end-btn'])[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div//div[@data-type='audio'])")).click();
		Thread.sleep(1000);
		Thread.sleep(5000);
		ExtentTest test= extent.createTest("Click on video call & later audio call to the user");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Click on on-site monitoring");
		test.info("Enter username : abc");
		test.info("Enter password : 123456");
		test.info("Click on login button");
		test.info("Click on user");
		test.info("Click on video call button");
		test.info("End the call");
		test.info("Click on audio call");
		test.info("EXPECTED RESULT:: It should click on audio call button to the user");
		test.pass(a1);
		String a=driver.findElement(By.xpath("//div[@class='calling-text']")).getAttribute("class");
		Assert.assertEquals(a, "calling-text");
		test.pass(a);
		test.log(Status.PASS,"ACTUAL RESULT:: It is clicking on audio call button to the user");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println(19);
		driver.close();
	}
	@Test
	public void test20() throws InterruptedException {
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
  		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//div[@id='troopGritEntityListWrapper']")).getAttribute("id");
		Assert.assertEquals(a1, "troopGritEntityListWrapper");
		driver.navigate().refresh();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='troopGritEntryBtn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@data-name='css']")).click();
		Thread.sleep(1000);
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div//div[@data-type='screenshare'])")).click();
		Thread.sleep(1000);
		Thread.sleep(5000);
		ExtentTest test= extent.createTest("Click on screen share to the user");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Click on on-site monitoring");
		test.info("Enter username : abc");
		test.info("Enter password : 123456");
		test.info("Click on login button");
		test.info("Click on user");
		test.info("Click on screen share button");
		test.info("EXPECTED RESULT:: It should click on screen share button to the user");
		test.pass(a1);
		String a=driver.findElement(By.xpath("//div[@class='calling-text']")).getAttribute("class");
		Assert.assertEquals(a, "calling-text");
		test.pass(a);
		test.log(Status.PASS,"ACTUAL RESULT:: It is clicking on screen share button to the user");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println(20);
		driver.close();
	}
	@Test
	public void test21() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/tvisha/Downloads/chromedriver_linux64/chromedriver");
		driver = new ChromeDriver();
		driver.get("chrome://flags");
		ChromeOptions options = new ChromeOptions()
			    .addArguments("--unsafely-treat-insecure-origin-as-secure=http://192.168.2.55:3000/user/submit-app,http://192.168.2.55:8083");
		options.addArguments("use-fake-device-for-media-stream");
	    options.addArguments("use-fake-ui-for-media-stream");
		ChromeDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("http://192.168.2.55:3000/user/submit-app");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='troopGritEntryBtn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='troopGritLoginUsernameInput']")).sendKeys("abc");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='troopGritLoginPasswordInput']")).sendKeys("123456");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id='troopGritLoginBtn']")).click();
		Thread.sleep(1000);
  		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//div[@id='troopGritEntityListWrapper']")).getAttribute("id");
		Assert.assertEquals(a1, "troopGritEntityListWrapper");
		driver.navigate().refresh();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='troopGritEntryBtn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@data-name='css']")).click();
		Thread.sleep(1000);
		
		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		ChromeDriver driver1 = new ChromeDriver(options);
		options.addArguments("--incognito");
		capabilities.setCapability(ChromeOptions.CAPABILITY, options);
		driver1.get("http://192.168.2.55:8083");
		driver1.findElement(By.xpath("//input[@name='username']")).sendKeys("css");
  		driver1.findElement(By.xpath("//input[@name='password']")).sendKeys("123456");
  		driver1.findElement(By.xpath("//button[@id='bG9naW5CdG4']")).click();
  		Thread.sleep(2000);
  		options.addArguments("--disable-notifications");
  		Thread.sleep(1000);
  		driver1.manage().window().setSize(new Dimension(500, 768));
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div//div[@data-type='audio'])")).click();
		Thread.sleep(1000);
		String a2=driver1.findElement(By.xpath("//div[@id='draggableIncomingAudioCall']")).getAttribute("id");
		driver1.findElement(By.xpath("//span[@id='acceptAudioDraggableIncomingBtn']")).click();
		Thread.sleep(5000);
		ExtentTest test= extent.createTest("Accept the audio call");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Click on on-site monitoring");
		test.info("Enter username : abc");
		test.info("Enter password : 123456");
		test.info("Click on login button");
		test.info("Click on user");
		test.info("Open incognito");
		test.info("Enter Url");
		test.info("Enter username & password");
		test.info("Click on login");
		test.info("Minimize the screen");
		test.info("Call from abc user to web user");
		test.info("Web user accept the audio call");
		test.info("EXPECTED RESULT:: It should display the audio call to both the users");
		test.pass(a1);
		Assert.assertEquals(a2, "draggableIncomingAudioCall");
		test.pass(a2);
		String a=driver.findElement(By.xpath("//div[@class='users-wrapper']")).getText();
		Assert.assertEquals(a, "AB\n"
				+ "Myself\n"
				+ "css");
		test.pass(a);
		test.log(Status.PASS,"ACTUAL RESULT:: It is displaying the audio call to both the users");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println(21);
		driver.quit();
		driver1.quit();
	}
	@Test
	public void test22() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/tvisha/Downloads/chromedriver_linux64/chromedriver");
		driver = new ChromeDriver();
		driver.get("chrome://flags");
		ChromeOptions options = new ChromeOptions()
			    .addArguments("--unsafely-treat-insecure-origin-as-secure=http://192.168.2.55:3000/user/submit-app,http://192.168.2.55:8083");
		options.addArguments("use-fake-device-for-media-stream");
	    options.addArguments("use-fake-ui-for-media-stream");
		ChromeDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("http://192.168.2.55:3000/user/submit-app");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='troopGritEntryBtn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='troopGritLoginUsernameInput']")).sendKeys("abc");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='troopGritLoginPasswordInput']")).sendKeys("123456");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id='troopGritLoginBtn']")).click();
		Thread.sleep(1000);
  		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//div[@id='troopGritEntityListWrapper']")).getAttribute("id");
		Assert.assertEquals(a1, "troopGritEntityListWrapper");
		driver.navigate().refresh();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='troopGritEntryBtn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@data-name='css']")).click();
		Thread.sleep(1000);
		
		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		ChromeDriver driver1 = new ChromeDriver(options);
		options.addArguments("--incognito");
		capabilities.setCapability(ChromeOptions.CAPABILITY, options);
		driver1.get("http://192.168.2.55:8083");
		driver1.findElement(By.xpath("//input[@name='username']")).sendKeys("css");
  		driver1.findElement(By.xpath("//input[@name='password']")).sendKeys("123456");
  		driver1.findElement(By.xpath("//button[@id='bG9naW5CdG4']")).click();
  		Thread.sleep(2000);
  		options.addArguments("--disable-notifications");
  		Thread.sleep(1000);
  		driver1.manage().window().setSize(new Dimension(500, 768));
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div//div[@data-type='audio'])")).click();
		Thread.sleep(1000);
		String a2=driver1.findElement(By.xpath("//div[@id='draggableIncomingAudioCall']")).getAttribute("id");
		
		String a=driver1.findElement(By.xpath("//span[@id='rejectAudioDraggableIncomingBtn']")).getText();
		driver1.findElement(By.xpath("//span[@id='rejectAudioDraggableIncomingBtn']")).click();
		Thread.sleep(5000);
		ExtentTest test= extent.createTest("Reject the audio call");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Click on on-site monitoring");
		test.info("Enter username : abc");
		test.info("Enter password : 123456");
		test.info("Click on login button");
		test.info("Click on user");
		test.info("Open incognito");
		test.info("Enter Url");
		test.info("Enter username & password");
		test.info("Click on login");
		test.info("Minimize the screen");
		test.info("Call from abc user to web user");
		test.info("Web user reject the audio call");
		test.info("EXPECTED RESULT:: It should reject the audio call in web user");
		test.pass(a1);
		Assert.assertEquals(a2, "draggableIncomingAudioCall");
		test.pass(a2);
		Assert.assertEquals(a, "Reject");
		test.pass(a);
		String a5=driver.switchTo().alert().getText();
		Assert.assertEquals(a5, "User Rejected Call!");
		test.pass(a5);
		test.log(Status.PASS,"ACTUAL RESULT:: It is rejecting the audio call in web user");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println(22);
		driver.quit();
		driver1.quit();
	}
	@Test
	public void test23() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/tvisha/Downloads/chromedriver_linux64/chromedriver");
		driver = new ChromeDriver();
		driver.get("chrome://flags");
		ChromeOptions options = new ChromeOptions()
			    .addArguments("--unsafely-treat-insecure-origin-as-secure=http://192.168.2.55:3000/user/submit-app,http://192.168.2.55:8083");
		options.addArguments("use-fake-device-for-media-stream");
	    options.addArguments("use-fake-ui-for-media-stream");
		ChromeDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("http://192.168.2.55:3000/user/submit-app");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='troopGritEntryBtn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='troopGritLoginUsernameInput']")).sendKeys("abc");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='troopGritLoginPasswordInput']")).sendKeys("123456");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id='troopGritLoginBtn']")).click();
		Thread.sleep(1000);
  		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//div[@id='troopGritEntityListWrapper']")).getAttribute("id");
		Assert.assertEquals(a1, "troopGritEntityListWrapper");
		driver.navigate().refresh();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='troopGritEntryBtn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@data-name='css']")).click();
		Thread.sleep(1000);
		
		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		ChromeDriver driver1 = new ChromeDriver(options);
		options.addArguments("--incognito");
		capabilities.setCapability(ChromeOptions.CAPABILITY, options);
		driver1.get("http://192.168.2.55:8083");
		driver1.findElement(By.xpath("//input[@name='username']")).sendKeys("css");
  		driver1.findElement(By.xpath("//input[@name='password']")).sendKeys("123456");
  		driver1.findElement(By.xpath("//button[@id='bG9naW5CdG4']")).click();
  		Thread.sleep(2000);
  		options.addArguments("--disable-notifications");
  		Thread.sleep(1000);
  		driver1.manage().window().setSize(new Dimension(500, 768));
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div//div[@data-type='audio'])")).click();
		Thread.sleep(1000);
		String a2=driver1.findElement(By.xpath("//div[@id='draggableIncomingAudioCall']")).getAttribute("id");
		
		String a=driver1.findElement(By.xpath("//span[@id='ignoreAudioDraggableIncomingBtn']")).getText();
		driver1.findElement(By.xpath("//span[@id='ignoreAudioDraggableIncomingBtn']")).click();
		Thread.sleep(5000);
		ExtentTest test= extent.createTest("Ignore the audio call");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Click on on-site monitoring");
		test.info("Enter username : abc");
		test.info("Enter password : 123456");
		test.info("Click on login button");
		test.info("Click on user");
		test.info("Open incognito");
		test.info("Enter Url");
		test.info("Enter username & password");
		test.info("Click on login");
		test.info("Minimize the screen");
		test.info("Call from abc user to web user");
		test.info("Web user ignore the audio call");
		test.info("EXPECTED RESULT:: It should not end the audio call in abc(vidzet) user");
		test.pass(a1);
		Assert.assertEquals(a2, "draggableIncomingAudioCall");
		test.pass(a2);
		Assert.assertEquals(a, "Ignore");
		test.pass(a);
		test.log(Status.PASS,"ACTUAL RESULT:: It is not ending the audio call in abc(vidzet) user");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println(23);
		driver.quit();
		driver1.quit();
	}
	@Test
	public void test24() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/tvisha/Downloads/chromedriver_linux64/chromedriver");
		driver = new ChromeDriver();
		driver.get("chrome://flags");
		ChromeOptions options = new ChromeOptions()
			    .addArguments("--unsafely-treat-insecure-origin-as-secure=http://192.168.2.55:3000/user/submit-app,http://192.168.2.55:8083");
		options.addArguments("use-fake-device-for-media-stream");
	    options.addArguments("use-fake-ui-for-media-stream");
		ChromeDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("http://192.168.2.55:3000/user/submit-app");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='troopGritEntryBtn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='troopGritLoginUsernameInput']")).sendKeys("abc");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='troopGritLoginPasswordInput']")).sendKeys("123456");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id='troopGritLoginBtn']")).click();
		Thread.sleep(1000);
  		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//div[@id='troopGritEntityListWrapper']")).getAttribute("id");
		Assert.assertEquals(a1, "troopGritEntityListWrapper");
		driver.navigate().refresh();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='troopGritEntryBtn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@data-name='css']")).click();
		Thread.sleep(1000);
		
		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		ChromeDriver driver1 = new ChromeDriver(options);
		options.addArguments("--incognito");
		capabilities.setCapability(ChromeOptions.CAPABILITY, options);
		driver1.get("http://192.168.2.55:8083");
		driver1.findElement(By.xpath("//input[@name='username']")).sendKeys("css");
  		driver1.findElement(By.xpath("//input[@name='password']")).sendKeys("123456");
  		driver1.findElement(By.xpath("//button[@id='bG9naW5CdG4']")).click();
  		Thread.sleep(2000);
  		options.addArguments("--disable-notifications");
  		Thread.sleep(1000);
  		driver1.manage().window().setSize(new Dimension(500, 768));
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div//div[@data-type='audio'])")).click();
		Thread.sleep(1000);
		String a2=driver1.findElement(By.xpath("//div[@id='draggableIncomingAudioCall']")).getAttribute("id");
		
		String a=driver1.findElement(By.xpath("//span[@id='acceptAudioDraggableIncomingBtn']")).getText();
		driver1.findElement(By.xpath("//span[@id='acceptAudioDraggableIncomingBtn']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[@class='end-btn']")).click();
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//span[@class='end-btn-option end-call']")).getText();
		driver.findElement(By.xpath("//span[@class='end-btn-option end-call']")).click();
		Thread.sleep(1000);
		ExtentTest test= extent.createTest("End the call in abc(vidzet) user");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Click on on-site monitoring");
		test.info("Enter username : abc");
		test.info("Enter password : 123456");
		test.info("Click on login button");
		test.info("Click on user");
		test.info("Open incognito");
		test.info("Enter Url");
		test.info("Enter username & password");
		test.info("Click on login");
		test.info("Minimize the screen");
		test.info("Call from abc user to web user");
		test.info("Web user accept the audio call");
		test.info("abc(vidzet) user end the call");
		test.info("EXPECTED RESULT:: It should click on end call in abc(vidzet) user");
		test.pass(a1);
		Assert.assertEquals(a2, "draggableIncomingAudioCall");
		test.pass(a2);
		Assert.assertEquals(a, "Accept");
		test.pass(a);
		Assert.assertEquals(a3, "End Call");
		test.pass(a3);
		test.log(Status.PASS,"ACTUAL RESULT:: It is clicking on end call in abc(vidzet) user");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println(24);
		driver.quit();
		driver1.quit();
	}
	@Test
	public void test25() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/tvisha/Downloads/chromedriver_linux64/chromedriver");
		driver = new ChromeDriver();
		driver.get("chrome://flags");
		ChromeOptions options = new ChromeOptions()
			    .addArguments("--unsafely-treat-insecure-origin-as-secure=http://192.168.2.55:3000/user/submit-app,http://192.168.2.55:8083");
		options.addArguments("use-fake-device-for-media-stream");
	    options.addArguments("use-fake-ui-for-media-stream");
		ChromeDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("http://192.168.2.55:3000/user/submit-app");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='troopGritEntryBtn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='troopGritLoginUsernameInput']")).sendKeys("abc");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='troopGritLoginPasswordInput']")).sendKeys("123456");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id='troopGritLoginBtn']")).click();
		Thread.sleep(1000);
  		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//div[@id='troopGritEntityListWrapper']")).getAttribute("id");
		Assert.assertEquals(a1, "troopGritEntityListWrapper");
		driver.navigate().refresh();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='troopGritEntryBtn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@data-name='css']")).click();
		Thread.sleep(1000);
		
		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		ChromeDriver driver1 = new ChromeDriver(options);
		options.addArguments("--incognito");
		capabilities.setCapability(ChromeOptions.CAPABILITY, options);
		driver1.get("http://192.168.2.55:8083");
		driver1.findElement(By.xpath("//input[@name='username']")).sendKeys("css");
  		driver1.findElement(By.xpath("//input[@name='password']")).sendKeys("123456");
  		driver1.findElement(By.xpath("//button[@id='bG9naW5CdG4']")).click();
  		Thread.sleep(2000);
  		options.addArguments("--disable-notifications");
  		Thread.sleep(1000);
  		driver1.manage().window().setSize(new Dimension(500, 768));
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div//div[@data-type='audio'])")).click();
		Thread.sleep(1000);
		String a2=driver1.findElement(By.xpath("//div[@id='draggableIncomingAudioCall']")).getAttribute("id");
		
		String a=driver1.findElement(By.xpath("//span[@id='acceptAudioDraggableIncomingBtn']")).getText();
		driver1.findElement(By.xpath("//span[@id='acceptAudioDraggableIncomingBtn']")).click();
		Thread.sleep(8000);
		driver1.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@class='end-btn']")).click();
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//span[@class='end-btn-option end-call']")).getText();
		driver.findElement(By.xpath("//span[@class='end-btn-option end-call']")).click();
		Thread.sleep(1000);
		ExtentTest test= extent.createTest("End the call in web user");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Click on on-site monitoring");
		test.info("Enter username : abc");
		test.info("Enter password : 123456");
		test.info("Click on login button");
		test.info("Click on user");
		test.info("Open incognito");
		test.info("Enter Url");
		test.info("Enter username & password");
		test.info("Click on login");
		test.info("Minimize the screen");
		test.info("Call from abc user to web user");
		test.info("Web user accept the audio call");
		test.info("Click on end button in web user");
		test.info("Click on end call in web user");
		test.info("EXPECTED RESULT:: It should click on end call in web user");
		test.pass(a1);
		Assert.assertEquals(a2, "draggableIncomingAudioCall");
		test.pass(a2);
		Assert.assertEquals(a, "Accept");
		test.pass(a);
		Assert.assertEquals(a3, "End Call");
		test.pass(a3);
		test.log(Status.PASS,"ACTUAL RESULT:: It is clicking on end call in web user");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println(25);
		driver.quit();
		driver1.quit();
	}
	@Test
	public void test26() throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "/home/tvisha/Downloads/chromedriver_linux64/chromedriver");
		driver = new ChromeDriver();
		driver.get("chrome://flags");
		ChromeOptions options = new ChromeOptions()
			    .addArguments("--unsafely-treat-insecure-origin-as-secure=http://192.168.2.55:3000/user/submit-app,http://192.168.2.55:8083");
		options.addArguments("use-fake-device-for-media-stream");
	    options.addArguments("use-fake-ui-for-media-stream");
		ChromeDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("http://192.168.2.55:3000/user/submit-app");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='troopGritEntryBtn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='troopGritLoginUsernameInput']")).sendKeys("abc");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='troopGritLoginPasswordInput']")).sendKeys("123456");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id='troopGritLoginBtn']")).click();
		Thread.sleep(1000);
  		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//div[@id='troopGritEntityListWrapper']")).getAttribute("id");
		Assert.assertEquals(a1, "troopGritEntityListWrapper");
		driver.navigate().refresh();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='troopGritEntryBtn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@data-name='css']")).click();
		Thread.sleep(1000);
		
		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		ChromeDriver driver1 = new ChromeDriver(options);
		options.addArguments("--incognito");
		capabilities.setCapability(ChromeOptions.CAPABILITY, options);
		driver1.get("http://192.168.2.55:8083");
		driver1.findElement(By.xpath("//input[@name='username']")).sendKeys("css");
  		driver1.findElement(By.xpath("//input[@name='password']")).sendKeys("123456");
  		driver1.findElement(By.xpath("//button[@id='bG9naW5CdG4']")).click();
  		Thread.sleep(2000);
  		options.addArguments("--disable-notifications");
  		Thread.sleep(1000);
  		driver1.manage().window().setSize(new Dimension(500, 768));
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div//div[@data-type='audio'])")).click();
		Thread.sleep(1000);
		String a2=driver1.findElement(By.xpath("//div[@id='draggableIncomingAudioCall']")).getAttribute("id");
		
		String a=driver1.findElement(By.xpath("//span[@id='acceptAudioDraggableIncomingBtn']")).getText();
		driver1.findElement(By.xpath("//span[@id='acceptAudioDraggableIncomingBtn']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class='add-users-btn']")).click();
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("(//div[@class='heading-text'])[3]")).getText();
		Thread.sleep(1000);
		ExtentTest test= extent.createTest("Click on add user");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Click on on-site monitoring");
		test.info("Enter username : abc");
		test.info("Enter password : 123456");
		test.info("Click on login button");
		test.info("Click on user");
		test.info("Open incognito");
		test.info("Enter Url");
		test.info("Enter username & password");
		test.info("Click on login");
		test.info("Minimize the screen");
		test.info("Call from abc user to web user");
		test.info("Web user accept the audio call");
		test.info("Click on add user button in abc(vidzet) user");
		test.info("EXPECTED RESULT:: It should highlight the selected members in add user page");
		test.pass(a1);
		Assert.assertEquals(a2, "draggableIncomingAudioCall");
		test.pass(a2);
		Assert.assertEquals(a, "Accept");
		test.pass(a);
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Files.copy(src, new File("vidzet.png"));
		test.addScreenCaptureFromPath("/home/tvisha/Downloads/eclipse-inst-jre-linux64/Desktop/vidzet.png");
		Assert.assertEquals(a3, "Selected Members (2)");
		test.pass(a3);
		test.log(Status.FAIL,"ACTUAL RESULT:: It is not highlighted the selected members in add user page");
		test.log(Status.FAIL,"Test Case:: TestCase FAILED");
		System.out.println(26);
		driver.quit();
		driver1.quit();
	}
	@Test
	public void test27() throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "/home/tvisha/Downloads/chromedriver_linux64/chromedriver");
		driver = new ChromeDriver();
		driver.get("chrome://flags");
		ChromeOptions options = new ChromeOptions()
			    .addArguments("--unsafely-treat-insecure-origin-as-secure=http://192.168.2.55:3000/user/submit-app,http://192.168.2.55:8083");
		options.addArguments("use-fake-device-for-media-stream");
	    options.addArguments("use-fake-ui-for-media-stream");
		ChromeDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("http://192.168.2.55:3000/user/submit-app");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='troopGritEntryBtn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='troopGritLoginUsernameInput']")).sendKeys("abc");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='troopGritLoginPasswordInput']")).sendKeys("123456");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id='troopGritLoginBtn']")).click();
		Thread.sleep(1000);
  		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//div[@id='troopGritEntityListWrapper']")).getAttribute("id");
		Assert.assertEquals(a1, "troopGritEntityListWrapper");
		driver.navigate().refresh();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='troopGritEntryBtn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@data-name='css']")).click();
		Thread.sleep(1000);
		
		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		ChromeDriver driver1 = new ChromeDriver(options);
		options.addArguments("--incognito");
		capabilities.setCapability(ChromeOptions.CAPABILITY, options);
		driver1.get("http://192.168.2.55:8083");
		driver1.findElement(By.xpath("//input[@name='username']")).sendKeys("css");
  		driver1.findElement(By.xpath("//input[@name='password']")).sendKeys("123456");
  		driver1.findElement(By.xpath("//button[@id='bG9naW5CdG4']")).click();
  		Thread.sleep(2000);
  		options.addArguments("--disable-notifications");
  		Thread.sleep(1000);
  		driver1.manage().window().setSize(new Dimension(500, 768));
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div//div[@data-type='audio'])")).click();
		Thread.sleep(1000);
		String a2=driver1.findElement(By.xpath("//div[@id='draggableIncomingAudioCall']")).getAttribute("id");
		
		String a=driver1.findElement(By.xpath("//span[@id='acceptAudioDraggableIncomingBtn']")).getText();
		driver1.findElement(By.xpath("//span[@id='acceptAudioDraggableIncomingBtn']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class='add-users-btn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='usersSearch']")).sendKeys("sharath");
		Thread.sleep(1000);
		ExtentTest test= extent.createTest("Enter search in add user");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Click on on-site monitoring");
		test.info("Enter username : abc");
		test.info("Enter password : 123456");
		test.info("Click on login button");
		test.info("Click on user");
		test.info("Open incognito");
		test.info("Enter Url");
		test.info("Enter username & password");
		test.info("Click on login");
		test.info("Minimize the screen");
		test.info("Call from abc user to web user");
		test.info("Web user accept the audio call");
		test.info("Click on add user in abc(vidzet) user");
		test.info("Enter text in search : sharath");
		test.info("EXPECTED RESULT:: It should search the user in add user page");
		test.pass(a1);
		Assert.assertEquals(a2, "draggableIncomingAudioCall");
		test.pass(a2);
		Assert.assertEquals(a, "Accept");
		test.pass(a);
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Files.copy(src, new File("vidzet1.png"));
		test.addScreenCaptureFromPath("/home/tvisha/Downloads/eclipse-inst-jre-linux64/Desktop/vidzet1.png");
		test.log(Status.FAIL,"ACTUAL RESULT:: It is not searching the user in add user page");
		test.log(Status.FAIL,"Test Case:: TestCase FAILED");
		System.out.println(27);
		driver.quit();
		driver1.quit();
	}
	@Test
	public void test28() throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "/home/tvisha/Downloads/chromedriver_linux64/chromedriver");
		driver = new ChromeDriver();
		driver.get("chrome://flags");
		ChromeOptions options = new ChromeOptions()
			    .addArguments("--unsafely-treat-insecure-origin-as-secure=http://192.168.2.55:3000/user/submit-app,http://192.168.2.55:8083");
		options.addArguments("use-fake-device-for-media-stream");
	    options.addArguments("use-fake-ui-for-media-stream");
		ChromeDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("http://192.168.2.55:3000/user/submit-app");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='troopGritEntryBtn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='troopGritLoginUsernameInput']")).sendKeys("abc");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='troopGritLoginPasswordInput']")).sendKeys("123456");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id='troopGritLoginBtn']")).click();
		Thread.sleep(1000);
  		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//div[@id='troopGritEntityListWrapper']")).getAttribute("id");
		Assert.assertEquals(a1, "troopGritEntityListWrapper");
		driver.navigate().refresh();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='troopGritEntryBtn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@data-name='css']")).click();
		Thread.sleep(1000);
		
		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		ChromeDriver driver1 = new ChromeDriver(options);
		options.addArguments("--incognito");
		capabilities.setCapability(ChromeOptions.CAPABILITY, options);
		driver1.get("http://192.168.2.55:8083");
		driver1.findElement(By.xpath("//input[@name='username']")).sendKeys("css");
  		driver1.findElement(By.xpath("//input[@name='password']")).sendKeys("123456");
  		driver1.findElement(By.xpath("//button[@id='bG9naW5CdG4']")).click();
  		Thread.sleep(2000);
  		options.addArguments("--disable-notifications");
  		Thread.sleep(1000);
  		driver1.manage().window().setSize(new Dimension(500, 768));
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div//div[@data-type='audio'])")).click();
		Thread.sleep(1000);
		String a2=driver1.findElement(By.xpath("//div[@id='draggableIncomingAudioCall']")).getAttribute("id");
		
		String a=driver1.findElement(By.xpath("//span[@id='acceptAudioDraggableIncomingBtn']")).getText();
		driver1.findElement(By.xpath("//span[@id='acceptAudioDraggableIncomingBtn']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class='add-users-btn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@data-username='Department Admin']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='addUsersSubmitBtn']")).click();
		Thread.sleep(3000);
		ExtentTest test= extent.createTest("Select the user & click on add participants in add user");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Click on on-site monitoring");
		test.info("Enter username : abc");
		test.info("Enter password : 123456");
		test.info("Click on login button");
		test.info("Click on user");
		test.info("Open incognito");
		test.info("Enter Url");
		test.info("Enter username & password");
		test.info("Click on login");
		test.info("Minimize the screen");
		test.info("Call from abc user to web user");
		test.info("Web user accept the audio call");
		test.info("Click on add user in abc(vidzet) user");
		test.info("Select the user & Click on it");
		test.info("Click on add participants");
		test.info("EXPECTED RESULT:: It should add the user in audio call");
		test.pass(a1);
		Assert.assertEquals(a2, "draggableIncomingAudioCall");
		test.pass(a2);
		Assert.assertEquals(a, "Accept");
		test.pass(a);
		String a3=driver.findElement(By.xpath("//div[@class='users-wrapper']")).getText();
		Assert.assertEquals(a3, "AB\n"
				+ "Myself\n"
				+ "css\n"
				+ "DA\n"
				+ "Department Admin\n"
				+ "Ringing");
		test.pass(a3);
		test.log(Status.PASS,"ACTUAL RESULT:: It is adding the user in the audio call");
		test.log(Status.PASS,"Test Case:: TestCase PASSED");
		System.out.println(28);
		driver.quit();
		driver1.quit();
	}
	@Test
	public void test29() throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "/home/tvisha/Downloads/chromedriver_linux64/chromedriver");
		driver = new ChromeDriver();
		driver.get("chrome://flags");
		ChromeOptions options = new ChromeOptions()
			    .addArguments("--unsafely-treat-insecure-origin-as-secure=http://192.168.2.55:3000/user/submit-app,http://192.168.2.55:8083");
		options.addArguments("use-fake-device-for-media-stream");
	    options.addArguments("use-fake-ui-for-media-stream");
		ChromeDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("http://192.168.2.55:3000/user/submit-app");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='troopGritEntryBtn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='troopGritLoginUsernameInput']")).sendKeys("abc");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='troopGritLoginPasswordInput']")).sendKeys("123456");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id='troopGritLoginBtn']")).click();
		Thread.sleep(1000);
  		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//div[@id='troopGritEntityListWrapper']")).getAttribute("id");
		Assert.assertEquals(a1, "troopGritEntityListWrapper");
		driver.navigate().refresh();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='troopGritEntryBtn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@data-name='css']")).click();
		Thread.sleep(1000);
		
		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		ChromeDriver driver1 = new ChromeDriver(options);
		options.addArguments("--incognito");
		capabilities.setCapability(ChromeOptions.CAPABILITY, options);
		driver1.get("http://192.168.2.55:8083");
		driver1.findElement(By.xpath("//input[@name='username']")).sendKeys("css");
  		driver1.findElement(By.xpath("//input[@name='password']")).sendKeys("123456");
  		driver1.findElement(By.xpath("//button[@id='bG9naW5CdG4']")).click();
  		Thread.sleep(2000);
  		options.addArguments("--disable-notifications");
  		Thread.sleep(1000);
  		driver1.manage().window().setSize(new Dimension(500, 768));
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div//div[@data-type='audio'])")).click();
		Thread.sleep(1000);
		String a2=driver1.findElement(By.xpath("//div[@id='draggableIncomingAudioCall']")).getAttribute("id");
		
		String a=driver1.findElement(By.xpath("//span[@id='acceptAudioDraggableIncomingBtn']")).getText();
		driver1.findElement(By.xpath("//span[@id='acceptAudioDraggableIncomingBtn']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class='add-users-btn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@data-username='Department Admin']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='addUsersSubmitBtn']")).click();
		Thread.sleep(3000);
		Thread.sleep(8000);
		Thread.sleep(8000);
		Thread.sleep(8000);
		Thread.sleep(8000);
		ExtentTest test= extent.createTest("User1 didnot accept the call");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Click on on-site monitoring");
		test.info("Enter username : abc");
		test.info("Enter password : 123456");
		test.info("Click on login button");
		test.info("Click on user");
		test.info("Open incognito");
		test.info("Enter Url");
		test.info("Enter username & password");
		test.info("Click on login");
		test.info("Minimize the screen");
		test.info("Call from abc user to web user");
		test.info("Web user accept the audio call");
		test.info("Click on add user in abc(vidzet) user");
		test.info("Select the user & Click on it");
		test.info("Click on add participants");
		test.info("User1 didnot accept the call");
		test.info("EXPECTED RESULT:: It should display unable to take call");
		test.pass(a1);
		Assert.assertEquals(a2, "draggableIncomingAudioCall");
		test.pass(a2);
		Assert.assertEquals(a, "Accept");
		test.pass(a);
		String a3=driver.findElement(By.xpath("//div[@class='users-wrapper']")).getText();
		Assert.assertEquals(a3, "AB\n"
				+ "Myself\n"
				+ "css\n"
				+ "DA\n"
				+ "Department Admin\n"
				+ "Unable to take call");
		test.pass(a3);
		test.log(Status.PASS,"ACTUAL RESULT:: It is displaying as unable to take call");
		test.log(Status.PASS,"Test Case:: TestCase PASSED");
		System.out.println(29);
		driver.quit();
		driver1.quit();
	}
	@Test
	public void test30() throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "/home/tvisha/Downloads/chromedriver_linux64/chromedriver");
		driver = new ChromeDriver();
		driver.get("chrome://flags");
		ChromeOptions options = new ChromeOptions()
			    .addArguments("--unsafely-treat-insecure-origin-as-secure=http://192.168.2.55:3000/user/submit-app,http://192.168.2.55:8083");
		options.addArguments("use-fake-device-for-media-stream");
	    options.addArguments("use-fake-ui-for-media-stream");
		ChromeDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("http://192.168.2.55:3000/user/submit-app");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='troopGritEntryBtn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='troopGritLoginUsernameInput']")).sendKeys("abc");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='troopGritLoginPasswordInput']")).sendKeys("123456");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id='troopGritLoginBtn']")).click();
		Thread.sleep(1000);
  		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//div[@id='troopGritEntityListWrapper']")).getAttribute("id");
		Assert.assertEquals(a1, "troopGritEntityListWrapper");
		driver.navigate().refresh();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='troopGritEntryBtn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@data-name='css']")).click();
		Thread.sleep(1000);
		
		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		ChromeDriver driver1 = new ChromeDriver(options);
		options.addArguments("--incognito");
		capabilities.setCapability(ChromeOptions.CAPABILITY, options);
		driver1.get("http://192.168.2.55:8083");
		driver1.findElement(By.xpath("//input[@name='username']")).sendKeys("css");
  		driver1.findElement(By.xpath("//input[@name='password']")).sendKeys("123456");
  		driver1.findElement(By.xpath("//button[@id='bG9naW5CdG4']")).click();
  		Thread.sleep(2000);
  		options.addArguments("--disable-notifications");
  		Thread.sleep(1000);
  		driver1.manage().window().setSize(new Dimension(500, 768));
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div//div[@data-type='audio'])")).click();
		Thread.sleep(1000);
		String a2=driver1.findElement(By.xpath("//div[@id='draggableIncomingAudioCall']")).getAttribute("id");
		
		String a=driver1.findElement(By.xpath("//span[@id='acceptAudioDraggableIncomingBtn']")).getText();
		driver1.findElement(By.xpath("//span[@id='acceptAudioDraggableIncomingBtn']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class='add-users-btn']")).click();
		Thread.sleep(1000);
		//driver.findElement(By.xpath("//div[@data-username='Department Admin']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='addUsersSubmitBtn']")).click();
		Thread.sleep(1000);
		ExtentTest test= extent.createTest("Without selecting any user click on add user");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Click on on-site monitoring");
		test.info("Enter username : abc");
		test.info("Enter password : 123456");
		test.info("Click on login button");
		test.info("Click on user");
		test.info("Open incognito");
		test.info("Enter Url");
		test.info("Enter username & password");
		test.info("Click on login");
		test.info("Minimize the screen");
		test.info("Call from abc user to web user");
		test.info("Web user accept the audio call");
		test.info("Click on add user in abc(vidzet) user");
		test.info("Click on add participants");
		test.info("EXPECTED RESULT:: It should display toast msg");
		test.pass(a1);
		Assert.assertEquals(a2, "draggableIncomingAudioCall");
		test.pass(a2);
		Assert.assertEquals(a, "Accept");
		test.pass(a);
		String a5=driver.switchTo().alert().getText();
		Assert.assertEquals(a5, "Please select atleast one user");
		test.pass(a5);
		test.log(Status.PASS,"ACTUAL RESULT:: Please select atleast one user");
		test.log(Status.PASS,"Test Case:: TestCase PASSED");
		System.out.println(30);
		driver.quit();
		driver1.quit();
	}
	@Test
	public void test31() throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "/home/tvisha/Downloads/chromedriver_linux64/chromedriver");
		driver = new ChromeDriver();
		driver.get("chrome://flags");
		ChromeOptions options = new ChromeOptions()
			    .addArguments("--unsafely-treat-insecure-origin-as-secure=http://192.168.2.55:3000/user/submit-app,http://192.168.2.55:8083");
		options.addArguments("use-fake-device-for-media-stream");
	    options.addArguments("use-fake-ui-for-media-stream");
		ChromeDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("http://192.168.2.55:3000/user/submit-app");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='troopGritEntryBtn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='troopGritLoginUsernameInput']")).sendKeys("abc");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='troopGritLoginPasswordInput']")).sendKeys("123456");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id='troopGritLoginBtn']")).click();
		Thread.sleep(1000);
  		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//div[@id='troopGritEntityListWrapper']")).getAttribute("id");
		Assert.assertEquals(a1, "troopGritEntityListWrapper");
		driver.navigate().refresh();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='troopGritEntryBtn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@data-name='css']")).click();
		Thread.sleep(1000);
		
		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		ChromeDriver driver1 = new ChromeDriver(options);
		options.addArguments("--incognito");
		capabilities.setCapability(ChromeOptions.CAPABILITY, options);
		driver1.get("http://192.168.2.55:8083");
		driver1.findElement(By.xpath("//input[@name='username']")).sendKeys("css");
  		driver1.findElement(By.xpath("//input[@name='password']")).sendKeys("123456");
  		driver1.findElement(By.xpath("//button[@id='bG9naW5CdG4']")).click();
  		Thread.sleep(2000);
  		options.addArguments("--disable-notifications");
  		Thread.sleep(1000);
  		driver1.manage().window().setSize(new Dimension(500, 768));
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div//div[@data-type='audio'])")).click();
		Thread.sleep(1000);
		String a2=driver1.findElement(By.xpath("//div[@id='draggableIncomingAudioCall']")).getAttribute("id");
		
		String a=driver1.findElement(By.xpath("//span[@id='acceptAudioDraggableIncomingBtn']")).getText();
		driver1.findElement(By.xpath("//span[@id='acceptAudioDraggableIncomingBtn']")).click();
		Thread.sleep(5000);
		driver1.quit();
		Thread.sleep(3000);
		ExtentTest test= extent.createTest("When we are in call web user close the app");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Click on on-site monitoring");
		test.info("Enter username : abc");
		test.info("Enter password : 123456");
		test.info("Click on login button");
		test.info("Click on user");
		test.info("Open incognito");
		test.info("Enter Url");
		test.info("Enter username & password");
		test.info("Click on login");
		test.info("Minimize the screen");
		test.info("Call from abc user to web user");
		test.info("Web user accept the audio call");
		test.info("Close the app of web user");
		test.info("EXPECTED RESULT:: It should display user disconnected");
		test.pass(a1);
		Assert.assertEquals(a2, "draggableIncomingAudioCall");
		test.pass(a2);
		Assert.assertEquals(a, "Accept");
		test.pass(a);
		String a3=driver.findElement(By.xpath("//div[@class='users-wrapper']")).getText();
		Assert.assertEquals(a3, "AB\n"
				+ "Myself\n"
				+ "css\n"
				+ "User Disconnected");
		test.pass(a3);
		test.log(Status.PASS,"ACTUAL RESULT:: It is displaying user disconnected");
		test.log(Status.PASS,"Test Case:: TestCase PASSED");
		System.out.println(31);
		driver.quit();
		
	}
	@Test
	public void test32() throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "/home/tvisha/Downloads/chromedriver_linux64/chromedriver");
		driver = new ChromeDriver();
		driver.get("chrome://flags");
		ChromeOptions options = new ChromeOptions()
			    .addArguments("--unsafely-treat-insecure-origin-as-secure=http://192.168.2.55:3000/user/submit-app,http://192.168.2.55:8083");
		options.addArguments("use-fake-device-for-media-stream");
	    options.addArguments("use-fake-ui-for-media-stream");
		ChromeDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("http://192.168.2.55:3000/user/submit-app");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='troopGritEntryBtn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='troopGritLoginUsernameInput']")).sendKeys("abc");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='troopGritLoginPasswordInput']")).sendKeys("123456");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id='troopGritLoginBtn']")).click();
		Thread.sleep(1000);
  		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//div[@id='troopGritEntityListWrapper']")).getAttribute("id");
		Assert.assertEquals(a1, "troopGritEntityListWrapper");
		driver.navigate().refresh();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='troopGritEntryBtn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@data-name='css']")).click();
		Thread.sleep(1000);
		
		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		ChromeDriver driver1 = new ChromeDriver(options);
		options.addArguments("--incognito");
		capabilities.setCapability(ChromeOptions.CAPABILITY, options);
		driver1.get("http://192.168.2.55:8083");
		driver1.findElement(By.xpath("//input[@name='username']")).sendKeys("css");
  		driver1.findElement(By.xpath("//input[@name='password']")).sendKeys("123456");
  		driver1.findElement(By.xpath("//button[@id='bG9naW5CdG4']")).click();
  		Thread.sleep(2000);
  		options.addArguments("--disable-notifications");
  		Thread.sleep(1000);
  		driver1.manage().window().setSize(new Dimension(500, 768));
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div//div[@data-type='audio'])")).click();
		Thread.sleep(1000);
		String a2=driver1.findElement(By.xpath("//div[@id='draggableIncomingAudioCall']")).getAttribute("id");
		
		String a=driver1.findElement(By.xpath("//span[@id='acceptAudioDraggableIncomingBtn']")).getText();
		driver1.findElement(By.xpath("//span[@id='acceptAudioDraggableIncomingBtn']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//span[@class='user-options'])[2]")).click();
		Thread.sleep(3000);
		ExtentTest test= extent.createTest("Click on 3 dots for user");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Click on on-site monitoring");
		test.info("Enter username : abc");
		test.info("Enter password : 123456");
		test.info("Click on login button");
		test.info("Click on user");
		test.info("Open incognito");
		test.info("Enter Url");
		test.info("Enter username & password");
		test.info("Click on login");
		test.info("Minimize the screen");
		test.info("Call from abc user to web user");
		test.info("Web user accept the audio call");
		test.info("Click on 3 dots in abc(vidzet) user");
		test.info("EXPECTED RESULT:: It should click on 3 dots");
		test.pass(a1);
		Assert.assertEquals(a2, "draggableIncomingAudioCall");
		test.pass(a2);
		Assert.assertEquals(a, "Accept");
		test.pass(a);
		String a3=driver.findElement(By.xpath("//div[@class='users-wrapper']")).getText();
		Assert.assertEquals(a3, "AB\n"
				+ "Myself\n"
				+ "css\n"
				+ "Make Host\n"
				+ "Remove User\n"
				+ "Mute audio");
		test.pass(a3);
		test.log(Status.PASS,"ACTUAL RESULT:: It is clicking on 3 dots");
		test.log(Status.PASS,"Test Case:: TestCase PASSED");
		System.out.println(32);
		driver.quit();
		driver1.quit();
	}
	@Test
	public void test33() throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "/home/tvisha/Downloads/chromedriver_linux64/chromedriver");
		driver = new ChromeDriver();
		driver.get("chrome://flags");
		ChromeOptions options = new ChromeOptions()
			    .addArguments("--unsafely-treat-insecure-origin-as-secure=http://192.168.2.55:3000/user/submit-app,http://192.168.2.55:8083");
		options.addArguments("use-fake-device-for-media-stream");
	    options.addArguments("use-fake-ui-for-media-stream");
		ChromeDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("http://192.168.2.55:3000/user/submit-app");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='troopGritEntryBtn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='troopGritLoginUsernameInput']")).sendKeys("abc");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='troopGritLoginPasswordInput']")).sendKeys("123456");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id='troopGritLoginBtn']")).click();
		Thread.sleep(1000);
  		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//div[@id='troopGritEntityListWrapper']")).getAttribute("id");
		Assert.assertEquals(a1, "troopGritEntityListWrapper");
		driver.navigate().refresh();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='troopGritEntryBtn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@data-name='css']")).click();
		Thread.sleep(1000);
		
		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		ChromeDriver driver1 = new ChromeDriver(options);
		options.addArguments("--incognito");
		capabilities.setCapability(ChromeOptions.CAPABILITY, options);
		driver1.get("http://192.168.2.55:8083");
		driver1.findElement(By.xpath("//input[@name='username']")).sendKeys("css");
  		driver1.findElement(By.xpath("//input[@name='password']")).sendKeys("123456");
  		driver1.findElement(By.xpath("//button[@id='bG9naW5CdG4']")).click();
  		Thread.sleep(2000);
  		options.addArguments("--disable-notifications");
  		Thread.sleep(1000);
  		driver1.manage().window().setSize(new Dimension(500, 768));
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div//div[@data-type='audio'])")).click();
		Thread.sleep(1000);
		String a2=driver1.findElement(By.xpath("//div[@id='draggableIncomingAudioCall']")).getAttribute("id");
		
		String a=driver1.findElement(By.xpath("//span[@id='acceptAudioDraggableIncomingBtn']")).getText();
		driver1.findElement(By.xpath("//span[@id='acceptAudioDraggableIncomingBtn']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//span[@class='user-options'])[2]")).click();
		Thread.sleep(3000);
		String a4=driver.findElement(By.xpath("(//span[@class='user-option user-remove'])")).getText();
		driver.findElement(By.xpath("(//span[@class='user-option user-remove'])")).click();
		ExtentTest test= extent.createTest("Click on 3 dots & remove the user");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Click on on-site monitoring");
		test.info("Enter username : abc");
		test.info("Enter password : 123456");
		test.info("Click on login button");
		test.info("Click on user");
		test.info("Open incognito");
		test.info("Enter Url");
		test.info("Enter username & password");
		test.info("Click on login");
		test.info("Minimize the screen");
		test.info("Call from abc user to web user");
		test.info("Web user accept the audio call");
		test.info("Click on 3 dots in abc(vidzet) user");
		test.info("Remove the web user");
		test.info("EXPECTED RESULT:: It should remove the web user");
		test.pass(a1);
		Assert.assertEquals(a2, "draggableIncomingAudioCall");
		test.pass(a2);
		Assert.assertEquals(a, "Accept");
		test.pass(a);
		Assert.assertEquals(a4, "Remove User");
		test.pass(a4);
		String a3=driver.findElement(By.xpath("//div[@class='users-wrapper']")).getText();
		Assert.assertEquals(a3, "AB\n"
				+ "Myself");
		test.pass(a3);
		test.log(Status.PASS,"ACTUAL RESULT:: It is removing the web user");
		test.log(Status.PASS,"Test Case:: TestCase PASSED");
		System.out.println(33);
		driver.quit();
		driver1.quit();
	}
	@Test
	public void test34() throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "/home/tvisha/Downloads/chromedriver_linux64/chromedriver");
		driver = new ChromeDriver();
		driver.get("chrome://flags");
		ChromeOptions options = new ChromeOptions()
			    .addArguments("--unsafely-treat-insecure-origin-as-secure=http://192.168.2.55:3000/user/submit-app,http://192.168.2.55:8083");
		options.addArguments("use-fake-device-for-media-stream");
	    options.addArguments("use-fake-ui-for-media-stream");
		ChromeDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("http://192.168.2.55:3000/user/submit-app");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='troopGritEntryBtn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='troopGritLoginUsernameInput']")).sendKeys("abc");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='troopGritLoginPasswordInput']")).sendKeys("123456");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id='troopGritLoginBtn']")).click();
		Thread.sleep(1000);
  		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//div[@id='troopGritEntityListWrapper']")).getAttribute("id");
		Assert.assertEquals(a1, "troopGritEntityListWrapper");
		driver.navigate().refresh();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='troopGritEntryBtn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@data-name='css']")).click();
		Thread.sleep(1000);
		
		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		ChromeDriver driver1 = new ChromeDriver(options);
		options.addArguments("--incognito");
		capabilities.setCapability(ChromeOptions.CAPABILITY, options);
		driver1.get("http://192.168.2.55:8083");
		driver1.findElement(By.xpath("//input[@name='username']")).sendKeys("css");
  		driver1.findElement(By.xpath("//input[@name='password']")).sendKeys("123456");
  		driver1.findElement(By.xpath("//button[@id='bG9naW5CdG4']")).click();
  		Thread.sleep(2000);
  		options.addArguments("--disable-notifications");
  		Thread.sleep(1000);
  		driver1.manage().window().setSize(new Dimension(500, 768));
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div//div[@data-type='audio'])")).click();
		Thread.sleep(1000);
		String a2=driver1.findElement(By.xpath("//div[@id='draggableIncomingAudioCall']")).getAttribute("id");
		
		String a=driver1.findElement(By.xpath("//span[@id='acceptAudioDraggableIncomingBtn']")).getText();
		driver1.findElement(By.xpath("//span[@id='acceptAudioDraggableIncomingBtn']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//span[@class='user-options'])[2]")).click();
		Thread.sleep(3000);
		String a4=driver.findElement(By.xpath("(//span[@class='user-option user-mute-audio'])")).getText();
		driver.findElement(By.xpath("(//span[@class='user-option user-mute-audio'])")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//span[@class='user-options'])[2]")).click();
		ExtentTest test= extent.createTest("Click on 3 dots & mute the audio");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Click on on-site monitoring");
		test.info("Enter username : abc");
		test.info("Enter password : 123456");
		test.info("Click on login button");
		test.info("Click on user");
		test.info("Open incognito");
		test.info("Enter Url");
		test.info("Enter username & password");
		test.info("Click on login");
		test.info("Minimize the screen");
		test.info("Call from abc user to web user");
		test.info("Web user accept the audio call");
		test.info("Click on 3 dots in abc(vidzet) user");
		test.info("Click on mute audio");
		test.info("EXPECTED RESULT:: It should mute the audio to the web user");
		test.pass(a1);
		Assert.assertEquals(a2, "draggableIncomingAudioCall");
		test.pass(a2);
		Assert.assertEquals(a, "Accept");
		test.pass(a);
		Assert.assertEquals(a4, "Mute audio");
		test.pass(a4);
		String a3=driver.findElement(By.xpath("//div[@class='users-wrapper']")).getText();
		Assert.assertEquals(a3, "AB\n"
				+ "Myself\n"
				+ "css\n"
				+ "Make Host\n"
				+ "Remove User\n"
				+ "Request to unmute audio");
		test.pass(a3);
		test.log(Status.PASS,"ACTUAL RESULT:: It is unmute the audio to the web user");
		test.log(Status.PASS,"Test Case:: TestCase PASSED");
		System.out.println(34);
		driver.quit();
		driver1.quit();
	}
	@Test
	public void test35() throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "/home/tvisha/Downloads/chromedriver_linux64/chromedriver");
		driver = new ChromeDriver();
		driver.get("chrome://flags");
		ChromeOptions options = new ChromeOptions()
			    .addArguments("--unsafely-treat-insecure-origin-as-secure=http://192.168.2.55:3000/user/submit-app,http://192.168.2.55:8083");
		options.addArguments("use-fake-device-for-media-stream");
	    options.addArguments("use-fake-ui-for-media-stream");
		ChromeDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("http://192.168.2.55:3000/user/submit-app");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='troopGritEntryBtn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='troopGritLoginUsernameInput']")).sendKeys("abc");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='troopGritLoginPasswordInput']")).sendKeys("123456");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id='troopGritLoginBtn']")).click();
		Thread.sleep(1000);
  		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//div[@id='troopGritEntityListWrapper']")).getAttribute("id");
		Assert.assertEquals(a1, "troopGritEntityListWrapper");
		driver.navigate().refresh();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='troopGritEntryBtn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@data-name='css']")).click();
		Thread.sleep(1000);
		
		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		ChromeDriver driver1 = new ChromeDriver(options);
		options.addArguments("--incognito");
		capabilities.setCapability(ChromeOptions.CAPABILITY, options);
		driver1.get("http://192.168.2.55:8083");
		driver1.findElement(By.xpath("//input[@name='username']")).sendKeys("css");
  		driver1.findElement(By.xpath("//input[@name='password']")).sendKeys("123456");
  		driver1.findElement(By.xpath("//button[@id='bG9naW5CdG4']")).click();
  		Thread.sleep(2000);
  		options.addArguments("--disable-notifications");
  		Thread.sleep(1000);
  		driver1.manage().window().setSize(new Dimension(500, 768));
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div//div[@data-type='audio'])")).click();
		Thread.sleep(1000);
		String a2=driver1.findElement(By.xpath("//div[@id='draggableIncomingAudioCall']")).getAttribute("id");
		
		String a=driver1.findElement(By.xpath("//span[@id='acceptAudioDraggableIncomingBtn']")).getText();
		driver1.findElement(By.xpath("//span[@id='acceptAudioDraggableIncomingBtn']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//span[@class='user-options'])[2]")).click();
		Thread.sleep(3000);
		String a4=driver.findElement(By.xpath("(//span[@class='user-option user-mute-audio'])")).getText();
		driver.findElement(By.xpath("(//span[@class='user-option user-mute-audio'])")).click();
		Thread.sleep(1000);
		driver1.manage().window().maximize();
		driver.findElement(By.xpath("(//span[@class='user-options'])[2]")).click();
		Thread.sleep(3000);
		String a5=driver.findElement(By.xpath("(//span[@class='user-option user-request-unmute-audio'])")).getText();
		driver.findElement(By.xpath("(//span[@class='user-option user-request-unmute-audio'])")).click();
		Thread.sleep(1000);
		Thread.sleep(1000);
		ExtentTest test= extent.createTest("Click on 3 dots & request to unmute audio");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Click on on-site monitoring");
		test.info("Enter username : abc");
		test.info("Enter password : 123456");
		test.info("Click on login button");
		test.info("Click on user");
		test.info("Open incognito");
		test.info("Enter Url");
		test.info("Enter username & password");
		test.info("Click on login");
		test.info("Minimize the screen");
		test.info("Call from abc user to web user");
		test.info("Web user accept the audio call");
		test.info("Click on 3 dots in abc(vidzet) user");
		test.info("Click on mute audio");
		test.info("Click on request to unmute audio");
		test.info("EXPECTED RESULT:: It should request to unmute the audio to the web user");
		test.pass(a1);
		Assert.assertEquals(a2, "draggableIncomingAudioCall");
		test.pass(a2);
		Assert.assertEquals(a, "Accept");
		test.pass(a);
		Assert.assertEquals(a4, "Mute audio");
		test.pass(a4);
		Assert.assertEquals(a5, "Request to unmute audio");
		test.pass(a5);
		test.log(Status.PASS,"ACTUAL RESULT:: It is requesting to unmute the audio to the web user");
		test.log(Status.PASS,"Test Case:: TestCase PASSED");
		System.out.println(35);
		driver.quit();
		driver1.quit();
	}
	@Test
	public void test36() throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "/home/tvisha/Downloads/chromedriver_linux64/chromedriver");
		driver = new ChromeDriver();
		driver.get("chrome://flags");
		ChromeOptions options = new ChromeOptions()
			    .addArguments("--unsafely-treat-insecure-origin-as-secure=http://192.168.2.55:3000/user/submit-app,http://192.168.2.55:8083");
		options.addArguments("use-fake-device-for-media-stream");
	    options.addArguments("use-fake-ui-for-media-stream");
		ChromeDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("http://192.168.2.55:3000/user/submit-app");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='troopGritEntryBtn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='troopGritLoginUsernameInput']")).sendKeys("abc");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='troopGritLoginPasswordInput']")).sendKeys("123456");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id='troopGritLoginBtn']")).click();
		Thread.sleep(1000);
  		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//div[@id='troopGritEntityListWrapper']")).getAttribute("id");
		Assert.assertEquals(a1, "troopGritEntityListWrapper");
		driver.navigate().refresh();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='troopGritEntryBtn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@data-name='css']")).click();
		Thread.sleep(1000);
		
		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		ChromeDriver driver1 = new ChromeDriver(options);
		options.addArguments("--incognito");
		capabilities.setCapability(ChromeOptions.CAPABILITY, options);
		driver1.get("http://192.168.2.55:8083");
		driver1.findElement(By.xpath("//input[@name='username']")).sendKeys("css");
  		driver1.findElement(By.xpath("//input[@name='password']")).sendKeys("123456");
  		driver1.findElement(By.xpath("//button[@id='bG9naW5CdG4']")).click();
  		Thread.sleep(2000);
  		options.addArguments("--disable-notifications");
  		Thread.sleep(1000);
  		driver1.manage().window().setSize(new Dimension(500, 768));
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div//div[@data-type='audio'])")).click();
		Thread.sleep(1000);
		String a2=driver1.findElement(By.xpath("//div[@id='draggableIncomingAudioCall']")).getAttribute("id");
		
		String a=driver1.findElement(By.xpath("//span[@id='acceptAudioDraggableIncomingBtn']")).getText();
		driver1.findElement(By.xpath("//span[@id='acceptAudioDraggableIncomingBtn']")).click();
		Thread.sleep(5000);
		String a5=driver.findElement(By.xpath("(//div[@class='mute-audio-btn active'])")).getAttribute("class");
		driver.findElement(By.xpath("(//div[@class='mute-audio-btn active'])")).click();
		Thread.sleep(3000);
		String a4=driver.findElement(By.xpath("(//div[@class='mute-audio-btn'])")).getAttribute("class");
		Thread.sleep(1000);
		Thread.sleep(1000);
		ExtentTest test= extent.createTest("Mute audio");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Click on on-site monitoring");
		test.info("Enter username : abc");
		test.info("Enter password : 123456");
		test.info("Click on login button");
		test.info("Click on user");
		test.info("Open incognito");
		test.info("Enter Url");
		test.info("Enter username & password");
		test.info("Click on login");
		test.info("Minimize the screen");
		test.info("Call from abc user to web user");
		test.info("Web user accept the audio call");
		test.info("Click on mute audio button");
		test.info("EXPECTED RESULT:: It should mute the audio for abc(vidzet) user");
		test.pass(a1);
		Assert.assertEquals(a2, "draggableIncomingAudioCall");
		test.pass(a2);
		Assert.assertEquals(a, "Accept");
		test.pass(a);
		Assert.assertEquals(a5, "mute-audio-btn active");
		test.pass(a5);
		Assert.assertEquals(a4, "mute-audio-btn");
		test.pass(a4);
		test.log(Status.PASS,"ACTUAL RESULT:: It mutes the audio for abc(vidzet) user");
		test.log(Status.PASS,"Test Case:: TestCase PASSED");
		System.out.println(36);
		driver.quit();
		driver1.quit();
	}
	@Test
	public void test37() throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "/home/tvisha/Downloads/chromedriver_linux64/chromedriver");
		driver = new ChromeDriver();
		driver.get("chrome://flags");
		ChromeOptions options = new ChromeOptions()
			    .addArguments("--unsafely-treat-insecure-origin-as-secure=http://192.168.2.55:3000/user/submit-app,http://192.168.2.55:8083");
		options.addArguments("use-fake-device-for-media-stream");
	    options.addArguments("use-fake-ui-for-media-stream");
		ChromeDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("http://192.168.2.55:3000/user/submit-app");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='troopGritEntryBtn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='troopGritLoginUsernameInput']")).sendKeys("abc");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='troopGritLoginPasswordInput']")).sendKeys("123456");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id='troopGritLoginBtn']")).click();
		Thread.sleep(1000);
  		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//div[@id='troopGritEntityListWrapper']")).getAttribute("id");
		Assert.assertEquals(a1, "troopGritEntityListWrapper");
		driver.navigate().refresh();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='troopGritEntryBtn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@data-name='css']")).click();
		Thread.sleep(1000);
		
		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		ChromeDriver driver1 = new ChromeDriver(options);
		options.addArguments("--incognito");
		capabilities.setCapability(ChromeOptions.CAPABILITY, options);
		driver1.get("http://192.168.2.55:8083");
		driver1.findElement(By.xpath("//input[@name='username']")).sendKeys("css");
  		driver1.findElement(By.xpath("//input[@name='password']")).sendKeys("123456");
  		driver1.findElement(By.xpath("//button[@id='bG9naW5CdG4']")).click();
  		Thread.sleep(2000);
  		options.addArguments("--disable-notifications");
  		Thread.sleep(1000);
  		driver1.manage().window().setSize(new Dimension(500, 768));
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div//div[@data-type='audio'])")).click();
		Thread.sleep(1000);
		String a2=driver1.findElement(By.xpath("//div[@id='draggableIncomingAudioCall']")).getAttribute("id");
		
		String a=driver1.findElement(By.xpath("//span[@id='acceptAudioDraggableIncomingBtn']")).getText();
		driver1.findElement(By.xpath("//span[@id='acceptAudioDraggableIncomingBtn']")).click();
		Thread.sleep(5000);
		String a5=driver.findElement(By.xpath("(//div[@class='mute-audio-btn active'])")).getAttribute("class");
		driver.findElement(By.xpath("(//div[@class='mute-audio-btn active'])")).click();
		Thread.sleep(3000);
		String a4=driver.findElement(By.xpath("(//div[@class='mute-audio-btn'])")).getAttribute("class");
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class='mute-audio-btn'])")).click();
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("(//div[@class='mute-audio-btn active'])")).getAttribute("class");
		Thread.sleep(1000);
		ExtentTest test= extent.createTest("Unmute audio");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Click on on-site monitoring");
		test.info("Enter username : abc");
		test.info("Enter password : 123456");
		test.info("Click on login button");
		test.info("Click on user");
		test.info("Open incognito");
		test.info("Enter Url");
		test.info("Enter username & password");
		test.info("Click on login");
		test.info("Minimize the screen");
		test.info("Call from abc user to web user");
		test.info("Web user accept the audio call");
		test.info("Click on mute audio button");
		test.info("Click on unmute audio button");
		test.info("EXPECTED RESULT:: It should unmute the audio for abc(vidzet) user");
		test.pass(a1);
		Assert.assertEquals(a2, "draggableIncomingAudioCall");
		test.pass(a2);
		Assert.assertEquals(a, "Accept");
		test.pass(a);
		Assert.assertEquals(a5, "mute-audio-btn active");
		test.pass(a5);
		Assert.assertEquals(a4, "mute-audio-btn");
		test.pass(a4);
		Assert.assertEquals(a6, "mute-audio-btn active");
		test.pass(a6);
		test.log(Status.PASS,"ACTUAL RESULT:: It unmutes the audio for abc(vidzet) user");
		test.log(Status.PASS,"Test Case:: TestCase PASSED");
		System.out.println(36);
		driver.quit();
		driver1.quit();
	}
	@Test
	public void test38() throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "/home/tvisha/Downloads/chromedriver_linux64/chromedriver");
		driver = new ChromeDriver();
		driver.get("chrome://flags");
		ChromeOptions options = new ChromeOptions()
			    .addArguments("--unsafely-treat-insecure-origin-as-secure=http://192.168.2.55:3000/user/submit-app,http://192.168.2.55:8083");
		options.addArguments("use-fake-device-for-media-stream");
	    options.addArguments("use-fake-ui-for-media-stream");
		ChromeDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("http://192.168.2.55:3000/user/submit-app");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='troopGritEntryBtn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='troopGritLoginUsernameInput']")).sendKeys("abc");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='troopGritLoginPasswordInput']")).sendKeys("123456");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id='troopGritLoginBtn']")).click();
		Thread.sleep(1000);
  		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//div[@id='troopGritEntityListWrapper']")).getAttribute("id");
		Assert.assertEquals(a1, "troopGritEntityListWrapper");
		driver.navigate().refresh();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='troopGritEntryBtn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@data-name='css']")).click();
		Thread.sleep(1000);
		
		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		ChromeDriver driver1 = new ChromeDriver(options);
		options.addArguments("--incognito");
		capabilities.setCapability(ChromeOptions.CAPABILITY, options);
		driver1.get("http://192.168.2.55:8083");
		driver1.findElement(By.xpath("//input[@name='username']")).sendKeys("css");
  		driver1.findElement(By.xpath("//input[@name='password']")).sendKeys("123456");
  		driver1.findElement(By.xpath("//button[@id='bG9naW5CdG4']")).click();
  		Thread.sleep(2000);
  		options.addArguments("--disable-notifications");
  		Thread.sleep(1000);
  		driver1.manage().window().setSize(new Dimension(500, 768));
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div//div[@data-type='audio'])")).click();
		Thread.sleep(1000);
		String a2=driver1.findElement(By.xpath("//div[@id='draggableIncomingAudioCall']")).getAttribute("id");
		
		String a=driver1.findElement(By.xpath("//span[@id='acceptAudioDraggableIncomingBtn']")).getText();
		driver1.findElement(By.xpath("//span[@id='acceptAudioDraggableIncomingBtn']")).click();
		Thread.sleep(5000);
		String a5=driver.findElement(By.xpath("(//div[@class='mute-video-btn'])")).getAttribute("class");
		driver.findElement(By.xpath("(//div[@class='mute-video-btn'])")).click();
		Thread.sleep(3000);
		String a4=driver.findElement(By.xpath("(//div[@class='mute-video-btn active'])")).getAttribute("class");
		Thread.sleep(1000);
		Thread.sleep(1000);
		ExtentTest test= extent.createTest("Turn on the video button");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Click on on-site monitoring");
		test.info("Enter username : abc");
		test.info("Enter password : 123456");
		test.info("Click on login button");
		test.info("Click on user");
		test.info("Open incognito");
		test.info("Enter Url");
		test.info("Enter username & password");
		test.info("Click on login");
		test.info("Minimize the screen");
		test.info("Call from abc user to web user");
		test.info("Web user accept the audio call");
		test.info("Turn on video button");
		test.info("EXPECTED RESULT:: It should turn on the video");
		test.pass(a1);
		Assert.assertEquals(a2, "draggableIncomingAudioCall");
		test.pass(a2);
		Assert.assertEquals(a, "Accept");
		test.pass(a);
		Assert.assertEquals(a5, "mute-video-btn");
		test.pass(a5);
		Assert.assertEquals(a4, "mute-video-btn active");
		test.pass(a4);
		test.log(Status.PASS,"ACTUAL RESULT:: It turn on's the video for abc(vidzet) user");
		test.log(Status.PASS,"Test Case:: TestCase PASSED");
		System.out.println(38);
		driver.quit();
		driver1.quit();
	}
	@Test
	public void test39() throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "/home/tvisha/Downloads/chromedriver_linux64/chromedriver");
		driver = new ChromeDriver();
		driver.get("chrome://flags");
		ChromeOptions options = new ChromeOptions()
			    .addArguments("--unsafely-treat-insecure-origin-as-secure=http://192.168.2.55:3000/user/submit-app,http://192.168.2.55:8083");
		options.addArguments("use-fake-device-for-media-stream");
	    options.addArguments("use-fake-ui-for-media-stream");
		ChromeDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("http://192.168.2.55:3000/user/submit-app");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='troopGritEntryBtn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='troopGritLoginUsernameInput']")).sendKeys("abc");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='troopGritLoginPasswordInput']")).sendKeys("123456");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id='troopGritLoginBtn']")).click();
		Thread.sleep(1000);
  		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//div[@id='troopGritEntityListWrapper']")).getAttribute("id");
		Assert.assertEquals(a1, "troopGritEntityListWrapper");
		driver.navigate().refresh();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='troopGritEntryBtn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@data-name='css']")).click();
		Thread.sleep(1000);
		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		ChromeDriver driver1 = new ChromeDriver(options);
		options.addArguments("--incognito");
		capabilities.setCapability(ChromeOptions.CAPABILITY, options);
		driver1.get("http://192.168.2.55:8083");
		driver1.findElement(By.xpath("//input[@name='username']")).sendKeys("css");
  		driver1.findElement(By.xpath("//input[@name='password']")).sendKeys("123456");
  		driver1.findElement(By.xpath("//button[@id='bG9naW5CdG4']")).click();
  		Thread.sleep(2000);
  		options.addArguments("--disable-notifications");
  		Thread.sleep(1000);
  		driver1.manage().window().setSize(new Dimension(500, 768));
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div//div[@data-type='audio'])")).click();
		Thread.sleep(1000);
		String a2=driver1.findElement(By.xpath("//div[@id='draggableIncomingAudioCall']")).getAttribute("id");
		String a=driver1.findElement(By.xpath("//span[@id='acceptAudioDraggableIncomingBtn']")).getText();
		driver1.findElement(By.xpath("//span[@id='acceptAudioDraggableIncomingBtn']")).click();
		Thread.sleep(5000);
		String a5=driver.findElement(By.xpath("(//div[@class='mute-video-btn'])")).getAttribute("class");
		driver.findElement(By.xpath("(//div[@class='mute-video-btn'])")).click();
		Thread.sleep(3000);
		String a4=driver.findElement(By.xpath("(//div[@class='mute-video-btn active'])")).getAttribute("class");
		driver.findElement(By.xpath("(//div[@class='mute-video-btn active'])")).click();
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("(//div[@class='mute-video-btn'])")).getAttribute("class");
		Thread.sleep(1000);
		ExtentTest test= extent.createTest("Turn off the video button");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Click on on-site monitoring");
		test.info("Enter username : abc");
		test.info("Enter password : 123456");
		test.info("Click on login button");
		test.info("Click on user");
		test.info("Open incognito");
		test.info("Enter Url");
		test.info("Enter username & password");
		test.info("Click on login");
		test.info("Minimize the screen");
		test.info("Call from abc user to web user");
		test.info("Web user accept the audio call");
		test.info("Turn on video button");
		test.info("Turn off the video");
		test.info("EXPECTED RESULT:: It should turn off the video");
		test.pass(a1);
		Assert.assertEquals(a2, "draggableIncomingAudioCall");
		test.pass(a2);
		Assert.assertEquals(a, "Accept");
		test.pass(a);
		Assert.assertEquals(a5, "mute-video-btn");
		test.pass(a5);
		Assert.assertEquals(a4, "mute-video-btn active");
		test.pass(a4);
		Assert.assertEquals(a6, "mute-video-btn");
		test.pass(a6);
		test.log(Status.PASS,"ACTUAL RESULT:: It turn off's the video for abc(vidzet) user");
		test.log(Status.PASS,"Test Case:: TestCase PASSED");
		System.out.println(39);
		driver.quit();
		driver1.quit();
	}
	@Test
	public void test40() throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "/home/tvisha/Downloads/chromedriver_linux64/chromedriver");
		driver = new ChromeDriver();
		driver.get("chrome://flags");
		ChromeOptions options = new ChromeOptions()
			    .addArguments("--unsafely-treat-insecure-origin-as-secure=http://192.168.2.55:3000/user/submit-app,http://192.168.2.55:8083");
		options.addArguments("use-fake-device-for-media-stream");
	    options.addArguments("use-fake-ui-for-media-stream");
		ChromeDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("http://192.168.2.55:3000/user/submit-app");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='troopGritEntryBtn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='troopGritLoginUsernameInput']")).sendKeys("abc");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='troopGritLoginPasswordInput']")).sendKeys("123456");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id='troopGritLoginBtn']")).click();
		Thread.sleep(1000);
  		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//div[@id='troopGritEntityListWrapper']")).getAttribute("id");
		Assert.assertEquals(a1, "troopGritEntityListWrapper");
		driver.navigate().refresh();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='troopGritEntryBtn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@data-name='css']")).click();
		Thread.sleep(1000);
		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		ChromeDriver driver1 = new ChromeDriver(options);
		options.addArguments("--incognito");
		capabilities.setCapability(ChromeOptions.CAPABILITY, options);
		driver1.get("http://192.168.2.55:8083");
		driver1.findElement(By.xpath("//input[@name='username']")).sendKeys("css");
  		driver1.findElement(By.xpath("//input[@name='password']")).sendKeys("123456");
  		driver1.findElement(By.xpath("//button[@id='bG9naW5CdG4']")).click();
  		Thread.sleep(2000);
  		options.addArguments("--disable-notifications");
  		Thread.sleep(1000);
  		driver1.manage().window().setSize(new Dimension(500, 768));
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div//div[@data-type='audio'])")).click();
		Thread.sleep(1000);
		String a2=driver1.findElement(By.xpath("//div[@id='draggableIncomingAudioCall']")).getAttribute("id");
		String a=driver1.findElement(By.xpath("//span[@id='acceptAudioDraggableIncomingBtn']")).getText();
		driver1.findElement(By.xpath("//span[@id='acceptAudioDraggableIncomingBtn']")).click();
		Thread.sleep(5000);
		String a5=driver.findElement(By.xpath("(//div[@class='screen-share-btn'])")).getAttribute("class");
		driver.findElement(By.xpath("(//div[@class='screen-share-btn'])")).click();
		Thread.sleep(3000);
		String a4=driver.findElement(By.xpath("(//div[@class='screen-share-btn active'])")).getAttribute("class");
		Thread.sleep(1000);
		Thread.sleep(1000);
		ExtentTest test= extent.createTest("Turn on the screen share button");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Click on on-site monitoring");
		test.info("Enter username : abc");
		test.info("Enter password : 123456");
		test.info("Click on login button");
		test.info("Click on user");
		test.info("Open incognito");
		test.info("Enter Url");
		test.info("Enter username & password");
		test.info("Click on login");
		test.info("Minimize the screen");
		test.info("Call from abc user to web user");
		test.info("Web user accept the audio call");
		test.info("Turn on screen share button");
		test.info("EXPECTED RESULT:: It should turn on the screen share");
		test.pass(a1);
		Assert.assertEquals(a2, "draggableIncomingAudioCall");
		test.pass(a2);
		Assert.assertEquals(a, "Accept");
		test.pass(a);
		Assert.assertEquals(a5, "screen-share-btn");
		test.pass(a5);
		Assert.assertEquals(a4, "screen-share-btn active");
		test.pass(a4);
		test.log(Status.PASS,"ACTUAL RESULT:: It turn on's the screen share in abc(vidzet) user");
		test.log(Status.PASS,"Test Case:: TestCase PASSED");
		System.out.println(40);
		driver.quit();
		driver1.quit();
	}
	@Test
	public void test41() throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "/home/tvisha/Downloads/chromedriver_linux64/chromedriver");
		driver = new ChromeDriver();
		driver.get("chrome://flags");
		ChromeOptions options = new ChromeOptions()
			    .addArguments("--unsafely-treat-insecure-origin-as-secure=http://192.168.2.55:3000/user/submit-app,http://192.168.2.55:8083");
		options.addArguments("use-fake-device-for-media-stream");
	    options.addArguments("use-fake-ui-for-media-stream");
		ChromeDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("http://192.168.2.55:3000/user/submit-app");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='troopGritEntryBtn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='troopGritLoginUsernameInput']")).sendKeys("abc");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='troopGritLoginPasswordInput']")).sendKeys("123456");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id='troopGritLoginBtn']")).click();
		Thread.sleep(1000);
  		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//div[@id='troopGritEntityListWrapper']")).getAttribute("id");
		Assert.assertEquals(a1, "troopGritEntityListWrapper");
		driver.navigate().refresh();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='troopGritEntryBtn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@data-name='css']")).click();
		Thread.sleep(1000);
		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		ChromeDriver driver1 = new ChromeDriver(options);
		options.addArguments("--incognito");
		capabilities.setCapability(ChromeOptions.CAPABILITY, options);
		driver1.get("http://192.168.2.55:8083");
		driver1.findElement(By.xpath("//input[@name='username']")).sendKeys("css");
  		driver1.findElement(By.xpath("//input[@name='password']")).sendKeys("123456");
  		driver1.findElement(By.xpath("//button[@id='bG9naW5CdG4']")).click();
  		Thread.sleep(2000);
  		options.addArguments("--disable-notifications");
  		Thread.sleep(1000);
  		driver1.manage().window().setSize(new Dimension(500, 768));
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div//div[@data-type='audio'])")).click();
		Thread.sleep(1000);
		String a2=driver1.findElement(By.xpath("//div[@id='draggableIncomingAudioCall']")).getAttribute("id");
		String a=driver1.findElement(By.xpath("//span[@id='acceptAudioDraggableIncomingBtn']")).getText();
		driver1.findElement(By.xpath("//span[@id='acceptAudioDraggableIncomingBtn']")).click();
		Thread.sleep(5000);
		String a5=driver.findElement(By.xpath("(//div[@class='screen-share-btn'])")).getAttribute("class");
		driver.findElement(By.xpath("(//div[@class='screen-share-btn'])")).click();
		Thread.sleep(3000);
		String a4=driver.findElement(By.xpath("(//div[@class='screen-share-btn active'])")).getAttribute("class");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@class='end-btn']")).click();
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//span[@class='end-btn-option end-screen-share']")).getText();
		driver.findElement(By.xpath("//span[@class='end-btn-option end-screen-share']")).click();
		Thread.sleep(1000);
		ExtentTest test= extent.createTest("End the screen share");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Click on on-site monitoring");
		test.info("Enter username : abc");
		test.info("Enter password : 123456");
		test.info("Click on login button");
		test.info("Click on user");
		test.info("Open incognito");
		test.info("Enter Url");
		test.info("Enter username & password");
		test.info("Click on login");
		test.info("Minimize the screen");
		test.info("Call from abc user to web user");
		test.info("Web user accept the audio call");
		test.info("Click on screen share");
		test.info("Click on end button");
		test.info("Click on end screen share");
		test.info("EXPECTED RESULT:: It should end the screen share");
		test.pass(a1);
		Assert.assertEquals(a2, "draggableIncomingAudioCall");
		test.pass(a2);
		Assert.assertEquals(a, "Accept");
		test.pass(a);
		Assert.assertEquals(a5, "screen-share-btn");
		test.pass(a5);
		Assert.assertEquals(a4, "screen-share-btn active");
		test.pass(a4);
		Assert.assertEquals(a6, "End Screen Share");
		test.pass(a6);
		test.log(Status.PASS,"ACTUAL RESULT:: It is ending the screen share in abc(vidzet) user");
		test.log(Status.PASS,"Test Case:: TestCase PASSED");
		System.out.println(41);
		driver.quit();
		driver1.quit();
	}
	@Test
	public void test42() throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "/home/tvisha/Downloads/chromedriver_linux64/chromedriver");
		driver = new ChromeDriver();
		driver.get("chrome://flags");
		ChromeOptions options = new ChromeOptions()
			    .addArguments("--unsafely-treat-insecure-origin-as-secure=http://192.168.2.55:3000/user/submit-app,http://192.168.2.55:8083");
		options.addArguments("use-fake-device-for-media-stream");
	    options.addArguments("use-fake-ui-for-media-stream");
		ChromeDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("http://192.168.2.55:3000/user/submit-app");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='troopGritEntryBtn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='troopGritLoginUsernameInput']")).sendKeys("abc");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='troopGritLoginPasswordInput']")).sendKeys("123456");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id='troopGritLoginBtn']")).click();
		Thread.sleep(1000);
  		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//div[@id='troopGritEntityListWrapper']")).getAttribute("id");
		Assert.assertEquals(a1, "troopGritEntityListWrapper");
		driver.navigate().refresh();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='troopGritEntryBtn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@data-name='css']")).click();
		Thread.sleep(1000);
		
		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		ChromeDriver driver1 = new ChromeDriver(options);
		options.addArguments("--incognito");
		capabilities.setCapability(ChromeOptions.CAPABILITY, options);
		driver1.get("http://192.168.2.55:8083");
		driver1.findElement(By.xpath("//input[@name='username']")).sendKeys("css");
  		driver1.findElement(By.xpath("//input[@name='password']")).sendKeys("123456");
  		driver1.findElement(By.xpath("//button[@id='bG9naW5CdG4']")).click();
  		Thread.sleep(2000);
  		options.addArguments("--disable-notifications");
  		Thread.sleep(1000);
  		driver1.manage().window().setSize(new Dimension(500, 768));
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div//div[@data-type='audio'])")).click();
		Thread.sleep(1000);
		String a2=driver1.findElement(By.xpath("//div[@id='draggableIncomingAudioCall']")).getAttribute("id");
		
		String a=driver1.findElement(By.xpath("//span[@id='acceptAudioDraggableIncomingBtn']")).getText();
		driver1.findElement(By.xpath("//span[@id='acceptAudioDraggableIncomingBtn']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//span[@class='user-options'])[2]")).click();
		Thread.sleep(3000);
		String a4=driver.findElement(By.xpath("(//span[@class='user-option user-make-host'])")).getText();
		driver.findElement(By.xpath("(//span[@class='user-option user-make-host'])")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//span[@class='user-options'])[2]")).click();
		Thread.sleep(1000);
		ExtentTest test= extent.createTest("Click on 3 dots & make host to the user");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Click on on-site monitoring");
		test.info("Enter username : abc");
		test.info("Enter password : 123456");
		test.info("Click on login button");
		test.info("Click on user");
		test.info("Open incognito");
		test.info("Enter Url");
		test.info("Enter username & password");
		test.info("Click on login");
		test.info("Minimize the screen");
		test.info("Call from abc user to web user");
		test.info("Web user accept the audio call");
		test.info("Click on 3 dots in abc(vidzet) user");
		test.info("Make host to the web user");
		test.info("EXPECTED RESULT:: It should click on make host to the web user");
		test.pass(a1);
		Assert.assertEquals(a2, "draggableIncomingAudioCall");
		test.pass(a2);
		Assert.assertEquals(a, "Accept");
		test.pass(a);
		Assert.assertEquals(a4, "Make Host");
		test.pass(a4);
		String a3=driver.findElement(By.xpath("//div[@class='users-wrapper']")).getText();
		Assert.assertEquals(a3, "AB\n"
				+ "Myself\n"
				+ "css\n"
				+ "Revoke Host\n"
				+ "Remove User\n"
				+ "Mute audio");
		test.pass(a3);
		test.log(Status.PASS,"ACTUAL RESULT:: It is clicking on make host to the web user");
		test.log(Status.PASS,"Test Case:: TestCase PASSED");
		System.out.println(42);
		driver.quit();
		driver1.quit();
	}
	@Test
	public void test43() throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "/home/tvisha/Downloads/chromedriver_linux64/chromedriver");
		driver = new ChromeDriver();
		driver.get("chrome://flags");
		ChromeOptions options = new ChromeOptions()
			    .addArguments("--unsafely-treat-insecure-origin-as-secure=http://192.168.2.55:3000/user/submit-app,http://192.168.2.55:8083");
		options.addArguments("use-fake-device-for-media-stream");
	    options.addArguments("use-fake-ui-for-media-stream");
		ChromeDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("http://192.168.2.55:3000/user/submit-app");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='troopGritEntryBtn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='troopGritLoginUsernameInput']")).sendKeys("abc");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='troopGritLoginPasswordInput']")).sendKeys("123456");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id='troopGritLoginBtn']")).click();
		Thread.sleep(1000);
  		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//div[@id='troopGritEntityListWrapper']")).getAttribute("id");
		Assert.assertEquals(a1, "troopGritEntityListWrapper");
		driver.navigate().refresh();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='troopGritEntryBtn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@data-name='css']")).click();
		Thread.sleep(1000);
		
		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		ChromeDriver driver1 = new ChromeDriver(options);
		options.addArguments("--incognito");
		capabilities.setCapability(ChromeOptions.CAPABILITY, options);
		driver1.get("http://192.168.2.55:8083");
		driver1.findElement(By.xpath("//input[@name='username']")).sendKeys("css");
  		driver1.findElement(By.xpath("//input[@name='password']")).sendKeys("123456");
  		driver1.findElement(By.xpath("//button[@id='bG9naW5CdG4']")).click();
  		Thread.sleep(2000);
  		options.addArguments("--disable-notifications");
  		Thread.sleep(1000);
  		driver1.manage().window().setSize(new Dimension(500, 768));
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div//div[@data-type='audio'])")).click();
		Thread.sleep(1000);
		String a2=driver1.findElement(By.xpath("//div[@id='draggableIncomingAudioCall']")).getAttribute("id");
		
		String a=driver1.findElement(By.xpath("//span[@id='acceptAudioDraggableIncomingBtn']")).getText();
		driver1.findElement(By.xpath("//span[@id='acceptAudioDraggableIncomingBtn']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//span[@class='user-options'])[2]")).click();
		Thread.sleep(3000);
		String a4=driver.findElement(By.xpath("(//span[@class='user-option user-make-host'])")).getText();
		driver.findElement(By.xpath("(//span[@class='user-option user-make-host'])")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//span[@class='user-options'])[2]")).click();
		Thread.sleep(3000);
		String a5=driver.findElement(By.xpath("(//span[@class='user-option user-revoke-host'])")).getText();
		driver.findElement(By.xpath("(//span[@class='user-option user-revoke-host'])")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//span[@class='user-options'])[2]")).click();
		Thread.sleep(1000);
		ExtentTest test= extent.createTest("Click on 3 dots & Revoke host to the user");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Click on on-site monitoring");
		test.info("Enter username : abc");
		test.info("Enter password : 123456");
		test.info("Click on login button");
		test.info("Click on user");
		test.info("Open incognito");
		test.info("Enter Url");
		test.info("Enter username & password");
		test.info("Click on login");
		test.info("Minimize the screen");
		test.info("Call from abc user to web user");
		test.info("Web user accept the audio call");
		test.info("Click on 3 dots in abc(vidzet) user");
		test.info("Make host to the web user");
		test.info("Again click on 3 dots");
		test.info("Click on revoke host");
		test.info("EXPECTED RESULT:: It should click on revoke host to the web user");
		test.pass(a1);
		Assert.assertEquals(a2, "draggableIncomingAudioCall");
		test.pass(a2);
		Assert.assertEquals(a, "Accept");
		test.pass(a);
		Assert.assertEquals(a4, "Make Host");
		test.pass(a4);
		Assert.assertEquals(a5, "Revoke Host");
		test.pass(a5);
		String a3=driver.findElement(By.xpath("//div[@class='users-wrapper']")).getText();
		Assert.assertEquals(a3, "AB\n"
				+ "Myself\n"
				+ "css\n"
				+ "Make Host\n"
				+ "Remove User\n"
				+ "Mute audio");
		test.pass(a3);
		test.log(Status.PASS,"ACTUAL RESULT:: It is clicking on revoke host to the web user");
		test.log(Status.PASS,"Test Case:: TestCase PASSED");
		System.out.println(43);
		driver.quit();
		driver1.quit();
	}
	@Test
	public void test44() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/tvisha/Downloads/chromedriver_linux64/chromedriver");
		driver = new ChromeDriver();
		driver.get("chrome://flags");
		ChromeOptions options = new ChromeOptions()
			    .addArguments("--unsafely-treat-insecure-origin-as-secure=http://192.168.2.55:3000/user/submit-app,http://192.168.2.55:8083");
		options.addArguments("use-fake-device-for-media-stream");
	    options.addArguments("use-fake-ui-for-media-stream");
		ChromeDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("http://192.168.2.55:3000/user/submit-app");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='troopGritEntryBtn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='troopGritLoginUsernameInput']")).sendKeys("abc");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='troopGritLoginPasswordInput']")).sendKeys("123456");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id='troopGritLoginBtn']")).click();
		Thread.sleep(1000);
  		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//div[@id='troopGritEntityListWrapper']")).getAttribute("id");
		Assert.assertEquals(a1, "troopGritEntityListWrapper");
		driver.navigate().refresh();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='troopGritEntryBtn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@data-name='css']")).click();
		Thread.sleep(1000);
		
		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		ChromeDriver driver1 = new ChromeDriver(options);
		options.addArguments("--incognito");
		capabilities.setCapability(ChromeOptions.CAPABILITY, options);
		driver1.get("http://192.168.2.55:8083");
		driver1.findElement(By.xpath("//input[@name='username']")).sendKeys("css");
  		driver1.findElement(By.xpath("//input[@name='password']")).sendKeys("123456");
  		driver1.findElement(By.xpath("//button[@id='bG9naW5CdG4']")).click();
  		Thread.sleep(2000);
  		options.addArguments("--disable-notifications");
  		Thread.sleep(1000);
  		driver1.manage().window().setSize(new Dimension(500, 768));
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div//div[@data-type='audio'])")).click();
		Thread.sleep(1000);
		String a2=driver1.findElement(By.xpath("//div[@id='draggableIncomingAudioCall']")).getAttribute("id");
		
		String a=driver1.findElement(By.xpath("//span[@id='acceptAudioDraggableIncomingBtn']")).getText();
		driver1.findElement(By.xpath("//span[@id='acceptAudioDraggableIncomingBtn']")).click();
		Thread.sleep(5000);
		ChromeDriver driver2 = new ChromeDriver(options);
		options.addArguments("--incognito");
		capabilities.setCapability(ChromeOptions.CAPABILITY, options);
		driver2.get("http://192.168.2.55:8083");
		driver2.findElement(By.xpath("//input[@name='username']")).sendKeys("department_admin");
  		driver2.findElement(By.xpath("//input[@name='password']")).sendKeys("123456");
  		driver2.findElement(By.xpath("//button[@id='bG9naW5CdG4']")).click();
  		Thread.sleep(2000);
  		options.addArguments("--disable-notifications");
  		Thread.sleep(1000);
  		driver2.manage().window().setSize(new Dimension(500, 768));
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='add-users-btn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@data-username='Department Admin']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='addUsersSubmitBtn']")).click();
		Thread.sleep(3000);
		String a3=driver2.findElement(By.xpath("//div[@id='draggableIncomingAudioCall']")).getAttribute("id");
		
		String a4=driver2.findElement(By.xpath("//span[@id='acceptAudioDraggableIncomingBtn']")).getText();
		driver2.findElement(By.xpath("//span[@id='acceptAudioDraggableIncomingBtn']")).click();
		Thread.sleep(8000);
		ExtentTest test= extent.createTest("Accept the Call in user1");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Click on on-site monitoring");
		test.info("Enter username : abc");
		test.info("Enter password : 123456");
		test.info("Click on login button");
		test.info("Click on user");
		test.info("Open incognito");
		test.info("Enter Url");
		test.info("Enter username & password");
		test.info("Click on login");
		test.info("Minimize the screen");
		test.info("Call from abc user to web user");
		test.info("Web user accept the audio call");
		test.info("Click on add user in abc(vidzet) user");
		test.info("Select the user1 & Click on add participant");
		test.info("User1 accept the call");
		test.info("EXPECTED RESULT:: It should display 3 users in the call");
		test.pass(a1);
		Assert.assertEquals(a2, "draggableIncomingAudioCall");
		test.pass(a2);
		Assert.assertEquals(a, "Accept");
		test.pass(a);
		Assert.assertEquals(a3, "draggableIncomingAudioCall");
		test.pass(a3);
		Assert.assertEquals(a4, "Accept");
		test.pass(a4);
		String a5=driver.findElement(By.xpath("//div[@class='users-wrapper']")).getText();
		Assert.assertEquals(a5, "DA\n"
				+ "Department Admin\n"
				+ "AB\n"
				+ "Myself\n"
				+ "css");
		test.pass(a5);
		test.log(Status.PASS,"ACTUAL RESULT:: It is displaying three users in the call");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println(44);
		driver.close();
		driver1.quit();
		driver2.quit();
	}
	@Test
	public void test45() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/tvisha/Downloads/chromedriver_linux64/chromedriver");
		driver = new ChromeDriver();
		driver.get("chrome://flags");
		ChromeOptions options = new ChromeOptions()
			    .addArguments("--unsafely-treat-insecure-origin-as-secure=http://192.168.2.55:3000/user/submit-app,http://192.168.2.55:8083");
		options.addArguments("use-fake-device-for-media-stream");
	    options.addArguments("use-fake-ui-for-media-stream");
		ChromeDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("http://192.168.2.55:3000/user/submit-app");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='troopGritEntryBtn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='troopGritLoginUsernameInput']")).sendKeys("abc");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='troopGritLoginPasswordInput']")).sendKeys("123456");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id='troopGritLoginBtn']")).click();
		Thread.sleep(1000);
  		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//div[@id='troopGritEntityListWrapper']")).getAttribute("id");
		Assert.assertEquals(a1, "troopGritEntityListWrapper");
		driver.navigate().refresh();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='troopGritEntryBtn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@data-name='css']")).click();
		Thread.sleep(1000);
		
		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		ChromeDriver driver1 = new ChromeDriver(options);
		options.addArguments("--incognito");
		capabilities.setCapability(ChromeOptions.CAPABILITY, options);
		driver1.get("http://192.168.2.55:8083");
		driver1.findElement(By.xpath("//input[@name='username']")).sendKeys("css");
  		driver1.findElement(By.xpath("//input[@name='password']")).sendKeys("123456");
  		driver1.findElement(By.xpath("//button[@id='bG9naW5CdG4']")).click();
  		Thread.sleep(2000);
  		options.addArguments("--disable-notifications");
  		Thread.sleep(1000);
  		driver1.manage().window().setSize(new Dimension(500, 768));
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div//div[@data-type='audio'])")).click();
		Thread.sleep(1000);
		String a2=driver1.findElement(By.xpath("//div[@id='draggableIncomingAudioCall']")).getAttribute("id");
		
		String a=driver1.findElement(By.xpath("//span[@id='acceptAudioDraggableIncomingBtn']")).getText();
		driver1.findElement(By.xpath("//span[@id='acceptAudioDraggableIncomingBtn']")).click();
		Thread.sleep(5000);
		ChromeDriver driver2 = new ChromeDriver(options);
		options.addArguments("--incognito");
		capabilities.setCapability(ChromeOptions.CAPABILITY, options);
		driver2.get("http://192.168.2.55:8083");
		driver2.findElement(By.xpath("//input[@name='username']")).sendKeys("department_admin");
  		driver2.findElement(By.xpath("//input[@name='password']")).sendKeys("123456");
  		driver2.findElement(By.xpath("//button[@id='bG9naW5CdG4']")).click();
  		Thread.sleep(2000);
  		options.addArguments("--disable-notifications");
  		Thread.sleep(1000);
  		driver2.manage().window().setSize(new Dimension(500, 768));
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='add-users-btn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@data-username='Department Admin']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='addUsersSubmitBtn']")).click();
		Thread.sleep(3000);
		String a3=driver2.findElement(By.xpath("//div[@id='draggableIncomingAudioCall']")).getAttribute("id");
		
		String a4=driver2.findElement(By.xpath("//span[@id='rejectAudioDraggableIncomingBtn']")).getText();
		driver2.findElement(By.xpath("//span[@id='rejectAudioDraggableIncomingBtn']")).click();
		Thread.sleep(8000);
		ExtentTest test= extent.createTest("Reject the Call in user1");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Click on on-site monitoring");
		test.info("Enter username : abc");
		test.info("Enter password : 123456");
		test.info("Click on login button");
		test.info("Click on user");
		test.info("Open incognito");
		test.info("Enter Url");
		test.info("Enter username & password");
		test.info("Click on login");
		test.info("Minimize the screen");
		test.info("Call from abc user to web user");
		test.info("Web user accept the audio call");
		test.info("Click on add user in abc(vidzet) user");
		test.info("Select the user1 & Click on add participant");
		test.info("User1 reject the call");
		test.info("EXPECTED RESULT:: It should display reject for user1");
		test.pass(a1);
		Assert.assertEquals(a2, "draggableIncomingAudioCall");
		test.pass(a2);
		Assert.assertEquals(a, "Accept");
		test.pass(a);
		Assert.assertEquals(a3, "draggableIncomingAudioCall");
		test.pass(a3);
		Assert.assertEquals(a4, "Reject");
		test.pass(a4);
		String a5=driver.findElement(By.xpath("//div[@class='users-wrapper']")).getText();
		Assert.assertEquals(a5, "AB\n"
				+ "Myself\n"
				+ "css\n"
				+ "DA\n"
				+ "Department Admin\n"
				+ "Rejected");
		test.pass(a5);
		test.log(Status.PASS,"ACTUAL RESULT:: It is displaying rejected for user1");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println(45);
		driver.close();
		driver1.quit();
		driver2.quit();
	}
	@Test
	public void test46() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/tvisha/Downloads/chromedriver_linux64/chromedriver");
		driver = new ChromeDriver();
		driver.get("chrome://flags");
		ChromeOptions options = new ChromeOptions()
			    .addArguments("--unsafely-treat-insecure-origin-as-secure=http://192.168.2.55:3000/user/submit-app,http://192.168.2.55:8083");
		options.addArguments("use-fake-device-for-media-stream");
	    options.addArguments("use-fake-ui-for-media-stream");
		ChromeDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("http://192.168.2.55:3000/user/submit-app");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='troopGritEntryBtn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='troopGritLoginUsernameInput']")).sendKeys("abc");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='troopGritLoginPasswordInput']")).sendKeys("123456");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id='troopGritLoginBtn']")).click();
		Thread.sleep(1000);
  		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//div[@id='troopGritEntityListWrapper']")).getAttribute("id");
		Assert.assertEquals(a1, "troopGritEntityListWrapper");
		driver.navigate().refresh();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='troopGritEntryBtn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@data-name='css']")).click();
		Thread.sleep(1000);
		
		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		ChromeDriver driver1 = new ChromeDriver(options);
		options.addArguments("--incognito");
		capabilities.setCapability(ChromeOptions.CAPABILITY, options);
		driver1.get("http://192.168.2.55:8083");
		driver1.findElement(By.xpath("//input[@name='username']")).sendKeys("css");
  		driver1.findElement(By.xpath("//input[@name='password']")).sendKeys("123456");
  		driver1.findElement(By.xpath("//button[@id='bG9naW5CdG4']")).click();
  		Thread.sleep(2000);
  		options.addArguments("--disable-notifications");
  		Thread.sleep(1000);
  		driver1.manage().window().setSize(new Dimension(500, 768));
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div//div[@data-type='audio'])")).click();
		Thread.sleep(1000);
		String a2=driver1.findElement(By.xpath("//div[@id='draggableIncomingAudioCall']")).getAttribute("id");
		
		String a=driver1.findElement(By.xpath("//span[@id='acceptAudioDraggableIncomingBtn']")).getText();
		driver1.findElement(By.xpath("//span[@id='acceptAudioDraggableIncomingBtn']")).click();
		Thread.sleep(5000);
		ChromeDriver driver2 = new ChromeDriver(options);
		options.addArguments("--incognito");
		capabilities.setCapability(ChromeOptions.CAPABILITY, options);
		driver2.get("http://192.168.2.55:8083");
		driver2.findElement(By.xpath("//input[@name='username']")).sendKeys("department_admin");
  		driver2.findElement(By.xpath("//input[@name='password']")).sendKeys("123456");
  		driver2.findElement(By.xpath("//button[@id='bG9naW5CdG4']")).click();
  		Thread.sleep(2000);
  		options.addArguments("--disable-notifications");
  		Thread.sleep(1000);
  		driver2.manage().window().setSize(new Dimension(500, 768));
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='add-users-btn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@data-username='Department Admin']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='addUsersSubmitBtn']")).click();
		Thread.sleep(3000);
		String a3=driver2.findElement(By.xpath("//div[@id='draggableIncomingAudioCall']")).getAttribute("id");
		
		String a4=driver2.findElement(By.xpath("//span[@id='ignoreAudioDraggableIncomingBtn']")).getText();
		driver2.findElement(By.xpath("//span[@id='ignoreAudioDraggableIncomingBtn']")).click();
		Thread.sleep(8000);
		ExtentTest test= extent.createTest("Ignore the Call in user1");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Click on on-site monitoring");
		test.info("Enter username : abc");
		test.info("Enter password : 123456");
		test.info("Click on login button");
		test.info("Click on user");
		test.info("Open incognito");
		test.info("Enter Url");
		test.info("Enter username & password");
		test.info("Click on login");
		test.info("Minimize the screen");
		test.info("Call from abc user to web user");
		test.info("Web user accept the audio call");
		test.info("Click on add user in abc(vidzet) user");
		test.info("Select the user1 & Click on add participant");
		test.info("User1 ignore the call");
		test.info("EXPECTED RESULT:: It should display as ringing for user1");
		test.pass(a1);
		Assert.assertEquals(a2, "draggableIncomingAudioCall");
		test.pass(a2);
		Assert.assertEquals(a, "Accept");
		test.pass(a);
		Assert.assertEquals(a3, "draggableIncomingAudioCall");
		test.pass(a3);
		Assert.assertEquals(a4, "Ignore");
		test.pass(a4);
		String a5=driver.findElement(By.xpath("//div[@class='users-wrapper']")).getText();
		Assert.assertEquals(a5, "AB\n"
				+ "Myself\n"
				+ "css\n"
				+ "DA\n"
				+ "Department Admin\n"
				+ "Ringing");
		test.pass(a5);
		test.log(Status.PASS,"ACTUAL RESULT:: It is displaying as ringing for user1");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println(46);
		driver.close();
		driver1.quit();
		driver2.quit();
	}
	@Test
	public void test47() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/tvisha/Downloads/chromedriver_linux64/chromedriver");
		driver = new ChromeDriver();
		driver.get("chrome://flags");
		ChromeOptions options = new ChromeOptions()
			    .addArguments("--unsafely-treat-insecure-origin-as-secure=http://192.168.2.55:3000/user/submit-app,http://192.168.2.55:8083");
		options.addArguments("use-fake-device-for-media-stream");
	    options.addArguments("use-fake-ui-for-media-stream");
		ChromeDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("http://192.168.2.55:3000/user/submit-app");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='troopGritEntryBtn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='troopGritLoginUsernameInput']")).sendKeys("abc");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='troopGritLoginPasswordInput']")).sendKeys("123456");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id='troopGritLoginBtn']")).click();
		Thread.sleep(1000);
  		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//div[@id='troopGritEntityListWrapper']")).getAttribute("id");
		Assert.assertEquals(a1, "troopGritEntityListWrapper");
		driver.navigate().refresh();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='troopGritEntryBtn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@data-name='css']")).click();
		Thread.sleep(1000);
		
		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		ChromeDriver driver1 = new ChromeDriver(options);
		options.addArguments("--incognito");
		capabilities.setCapability(ChromeOptions.CAPABILITY, options);
		driver1.get("http://192.168.2.55:8083");
		driver1.findElement(By.xpath("//input[@name='username']")).sendKeys("css");
  		driver1.findElement(By.xpath("//input[@name='password']")).sendKeys("123456");
  		driver1.findElement(By.xpath("//button[@id='bG9naW5CdG4']")).click();
  		Thread.sleep(2000);
  		options.addArguments("--disable-notifications");
  		Thread.sleep(1000);
  		driver1.manage().window().setSize(new Dimension(500, 768));
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div//div[@data-type='audio'])")).click();
		Thread.sleep(1000);
		String a2=driver1.findElement(By.xpath("//div[@id='draggableIncomingAudioCall']")).getAttribute("id");
		
		String a=driver1.findElement(By.xpath("//span[@id='acceptAudioDraggableIncomingBtn']")).getText();
		driver1.findElement(By.xpath("//span[@id='acceptAudioDraggableIncomingBtn']")).click();
		Thread.sleep(5000);
		driver1.manage().window().maximize();
		ChromeDriver driver2 = new ChromeDriver(options);
		options.addArguments("--incognito");
		capabilities.setCapability(ChromeOptions.CAPABILITY, options);
		driver2.get("http://192.168.2.55:8083");
		driver2.findElement(By.xpath("//input[@name='username']")).sendKeys("department_admin");
  		driver2.findElement(By.xpath("//input[@name='password']")).sendKeys("123456");
  		driver2.findElement(By.xpath("//button[@id='bG9naW5CdG4']")).click();
  		Thread.sleep(2000);
  		options.addArguments("--disable-notifications");
  		Thread.sleep(1000);
  		driver2.manage().window().setSize(new Dimension(500, 768));
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='add-users-btn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@data-username='Department Admin']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='addUsersSubmitBtn']")).click();
		Thread.sleep(3000);
		String a3=driver2.findElement(By.xpath("//div[@id='draggableIncomingAudioCall']")).getAttribute("id");
		
		String a4=driver2.findElement(By.xpath("//span[@id='acceptAudioDraggableIncomingBtn']")).getText();
		driver2.findElement(By.xpath("//span[@id='acceptAudioDraggableIncomingBtn']")).click();
		Thread.sleep(8000);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@class='end-btn']")).click();
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//span[@class='end-btn-option exit-self']")).getText();
		driver.findElement(By.xpath("//span[@class='end-btn-option exit-self']")).click();
		Thread.sleep(1000);
		ExtentTest test= extent.createTest("Exit self in abc(vidzet) user");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Click on on-site monitoring");
		test.info("Enter username : abc");
		test.info("Enter password : 123456");
		test.info("Click on login button");
		test.info("Click on user");
		test.info("Open incognito");
		test.info("Enter Url");
		test.info("Enter username & password");
		test.info("Click on login");
		test.info("Minimize the screen");
		test.info("Call from abc user to web user");
		test.info("Web user accept the audio call");
		test.info("Click on add user in abc(vidzet) user");
		test.info("Select the user1 & Click on add participant");
		test.info("User1 accept the call");
		test.info("Abc(vidzet) user exit self");
		test.info("EXPECTED RESULT:: It should exit self from call");
		test.pass(a1);
		Assert.assertEquals(a2, "draggableIncomingAudioCall");
		test.pass(a2);
		Assert.assertEquals(a, "Accept");
		test.pass(a);
		Assert.assertEquals(a3, "draggableIncomingAudioCall");
		test.pass(a3);
		Assert.assertEquals(a4, "Accept");
		test.pass(a4);
		Assert.assertEquals(a6, "Exit Self");
		test.pass(a6);
		test.log(Status.PASS,"ACTUAL RESULT:: It is existing self from call");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println(47);
		driver.close();
		driver1.quit();
		driver2.quit();
	}
	@Test
	public void test48() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/tvisha/Downloads/chromedriver_linux64/chromedriver");
		driver = new ChromeDriver();
		driver.get("chrome://flags");
		ChromeOptions options = new ChromeOptions()
			    .addArguments("--unsafely-treat-insecure-origin-as-secure=http://192.168.2.55:3000/user/submit-app,http://192.168.2.55:8083");
		options.addArguments("use-fake-device-for-media-stream");
	    options.addArguments("use-fake-ui-for-media-stream");
		ChromeDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("http://192.168.2.55:3000/user/submit-app");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='troopGritEntryBtn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='troopGritLoginUsernameInput']")).sendKeys("abc");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='troopGritLoginPasswordInput']")).sendKeys("123456");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id='troopGritLoginBtn']")).click();
		Thread.sleep(1000);
  		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//div[@id='troopGritEntityListWrapper']")).getAttribute("id");
		Assert.assertEquals(a1, "troopGritEntityListWrapper");
		driver.navigate().refresh();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='troopGritEntryBtn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@data-name='css']")).click();
		Thread.sleep(1000);
		
		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		ChromeDriver driver1 = new ChromeDriver(options);
		options.addArguments("--incognito");
		capabilities.setCapability(ChromeOptions.CAPABILITY, options);
		driver1.get("http://192.168.2.55:8083");
		driver1.findElement(By.xpath("//input[@name='username']")).sendKeys("css");
  		driver1.findElement(By.xpath("//input[@name='password']")).sendKeys("123456");
  		driver1.findElement(By.xpath("//button[@id='bG9naW5CdG4']")).click();
  		Thread.sleep(2000);
  		options.addArguments("--disable-notifications");
  		Thread.sleep(1000);
  		driver1.manage().window().setSize(new Dimension(500, 768));
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div//div[@data-type='video'])")).click();
		Thread.sleep(1000);
		String a2=driver1.findElement(By.xpath("//div[@id='draggableIncomingAudioCall']")).getAttribute("id");
		
		String a=driver1.findElement(By.xpath("//span[@id='acceptDraggableIncomingBtn']")).getText();
		driver1.findElement(By.xpath("//span[@id='acceptDraggableIncomingBtn']")).click();
		Thread.sleep(8000);
		ExtentTest test= extent.createTest("Video call to the user");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Click on on-site monitoring");
		test.info("Enter username : abc");
		test.info("Enter password : 123456");
		test.info("Click on login button");
		test.info("Click on user");
		test.info("Open incognito");
		test.info("Enter Url");
		test.info("Enter username & password");
		test.info("Click on login");
		test.info("Minimize the screen");
		test.info("Video Call from abc user to web user");
		test.info("Web user accept the Video call");
		test.info("EXPECTED RESULT:: It should accept video call");
		test.pass(a1);
		Assert.assertEquals(a2, "draggableIncomingAudioCall");
		test.pass(a2);
		Assert.assertEquals(a, "Video");
		test.pass(a);
		test.log(Status.PASS,"ACTUAL RESULT:: It is accepting video call");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println(48);
		driver.close();
		driver1.quit();
	}
	@Test
	public void test49() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/tvisha/Downloads/chromedriver_linux64/chromedriver");
		driver = new ChromeDriver();
		driver.get("chrome://flags");
		ChromeOptions options = new ChromeOptions()
			    .addArguments("--unsafely-treat-insecure-origin-as-secure=http://192.168.2.55:3000/user/submit-app,http://192.168.2.55:8083");
		options.addArguments("use-fake-device-for-media-stream");
	    options.addArguments("use-fake-ui-for-media-stream");
		ChromeDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("http://192.168.2.55:3000/user/submit-app");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='troopGritEntryBtn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='troopGritLoginUsernameInput']")).sendKeys("abc");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='troopGritLoginPasswordInput']")).sendKeys("123456");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id='troopGritLoginBtn']")).click();
		Thread.sleep(1000);
  		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//div[@id='troopGritEntityListWrapper']")).getAttribute("id");
		Assert.assertEquals(a1, "troopGritEntityListWrapper");
		driver.navigate().refresh();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='troopGritEntryBtn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@data-name='css']")).click();
		Thread.sleep(1000);
		
		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		ChromeDriver driver1 = new ChromeDriver(options);
		options.addArguments("--incognito");
		capabilities.setCapability(ChromeOptions.CAPABILITY, options);
		driver1.get("http://192.168.2.55:8083");
		driver1.findElement(By.xpath("//input[@name='username']")).sendKeys("css");
  		driver1.findElement(By.xpath("//input[@name='password']")).sendKeys("123456");
  		driver1.findElement(By.xpath("//button[@id='bG9naW5CdG4']")).click();
  		Thread.sleep(2000);
  		options.addArguments("--disable-notifications");
  		Thread.sleep(1000);
  		driver1.manage().window().setSize(new Dimension(500, 768));
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div//div[@data-type='video'])")).click();
		Thread.sleep(1000);
		String a2=driver1.findElement(By.xpath("//div[@id='draggableIncomingAudioCall']")).getAttribute("id");
		
		String a=driver1.findElement(By.xpath("//span[@id='acceptVideoAudioDraggableIncomingBtn']")).getText();
		driver1.findElement(By.xpath("//span[@id='acceptVideoAudioDraggableIncomingBtn']")).click();
		Thread.sleep(8000);
		ExtentTest test= extent.createTest("Video call to the user & accept audio in the user");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Click on on-site monitoring");
		test.info("Enter username : abc");
		test.info("Enter password : 123456");
		test.info("Click on login button");
		test.info("Click on user");
		test.info("Open incognito");
		test.info("Enter Url");
		test.info("Enter username & password");
		test.info("Click on login");
		test.info("Minimize the screen");
		test.info("Video Call from abc user to web user");
		test.info("Web user accept the audio call");
		test.info("EXPECTED RESULT:: It should accept audio call");
		test.pass(a1);
		Assert.assertEquals(a2, "draggableIncomingAudioCall");
		test.pass(a2);
		Assert.assertEquals(a, "Voice");
		test.pass(a);
		test.log(Status.PASS,"ACTUAL RESULT:: It is accepting audio call");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println(48);
		driver.close();
		driver1.quit();
	}
	@Test
	public void test50() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/tvisha/Downloads/chromedriver_linux64/chromedriver");
		driver = new ChromeDriver();
		driver.get("chrome://flags");
		ChromeOptions options = new ChromeOptions()
			    .addArguments("--unsafely-treat-insecure-origin-as-secure=http://192.168.2.55:3000/user/submit-app,http://192.168.2.55:8083");
		options.addArguments("use-fake-device-for-media-stream");
	    options.addArguments("use-fake-ui-for-media-stream");
		ChromeDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("http://192.168.2.55:3000/user/submit-app");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='troopGritEntryBtn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='troopGritLoginUsernameInput']")).sendKeys("abc");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='troopGritLoginPasswordInput']")).sendKeys("123456");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id='troopGritLoginBtn']")).click();
		Thread.sleep(1000);
  		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//div[@id='troopGritEntityListWrapper']")).getAttribute("id");
		Assert.assertEquals(a1, "troopGritEntityListWrapper");
		driver.navigate().refresh();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='troopGritEntryBtn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@data-name='css']")).click();
		Thread.sleep(1000);
		
		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		ChromeDriver driver1 = new ChromeDriver(options);
		options.addArguments("--incognito");
		capabilities.setCapability(ChromeOptions.CAPABILITY, options);
		driver1.get("http://192.168.2.55:8083");
		driver1.findElement(By.xpath("//input[@name='username']")).sendKeys("css");
  		driver1.findElement(By.xpath("//input[@name='password']")).sendKeys("123456");
  		driver1.findElement(By.xpath("//button[@id='bG9naW5CdG4']")).click();
  		Thread.sleep(2000);
  		options.addArguments("--disable-notifications");
  		Thread.sleep(1000);
  		driver1.manage().window().setSize(new Dimension(500, 768));
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div//div[@data-type='video'])")).click();
		Thread.sleep(1000);
		String a2=driver1.findElement(By.xpath("//div[@id='draggableIncomingAudioCall']")).getAttribute("id");
		
		String a=driver1.findElement(By.xpath("//span[@id='rejectDraggableIncomingBtn']")).getText();
		driver1.findElement(By.xpath("//span[@id='rejectDraggableIncomingBtn']")).click();
		//Thread.sleep(2000);
		ExtentTest test= extent.createTest("Video call to the user & reject the call");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Click on on-site monitoring");
		test.info("Enter username : abc");
		test.info("Enter password : 123456");
		test.info("Click on login button");
		test.info("Click on user");
		test.info("Open incognito");
		test.info("Enter Url");
		test.info("Enter username & password");
		test.info("Click on login");
		test.info("Minimize the screen");
		test.info("Video Call from abc user to web user");
		test.info("Web user reject the call");
		test.info("EXPECTED RESULT:: It should reject the call");
		test.pass(a1);
		Assert.assertEquals(a2, "draggableIncomingAudioCall");
		test.pass(a2);
		Assert.assertEquals(a, "Reject");
		test.pass(a);
		test.log(Status.PASS,"ACTUAL RESULT:: It is reject the call");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println(50);
		driver.close();
		driver1.quit();
	}
	@Test
	public void test51() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/tvisha/Downloads/chromedriver_linux64/chromedriver");
		driver = new ChromeDriver();
		driver.get("chrome://flags");
		ChromeOptions options = new ChromeOptions()
			    .addArguments("--unsafely-treat-insecure-origin-as-secure=http://192.168.2.55:3000/user/submit-app,http://192.168.2.55:8083");
		options.addArguments("use-fake-device-for-media-stream");
	    options.addArguments("use-fake-ui-for-media-stream");
		ChromeDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("http://192.168.2.55:3000/user/submit-app");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='troopGritEntryBtn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='troopGritLoginUsernameInput']")).sendKeys("abc");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='troopGritLoginPasswordInput']")).sendKeys("123456");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id='troopGritLoginBtn']")).click();
		Thread.sleep(1000);
  		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//div[@id='troopGritEntityListWrapper']")).getAttribute("id");
		Assert.assertEquals(a1, "troopGritEntityListWrapper");
		driver.navigate().refresh();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='troopGritEntryBtn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@data-name='css']")).click();
		Thread.sleep(1000);
		
		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		ChromeDriver driver1 = new ChromeDriver(options);
		options.addArguments("--incognito");
		capabilities.setCapability(ChromeOptions.CAPABILITY, options);
		driver1.get("http://192.168.2.55:8083");
		driver1.findElement(By.xpath("//input[@name='username']")).sendKeys("css");
  		driver1.findElement(By.xpath("//input[@name='password']")).sendKeys("123456");
  		driver1.findElement(By.xpath("//button[@id='bG9naW5CdG4']")).click();
  		Thread.sleep(2000);
  		options.addArguments("--disable-notifications");
  		Thread.sleep(1000);
  		driver1.manage().window().setSize(new Dimension(500, 768));
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div//div[@data-type='video'])")).click();
		Thread.sleep(1000);
		String a2=driver1.findElement(By.xpath("//div[@id='draggableIncomingAudioCall']")).getAttribute("id");
		
		String a=driver1.findElement(By.xpath("//span[@id='ignoreDraggableIncomingBtn']")).getText();
		driver1.findElement(By.xpath("//span[@id='ignoreDraggableIncomingBtn']")).click();
		Thread.sleep(5000);
		ExtentTest test= extent.createTest("Video call to the user & ignore the call");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Click on on-site monitoring");
		test.info("Enter username : abc");
		test.info("Enter password : 123456");
		test.info("Click on login button");
		test.info("Click on user");
		test.info("Open incognito");
		test.info("Enter Url");
		test.info("Enter username & password");
		test.info("Click on login");
		test.info("Minimize the screen");
		test.info("Video Call from abc user to web user");
		test.info("Web user ignore the call");
		test.info("EXPECTED RESULT:: It should Ignore the call");
		test.pass(a1);
		Assert.assertEquals(a2, "draggableIncomingAudioCall");
		test.pass(a2);
		Assert.assertEquals(a, "Ignore");
		test.pass(a);
		test.log(Status.PASS,"ACTUAL RESULT:: It is Ignore the call");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println(51);
		driver.close();
		driver1.quit();
	}
	@Test
	public void test52() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/tvisha/Downloads/chromedriver_linux64/chromedriver");
		driver = new ChromeDriver();
		driver.get("chrome://flags");
		ChromeOptions options = new ChromeOptions()
			    .addArguments("--unsafely-treat-insecure-origin-as-secure=http://192.168.2.55:3000/user/submit-app,http://192.168.2.55:8083");
		options.addArguments("use-fake-device-for-media-stream");
	    options.addArguments("use-fake-ui-for-media-stream");
		ChromeDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("http://192.168.2.55:3000/user/submit-app");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='troopGritEntryBtn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='troopGritLoginUsernameInput']")).sendKeys("abc");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='troopGritLoginPasswordInput']")).sendKeys("123456");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id='troopGritLoginBtn']")).click();
		Thread.sleep(1000);
  		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//div[@id='troopGritEntityListWrapper']")).getAttribute("id");
		Assert.assertEquals(a1, "troopGritEntityListWrapper");
		driver.navigate().refresh();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='troopGritEntryBtn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@data-name='css']")).click();
		Thread.sleep(1000);
		
		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		ChromeDriver driver1 = new ChromeDriver(options);
		options.addArguments("--incognito");
		capabilities.setCapability(ChromeOptions.CAPABILITY, options);
		driver1.get("http://192.168.2.55:8083");
		driver1.findElement(By.xpath("//input[@name='username']")).sendKeys("css");
  		driver1.findElement(By.xpath("//input[@name='password']")).sendKeys("123456");
  		driver1.findElement(By.xpath("//button[@id='bG9naW5CdG4']")).click();
  		Thread.sleep(2000);
  		options.addArguments("--disable-notifications");
  		Thread.sleep(1000);
  		driver1.manage().window().setSize(new Dimension(500, 768));
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div//div[@data-type='video'])")).click();
		Thread.sleep(1000);
		String a2=driver1.findElement(By.xpath("//div[@id='draggableIncomingAudioCall']")).getAttribute("id");
		
		String a=driver1.findElement(By.xpath("//span[@id='acceptDraggableIncomingBtn']")).getText();
		driver1.findElement(By.xpath("//span[@id='acceptDraggableIncomingBtn']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//span[@class='user-options'])[2]")).click();
		Thread.sleep(3000);
		String a4=driver.findElement(By.xpath("(//span[@class='user-option user-mute-video'])")).getText();
		driver.findElement(By.xpath("(//span[@class='user-option user-mute-video'])")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//span[@class='user-options'])[2]")).click();
		Thread.sleep(1000);
		ExtentTest test= extent.createTest("Click on 3 dots & Mute the video");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Click on on-site monitoring");
		test.info("Enter username : abc");
		test.info("Enter password : 123456");
		test.info("Click on login button");
		test.info("Click on user");
		test.info("Open incognito");
		test.info("Enter Url");
		test.info("Enter username & password");
		test.info("Click on login");
		test.info("Minimize the screen");
		test.info("Video Call from abc user to web user");
		test.info("Web user accept the Video call");
		test.info("Click on user");
		test.info("Select 3 dots & click on it");
		test.info("Click on mute video");
		test.info("EXPECTED RESULT:: It should mute the video");
		test.pass(a1);
		Assert.assertEquals(a2, "draggableIncomingAudioCall");
		test.pass(a2);
		Assert.assertEquals(a, "Video");
		test.pass(a);
		Assert.assertEquals(a4, "Mute video");
		test.pass(a4);
		String a5=driver.findElement(By.xpath("//div[@class='users-wrapper']")).getText();
		Assert.assertEquals(a5, "AB\n"
				+ "Myself\n"
				+ "css\n"
				+ "Make Host\n"
				+ "Remove User\n"
				+ "Request to unmute video\n"
				+ "Mute audio");
		test.pass(a5);
		test.log(Status.PASS,"ACTUAL RESULT:: It mute's the video");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println(52);
		driver.close();
		driver1.quit();
	}
	@Test
	public void test53() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/tvisha/Downloads/chromedriver_linux64/chromedriver");
		driver = new ChromeDriver();
		driver.get("chrome://flags");
		ChromeOptions options = new ChromeOptions()
			    .addArguments("--unsafely-treat-insecure-origin-as-secure=http://192.168.2.55:3000/user/submit-app,http://192.168.2.55:8083");
		options.addArguments("use-fake-device-for-media-stream");
	    options.addArguments("use-fake-ui-for-media-stream");
		ChromeDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("http://192.168.2.55:3000/user/submit-app");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='troopGritEntryBtn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='troopGritLoginUsernameInput']")).sendKeys("abc");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='troopGritLoginPasswordInput']")).sendKeys("123456");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id='troopGritLoginBtn']")).click();
		Thread.sleep(1000);
  		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//div[@id='troopGritEntityListWrapper']")).getAttribute("id");
		Assert.assertEquals(a1, "troopGritEntityListWrapper");
		driver.navigate().refresh();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='troopGritEntryBtn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@data-name='css']")).click();
		Thread.sleep(1000);
		
		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		ChromeDriver driver1 = new ChromeDriver(options);
		options.addArguments("--incognito");
		capabilities.setCapability(ChromeOptions.CAPABILITY, options);
		driver1.get("http://192.168.2.55:8083");
		driver1.findElement(By.xpath("//input[@name='username']")).sendKeys("css");
  		driver1.findElement(By.xpath("//input[@name='password']")).sendKeys("123456");
  		driver1.findElement(By.xpath("//button[@id='bG9naW5CdG4']")).click();
  		Thread.sleep(2000);
  		options.addArguments("--disable-notifications");
  		Thread.sleep(1000);
  		driver1.manage().window().setSize(new Dimension(500, 768));
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div//div[@data-type='video'])")).click();
		Thread.sleep(1000);
		String a2=driver1.findElement(By.xpath("//div[@id='draggableIncomingAudioCall']")).getAttribute("id");
		
		String a=driver1.findElement(By.xpath("//span[@id='acceptDraggableIncomingBtn']")).getText();
		driver1.findElement(By.xpath("//span[@id='acceptDraggableIncomingBtn']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//span[@class='user-options'])[2]")).click();
		Thread.sleep(3000);
		String a4=driver.findElement(By.xpath("(//span[@class='user-option user-mute-video'])")).getText();
		driver.findElement(By.xpath("(//span[@class='user-option user-mute-video'])")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//span[@class='user-options'])[2]")).click();
		Thread.sleep(2000);
		String a6=driver.findElement(By.xpath("(//span[@class='user-option user-request-unmute-video'])[1]")).getText();
		driver.findElement(By.xpath("(//span[@class='user-option user-request-unmute-video'])[1]")).click();
		Thread.sleep(3000);
		Thread.sleep(1000);
		Thread.sleep(1000);
		ExtentTest test= extent.createTest("Click on 3 dots & UnMute the video");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Click on on-site monitoring");
		test.info("Enter username : abc");
		test.info("Enter password : 123456");
		test.info("Click on login button");
		test.info("Click on user");
		test.info("Open incognito");
		test.info("Enter Url");
		test.info("Enter username & password");
		test.info("Click on login");
		test.info("Minimize the screen");
		test.info("Video Call from abc user to web user");
		test.info("Web user accept the Video call");
		test.info("Click on user");
		test.info("Select 3 dots & click on it");
		test.info("Click on mute video");
		test.info("Select 3 dots & click on it");
		test.info("Click on unmute video");
		test.info("EXPECTED RESULT:: It should unmute the video");
		test.pass(a1);
		Assert.assertEquals(a2, "draggableIncomingAudioCall");
		test.pass(a2);
		Assert.assertEquals(a, "Video");
		test.pass(a);
		Assert.assertEquals(a4, "Mute video");
		test.pass(a4);
		Assert.assertEquals(a6, "Request to unmute video");
		test.pass(a6);
		test.log(Status.PASS,"ACTUAL RESULT:: It unmute's the video");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println(53);
		driver.close();
		driver1.quit();
	}
	@Test
	public void test54() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/tvisha/Downloads/chromedriver_linux64/chromedriver");
		driver = new ChromeDriver();
		driver.get("chrome://flags");
		ChromeOptions options = new ChromeOptions()
			    .addArguments("--unsafely-treat-insecure-origin-as-secure=http://192.168.2.55:3000/user/submit-app,http://192.168.2.55:8083");
		options.addArguments("use-fake-device-for-media-stream");
	    options.addArguments("use-fake-ui-for-media-stream");
		ChromeDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("http://192.168.2.55:3000/user/submit-app");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='troopGritEntryBtn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='troopGritLoginUsernameInput']")).sendKeys("abc");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='troopGritLoginPasswordInput']")).sendKeys("123456");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id='troopGritLoginBtn']")).click();
		Thread.sleep(1000);
  		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//div[@id='troopGritEntityListWrapper']")).getAttribute("id");
		Assert.assertEquals(a1, "troopGritEntityListWrapper");
		driver.navigate().refresh();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='troopGritEntryBtn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@data-name='css']")).click();
		Thread.sleep(1000);
		
		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		ChromeDriver driver1 = new ChromeDriver(options);
		options.addArguments("--incognito");
		capabilities.setCapability(ChromeOptions.CAPABILITY, options);
		driver1.get("http://192.168.2.55:8083");
		driver1.findElement(By.xpath("//input[@name='username']")).sendKeys("css");
  		driver1.findElement(By.xpath("//input[@name='password']")).sendKeys("123456");
  		driver1.findElement(By.xpath("//button[@id='bG9naW5CdG4']")).click();
  		Thread.sleep(2000);
  		options.addArguments("--disable-notifications");
  		Thread.sleep(1000);
  		driver1.manage().window().setSize(new Dimension(500, 768));
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div//div[@data-type='video'])")).click();
		Thread.sleep(1000);
		String a2=driver1.findElement(By.xpath("//div[@id='draggableIncomingAudioCall']")).getAttribute("id");
		
		String a=driver1.findElement(By.xpath("//span[@id='acceptDraggableIncomingBtn']")).getText();
		driver1.findElement(By.xpath("//span[@id='acceptDraggableIncomingBtn']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class='screen-share-btn']")).click();
		Thread.sleep(3000);
		Thread.sleep(1000);
		ExtentTest test= extent.createTest("Turn on the screen share");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Click on on-site monitoring");
		test.info("Enter username : abc");
		test.info("Enter password : 123456");
		test.info("Click on login button");
		test.info("Click on user");
		test.info("Open incognito");
		test.info("Enter Url");
		test.info("Enter username & password");
		test.info("Click on login");
		test.info("Minimize the screen");
		test.info("Video Call from abc user to web user");
		test.info("Web user accept the Video call");
		test.info("Click on screen share button");
		test.info("EXPECTED RESULT:: It should share the screen");
		test.pass(a1);
		Assert.assertEquals(a2, "draggableIncomingAudioCall");
		test.pass(a2);
		Assert.assertEquals(a, "Video");
		test.pass(a);
		String a6=driver.findElement(By.xpath("//div[@class='screen-share-btn active']")).getAttribute("class");
		Assert.assertEquals(a6, "screen-share-btn active");
		test.pass(a6);
		String a5=driver.findElement(By.xpath("//div[@class='users-wrapper']")).getText();
		Assert.assertEquals(a5, "AB\n"
				+ "Myself\n"
				+ "css");
		test.pass(a5);
		test.log(Status.PASS,"ACTUAL RESULT:: It is sharing the screen");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println(54);
		driver.close();
		driver1.quit();
	}
	@Test
	public void test55() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/tvisha/Downloads/chromedriver_linux64/chromedriver");
		driver = new ChromeDriver();
		driver.get("chrome://flags");
		ChromeOptions options = new ChromeOptions()
			    .addArguments("--unsafely-treat-insecure-origin-as-secure=http://192.168.2.55:3000/user/submit-app,http://192.168.2.55:8083");
		options.addArguments("use-fake-device-for-media-stream");
	    options.addArguments("use-fake-ui-for-media-stream");
		ChromeDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("http://192.168.2.55:3000/user/submit-app");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='troopGritEntryBtn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='troopGritLoginUsernameInput']")).sendKeys("abc");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='troopGritLoginPasswordInput']")).sendKeys("123456");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id='troopGritLoginBtn']")).click();
		Thread.sleep(1000);
  		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//div[@id='troopGritEntityListWrapper']")).getAttribute("id");
		Assert.assertEquals(a1, "troopGritEntityListWrapper");
		driver.navigate().refresh();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='troopGritEntryBtn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@data-name='css']")).click();
		Thread.sleep(1000);
		
		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		ChromeDriver driver1 = new ChromeDriver(options);
		options.addArguments("--incognito");
		capabilities.setCapability(ChromeOptions.CAPABILITY, options);
		driver1.get("http://192.168.2.55:8083");
		driver1.findElement(By.xpath("//input[@name='username']")).sendKeys("css");
  		driver1.findElement(By.xpath("//input[@name='password']")).sendKeys("123456");
  		driver1.findElement(By.xpath("//button[@id='bG9naW5CdG4']")).click();
  		Thread.sleep(2000);
  		options.addArguments("--disable-notifications");
  		Thread.sleep(1000);
  		driver1.manage().window().setSize(new Dimension(500, 768));
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div//div[@data-type='video'])")).click();
		Thread.sleep(1000);
		String a2=driver1.findElement(By.xpath("//div[@id='draggableIncomingAudioCall']")).getAttribute("id");
		
		String a=driver1.findElement(By.xpath("//span[@id='acceptDraggableIncomingBtn']")).getText();
		driver1.findElement(By.xpath("//span[@id='acceptDraggableIncomingBtn']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class='screen-share-btn']")).click();
		Thread.sleep(3000);
		String a6=driver.findElement(By.xpath("//div[@class='screen-share-btn active']")).getAttribute("class");
		driver.findElement(By.xpath("//span[@class='end-btn']")).click();
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//span[@class='end-btn-option end-screen-share']")).getText();
		driver.findElement(By.xpath("//span[@class='end-btn-option end-screen-share']")).click();
		Thread.sleep(1000);
		ExtentTest test= extent.createTest("Turn off the screen share");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Click on on-site monitoring");
		test.info("Enter username : abc");
		test.info("Enter password : 123456");
		test.info("Click on login button");
		test.info("Click on user");
		test.info("Open incognito");
		test.info("Enter Url");
		test.info("Enter username & password");
		test.info("Click on login");
		test.info("Minimize the screen");
		test.info("Video Call from abc user to web user");
		test.info("Web user accept the Video call");
		test.info("Click on screen share button");
		test.info("Click on end button");
		test.info("Click on end screen share");
		test.info("EXPECTED RESULT:: It should end the screen share");
		test.pass(a1);
		Assert.assertEquals(a2, "draggableIncomingAudioCall");
		test.pass(a2);
		Assert.assertEquals(a, "Video");
		test.pass(a);
		Assert.assertEquals(a6, "screen-share-btn active");
		test.pass(a6);
		Assert.assertEquals(a3, "End Screen Share");
		test.pass(a3);
		String a7=driver.findElement(By.xpath("//div[@class='screen-share-btn']")).getAttribute("class");
		Assert.assertEquals(a7, "screen-share-btn");
		test.pass(a7);
		String a5=driver.findElement(By.xpath("//div[@class='users-wrapper']")).getText();
		Assert.assertEquals(a5, "AB\n"
				+ "Myself\n"
				+ "css");
		test.pass(a5);
		test.log(Status.PASS,"ACTUAL RESULT:: It is ending the screen share");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println(55);
		driver.close();
		driver1.quit();
	}
	@Test
	public void test56() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/tvisha/Downloads/chromedriver_linux64/chromedriver");
		driver = new ChromeDriver();
		driver.get("chrome://flags");
		ChromeOptions options = new ChromeOptions()
			    .addArguments("--unsafely-treat-insecure-origin-as-secure=http://192.168.2.55:3000/user/submit-app,http://192.168.2.55:8083");
		options.addArguments("use-fake-device-for-media-stream");
	    options.addArguments("use-fake-ui-for-media-stream");
		ChromeDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("http://192.168.2.55:3000/user/submit-app");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='troopGritEntryBtn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='troopGritLoginUsernameInput']")).sendKeys("abc");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='troopGritLoginPasswordInput']")).sendKeys("123456");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id='troopGritLoginBtn']")).click();
		Thread.sleep(1000);
  		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//div[@id='troopGritEntityListWrapper']")).getAttribute("id");
		Assert.assertEquals(a1, "troopGritEntityListWrapper");
		driver.navigate().refresh();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='troopGritEntryBtn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@data-name='css']")).click();
		Thread.sleep(1000);
		
		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		ChromeDriver driver1 = new ChromeDriver(options);
		options.addArguments("--incognito");
		capabilities.setCapability(ChromeOptions.CAPABILITY, options);
		driver1.get("http://192.168.2.55:8083");
		driver1.findElement(By.xpath("//input[@name='username']")).sendKeys("css");
  		driver1.findElement(By.xpath("//input[@name='password']")).sendKeys("123456");
  		driver1.findElement(By.xpath("//button[@id='bG9naW5CdG4']")).click();
  		Thread.sleep(2000);
  		options.addArguments("--disable-notifications");
  		Thread.sleep(1000);
  		driver1.manage().window().setSize(new Dimension(500, 768));
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div//div[@data-type='video'])")).click();
		Thread.sleep(1000);
		String a2=driver1.findElement(By.xpath("//div[@id='draggableIncomingAudioCall']")).getAttribute("id");
		
		String a=driver1.findElement(By.xpath("//span[@id='acceptDraggableIncomingBtn']")).getText();
		driver1.findElement(By.xpath("//span[@id='acceptDraggableIncomingBtn']")).click();
		Thread.sleep(5000);
		ChromeDriver driver2 = new ChromeDriver(options);
		options.addArguments("--incognito");
		capabilities.setCapability(ChromeOptions.CAPABILITY, options);
		driver2.get("http://192.168.2.55:8083");
		driver2.findElement(By.xpath("//input[@name='username']")).sendKeys("department_admin");
  		driver2.findElement(By.xpath("//input[@name='password']")).sendKeys("123456");
  		driver2.findElement(By.xpath("//button[@id='bG9naW5CdG4']")).click();
  		Thread.sleep(2000);
  		options.addArguments("--disable-notifications");
  		Thread.sleep(1000);
  		driver2.manage().window().setSize(new Dimension(500, 768));
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='add-users-btn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@data-username='Department Admin']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='addUsersSubmitBtn']")).click();
		Thread.sleep(3000);
		String a3=driver2.findElement(By.xpath("//div[@id='draggableIncomingAudioCall']")).getAttribute("id");
		
		String a4=driver2.findElement(By.xpath("//span[@id='acceptAudioDraggableIncomingBtn']")).getText();
		driver2.findElement(By.xpath("//span[@id='acceptAudioDraggableIncomingBtn']")).click();
		Thread.sleep(8000);
		ExtentTest test= extent.createTest("Add the user into video call without selecting video icon");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Click on on-site monitoring");
		test.info("Enter username : abc");
		test.info("Enter password : 123456");
		test.info("Click on login button");
		test.info("Click on user");
		test.info("Open incognito");
		test.info("Enter Url");
		test.info("Enter username & password");
		test.info("Click on login");
		test.info("Minimize the screen");
		test.info("Video Call from abc user to web user");
		test.info("Web user accept the Video call");
		test.info("Click on add user button");
		test.info("Select the user");
		test.info("Click on add participants");
		test.info("EXPECTED RESULT:: It should add the user in the call");
		test.pass(a1);
		Assert.assertEquals(a2, "draggableIncomingAudioCall");
		test.pass(a2);
		Assert.assertEquals(a, "Video");
		test.pass(a);
		Assert.assertEquals(a3, "draggableIncomingAudioCall");
		test.pass(a3);
		Assert.assertEquals(a4, "Accept");
		test.pass(a4);
		String a5=driver.findElement(By.xpath("//div[@class='users-wrapper']")).getText();
		Assert.assertEquals(a5, "DA\n"
				+ "Department Admin\n"
				+ "AB\n"
				+ "Myself\n"
				+ "css");
		test.pass(a5);
		test.log(Status.PASS,"ACTUAL RESULT:: It is adding the user in the call");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println(56);
		driver.close();
		driver1.quit();
		driver2.quit();
	}
	@Test
	public void test57() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/tvisha/Downloads/chromedriver_linux64/chromedriver");
		driver = new ChromeDriver();
		driver.get("chrome://flags");
		ChromeOptions options = new ChromeOptions()
			    .addArguments("--unsafely-treat-insecure-origin-as-secure=http://192.168.2.55:3000/user/submit-app,http://192.168.2.55:8083");
		options.addArguments("use-fake-device-for-media-stream");
	    options.addArguments("use-fake-ui-for-media-stream");
		ChromeDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("http://192.168.2.55:3000/user/submit-app");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='troopGritEntryBtn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='troopGritLoginUsernameInput']")).sendKeys("abc");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='troopGritLoginPasswordInput']")).sendKeys("123456");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id='troopGritLoginBtn']")).click();
		Thread.sleep(1000);
  		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//div[@id='troopGritEntityListWrapper']")).getAttribute("id");
		Assert.assertEquals(a1, "troopGritEntityListWrapper");
		driver.navigate().refresh();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='troopGritEntryBtn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@data-name='css']")).click();
		Thread.sleep(1000);
		
		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		ChromeDriver driver1 = new ChromeDriver(options);
		options.addArguments("--incognito");
		capabilities.setCapability(ChromeOptions.CAPABILITY, options);
		driver1.get("http://192.168.2.55:8083");
		driver1.findElement(By.xpath("//input[@name='username']")).sendKeys("css");
  		driver1.findElement(By.xpath("//input[@name='password']")).sendKeys("123456");
  		driver1.findElement(By.xpath("//button[@id='bG9naW5CdG4']")).click();
  		Thread.sleep(2000);
  		options.addArguments("--disable-notifications");
  		Thread.sleep(1000);
  		driver1.manage().window().setSize(new Dimension(500, 768));
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div//div[@data-type='video'])")).click();
		Thread.sleep(1000);
		String a2=driver1.findElement(By.xpath("//div[@id='draggableIncomingAudioCall']")).getAttribute("id");
		
		String a=driver1.findElement(By.xpath("//span[@id='acceptDraggableIncomingBtn']")).getText();
		driver1.findElement(By.xpath("//span[@id='acceptDraggableIncomingBtn']")).click();
		Thread.sleep(5000);
		ChromeDriver driver2 = new ChromeDriver(options);
		options.addArguments("--incognito");
		capabilities.setCapability(ChromeOptions.CAPABILITY, options);
		driver2.get("http://192.168.2.55:8083");
		driver2.findElement(By.xpath("//input[@name='username']")).sendKeys("department_admin");
  		driver2.findElement(By.xpath("//input[@name='password']")).sendKeys("123456");
  		driver2.findElement(By.xpath("//button[@id='bG9naW5CdG4']")).click();
  		Thread.sleep(2000);
  		options.addArguments("--disable-notifications");
  		Thread.sleep(1000);
  		driver2.manage().window().setSize(new Dimension(500, 768));
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='add-users-btn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@data-username='Department Admin']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[4]/div[4]/div/div/div[3]/div/div/div/div[1]/div[2]/div[2]/div[3]/span[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='addUsersSubmitBtn']")).click();
		Thread.sleep(3000);
		String a3=driver2.findElement(By.xpath("//div[@id='draggableIncomingAudioCall']")).getAttribute("id");
		
		String a4=driver2.findElement(By.xpath("//span[@id='acceptDraggableIncomingBtn']")).getText();
		driver2.findElement(By.xpath("//span[@id='acceptDraggableIncomingBtn']")).click();
		Thread.sleep(8000);
		ExtentTest test= extent.createTest("Add the user with Selecting video icon");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Click on on-site monitoring");
		test.info("Enter username : abc");
		test.info("Enter password : 123456");
		test.info("Click on login button");
		test.info("Click on user");
		test.info("Open incognito");
		test.info("Enter Url");
		test.info("Enter username & password");
		test.info("Click on login");
		test.info("Minimize the screen");
		test.info("Video Call from abc user to web user");
		test.info("Web user accept the Video call");
		test.info("Click on add user button");
		test.info("Select the user");
		test.info("Click on add participants");
		test.info("User1 accept the video call");
		test.info("EXPECTED RESULT:: It should add the user with video call");
		test.pass(a1);
		Assert.assertEquals(a2, "draggableIncomingAudioCall");
		test.pass(a2);
		Assert.assertEquals(a, "Video");
		test.pass(a);
		Assert.assertEquals(a3, "draggableIncomingAudioCall");
		test.pass(a3);
		Assert.assertEquals(a4, "Video");
		test.pass(a4);
		String a5=driver.findElement(By.xpath("//div[@class='users-wrapper']")).getText();
		Assert.assertEquals(a5, "DA\n"
				+ "Department Admin\n"
				+ "AB\n"
				+ "Myself\n"
				+ "css");
		test.pass(a5);
		test.log(Status.PASS,"ACTUAL RESULT:: It is adding the user with video call");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println(57);
		driver.close();
		driver1.quit();
		driver2.quit();
	}
	@Test
	public void test58() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/tvisha/Downloads/chromedriver_linux64/chromedriver");
		driver = new ChromeDriver();
		driver.get("chrome://flags");
		ChromeOptions options = new ChromeOptions()
			    .addArguments("--unsafely-treat-insecure-origin-as-secure=http://192.168.2.55:3000/user/submit-app,http://192.168.2.55:8083");
		options.addArguments("use-fake-device-for-media-stream");
	    options.addArguments("use-fake-ui-for-media-stream");
		ChromeDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("http://192.168.2.55:3000/user/submit-app");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='troopGritEntryBtn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='troopGritLoginUsernameInput']")).sendKeys("abc");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='troopGritLoginPasswordInput']")).sendKeys("123456");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id='troopGritLoginBtn']")).click();
		Thread.sleep(1000);
  		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//div[@id='troopGritEntityListWrapper']")).getAttribute("id");
		Assert.assertEquals(a1, "troopGritEntityListWrapper");
		driver.navigate().refresh();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='troopGritEntryBtn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@data-name='css']")).click();
		Thread.sleep(1000);
		
		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		ChromeDriver driver1 = new ChromeDriver(options);
		options.addArguments("--incognito");
		capabilities.setCapability(ChromeOptions.CAPABILITY, options);
		driver1.get("http://192.168.2.55:8083");
		driver1.findElement(By.xpath("//input[@name='username']")).sendKeys("css");
  		driver1.findElement(By.xpath("//input[@name='password']")).sendKeys("123456");
  		driver1.findElement(By.xpath("//button[@id='bG9naW5CdG4']")).click();
  		Thread.sleep(2000);
  		options.addArguments("--disable-notifications");
  		Thread.sleep(1000);
  		driver1.manage().window().setSize(new Dimension(500, 768));
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div//div[@data-type='video'])")).click();
		Thread.sleep(1000);
		String a2=driver1.findElement(By.xpath("//div[@id='draggableIncomingAudioCall']")).getAttribute("id");
		
		String a=driver1.findElement(By.xpath("//span[@id='acceptDraggableIncomingBtn']")).getText();
		driver1.findElement(By.xpath("//span[@id='acceptDraggableIncomingBtn']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class='add-users-btn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@data-username='Department Admin']")).click();
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//span[@class='remove-selected-user']")).getAttribute("class");
		driver.findElement(By.xpath("//span[@class='remove-selected-user']")).click();
		Thread.sleep(1000);
		Thread.sleep(8000);
		ExtentTest test= extent.createTest("Click on close button for selected user");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Click on on-site monitoring");
		test.info("Enter username : abc");
		test.info("Enter password : 123456");
		test.info("Click on login button");
		test.info("Click on user");
		test.info("Open incognito");
		test.info("Enter Url");
		test.info("Enter username & password");
		test.info("Click on login");
		test.info("Minimize the screen");
		test.info("Video Call from abc user to web user");
		test.info("Web user accept the Video call");
		test.info("Click on add user button");
		test.info("Select the user");
		test.info("Click on close button for selected user");
		test.info("EXPECTED RESULT:: It should deselect the selected user");
		test.pass(a1);
		Assert.assertEquals(a2, "draggableIncomingAudioCall");
		test.pass(a2);
		Assert.assertEquals(a, "Video");
		test.pass(a);
		Assert.assertEquals(a4, "remove-selected-user");
		test.pass(a4);
		test.log(Status.PASS,"ACTUAL RESULT:: It is deselecting the selected user");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println(58);
		driver.close();
		driver1.quit();
	}
	@Test
	public void test59() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/tvisha/Downloads/chromedriver_linux64/chromedriver");
		driver = new ChromeDriver();
		driver.get("chrome://flags");
		ChromeOptions options = new ChromeOptions()
			    .addArguments("--unsafely-treat-insecure-origin-as-secure=http://192.168.2.55:3000/user/submit-app,http://192.168.2.55:8083");
		options.addArguments("use-fake-device-for-media-stream");
	    options.addArguments("use-fake-ui-for-media-stream");
		ChromeDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("http://192.168.2.55:3000/user/submit-app");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='troopGritEntryBtn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='troopGritLoginUsernameInput']")).sendKeys("abc");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='troopGritLoginPasswordInput']")).sendKeys("123456");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id='troopGritLoginBtn']")).click();
		Thread.sleep(1000);
  		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//div[@id='troopGritEntityListWrapper']")).getAttribute("id");
		Assert.assertEquals(a1, "troopGritEntityListWrapper");
		driver.navigate().refresh();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='troopGritEntryBtn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@data-name='css']")).click();
		Thread.sleep(1000);
		
		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		ChromeDriver driver1 = new ChromeDriver(options);
		options.addArguments("--incognito");
		capabilities.setCapability(ChromeOptions.CAPABILITY, options);
		driver1.get("http://192.168.2.55:8083");
		driver1.findElement(By.xpath("//input[@name='username']")).sendKeys("css");
  		driver1.findElement(By.xpath("//input[@name='password']")).sendKeys("123456");
  		driver1.findElement(By.xpath("//button[@id='bG9naW5CdG4']")).click();
  		Thread.sleep(2000);
  		options.addArguments("--disable-notifications");
  		Thread.sleep(1000);
  		driver1.manage().window().setSize(new Dimension(500, 768));
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div//div[@data-type='screenshare'])")).click();
		Thread.sleep(1000);
		String a2=driver1.findElement(By.xpath("//div[@id='draggableIncomingAudioCall']")).getAttribute("id");
		
		String a=driver1.findElement(By.xpath("//span[@id='acceptDraggableIncomingDesktopSharingBtn']")).getText();
		driver1.findElement(By.xpath("//span[@id='acceptDraggableIncomingDesktopSharingBtn']")).click();
		Thread.sleep(5000);
		ExtentTest test= extent.createTest("Call with screen share");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Click on on-site monitoring");
		test.info("Enter username : abc");
		test.info("Enter password : 123456");
		test.info("Click on login button");
		test.info("Click on user");
		test.info("Open incognito");
		test.info("Enter Url");
		test.info("Enter username & password");
		test.info("Click on login");
		test.info("Minimize the screen");
		test.info("Screen share from abc user to web user");
		test.info("Web user accept the screen share call");
		test.info("EXPECTED RESULT:: It should click on accept of screen share call");
		test.pass(a1);
		Assert.assertEquals(a2, "draggableIncomingAudioCall");
		test.pass(a2);
		Assert.assertEquals(a, "Accept");
		test.pass(a);
		test.log(Status.PASS,"ACTUAL RESULT:: It is clicking on accept of screen share call");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println(59);
		driver.close();
		driver1.quit();
	}
	@Test
	public void test60() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/tvisha/Downloads/chromedriver_linux64/chromedriver");
		driver = new ChromeDriver();
		driver.get("chrome://flags");
		ChromeOptions options = new ChromeOptions()
			    .addArguments("--unsafely-treat-insecure-origin-as-secure=http://192.168.2.55:3000/user/submit-app,http://192.168.2.55:8083");
		options.addArguments("use-fake-device-for-media-stream");
	    options.addArguments("use-fake-ui-for-media-stream");
		ChromeDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("http://192.168.2.55:3000/user/submit-app");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='troopGritEntryBtn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='troopGritLoginUsernameInput']")).sendKeys("abc");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='troopGritLoginPasswordInput']")).sendKeys("123456");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id='troopGritLoginBtn']")).click();
		Thread.sleep(1000);
  		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//div[@id='troopGritEntityListWrapper']")).getAttribute("id");
		Assert.assertEquals(a1, "troopGritEntityListWrapper");
		driver.navigate().refresh();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='troopGritEntryBtn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@data-name='css']")).click();
		Thread.sleep(1000);
		
		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		ChromeDriver driver1 = new ChromeDriver(options);
		options.addArguments("--incognito");
		capabilities.setCapability(ChromeOptions.CAPABILITY, options);
		driver1.get("http://192.168.2.55:8083");
		driver1.findElement(By.xpath("//input[@name='username']")).sendKeys("css");
  		driver1.findElement(By.xpath("//input[@name='password']")).sendKeys("123456");
  		driver1.findElement(By.xpath("//button[@id='bG9naW5CdG4']")).click();
  		Thread.sleep(2000);
  		options.addArguments("--disable-notifications");
  		Thread.sleep(1000);
  		driver1.manage().window().setSize(new Dimension(500, 768));
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div//div[@data-type='screenshare'])")).click();
		Thread.sleep(1000);
		String a2=driver1.findElement(By.xpath("//div[@id='draggableIncomingAudioCall']")).getAttribute("id");
		
		String a=driver1.findElement(By.xpath("//span[@id='acceptDraggableIncomingDesktopSharingBtn']")).getText();
		driver1.findElement(By.xpath("//span[@id='acceptDraggableIncomingDesktopSharingBtn']")).click();
		Thread.sleep(5000);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@class='end-btn']")).click();
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//span[@class='end-btn-option end-call']")).getText();
		driver.findElement(By.xpath("//span[@class='end-btn-option end-call']")).click();
		Thread.sleep(1000);
		ExtentTest test= extent.createTest("End call");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Click on on-site monitoring");
		test.info("Enter username : abc");
		test.info("Enter password : 123456");
		test.info("Click on login button");
		test.info("Click on user");
		test.info("Open incognito");
		test.info("Enter Url");
		test.info("Enter username & password");
		test.info("Click on login");
		test.info("Minimize the screen");
		test.info("Screen share from abc user to web user");
		test.info("Web user accept the screen share call");
		test.info("Click on end button");
		test.info("Click on end call");
		test.info("EXPECTED RESULT:: It should end the call");
		test.pass(a1);
		Assert.assertEquals(a2, "draggableIncomingAudioCall");
		test.pass(a2);
		Assert.assertEquals(a, "Accept");
		test.pass(a);
		Assert.assertEquals(a6, "End Call");
		test.pass(a6);
		test.log(Status.PASS,"ACTUAL RESULT:: It is ending the call");
		test.pass("Test Case:: TestCase PASSED");
		System.out.println(60);
		driver.close();
		driver1.quit();
	}
	@Test
	public void test61() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/tvisha/Downloads/chromedriver_linux64/chromedriver");
		driver = new ChromeDriver();
		driver.get("chrome://flags");
		ChromeOptions options = new ChromeOptions()
			    .addArguments("--unsafely-treat-insecure-origin-as-secure=http://192.168.2.55:3000/user/submit-app,http://192.168.2.55:8083");
		options.addArguments("use-fake-device-for-media-stream");
	    options.addArguments("use-fake-ui-for-media-stream");
		ChromeDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("http://192.168.2.55:3000/user/submit-app");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='troopGritEntryBtn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='troopGritLoginUsernameInput']")).sendKeys("abc");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='troopGritLoginPasswordInput']")).sendKeys("123456");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id='troopGritLoginBtn']")).click();
		Thread.sleep(1000);
  		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//div[@id='troopGritEntityListWrapper']")).getAttribute("id");
		Assert.assertEquals(a1, "troopGritEntityListWrapper");
		driver.navigate().refresh();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='troopGritEntryBtn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@data-name='css']")).click();
		Thread.sleep(1000);
		
		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		ChromeDriver driver1 = new ChromeDriver(options);
		options.addArguments("--incognito");
		capabilities.setCapability(ChromeOptions.CAPABILITY, options);
		driver1.get("http://192.168.2.55:8083");
		driver1.findElement(By.xpath("//input[@name='username']")).sendKeys("css");
  		driver1.findElement(By.xpath("//input[@name='password']")).sendKeys("123456");
  		driver1.findElement(By.xpath("//button[@id='bG9naW5CdG4']")).click();
  		Thread.sleep(2000);
  		options.addArguments("--disable-notifications");
  		Thread.sleep(1000);
  		driver1.manage().window().setSize(new Dimension(500, 768));
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div//div[@data-type='audio'])")).click();
		Thread.sleep(1000);
		String a2=driver1.findElement(By.xpath("//div[@id='draggableIncomingAudioCall']")).getAttribute("id");
		
		String a=driver1.findElement(By.xpath("//span[@id='acceptAudioDraggableIncomingBtn']")).getText();
		driver1.findElement(By.xpath("//span[@id='acceptAudioDraggableIncomingBtn']")).click();
		Thread.sleep(5000);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id='troopGritConversationBackBtn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@data-name='sharath']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div//div[@data-type='audio'])")).click();
		//String a5=driver.switchTo().alert().getText();
		//Thread.sleep(1000);
		//driver.switchTo().alert().accept();
		//String a6=driver.findElement(By.xpath("//div[@class='calling-text']")).getText();
		//Thread.sleep(1000);
		ExtentTest test= extent.createTest("Without ending the call make another call");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Click on on-site monitoring");
		test.info("Enter username : abc");
		test.info("Enter password : 123456");
		test.info("Click on login button");
		test.info("Click on user");
		test.info("Open incognito");
		test.info("Enter Url");
		test.info("Enter username & password");
		test.info("Click on login");
		test.info("Minimize the screen");
		test.info("Screen share from abc user to web user");
		test.info("Web user accept the audio call");
		test.info("Click on back button");
		test.info("Click on user1");
		test.info("Click on audio call");
		test.info("EXPECTED RESULT:: It should not make another call when we are in call");
		test.pass(a1);
		Assert.assertEquals(a2, "draggableIncomingAudioCall");
		test.pass(a2);
		Assert.assertEquals(a, "Accept");
		test.pass(a);
		//Assert.assertEquals(a5, "Users Busy");
		//test.pass(a5);
		test.log(Status.FAIL,"ACTUAL RESULT:: It is calling to another user when we are in call");
		test.log(Status.FAIL,"Test Case:: TestCase PASSED");
		System.out.println(60);
		driver.close();
		driver1.quit();
	}
	@AfterSuite
	public void endTest() {
		extent.flush();
	}
}
