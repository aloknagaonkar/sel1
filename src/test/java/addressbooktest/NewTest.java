package addressbooktest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NewTest {
	WebDriver driver;
	
	@BeforeClass
	public void launch() {
		System.setProperty("webdriver.chrome.driver","chromedriver");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://192.168.56.101:8082/addressbook/");
	}
	
  @Test
  public void Addressbook() {
	  
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  driver.findElement(By.xpath("//div[@class='v-button v-widget']")).click();
	  driver.findElement(By.id("gwt-uid-5")).sendKeys("testing");
	  driver.findElement(By.id("gwt-uid-7")).sendKeys("selenium");
	  driver.findElement(By.id("gwt-uid-9")).sendKeys("9876789");
	  driver.findElement(By.id("gwt-uid-11")).sendKeys("testing@testing.com");
	  driver.findElement(By.id("gwt-uid-13")).sendKeys("01/11/1987");
	  driver.findElement(By.xpath("//div[@class='v-button v-widget primary v-button-primary']")).click();
	  
			  
  }
  
  
  @AfterClass
  public void close() {
	  driver.close();
	  
  }

  
}