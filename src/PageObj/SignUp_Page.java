package PageObj;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class SignUp_Page extends Home_Page {
	
	public WebDriver driver;

	public SignUp_Page() {
		
		driver = Baseclass_Page.driver;
		PageFactory.initElements(driver, this);
	}

	public void isSignUp_Page() throws InterruptedException {
		
		driver.navigate().back();
		Thread.sleep(1000);
		SignUp.click();
		Thread.sleep(2000);
		Assert.assertEquals("Sign Up - Personal", SignUpDescription.getText());
		System.out.println("SignUp Page is Launched Successfully");
	}

}
