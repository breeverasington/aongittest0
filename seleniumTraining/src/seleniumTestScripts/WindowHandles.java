package seleniumTestScripts;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandles {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\webdriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://stqatools.com/demo/Windows.php");
		String parentWin = driver.getWindowHandle();
		System.out.println("Parent Window ID: " +parentWin);
		
		driver.findElement(By.xpath("//button[contains(text(), 'new Tab')]")).click();
		Set<String> tabs = driver.getWindowHandles();
		System.out.println("Number of Tabs: " +tabs.size());
		
		for(String ChildWin:tabs) {
			System.out.println(ChildWin);
			if(!ChildWin.equalsIgnoreCase(parentWin)) {
				driver.switchTo().window(ChildWin);
				driver.findElement(By.xpath("//a[contains(text(), 'Java')]")).click();
			}
		}
		
		driver.quit();
		
		
	}
}