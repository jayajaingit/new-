package edureka;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class google {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		
			WebDriver driver= new ChromeDriver();
	//driver.get("https://www.google.com");
	driver.get("https://www.rahulshettyacademy.com/loginpagePractise/");
	driver.findElement(By.id("username")).sendKeys("jaya");
driver.findElement(By.id("password")).sendKeys("jaya");



if(at.equalsIgnoreCase(et))

{
	System.out.println("username");

}
else 
{
System.out.println("jaya");
	}
	

}
}
