package seleniumAssignments;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegistrationPage {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\webdriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.opencart.com/index.php?route=account/register");
		driver.findElement(By.name("firstname")).sendKeys("Breever");
		driver.findElement(By.name("lastname")).sendKeys("Asington");
		driver.findElement(By.id("input-email")).sendKeys("breeverchristeen@gmail.com");
		driver.findElement(By.cssSelector("input[id='input-telephone']")).sendKeys("8012065159");
		driver.findElement(By.cssSelector("input[name='password']")).sendKeys("lol");
		driver.findElement(By.name("confirm")).sendKeys("afds");
	}
}