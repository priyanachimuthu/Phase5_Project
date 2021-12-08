package test;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Login_Prod_Purchase extends BaseClass{
	
	
	@Test

	public void Login() throws InterruptedException {
		
									/*LOGIN PAGE*/
        
		WebElement Login = driver.findElement(By.xpath("//li[@id='login']"));
        Login.click();		
		Thread.sleep(2000);
		
		
		//Email
        WebElement Email = driver.findElement(By.xpath("//input[@id='username']"));
        Email.sendKeys("kn@gmail.com");		
		Thread.sleep(2000);
		
		//Password
        WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
        password.sendKeys("12345");		
		Thread.sleep(2000);
		
		//LoginSubmit
        WebElement Loginsubmit = driver.findElement(By.xpath("//input[@type='submit']"));
        Loginsubmit.click();		
		Thread.sleep(2000);
		
		
										/*VIEW PRODUCTS PAGE*/
		//ViewProducts
        WebElement ViewProducts = driver.findElement(By.xpath("//li[@id='listProducts']"));
        ViewProducts.click();		
		Thread.sleep(2000);
		
		//Search
        WebElement Search = driver.findElement(By.xpath("//input[@type='search']"));
        Search.sendKeys("combiflame");		
		Thread.sleep(2000);
		
		
		//EyeOpen_Prod
        WebElement Detail = driver.findElement(By.xpath("//a[@class='btn btn-primary']"));
        Detail.click();
        Thread.sleep(2000);
        
        								/*ADD PRODUCT PAGE*/
        //Add_prod
        WebElement Add = driver.findElement(By.xpath("//a[@class='btn btn-success']"));
        Add.click();
        Thread.sleep(2000);
        
       //  CheckOut
        WebElement Checkout = driver.findElement(By.xpath("//a[@class='btn btn-success btn-block']"));
        Checkout.click();
        Thread.sleep(2000);
        
        //Select
        WebElement select = driver.findElement(By.xpath("//a[@class='btn btn-primary']"));
        select.click();
        Thread.sleep(2000);
        
        								/*PAYMENT PAGE*/
        //cardNumber
        WebElement card_number = driver.findElement(By.xpath("//input[@id='cardNumber']"));
        card_number.sendKeys("1234-456-9990");
        Thread.sleep(1000);
        
        //Month
        WebElement Month = driver.findElement(By.xpath("//input[@id='expityMonth']")); 
        Month.sendKeys("12");
        Thread.sleep(1000);
        
        //Year
        WebElement Year = driver.findElement(By.xpath("//input[@id='expityYear']")); 
        Year.sendKeys("23");
        Thread.sleep(1000);
        
        //CV Code
        WebElement cv_code = driver.findElement(By.xpath("//input[@id='cvCode']"));
        cv_code.sendKeys("25");
        Thread.sleep(2000);
      
        
        //Pay
        WebElement pay = driver.findElement(By.xpath("//a[@class='btn btn-success btn-lg btn-block']"));
        pay.click();
        Thread.sleep(4000);
      
        
        //Summary Page
        
        WebElement Order_Summary_Screen = driver.findElement(By.xpath("//h3[@class='text-center']"));
		Assert.assertTrue(Order_Summary_Screen.isDisplayed(),"Your Order is Confirmed");
        
        System.out.println("Order Page is successfully Displayed");
				
	}
}
