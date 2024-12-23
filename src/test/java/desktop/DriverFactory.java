package desktop;

import java.io.File;
import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DriverFactory {
/*public static void main(String args[]) throws IOException, InterruptedException {
    int port = 9223;// Open App

      Runtime.getRuntime().exec(
      "/home/tvisha/Downloads/ElectronAPIDemosSetup.exe"
      , null, new
      File("/home/tvisha/Downloads/ElectronAPIDemosSetup"
      ));

     ChromeOptions options = new ChromeOptions();
    String remoteDebuggingAddress = "localhost:" + port;
    options.setExperimentalOption("debuggerAddress", remoteDebuggingAddress);
    options.addArguments("remote-debugging-port=9223");

    // options.addArguments("electron-port="+port);
    options.setBinary(
            "/home/tvisha/Downloads/ElectronAPIDemosSetup.exe");

    System.setProperty("webdriver.chrome.driver",
            "/home/tvisha/Documents/chrome/chromedriver_linux64/chromedriver");
    WebDriver driver = new ChromeDriver(options);
    System.out.println(driver.getTitle());

    String location = "/home/tvisha/Downloads/eclipse-inst-jre-linux64/Desktop/src/test/java/desktop";
    Date now = new Date();
    SimpleDateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy");
    String time = dateFormat.format(now);
    File dir = new File(location + time);

    if (!dir.exists())
    {
        dir.mkdir();
    }
    else
    {
        //System.out.println("directory already exists");
        //Do nothing
    }

    File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
    try {
        Files.copy(scrFile, new File(location + time + "\\screen1.png"));
        }
    catch (IOException e)
         {
          System.out.println(e.getMessage());

         }

}*/
public static void main(String args[]) throws IOException, InterruptedException {
    int port = 9223;
    // Open App

    Runtime.getRuntime().exec(
            "/home/tvisha/Downloads/ElectronAPIDemosSetup.exe", null,
            new File("/home/tvisha/Downloads/ElectronAPIDemosSetup"));

    ChromeOptions options = new ChromeOptions();
    String remoteDebuggingAddress = "localhost:" + port;
    options.setExperimentalOption("debuggerAddress", remoteDebuggingAddress);
    options.addArguments("remote-debugging-port=9223");
    options.setBinary(
            "/home/tvisha/Downloads/ElectronAPIDemosSetup.exe");

    System.setProperty("webdriver.chrome.driver",
            "/home/tvisha/Documents/chrome/chromedriver_linux64/chromedriver");
    WebDriver driver = new ChromeDriver(options);
    System.out.println(driver.getTitle());

}
}
