package PageObj;

import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class Baseclass_Page {

	public static WebDriver driver;

	@BeforeTest
	public void setup() throws IOException {

		System.setProperty("webdriver.chrome.driver", "chromedriver");

		driver = new ChromeDriver();

		driver.get("http://localhost:8080/Medicare2/");

		driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	}

	@AfterTest
	public void teardown() {

		driver.quit();
	}

}
