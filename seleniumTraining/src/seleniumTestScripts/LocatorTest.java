package seleniumTestScripts;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\webdriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://the-internet.herokuapp.com/login");
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("tomsmith");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("SuperSecretPassword!");
		
		//finds and prints name value of 1 element 
		WebElement inputElem = driver.findElement(By.tagName("input"));
		System.out.println("No. of Elements :" +inputElem.getAttribute("name"));
		
		//finds and prints count of no. of elements in the page with given attribute
		List<WebElement> elements = driver.findElements(By.tagName("input"));
		System.out.println("No. of Elements :" +elements.size());
		
		//prints attribute value of all matching elements
		for (WebElement elem:elements) {
			System.out.println("Value of name attribute : " +elem.getAttribute("name"));
		}
		
		driver.findElement(By.xpath("//i[contains(text(),'Login')]")).click();
//		driver.quit();
	}

}
