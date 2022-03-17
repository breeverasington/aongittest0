package seleniumTestScripts;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GooglePageTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\webdriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
//		WebElement searchbox = driver.findElement(By.name("q"));
		
		//Locating using className
		//className can use only one of the complex class names of an element
		WebElement searchbox = driver.findElement(By.className("gLFyf"));
		
		//Locating using cssSelector
		//cssSelectors should be used as .className1.className2 in case of complex class name
//		WebElement searchbox = driver.findElement(By.cssSelector(".gLFyf.gsfi"));
		
		searchbox.sendKeys("Selenium");
		searchbox.submit();
		System.out.println("Page Title: "+driver.getTitle());
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().forward();
		driver.navigate().refresh();
		driver.quit();
	}

}
