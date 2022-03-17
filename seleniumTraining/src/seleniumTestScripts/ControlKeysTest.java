package seleniumTestScripts;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ControlKeysTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\webdriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.opencart.com/");
		WebElement searchbox = driver.findElement(By.cssSelector("input.form-control.input-lg"));
		WebElement searchbtn = driver.findElement(By.cssSelector("button.btn.btn-default.btn-lg"));
		searchbox.sendKeys("iPhone");
		searchbtn.sendKeys(Keys.ENTER);
		
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.PAGE_DOWN);
		
	}
}