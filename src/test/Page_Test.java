package test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import PageObj.About_Page;
import PageObj.Baseclass_Page;
import PageObj.Contact_Page;
import PageObj.Home_Page;
import PageObj.Login_Page;
import PageObj.SignUp_Page;
import PageObj.View_Products;

public class Page_Test extends Baseclass_Page{
	
public WebDriver driver;
	
@Test(priority = 0)
public void validateHomePage() throws InterruptedException {
	
	Home_Page HP = new Home_Page();
	HP.isHomePage();
	Thread.sleep(3000);
}
	
@Test(priority = 1)
public void validateContactPage() throws InterruptedException  {
	
	Contact_Page CP = new Contact_Page();
	CP.isContact_Page();
	Thread.sleep(3000);
}


@Test(priority = 2)
public void validateAboutPage() throws InterruptedException  {
	
	About_Page AP = new About_Page();
	AP.isAbout_Page();
	Thread.sleep(3000);
}

@Test(priority = 3)
public void validateLoginPage() throws InterruptedException  {
	
	Login_Page LP = new Login_Page();
	LP.isLogin_Page();
	Thread.sleep(3000);
}

@Test(priority = 4)
public void validateView_Products() throws InterruptedException  {
	
	View_Products Anti = new View_Products();
	Anti.isView_Products();
	Thread.sleep(3000);
}

@Test(priority = 5)
public void validateSignUp_Page() throws InterruptedException  {
	
	SignUp_Page SP = new SignUp_Page();
	SP.isSignUp_Page();
	Thread.sleep(5000);
}


}
