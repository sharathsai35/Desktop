package testng;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class NewTest {
	
	WebDriver driver;
	ExtentHtmlReporter htmlReporter;
	ExtentReports Extent;
	
  @BeforeSuite
  public void starttest() {
	  htmlReporter = new ExtentHtmlReporter("Sendmessage.html");
		Extent = new ExtentReports();
		Extent.attachReporter(htmlReporter);
  }
  
  @Test
  public void test2() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver","/home/tvisha/Downloads/chromedriver_linux64/chromedriver");
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("http://192.168.2.55:8081/login");
	  System.out.println("Login into Admin Profile");
	  System.out.println("Deleting sent message from one to one");
	  driver.findElement(By.xpath("//input[@name='email']")).sendKeys("suup@gmail.com");

	  driver.findElement(By.xpath("//input[@name='password']")).sendKeys("123456");

	  driver.findElement(By.xpath("//button[@id='bG9naW5CdG4']")).click();

	  Thread.sleep(5000);

	  driver.findElement(By.xpath("//div[@data-app='dashboard']")).click();

	  driver.switchTo().frame(0);

	  driver.findElement(By.xpath("//div[@data-tab='4']")).click();

	  Thread.sleep(1000);

	  JavascriptExecutor jse=(JavascriptExecutor)driver;

	  jse.executeScript("window.scrollBy(0,500)");

	  Thread.sleep(1000);

	  driver.findElement(By.xpath("//div[@data-value='Delete']")).click();

	  Thread.sleep(1000);

	  driver.findElement(By.xpath("//label[@for='permissionDeleteRadioDisable']")).click();

	  Thread.sleep(1000);

	  driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/div/div[27]/div[2]/div[3]/input\n")).click();

	  Thread.sleep(400);

	  String a=driver.findElement(By.xpath("//div[@class='feedback-section']")).getText();

	  System.out.println(a);

	  assertEquals(a,"Permissions applied");

	  Thread.sleep(200);

	  driver.navigate().refresh();

	  Thread.sleep(5000);

	  System.out.println("Trying to delete sent message from one to one");

	  driver.findElement(By.xpath("//div[@data-name='Yug']")).click();

	  Thread.sleep(500);

	  Actions act=new Actions(driver);

	  WebElement ele=driver.findElement(By.xpath("(//div[@class='conversation-option-wrapper'])[9]"));

	  act.moveToElement(ele).build().perform();

	  Thread.sleep(1000);

	  driver.findElement(By.xpath("(//span[@class='conversation-option-button'])[9]")).click();

	  Thread.sleep(500);

	  driver.findElement(By.xpath("//div[@data-id='1568']")).click();

	  Thread.sleep(500);

	  System.out.println("Trying to delete recieved message from one to one ");

	  driver.findElement(By.xpath("//div[@data-name='shiv']")).click();

	  Thread.sleep(500);

	  WebElement ele2=driver.findElement(By.xpath("(//div[@class='conversation-option-wrapper'])[4]"));

	  act.moveToElement(ele2).build().perform();

	  Thread.sleep(1000);

	  driver.findElement(By.xpath("(//span[@class='conversation-option-button'])[4]")).click();

	  Thread.sleep(500);

	  driver.findElement(By.xpath("//div[@data-id='1574']")).click();

	  Thread.sleep(1000);

	  System.out.println("Trying to delete sent message from Group");

	  driver.findElement(By.xpath("//div[@data-name='Fries']")).click();

	  Thread.sleep(500);

	  WebElement ele3=driver.findElement(By.xpath("(//div[@class='conversation-option-wrapper'])[7]"));

	  act.moveToElement(ele3).build().perform();

	  Thread.sleep(1000);

	  driver.findElement(By.xpath("(//span[@class='conversation-option-button'])[7]")).click();

	  Thread.sleep(500);

	  driver.findElement(By.xpath("//div[@data-id='1536']")).click();

	  Thread.sleep(1000);

	  System.out.println("Trying to delete recieved message from Group");

	  driver.findElement(By.xpath("//div[@data-name='wegr']")).click();

	  Thread.sleep(500);

	  WebElement ele4=driver.findElement(By.xpath("(//div[@class='conversation-option-wrapper'])[10]"));

	  act.moveToElement(ele4).build().perform();

	  Thread.sleep(1000);

	  driver.findElement(By.xpath("(//span[@class='conversation-option-button'])[10]")).click();

	  Thread.sleep(500);

	  driver.findElement(By.xpath("//div[@data-id='1578']")).click();

	  Thread.sleep(1000);

	  System.out.println("Tryinf to delete sent message to orange member");

	  driver.findElement(By.xpath("//div[@data-name='syum']")).click();

	  Thread.sleep(500);

	  WebElement ele5=driver.findElement(By.xpath("(//div[@class='conversation-option-wrapper'])[3]"));

	  act.moveToElement(ele5).build().perform();

	  Thread.sleep(1000);

	  driver.findElement(By.xpath("(//span[@class='conversation-option-button'])[3]")).click();

	  Thread.sleep(500);

	  driver.findElement(By.xpath("//div[@data-id='1583']")).click();

	  Thread.sleep(1000);

	  System.out.println("Trying to delete Recieved message from orange member");

	  driver.findElement(By.xpath("//div[@data-name='Harish']")).click();

	  Thread.sleep(500);

	  WebElement ele6=driver.findElement(By.xpath("(//div[@class='conversation-option-wrapper'])[5]"));

	  act.moveToElement(ele6).build().perform();

	  Thread.sleep(1000);

	  driver.findElement(By.xpath("(//span[@class='conversation-option-button'])[5]")).click();

	  Thread.sleep(500);

	  driver.findElement(By.xpath("//div[@data-id='1588']")).click();

	  Thread.sleep(500);

	  driver.findElement(By.xpath("//div[@title='Logout']")).click();

	  System.out.println("now loging into users profile");

	  driver.findElement(By.xpath("//a[contains(text(),'LOGIN')]")).click();

	  driver.findElement(By.xpath("//input[@name='email']")).sendKeys("mum@gmail.com");

	  driver.findElement(By.xpath("//input[@name='password']")).sendKeys("123456");

	  driver.findElement(By.xpath("//button[@id='bG9naW5CdG4']")).click();

	  Thread.sleep(5000);

	  System.out.println("TRying to delet sent message from one to one ");

	  driver.findElement(By.xpath("//div[@data-name='shiv']")).click();

	  Thread.sleep(500);

	  WebElement ele7=driver.findElement(By.xpath("(//div[@class='conversation-option-wrapper'])[6]"));

	  act.moveToElement(ele7).build().perform();

	  Thread.sleep(1000);

	  driver.findElement(By.xpath("(//span[@class='conversation-option-button'])[6]")).click();

	  Thread.sleep(500);

	  driver.findElement(By.xpath("//div[@data-id='1594']")).click();

	  Thread.sleep(1000);

	  System.out.println("Trying to delete recieved message from one to one ");

	  driver.findElement(By.xpath("//div[@data-name='Sup']")).click();

	  Thread.sleep(500);

	  WebElement ele8=driver.findElement(By.xpath("(//div[@class='conversation-option-wrapper'])[7]"));

	  act.moveToElement(ele8).build().perform();

	  Thread.sleep(1000);

	  driver.findElement(By.xpath("(//span[@class='conversation-option-button'])[7]")).click();

	  Thread.sleep(500);

	  driver.findElement(By.xpath("//div[@data-id='1600']")).click();

	  Thread.sleep(1000);

	  System.out.println("Trying to delete sent message from Group");

	  driver.findElement(By.xpath("//div[@data-name='Fries']")).click();

	  Thread.sleep(500);

	  WebElement ele9=driver.findElement(By.xpath("(//div[@class='conversation-option-wrapper'])[15]"));

	  act.moveToElement(ele9).build().perform();

	  Thread.sleep(1000);

	  driver.findElement(By.xpath("(//span[@class='conversation-option-button'])[15]")).click();

	  Thread.sleep(500);

	  driver.findElement(By.xpath("//div[@data-id='1626']")).click();

	  Thread.sleep(1000);

	  System.out.println("Trying To delete recieved message from Group");

	  driver.findElement(By.xpath("//div[@data-name='wegr']")).click();

	  Thread.sleep(500);

	  WebElement ele10=driver.findElement(By.xpath("(//div[@class='conversation-option-wrapper'])[13]"));

	  act.moveToElement(ele10).build().perform();

	  Thread.sleep(1000);

	  driver.findElement(By.xpath("(//span[@class='conversation-option-button'])[13]")).click();

	  Thread.sleep(500);

	  driver.findElement(By.xpath("//div[@data-id='1577']")).click();

	  Thread.sleep(1000);

	  System.out.println("Trying to delete sent message to orange member");

	  driver.findElement(By.xpath("//div[@data-name='syum']")).click();

	  Thread.sleep(500);

	  WebElement ele11=driver.findElement(By.xpath("(//div[@class='conversation-option-wrapper'])[10]"));

	  act.moveToElement(ele11).build().perform();

	  Thread.sleep(1000);

	  driver.findElement(By.xpath("(//span[@class='conversation-option-button'])[10]")).click();

	  Thread.sleep(500);

	  driver.findElement(By.xpath("//div[@data-id='1544']")).click();

	  Thread.sleep(1000);

	  System.out.println("Trying to delete Recieved message from orange member");


	  driver.findElement(By.xpath("//div[@data-name='Harish']")).click();

	  Thread.sleep(500);

	  WebElement ele12=driver.findElement(By.xpath("(//div[@class='conversation-option-wrapper'])[8]"));

	  act.moveToElement(ele12).build().perform();

	  Thread.sleep(1000);

	  driver.findElement(By.xpath("(//span[@class='conversation-option-button'])[8]")).click();

	  Thread.sleep(500);

	  driver.findElement(By.xpath("//div[@data-id='1605']")).click();

	  Thread.sleep(1000);

	  driver.findElement(By.xpath("//div[@title='Logout']")).click();

	  System.out.println("now loging into Orange member profile");

	  driver.findElement(By.xpath("//a[contains(text(),'LOGIN')]")).click();

	  driver.findElement(By.xpath("//input[@name='email']")).sendKeys("syum@gmial.com");

	  driver.findElement(By.xpath("//input[@name='password']")).sendKeys("123456");

	  driver.findElement(By.xpath("//button[@id='bG9naW5CdG4']")).click();

	  Thread.sleep(5000);

	  System.out.println("Trying to delete sent message from one to one ");

	  driver.findElement(By.xpath("//div[@data-name='Mum']")).click();

	  Thread.sleep(500);

	  WebElement ele13=driver.findElement(By.xpath("(//div[@class='conversation-option-wrapper'])[12]"));

	  act.moveToElement(ele13).build().perform();

	  Thread.sleep(1000);

	  driver.findElement(By.xpath("(//span[@class='conversation-option-button'])[12]")).click();

	  Thread.sleep(500);

	  driver.findElement(By.xpath("//div[@data-id='1629']")).click();

	  Thread.sleep(1000);

	  System.out.println("Trying to delete Recieved message from one to one ");

	  driver.findElement(By.xpath("//div[@data-name='Sup']")).click();

	  Thread.sleep(500);

	  WebElement ele14=driver.findElement(By.xpath("(//div[@class='conversation-option-wrapper'])[9]"));

	  act.moveToElement(ele14).build().perform();

	  Thread.sleep(1000);

	  driver.findElement(By.xpath("(//span[@class='conversation-option-button'])[9]")).click();

	  Thread.sleep(500);

	  driver.findElement(By.xpath("//div[@data-id='1585']")).click();

	  Thread.sleep(1000);

	  System.out.println("TRying to delete sent message from Group");

	  driver.findElement(By.xpath("//div[@data-name='svg1']")).click();

	  Thread.sleep(500);

	  WebElement ele15=driver.findElement(By.xpath("(//div[@class='conversation-option-wrapper'])[11]"));

	  act.moveToElement(ele15).build().perform();

	  Thread.sleep(1000);

	  driver.findElement(By.xpath("(//span[@class='conversation-option-button'])[11]")).click();

	  Thread.sleep(500);

	  driver.findElement(By.xpath("//div[@data-id='1633']")).click();

	  Thread.sleep(1000);

	  System.out.println("Trying to delete recieved message from Group");

	  driver.findElement(By.xpath("//div[@data-name='svg1']")).click();

	  Thread.sleep(500);

	  WebElement ele16=driver.findElement(By.xpath("(//div[@class='conversation-option-wrapper'])[15]"));

	  act.moveToElement(ele16).build().perform();

	  Thread.sleep(1000);

	  driver.findElement(By.xpath("(//span[@class='conversation-option-button'])[15]")).click();

	  Thread.sleep(500);

	  driver.findElement(By.xpath("//div[@data-id='1639']")).click();

	  Thread.sleep(1000);

	  System.out.println("Trying to delete sent message to orange member");

	  driver.findElement(By.xpath("//div[@data-name='Harish']")).click();

	  Thread.sleep(500);

	  WebElement ele17=driver.findElement(By.xpath("(//div[@class='conversation-option-wrapper'])[13]"));

	  act.moveToElement(ele17).build().perform();

	  Thread.sleep(1000);

	  driver.findElement(By.xpath("(//span[@class='conversation-option-button'])[13]")).click();

	  Thread.sleep(500);

	  driver.findElement(By.xpath("//div[@data-id='1640']")).click();

	  Thread.sleep(1000);

	  System.out.println("Trying to delete Recieved message from orange member");

	  driver.findElement(By.xpath("//div[@data-name='Harish']")).click();

	  Thread.sleep(500);

	  WebElement ele18=driver.findElement(By.xpath("(//div[@class='conversation-option-wrapper'])[7]"));

	  act.moveToElement(ele18).build().perform();

	  Thread.sleep(1000);

	  driver.findElement(By.xpath("(//span[@class='conversation-option-button'])[7]")).click();

	  Thread.sleep(500);

	  driver.findElement(By.xpath("//div[@class='conversation-delete-button conversation-option disabled']")).click();

	  Thread.sleep(500);

	  String b=driver.findElement(By.xpath("//div[@id='snackbar']")).getText();

	  System.out.println(b);

	  assertEquals(b,"TM-Admin disabled this feature");

	  Thread.sleep(2000);

	 // WebElement ele19=driver.findElement(By.xpath("//div[@class='add-btn']"));

	  //act.moveToElement(ele19).build().perform();

	  ExtentTest test=Extent.createTest("Disable and checking from all profiles");

	  test.log(Status.INFO,"Chrome Browser Launched Successfully");

	  test.info("Navigate to URL");

	  test.info("Admin PROFILE");

	  test.info("User PROFILE");

	  test.info("Orange member PROFILE");

	  test.info("Login into Admin Profile");

	  test.info("Email: suup@gmail.com");

	  test.info("Password:123456");

	  test.info("Login:Click on Login");

	  test.info("Click on Dashboard");

	  test.info("Click on controls");

	  test.info("Click on Delete");

	  test.info("Click on Disable");

	  test.info("CLICK ON PATICULAR NAME (ONE TO ONE CHAT )");

	  test.info("TRying to delete SENT message");

	  test.info("Selecting paticular message");

	  test.info("Click on dropdown");

	  test.info("Click on delete");

	  test.info("Delete should not work");

	  test.info("Trying to delete RECIEVED message");

	  test.info("Selecting paticular message");

	  test.info("Click on dropdown");

	  test.info("Click on delete");

	  test.info("Delete should not work");

	  test.info("CLICK ON PATICULAR GROUP");

	  test.info("Trying to delete SENT message");

	  test.info("Selecting paticular message");

	  test.info("Click on dropdown");

	  test.info("Click on delete");

	  test.info("Delete should not work");

	  test.info("Trying to delete RECIEVED message");

	  test.info("Selecting paticular message");

	  test.info("Click on dropdown");

	  test.info("Click on delete");

	  test.info("Delete should not work");

	  test.info("CLICK ON PATICULAR ORANGE MEMBER");

	  test.info("TRying to delete SENT message");

	  test.info("Selecting paticular message");

	  test.info("Click on dropdown");

	  test.info("Click on delete");

	  test.info("Delete should not work");

	  test.info("TRying to delete RECIEVED message");

	  test.info("Selecting paticular message");

	  test.info("Click on dropdown");

	  test.info("Click on delete");

	  test.info("Delete should not work");

	  test.info("EXPECTED RESULT::The delete option should not work");

	  test.pass("we cant able to delete any type of messages after disabeling ");

	  test.log(Status.PASS,"ACTUAL RESULT:: Delete is not working ");

	  test.pass("Testcase:: Testcase Passed");

	  Thread.sleep(3000);

	  driver.close();		
  
}

@AfterSuite
public void endtest() {
	Extent.flush();

}

}
