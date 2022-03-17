package seleniumTestScripts;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActionsTest {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\webdriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Actions actions = new Actions(driver);
		driver.manage().window().maximize();
//		driver.get("https://stqatools.com/demo/DoubleClick.php");
		driver.get("https://demo.opencart.com/");

		//MouseActions hover click
		WebElement menu = driver.findElement(By.cssSelector("ul.nav.navbar-nav li.dropdown:nth-child(3)"));
		actions.moveToElement(menu)
		.click(driver.findElement(By.xpath("//a[contains(text(), 'Monitors (2)')]")))
		.perform();
		
		
	}
}