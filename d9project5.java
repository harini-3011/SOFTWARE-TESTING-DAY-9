package day9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class d9project5 {
	WebDriver driver;
	   @Test
	   public void f() throws InterruptedException {
		   Thread.sleep(3000);
		   WebElement na=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input"));
		   na.sendKeys("Admin");
		   Thread.sleep(1000);
		   WebElement naa=driver.findElement(By.name("password"));
		   naa.sendKeys("admin123");
		   Thread.sleep(1000);
		   WebElement bta=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button"));
		   bta.click();
		   Thread.sleep(3000);
		   String url="https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";
		   Assert.assertEquals(url,driver.getCurrentUrl());
		   }
	   
	  @BeforeMethod
	  public void setup() {
		  
		  WebDriverManager.chromedriver().setup();
	      ChromeOptions co=new ChromeOptions();
	      co.addArguments("--remote-allow-origins=*");
	      
//	      co.addArguments("start-maximized");
	      driver=new ChromeDriver(co);
	      driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	      driver.manage().window().maximize(); 
	 
		  
	   }
	  @AfterMethod
	  public void teardown() throws InterruptedException {
		  Thread.sleep(4000);
		  driver.close();
	  }
}