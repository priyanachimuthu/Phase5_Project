package PageObj;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Login_Page extends Home_Page {

	public WebDriver driver;

	public Login_Page() {

		driver = Baseclass_Page.driver;
		PageFactory.initElements(driver, this);
	}

	public void isLogin_Page() throws InterruptedException {

		driver.navigate().back();
		Thread.sleep(1000);
		Login.click();
		Assert.assertEquals("Login", LoginDisplay.getText());
		System.out.println("Login Page can be seen");
	}

}
