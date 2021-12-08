package PageObj;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class About_Page extends Home_Page {

	public WebDriver driver;

	public About_Page() {

		driver = Baseclass_Page.driver;
		PageFactory.initElements(driver, this);
	}

	public void isAbout_Page() throws InterruptedException {
		About.click();
		Thread.sleep(1000);
		Assert.assertEquals("This is an about us page", About_Display.getText());
		System.out.println("About Page is Launched Successfully");
	}

}
