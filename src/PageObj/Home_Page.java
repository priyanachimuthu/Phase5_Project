package PageObj;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Home_Page {

	public WebDriver driver;


	@FindBy(xpath = "//li[@id='about']")
	WebElement About;

	@FindBy(xpath = "//p[contains(text(),'This is an about us page')]")
	WebElement About_Display;

	@FindBy(xpath = "//li[@id='contact']")
	WebElement Contact;

	@FindBy(xpath = "//p['This is an contact us page']")
	WebElement Contact_Display;

	@FindBy(xpath = "//li[@id='signup']")
	WebElement SignUp;

	@FindBy(xpath = "//div[@class='row']//h4")
	WebElement SignUpDescription;

	@FindBy(xpath = "//li[@id='login']")
	WebElement Login;

	@FindBy(xpath = "//h4['Login']")
	WebElement LoginDisplay;

	@FindBy(xpath = "//li[@id='listProducts']")
	WebElement ViewProducts;

	@FindBy(xpath = "//a[@id='a_Antipyretics']")
	WebElement Antipyretics;

	

	public Home_Page() {

		driver = Baseclass_Page.driver;
		PageFactory.initElements(driver, this);
	}

	public void isHomePage() {

		Assert.assertEquals("About", About.getText());
		Assert.assertEquals("Contact", Contact.getText());

		System.out.println("This is Home Page");

	}

}
