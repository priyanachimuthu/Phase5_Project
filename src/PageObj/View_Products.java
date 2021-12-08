package PageObj;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class View_Products extends Home_Page {

	WebDriver driver;

	public View_Products() {

		driver = Baseclass_Page.driver;
		PageFactory.initElements(driver, this);
	}

	public void isView_Products() throws InterruptedException {

		driver.navigate().back();
		Thread.sleep(1000);
		ViewProducts.click();
		Thread.sleep(2000);
		Assert.assertEquals("Antipyretics", Antipyretics.getText());
		System.out.println("Antipyretics is Available");

	}

}
