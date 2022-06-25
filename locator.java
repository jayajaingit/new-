package edureka;


	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.Select;

	public class locator {


		public static void main(String[] args) {
		

			System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
			
				WebDriver driver= new ChromeDriver();
				driver.get("https://www.google.com");
				driver.navigate().to("https://www.rahulshettyacademy.com/loginpagePractise/");
				//driver.navigate().back();
				driver.navigate().forward();
		driver.findElement(By.id("username")).sendKeys("rahulshettyacademy");
	driver.findElement(By.id("password")).sendKeys("learning");
	//driver.findElement(By.className("btn btn-info btn-md")).click();
	driver.findElement(By.id("terms")).click();
	driver.findElement(By.className("btn")).click();
	driver.navigate().back();
		}
		
		

}
