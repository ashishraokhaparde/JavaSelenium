import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class BrowserTest {
	
	@BeforeTest
	public void LaunchBrowser() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.selenium.dev/selenium/web/");
	}

}
