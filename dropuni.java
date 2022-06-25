package edureka;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dropuni {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
							System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
				
				WebDriver driver= new ChromeDriver();
			//	Actions action=new Actions(driver);
				
		driver.get("https://v2.unirely.com/admin/home");
		driver.findElement(By.id("text")).sendKeys("tester@unirely.com");
		driver.findElement(By.id("password")).sendKeys("123456a");
		driver.findElement(By.className("login-btn")).click();
	//Actions action1=new Actions(driver);
		//driver.findElement(By.id("step2")).click();
		//List <WebElement> byclass = driver.findElements(By.className("items active-tabs"));
//		 
		//WebElement MyDocuments   = driver.findElement(By.cssSelector(" lf2n2"));
				

	}
	
}
 