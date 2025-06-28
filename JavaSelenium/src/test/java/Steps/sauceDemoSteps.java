package Steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;

public class sauceDemoSteps{
	
	@Given("User launch the sauce demo page")
	public void user_launch_the_sauce_demo_page() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
	   
	}
}

