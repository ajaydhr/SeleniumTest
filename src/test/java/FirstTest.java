import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class FirstTest {

@Test
	public void myFirstTest() {
	System.setProperty("webdriver.chrome.driver","/Users/ajay.kumar/Downloads/chromedriver");
	
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.choicehotels.com/");
	driver.manage().window().maximize();
	WebElement dropDown=driver.findElement(By.id("autosuggest-input"));
	dropDown.click();
	dropDown.sendKeys("Chandler, AZ, US");
	driver.findElement(By.tagName("button"));
//	System.out.println(findElement.getTagName());
	
	//driver.quit();
	}
}