package edureka;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class drop2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
    driver.get("http://3.110.88.201/dropdownsPractise/#");

driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT"));

//driver.findElement(By.xpath( //a(@value="MAA"
dropdown.selectByIndex(2);
System.out.println (dropdown.getFirstSelectedOption().getText());


dropdown.selectByVisibleText("option2");
System.out.println (dropdown.getFirstSelectedOption().getText());
//System.out.println (driver.getTitle());
	//driver.quit();	
	
		
		
		
	}

}
