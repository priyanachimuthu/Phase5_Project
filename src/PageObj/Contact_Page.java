package PageObj;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Contact_Page extends Home_Page {

	public WebDriver driver;

	public Contact_Page() {

		driver = Baseclass_Page.driver;
		PageFactory.initElements(driver, this);
	}

	public void isContact_Page() throws InterruptedException {
		Contact.click();
		Thread.sleep(2000);
		Assert.assertEquals("This is an contact us page", Contact_Display.getText());
		System.out.println("Contact Page is Launched Successfully");
	}

}
