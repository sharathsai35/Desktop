package desktop;

import java.net.MalformedURLException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class MyFirstTestCase {
static WebDriver driver;
	public static void main(String[] args) throws MalformedURLException, InterruptedException {

		EdgeOptions option = new EdgeOptions();

		//option.setApplicationPath("/home/tvisha/Downloads/Appium-Server-GUI-linux-1.22.0.AppImage");

		//WiniumDriver driver = new WiniumDriver(new URL("http://127.0.1.1:4723/wd/hub"), option);
		 DesiredCapabilities capabilities = new DesiredCapabilities();
	       capabilities.setCapability("chromeOptions", option);
	       capabilities.setBrowserName("chrome");
		Thread.sleep(5000);

		driver.findElement(By.name("Seven")).click();

		driver.findElement(By.name("Plus")).click();

		driver.findElement(By.name("Eight")).click();

		driver.findElement(By.name("Equals")).click();

		Thread.sleep(5000);

		String output = driver.findElement(By.id("CalculatorResults")).getAttribute("Name");

		System.out.println("Result after addition is: "+output);

		driver.quit();

	}
}

