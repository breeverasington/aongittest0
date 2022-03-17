package seleniumTestScripts;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IFrameTest {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\webdriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://the-internet.herokuapp.com/iframe");
		//switching to frame using webelement
		WebElement iFrameElem = driver.findElement(By.id("mce_0_ifr"));
		driver.switchTo().frame(iFrameElem);
		//switching to frame using frame's index
//		driver.switchTo().frame(0);
		//switching to frame using frame id
//		driver.switchTo().frame("mce_0_ifr");

		WebElement inpText = driver.findElement(By.id("tinymce"));
		inpText.clear();
		inpText.sendKeys("Hello World!");
		
		driver.switchTo().defaultContent();
		WebElement linkTxt = driver.findElement(By.cssSelector("span.tox-statusbar__branding"));
		linkTxt.click();
	}
}