package Basic;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
public class ParamaterTest {
	

		public static WebDriver driver;
		
		@Parameters("browserName")
		@Test
		public void AStartBrowser(String browserName) throws InterruptedException
		{
			switch(browserName.toLowerCase())
			{
			case "chrome":
				WebDriverManager.chromedriver().setup();
				driver=new ChromeDriver();
				driver.manage().window().maximize();
				break;
			case "edge":
				WebDriverManager.edgedriver().setup();
				driver=new EdgeDriver();
				driver.manage().window().maximize();
				break;
			case "firefox":
				WebDriverManager.firefoxdriver().setup();
				driver=new FirefoxDriver();
				driver.manage().window().maximize();
				break;
				default:System.err.println("Browser name is invalid");
			}
			
			//driver.get("https://www.flipkart.com/");
			
			//driver.findElement(By.xpath("//span[@role='button']")).click();
			Thread.sleep(2000);
		}
		
		@Parameters("url")
		@Test
		public void BLaunchApp(String url)
		{
			driver.get(url);
		}
		@Test
		public void CSearchIteam() throws Throwable
		{
			WebDriverManager.chromedriver().setup();
			driver.findElement(By.name("q")).sendKeys("iphone",Keys.ENTER);
			driver.findElement(By.xpath("//div[normalize-space()='APPLE iPhone 15 (Black, 128 GB)']")).click();
			
					Set<String> windowhandle=driver.getWindowHandles();
					ArrayList<String> handles=new ArrayList<String>(windowhandle);
					System.out.println(handles.get(0));
					System.out.println(handles.get(1));
					driver.switchTo().window((String)handles.get(1));
					driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")).click();
			System.out.println(driver.getTitle());
			Thread.sleep(2000);
			
		}
		
		@Test
		public void DPlaceOrder() throws InterruptedException
		{
			 driver.findElement(By.xpath("//button[@class='_2KpZ6l _2ObVJD _3AWRsL']")).click();
			 Thread.sleep(4000);
			 //driver.quit();
		}
		
		@Test
		public void ELogin() throws Throwable
		{
			driver.findElement(By.xpath("//input[@type='text']")).sendKeys("78999912164");
			//driver.findElement(By.xpath("button[@class='_2KpZ6l _20xBvF _3AWRsL']")).click();
			Thread.sleep(5000);
			//driver.quit();
		}
		
		@Test
		public void Fquit()
		{
			driver.quit();
		}
			}
