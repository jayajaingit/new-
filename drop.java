package edureka;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class drop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
driver.get("http://3.110.88.201/dropdownsPractise//");

 WebElement staticDropdown=driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
 Select dropdown=new Select (staticDropdown);
//driver.findElement(By.id("autosuggest")).sendKeys("ind");

 
 
 dropdown.selectByIndex(3);
 System.out.println (dropdown.getFirstSelectedOption().getText());
 dropdown.selectByVisibleText("AED");
  
 System.out.println (dropdown.getFirstSelectedOption().getText());
 dropdown.selectByVisibleText("USD");
	}

}
