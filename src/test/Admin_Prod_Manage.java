package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;


public class Admin_Prod_Manage extends BaseClass {

@Test
public void AdminLogin() throws InterruptedException {
/*LOGIN PAGE*/
			
			
			//Login
	        WebElement Login = driver.findElement(By.xpath("//li[@id='login']"));
	        Login.click();
			
			Thread.sleep(2000);
			

			//Email
	        WebElement Email = driver.findElement(By.xpath("//input[@id='username']"));
	        Email.sendKeys("vk@gmail.com");			
			Thread.sleep(2000);
			
			//Password
	        WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
	        password.sendKeys("admin");			
			Thread.sleep(2000);
			
			//LoginSubmit
	        WebElement Loginsubmit = driver.findElement(By.xpath("//input[@type='submit']"));
	        Loginsubmit.click();			
			Thread.sleep(2000);

/*MANAGE PRODUCT*/
						
			//MANAGEPRODUCT
	        WebElement ManageProduct = driver.findElement(By.xpath("//a[contains(text(), 'Manage Product')]"));
	        ManageProduct.click();			
			Thread.sleep(2000);
			
			
/*Add Category*/
	        WebElement AddCategory = driver.findElement(By.xpath("//button[@class='btn btn-warning btn-xs']"));
	        AddCategory.click();			
			Thread.sleep(2000);
			

	        WebElement CategoryName = driver.findElement(By.xpath("//input[@placeholder='Category Name']"));
	        CategoryName.sendKeys("Antipyretics");
			
			Thread.sleep(2000);
			
	        WebElement CategoryDesc = driver.findElement(By.xpath("//textarea[@placeholder='Enter category description here!']"));
	        CategoryDesc.sendKeys("Zinnoate");
			
			Thread.sleep(2000);
			
	        WebElement Save = driver.findElement(By.xpath("(//input[@class=\"btn btn-primary\" and @type=\"submit\"])[2]"));
	        Save.click();
			
			Thread.sleep(2000);
			
//AddProduct//
	        WebElement ProductName = driver.findElement(By.xpath("//input[@placeholder='Product Name']"));
	        ProductName.sendKeys("New Product");
			
			Thread.sleep(2000);
			
	        WebElement BrandName = driver.findElement(By.xpath("//input[@placeholder='Brand Name']"));
	        BrandName.sendKeys("Origin Brand");
			
			Thread.sleep(2000);
			
			
	        WebElement Description = driver.findElement(By.xpath("//textarea[@placeholder='Enter your description here!']"));
	        Description.sendKeys("Brand Description");
			
			Thread.sleep(2000);
			
			
	        WebElement UnitPrice = driver.findElement(By.xpath("//input[@placeholder='Enter Unit Price']"));
	        UnitPrice.sendKeys("20");
			
			Thread.sleep(2000);
			
			
	        WebElement Quantity = driver.findElement(By.xpath("//input[@placeholder='Enter Quantity']"));
	        Quantity.sendKeys("10");
			
			Thread.sleep(2000);
			
	        WebElement Uploadfile = driver.findElement(By.xpath("//input[@id='file']"));
	        Uploadfile.sendKeys("/home/npriyahereyahoo/Documents/New Folder/Medicine.jpeg");
			
			Thread.sleep(2000);
			
						
	        WebElement ChooseCategory = driver.findElement(By.xpath("//select[@name='categoryId']/option[@value='2']"));
	        ChooseCategory.click();
			
			Thread.sleep(2000);
			
			
	        WebElement Save2 = driver.findElement(By.xpath("//input[@class='btn btn-primary'][1]"));
	        Save2.click();
			
			Thread.sleep(2000);
			
/*Edit Product*/
			
			driver.switchTo().defaultContent();
			
			WebElement Edit = driver.findElement(By.xpath("//span[@class='glyphicon glyphicon-pencil']"));
			Edit.click();
		
			
			Thread.sleep(2000);
		//	Assert.assertEquals("Product Management",Edit.getText());
			System.out.println("Edited Successfully");
			Thread.sleep(2000);
			
			
			
		}

}