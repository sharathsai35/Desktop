package desktop;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;


@RunWith(JUnit4.class)
public class ElectronApiAppTest {
   private WebDriver driver = null;

   @SuppressWarnings("deprecation")
@Before
   public void setup() {
	   //System.setProperty("webdriver.chrome.driver", "/opt/Troop GRIT/Troop GRIT");
	   ChromeOptions opt = new ChromeOptions();
       opt.setBinary("/opt/Troop GRIT/Troop GRIT");
       DesiredCapabilities capabilities = new DesiredCapabilities();
       capabilities.setCapability("chromeOptions", opt);
       capabilities.setBrowserName("chrome");

       driver = new ChromeDriver(capabilities);
       System.out.print("driver.findElements(By.id(\"loginBtn\")).size()"+ driver.findElements(By.id("loginBtn")).size());
       if (driver.findElements(By.id("loginBtn")).size() > 0)
           driver.findElement(By.id("loginBtn")).click();
   }

   @Test
   public void test() throws InterruptedException {
		
	   		System.out.print("line executed");
		  driver.findElement(By.id("loginBtn")).click();
			/*
			 * List<WebElement> elements = driver.findElements(By.className("nav-button"));
			 * for (WebElement element : elements) { element.click(); }
			 */
		 
   }

   @After
   public void teardown() {
       driver.quit();
   }
}

