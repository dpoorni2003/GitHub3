import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class slenium {

 static WebDriver chromebrowser;
@Test
public static  void launchBrowser()
{
	System.setProperty("webdriver.chrome.driver","Users/dpoor/eclipse-workspace/HelloMaven1/src/test/resources/drivers/chromedriver.exe");
 //chromebrowser = new Chrome driver();

}
	

	@Test
public void launchUrl() {
	//chromeBrowser.get("https://google.com");
	
}
}