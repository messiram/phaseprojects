import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NewTest {
  @Test
  public void f() throws Exception {
	  System.setProperty("webdriver.chrome.driver",  "C:\\Users\\srir7\\OneDrive\\Desktop\\chromedriver_win32/chromedriver.exe");
      WebDriver driver = new ChromeDriver();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Long loadtime = (Long) ((JavascriptExecutor) driver).executeScript("return performance.timing.loadEventEnd - performance.timing.navigationStart;");
		System.out.println("Load time is: " + loadtime);
		Thread.sleep(10000);
		
		driver.findElement(By.cssSelector("._2hriZF ._2doB4z")).click();
		driver.findElement(By.name("q")).sendKeys("iPhone 13");
		
		Thread.sleep(10000);
		driver.findElement(By.className("L0Z3Pu")).click();
		Thread.sleep(10000);
		
		WebElement ImageFile = driver.findElement(By.xpath("//img[contains(@class,'_396cs4 _3exPp9')]"));
        
        Boolean ImagePresent = (Boolean)(js.executeScript("return arguments[0].complete && typeof arguments[0].naturalWidth != \"undefined\" && arguments[0].naturalWidth > 0", ImageFile));
        if (!ImagePresent){
             System.out.println("Image not displayed.");
        }
        else{
            System.out.println("Image displayed");
        }
  	  
  	  	js.executeScript("return window.scrollBy(0,1000)");  
  	  	System.out.println("Scroll available");
  	  	Thread.sleep(10000);
  	  	
  	  	js.executeScript("window.scroll(0,document.body.scrollHeight)");
  	  	System.out.println("Scroll to bottom available");
  	  	Thread.sleep(10000);
  	  	
  		}
 
 
}

