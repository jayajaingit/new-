package edureka;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class First {


	public static void main(String[] args) {
	

		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		
			WebDriver driver= new ChromeDriver();
	driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
	
WebElement staticDropdown=driver.findElement(By.id("dropdown-class-example"));

Select dropdown=new Select (staticDropdown);
dropdown.selectByIndex(2);
System.out.println (dropdown.getFirstSelectedOption().getText());


dropdown.selectByVisibleText("option2");
System.out.println (dropdown.getFirstSelectedOption().getText());
	//System.out.println (driver.getTitle());
		//driver.quit();	
	
}
}