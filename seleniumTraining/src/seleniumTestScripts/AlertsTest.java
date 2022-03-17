package seleniumTestScripts;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\webdriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.seleniumeasy.com/javascript-alert-box-demo.html");
		
		//accepting
		driver.findElement(By.xpath("//button[contains(text(), 'Click me!')][1]")).click();
		Alert alert = driver.switchTo().alert();
		alert.accept();		
		
		//getting text
		driver.findElement(By.xpath("//button[contains(text(), 'Click me!')][1]")).click();
		Alert confirm = driver.switchTo().alert();
		System.out.println("Alert Text : "+confirm.getText());
		confirm.accept();
		
		//enetering text
		driver.findElement(By.xpath("//button[contains(text(), 'Prompt')]")).click();
		Alert prompt = driver.switchTo().alert();
		System.out.println("Alert Text : "+prompt.getText());
		prompt.sendKeys("Hell");
		prompt.accept();
		
	}
}