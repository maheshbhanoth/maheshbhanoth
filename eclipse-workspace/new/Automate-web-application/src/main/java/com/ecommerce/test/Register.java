package com.ecommerce.test;

	import org.openqa.selenium.By;
	import org.openqa.selenium.NoAlertPresentException;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;


	public class Register {
	  
	public static void main(String[] args) throws NoAlertPresentException,InterruptedException  {									
			
//			System.setProperty("webdriver.chrome.driver", "D:\\phase-5\\chromedriver.exe");
	      
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.shine.com/registration/");
			
			//name
			WebElement name= driver.findElement(By.id("id_name"));
			name.sendKeys("Mahesh");
			
			//email
			WebElement email= driver.findElement(By.id("id_email"));
			email.sendKeys("maheshbanoth762@gmail.com");
			
			//mobile
			WebElement mobile= driver.findElement(By.id("id_cell_phone"));
			mobile.sendKeys("9949134005");
			
			
			//password
			WebElement password= driver.findElement(By.id("id_password"));
			password.sendKeys("Mahesh123@");
			
			//button
			WebElement register= driver.findElement(By.cssSelector("#registerButton"));
			Thread.sleep(20000);
			register.click();
			Thread.sleep(20000);
	  }
	}