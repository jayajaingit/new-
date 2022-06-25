package edureka;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
			System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
			
				WebDriver driver= new ChromeDriver();
				//driver.get("https://www.google.com");
				//driver.navigate().to("https://www.tutorialspoint.com/selenium/index.htm");
				driver.navigate().to("https://www.tutorialspoint.com/selenium/selenium_automation_practice.htm");
				driver.findElement(By.name("firstname")).sendKeys("rahulshettyacademy");
				driver.findElement(By.name("lastname")).sendKeys("learning");
			
				driver.findElement(By.name("sex")).click();
				driver.findElement(By.name("exp")).click();
				
				driver.findElement(By.name("profession")).click();
				
				//driver.findElement(By.name("tool")).click();
				
				
				//driver.findElement(By.linkText("")).click();
				//driver.findElement(By.name("text")).sendKeys("10-2-22");
				//String result= driver.findElement(By.name("text")).getAttribute("10-2-22");		
			//	System.out.println(" The Result is " + result);
	
				//FOR CHECK BOXES 
				//driver.findElement(By.linkText("Selenium -IDE")).click();
				  
			List <WebElement> AllCheckboxes = driver.findElements(By.xpath("//input[@type='checkbox']"));
				    
				   int size = AllCheckboxes.size();
				  System.out.println(size); 
				for(int i=0;i<5;i++) {
			driver.findElement(By.name("profession")).click();
					//driver.findElement(By.name("tool")).click();
				   AllCheckboxes.get(i).click();
				}		  
			  
			   //driver.findElement(By.name("profession")).click();
			  // driver.findElement(By.name("continents")).click();
			   Select dropdown = new Select(driver.findElement(By.name("continents")));
			    //  dropdown.selectByVisibleText("");
			    
			  // dropdown.selectByVisibleText("Africa");
		       dropdown.selectByIndex(4) ;
		//dropdown.selectByValue("Africa");
			
		driver.findElement(By.name("selenium_commands")).click();
		driver.findElement(By.name("submit")).click();
	}
	
	
}
